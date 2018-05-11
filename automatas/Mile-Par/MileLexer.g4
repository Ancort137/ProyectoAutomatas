lexer grammar MileLexer;

fragment TRUE	: 'accept'		;
fragment FALSE	: 'refuse'		;
fragment NUMBER	: [0-9]			;
fragment LETTER : [a-zA-Z]		;
fragment DOT	: '.'			;

EXC_MARK: '!'	;
PLUS 	: '+'	;
MINUS	: '-'	;
AND		: 'and'	;
OR		: 'or'	;
EQUAL	: '='	;
NQUAL	: '<>'	;
LTHAN	: '<'	;
GTHAN	: '>'	;

ASSIGN 	: '<->'	;
LPAR	: '('	;
RPAR	: ')'	;
LBRACE	: '{'	;
RBRACE	: '}'	;

BEGIN_RW	: 'born'		;
END_RW		: 'die'			;

IF_RW		: 'attack'		;
ELSE_RW		: 'defend'		;

FOR_RW		: 'journey'		;
WHILE_RW	: 'travel'		;

READ_RW		: 'listen'		;
WRITE_RW	: 'talk'		;
INTEGER_RW	: 'mage'		;
STRING_RW	: 'knight'		;
FLOAT_RW	: 'priest'		;
BOOLEAN_RW	: 'thief'		;

INT		: NUMBER+				;
FLOAT 	: INT DOT INT		;
BOOLEAN : TRUE | FALSE		;
STRING 	: '"' .*? '"'		;

ID		: LETTER+ (LETTER|NUMBER)*		;
COMMENT	:  '||' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;


