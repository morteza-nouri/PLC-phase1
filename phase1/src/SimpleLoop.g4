grammar SimpleLoop;


if_statement :
    | IF condition NEWLINE+ block elsif_statement
    | IF condition NEWLINE+ block
    ;
elsif_statement :
    | ELSIF condition NEWLINE+ block elsif_statement
    | ELSIF condition NEWLINE+ block else_statement?
    ;
else_statement :
    | ELSE block
    ;

condition :
    | expression
    ;

block :
    | NEWLINE* OPEN_SCOPE NEWLINE+ statements CLOSE_SCOPE
    ;

statements :
    | statement+
    ;

statement :
    | compound_statement
    | simple_statement
    ;

expression : OPAR expression CPAR
    | expression DOT expression
    | OBRACKET expression CBRACKET
    | expression op=(INCREMENT | DECREMENT)
    | op=(MINUS | NOT) expression
    | expression op=(MULTIPLY | DIVIDE) expression
    | expression op=(PLUS | MINUS) expression
    | expression op=(GREATER_THAN | LESS_THAN) expression
    | expression EQUAL expression
    | expression AND expression
    | expression OR expression
    | expression ASSIGN expression
    | INT_VALUE | BOOL_VALUE | IDENTIFIER | NULL | LETTER
    ;

// Scopes
OPEN_SCOPE          : '{ ';
CLOSE_SCOPE         : '}';

// Primitives values
INT_VALUE           : [0-9]+;
BOOL_VALUE          : TRUE | FALSE;

// Primitives
INT                 : 'int';
BOOL                : 'bool';
FPTR                : 'fptr';
SET                 : 'set';

// Control Structures
IF                  : 'if';
ELSIF               : 'elsif';
ELSE                : 'else';

// Return
RETURN              : 'return';

// Identifier
IDENTIFIER          : (LETTER | UNDERLINE)(LETTER | UNDERLINE | NUMBER);

// Values
TRUE                : 'true';
FALSE               : 'false';
ZERO                : '0';
NUMBER              : [0-9];
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
Ternary             : '?';
UNDERLINE           : '_';

// WhiteSpaces
NEWLINE             : '\n';
WS                  : [ \r\t] -> skip;
LINE_COMMENT        : '#' ~[\r\n]* -> skip;
BLOCK_COMMENT       : '=begin\n'  .*? '\n=end' -> skip;