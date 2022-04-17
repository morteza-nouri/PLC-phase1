grammar SimpleLoop;



primaryExpression
    : IDENTIFIER
    | NUMBER
    | BOOL_VALUE
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
    :
    conditionalExpression | unaryExpression op=ASSIGN assignmentExpression {System.out.println("Operator : " + $op.getText());}
    ;

expression
    :
    assignmentExpression (COMMA assignmentExpression)*
    ;


declaration : typeSpecifier IDENTIFIER(COMMA IDENTIFIER)*;

typeSpecifier
    : VOID
    |primaryTypeSpecifier
    | compoundTypeSpecifier
    ;

primaryTypeSpecifier
    : INT
    | BOOL
    | CLASS_NAME
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

classDeclaration : CLASS CLASS_NAME (LESS_THAN CLASS_NAME)? classBody;


classBody
    : OPEN_SCOPE NEWLINE* ((PUBLIC | PRIVATE) statement NEWLINE*)* CLOSE_SCOPE
    | NEWLINE+ (PUBLIC | PRIVATE) statement NEWLINE*
    ;


methodDeclaration
    :
    typeSpecifier (IDENTIFIER | INITIALIZE) OPAR argDeclarator CPAR methodBody
    ;

argDeclarator
    :
     typeSpecifier IDENTIFIER (ASSIGN expression)? (COMMA typeSpecifier IDENTIFIER (ASSIGN expression)?)*
    ;

methodBody
    :
    ;

block
    :
    ;

statement
    : declaration
    | ifStatement
    | forStatement
    | printStatement
    | returnStatement
    ;

ifStatement : IF expression NEWLINE+ (block NEWLINE*)?  elsifStatement* elseStatement?;
elsifStatement : ELSIF expression NEWLINE+ (block NEWLINE*)? elseStatement?;
elseStatement : ELSE NEWLINE+ (block NEWLINE*)?;

forStatement
    :
    (OPAR expression DOT DOT expression CPAR DOT EACH DO VBAR IDENTIFIER VBAR
    | IDENTIFIER DOT EACH DO VBAR IDENTIFIER VBAR
    ) NEWLINE+ block
    ;

printStatement : PRINT OPAR expression CPAR;

setAddStatement : (SELF DOT | ) IDENTIFIER DOT ADD OPAR expression CPAR;

setDeleteStatement : (SELF DOT | ) IDENTIFIER DOT DELETE OPAR expression CPAR;

setIncludeStatement : (SELF DOT | ) IDENTIFIER DOT INCLUDE OPAR expression CPAR;

returnStatement : RETURN expression;



// Scopes
OPEN_SCOPE          : '{';
CLOSE_SCOPE         : '}';

// CLASS
CLASS               : 'class';
CLASS_NAME          : [A-Z][a-zA-Z0-9_]*;
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

// Values
TRUE                : 'true';
FALSE               : 'false';
ZERO                : '0';
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