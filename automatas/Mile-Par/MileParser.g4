grammar MileParser;

import MileLexer;

s 		: operation EOF					
		;

program	: start_block stat+	end_block	
		;

stat		: declaration
			| assign
    		| operation
    		| if_block
    		| read_block
    		| write_block
    		;

start_block : BEGIN_RW	
			;

end_block	: END_RW		
			;

operation  	: operation PLUS operation 							# plus
            | operation ( EQUAL | NQUAL | LT | GT) operation 	# comp
            | operation AND operation 							# and
            | operation OR operation 							# or
            | ID 												# id
            | LPAR operation RPAR 								# parens
            ;

if_block	: IF_RW condition_block  
			  (ELSE_RW else_block)? 
			;

condition_block	: LPAR operation RPAR EXC_MARK block EXC_MARK
				| LPAR operation RPAR stat
				;

else_block	: EXC_MARK block EXC_MARK
            | stat
			;
			
block		: stat* 
			;

assign 		: ID ASSIGN 
			( operation 
			| ID 
			| NUMBER 
			| FLOAT 
			| STRING 
			| BOOLEAN
			) ; 

variable_type	: INTEGER_RW
				| STRING_RW
				| BOOLEAN_RW
				| FLOAT_RW
				;

declaration		: variable_type ID 
				| variable_type assign  
				;

read_block: READ_RW LPAR ID RPAR # read;

write_block: WRITE_RW LPAR (STRING | ID)+ RPAR # print;
