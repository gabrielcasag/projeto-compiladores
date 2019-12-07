lexer grammar JmmLexer ;

/***************************************************
 *             Lexer - Skips                       *
 **************************************************/

NEW_LINE            : ('\r' ? '\n') -> skip;
WS                  : [ \t\r\n\u000C]+ -> skip;
COMMENTS            : '//' ~[\r\n]* -> skip;

/***************************************************
 *             Lexer - Fragments                   *
 **************************************************/

fragment
LETTER              : ('a' .. 'z') | ('A'..'Z');

fragment
DIGIT               : ('0'..'9');

/***************************************************
 *             Lexer - Reserved Words              *
 **************************************************/

PUBLIC              : 'public';
PRIVATE             : 'private';
PROTECTED           : 'protected';
STATIC              : 'static';
ABSTRACT            : 'abstract';
INT                 : 'int';
CHAR                : 'char';
BOOLEAN             : 'boolean';
VOID                : 'void';
TRUE                : 'true';
FALSE               : 'false';
EXTENDS             : 'extends';
CLASS               : 'class';
IMPORT              : 'import';
PACKAGE             : 'package';
SUPER               : 'super';
THIS                : 'this';
NEW                 : 'new';
RETURN              : 'return';
NULL                : 'null';
IF                  : 'if';
ELSE                : 'else';
WHILE               : 'while';
INSTANCEOF          : 'instanceof';

/***************************************************
 *             Lexer - Operators                   *
 **************************************************/

GREATER_THAN         : '>';
LESS_EQUAL           : '<=';
EQUAL                : '==';
AND                  : '&&';
ASSIGN               : '=';
NOT                  : '!';
ADD                  : '+';
SUB                  : '-';
MULT                 : '*';
INCREMENT            : '++';
DECREMENT            : '--';
PLUS                 : '+=';


/***************************************************
 *             Lexer - Separators                  *
 **************************************************/

OPEN_PARENTHESIS     : '(';
CLOSE_PARENTHESIS    : ')';
OPEN_BRACES          : '{';
CLOSE_BRACES         : '}';
OPEN_BRACKETS        : '[';
CLOSE_BRACKETS       : ']';
SEMICOLON            : ';';
COLON                : ',';
DOT                  : '.';
TWOPOINTS            : ':';

/***************************************************
 *             Lexer - Literals                    *
 **************************************************/

ERROR               : DIGIT+IDENTIFIER+ ;
IDENTIFIER          : (LETTER | '_' | '$') (LETTER | DIGIT | '_' | '$')*;
ESC                 : '\\' ('n'|'r'|'t'|'b'|'f'|'\''|'"'|'\\') ;
INT_LITERAL         : '0' | ('1'..'9')(DIGIT)*;
CHAR_LITERAL        : '\'' . '\'' ;
STRING              : '"' .*? '"'  ;





