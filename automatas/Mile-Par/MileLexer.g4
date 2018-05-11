lexer grammar MileLexer;

fragment TRUE	: 'accept'			;
fragment FALSE	: 'decline'			;
fragment NAT	: [0-9]				;
fragment DOT	: '.'				;

EXC_MARK: '!'	;
PLUS 	: '+'	;
MINUS	: '-'	;
AND		: '$$'	;
OR		: '//'	;
EQUAL	: '='	;
NQUAL	: '<>'	;
GT		: '>'	;
LT		: '<'	;
LPAR	: '('	;
RPAR	: ')'	;
LBRACE	: '{'	;
RBRACE	: '}'	;

BEGIN_RW	: 'born'		;
END_RW		: 'die'			; 
IF_RW		: 'attack'		;
ELSE_RW		: 'defend'		;
//ENDIF_RW	: 'fin_si'		;
READ_RW		: 'listen'		;
WRITE_RW	: 'talk'		;
INTEGER_RW	: 'mage'		;
STRING_RW	: 'knigth'		;
FLOAT_RW	: 'priest'		;
BOOLEAN_RW	: 'thief'		;


NUMBER	: NAT+				;
FLOAT 	: NUMBER DOT NUMBER	;
BOOLEAN : TRUE | FALSE		;
STRING 	: '"' .*? '"'		;

ASSIGN 	: LT MINUS GT		;

ID		: [a-zA-Z]+.([a-zA-Z0-9])*		;
COMMENT	:  '||' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;

POW		: 'buff'	;
SQRT	: 'nerf'	;
ABS		: 'clean'	;
RAND	: 'roll'	;



