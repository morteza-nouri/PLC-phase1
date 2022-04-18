grammar SimpleLoop;



primaryExpression
    : IDENTIFIER
    | NUMBER
    | BOOL_VALUE
    | memberAccessStatement
    | setNewStatement
    | setIncludeStatement
    | OPAR expression CPAR
    ;

postfixUnaryExpression
    : primaryExpression
    (OBRACKET expression CBRACKET
    | DOT IDENTIFIER
    | op=(INCREMENT | DECREMENT) {System.out.println("Operator : " + $op.getText());}
    | OPAR argExpressionList? CPAR
    )*
    ;

argExpressionList
    : assignmentExpression (COMMA assignmentExpression)*;
unaryExpression
    :
    (op=(MINUS | NOT) unaryExpression {System.out.println("Operator : " + $op.getText());})
    | postfixUnaryExpression
    ;

multiplicativeExpression
    :
    unaryExpression (op=(MULTIPLY | DIVIDE) unaryExpression {System.out.println("Operator : " + $op.getText());})*
    ;

additiveExpression
    :
    multiplicativeExpression (op=(PLUS | MINUS) multiplicativeExpression {System.out.println("Operator : " + $op.getText());})*
    ;

relationalExpression
    :
    additiveExpression (op=(GREATER_THAN | LESS_THAN) additiveExpression {System.out.println("Operator : " + $op.getText());})*
    ;

equalityExpression
    :
    relationalExpression (op=EQUAL relationalExpression {System.out.println("Operator : " + $op.getText());})*
    ;

andExpression
    :
    equalityExpression (op=AND equalityExpression {System.out.println("Operator : " + $op.getText());})*
    ;

orExpression
    :
    andExpression (op=OR andExpression {System.out.println("Operator : " + $op.getText());})*
    ;

conditionalExpression
    :
    orExpression (QUESTION expression COLON conditionalExpression {System.out.println("Operator : ?:");})?
    ;

assignmentExpression
    : conditionalExpression
    | unaryExpression op=ASSIGN assignmentExpression {System.out.println("Operator : " + $op.getText());}
    | ASSIGN assignmentExpression
    ;

expression
    :
    assignmentExpression (COMMA assignmentExpression)*
    ;

declaration
    : typeSpecifier
    n=IDENTIFIER {System.out.println("VarDec : " + $n.getText());}
    (COMMA n=IDENTIFIER {System.out.println("VarDec : " + $n.getText());})*
    | methodDeclaration
    ;

typeSpecifier
    : VOID
    | primaryTypeSpecifier
    | compoundTypeSpecifier
    ;

primaryTypeSpecifier
    : INT
    | BOOL
    | CLASS_IDENTIFIER
    ;

compoundTypeSpecifier
    : arrayType
    | fptrType
    | setType
    ;

arrayType : primaryTypeSpecifier (OBRACKET expression CBRACKET)*;

setType : SET LESS_THAN INT GREATER_THAN;

fptrType
    : FPTR
    LESS_THAN
    (VOID | primaryTypeSpecifier | arrayType | setType)
    (COMMA (VOID | primaryTypeSpecifier | arrayType | setType))* ARROW
    (VOID | primaryTypeSpecifier | arrayType | setType)
    GREATER_THAN
    ;

classDeclaration : CLASS CLASS_IDENTIFIER (LESS_THAN CLASS_IDENTIFIER)? classBody;


classBody
    : NEWLINE* OPEN_SCOPE NEWLINE*
    ((PUBLIC | PRIVATE) declaration NEWLINE*)*
    CLOSE_SCOPE
    | NEWLINE+ (PUBLIC | PRIVATE) declaration NEWLINE*
    ;

methodDeclaration
    :
    (typeSpecifier | ) n=(IDENTIFIER | INITIALIZE) {System.out.println("MethodDec : " + $n.getText());}
    OPAR argDeclarator CPAR methodBody
    ;

argDeclarator
    :
     typeSpecifier n=IDENTIFIER  {System.out.println("ArgumentDec : " + $n.getText());}
     (ASSIGN expression)?
     (COMMA typeSpecifier IDENTIFIER {System.out.println("ArgumentDec : " + $n.getText());} (ASSIGN expression)?)*
    ;

methodBody
    : block
    | NEWLINE statement NEWLINE*
    ;

block
    : NEWLINE* OPEN_SCOPE NEWLINE* (statement NEWLINE*)* CLOSE_SCOPE NEWLINE*
    | NEWLINE statement NEWLINE*
    ;

statement
    : declaration
    | memberAccessStatement
    | ifStatement
    | forStatement
    | printStatement
    | returnStatement
    | setAddStatement
    | setDeleteStatement
    | setIncludeStatement
    | setMergeStatement
    | setNewStatement
    | newObjectStatement
    | assignmentExpression
    ;

ifStatement
    : IF expression block?  elsifStatement* elseStatement?
    ;

elsifStatement
    : ELSIF expression block? elseStatement?
    ;

elseStatement
    : ELSE block?
    ;

forStatement
    :
    (OPAR expression DOT DOT expression CPAR DOT EACH DO {System.out.println("Loop : each");} VBAR IDENTIFIER VBAR
    | (SELF DOT IDENTIFIER | IDENTIFIER) DOT EACH DO {System.out.println("Loop : each");} VBAR IDENTIFIER VBAR
    ) block
    ;

printStatement : PRINT {System.out.println("Built-in : print");} OPAR expression CPAR;

setAddStatement : (SELF DOT | ) IDENTIFIER DOT ADD {System.out.println("ADD");} OPAR expression CPAR;

setDeleteStatement : (SELF DOT | ) IDENTIFIER DOT DELETE {System.out.println("DELETE");} OPAR expression CPAR;

setIncludeStatement : (SELF DOT | ) IDENTIFIER DOT INCLUDE {System.out.println("INCLUDE");} OPAR expression CPAR;

setMergeStatement : (SELF DOT | ) IDENTIFIER DOT MERGE {System.out.println("MERGE");} OPAR SET DOT NEW OPAR ( IDENTIFIER | expression) CPAR CPAR;

setNewStatement : SET DOT NEW {System.out.println("NEW");} OPAR expression? CPAR;

newObjectStatement : IDENTIFIER ASSIGN CLASS_IDENTIFIER DOT NEW OPAR expression (COMMA expression)* CPAR;

memberAccessStatement : (SELF | IDENTIFIER) DOT IDENTIFIER;

returnStatement : RETURN {System.out.println("Return");} expression;



// Scopes
OPEN_SCOPE          : '{';
CLOSE_SCOPE         : '}';

// CLASS
CLASS               : 'class';
SELF                : 'self';

// Primitives values
BOOL_VALUE          : TRUE | FALSE;

// Primitives
VOID                : 'void';
INT                 : 'int';
BOOL                : 'bool';
FPTR                : 'fptr';
SET                 : 'Set';

// Built-in
PRINT               : 'print';
NEW                 : 'new';
ADD                 : 'add';
MERGE               : 'merge';
DELETE              : 'delete';
INCLUDE             : 'include';
INITIALIZE          : 'initialize';

// Control Structures
IF                  : 'if';
ELSIF               : 'elsif';
ELSE                : 'else';

// Loop Structures
FOR                 : 'for';
EACH                : 'each';
DO                  : 'do';

// Access Modifiers
PRIVATE             : 'private';
PUBLIC              : 'public';

// Return
RETURN              : 'return';

// Identifier
IDENTIFIER          : (LOWERCASE | UNDERLINE)(LETTER | UNDERLINE | DIGIT)*;
CLASS_IDENTIFIER    : [A-Z][a-zA-Z0-9_]*;

// Values
TRUE                : 'true';
FALSE               : 'false';
NUMBER              : DIGIT+;
DIGIT               : [0-9];
LETTER              : UPPERCASE | LOWERCASE;
UPPERCASE           : [A-Z];
LOWERCASE           :[a-z];
NULL                : 'null';

// Arithmetic operators
PLUS                : '+';
MINUS               : '-';
MULTIPLY            : '*';
DIVIDE              : '/';
INCREMENT           : '++';
DECREMENT           : '--';

// Comparative operators
EQUAL               : '==';
LESS_THAN           : '<';
GREATER_THAN        : '>';

// Logical operators
AND                 : '&&';
OR                  : '||';
NOT                 : '!';

// Assignment Operator
ASSIGN              : '=';

// Symbols
COMMA               : ',';
COLON               : ':';
DOT                 : '.';
OPAR                : '(';
CPAR                : ')';
OBRACKET	        : '[';
CBRACKET 	        : ']';
QUESTION            : '?';
UNDERLINE           : '_';
ARROW               : '->';
VBAR                : '|';

// WhiteSpaces
NEWLINE             : '\n';
WS                  : [ \r\t] -> skip;
LINE_COMMENT        : '#' ~[\r\n]* -> skip;
BLOCK_COMMENT       : '=begin\n'  .*? '=end' -> skip;
SEMICOLON           : ';' -> skip;