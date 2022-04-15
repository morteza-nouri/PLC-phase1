grammar SimpleLoop;

// Scopes
OPEN_SCOPE          : '{ ';
CLOSE_SCOPE         : '}';

// Data Types
INT                 : 'int';
BOOL                : 'bool';
FPTR                : 'fptr';
SET                 : 'set';

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
COMMENT             : '#' ~[\r\n]* -> skip;