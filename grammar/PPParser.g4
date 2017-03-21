parser grammar PPParser;

options {
	tokenVocab=PPLexer;
}

@header{
        import com.proteus.preprocess.pp.ext.*;
}

start locals [ StartContextExt extendedContext ] : text+ EOF; 

module_declaration locals [ Module_declarationContextExt extendedContext ] :
        (module_header atext* endmodule_rule ( colon_rule id)?)
        | (extern_rule  module_header);

module_header locals [ Module_headerContextExt extendedContext ] :
        module_keyword lifetime? id;

lifetime locals [ LifetimeContextExt extendedContext ] : static_rule | automatic_rule;

module_keyword locals [ Module_keywordContextExt extendedContext ] :
        module_rule | macromodule_rule;
        
atext locals [ AtextContextExt extendedContext ] : (id | token)(id|token)*?;

text locals [ TextContextExt extendedContext ]  : pp_statement | npp_statements;

npp_statements locals [ Npp_statementsContextExt extendedContext ] : npp_statement+;

npp_statement locals [ Npp_statementContextExt extendedContext ] :module_header | endmodule_rule | module_instantiation |atext;

module_instantiation locals [ Module_instantiationContextExt extendedContext ] : id pp_statement* ( parameter_value_assignment )? pp_statement* hierarchical_instance pp_statement* ( comma_rule pp_statement* hierarchical_instance pp_statement*  )* semi_rule;

parameter_value_assignment locals [ Parameter_value_assignmentContextExt extendedContext ] : hash_rule pp_statement*  lparen_rule pp_statement* ( list_of_parameter_assignments )? pp_statement* rparen_rule;

list_of_parameter_assignments locals [ List_of_parameter_assignmentsContextExt extendedContext ] : 
    named_parameter_assignment ( comma_rule pp_statement* named_parameter_assignment )*
    | mintypmax_expression ( comma_rule pp_statement* mintypmax_expression )*;
	
mintypmax_expression locals [ Mintypmax_expressionContextExt extendedContext ] :
    atext pp_statement* (atext pp_statement*)*?
     | atext pp_statement* colon_rule  pp_statement* atext pp_statement* colon_rule pp_statement* atext pp_statement* ;

named_parameter_assignment locals [ Named_parameter_assignmentContextExt extendedContext ] : 
	dot_rule pp_statement* id pp_statement* lparen_rule pp_statement* ( mintypmax_expression )? pp_statement*  rparen_rule;

hierarchical_instance locals [ Hierarchical_instanceContextExt extendedContext ] : 
	name_of_instance pp_statement* lparen_rule pp_statement*  ( list_of_port_connections )? pp_statement* rparen_rule;

name_of_instance locals [ Name_of_instanceContextExt extendedContext ] : 
	id pp_statement* (lbrack_rule pp_statement* atext pp_statement* rbrack_rule pp_statement* )*;
	
list_of_port_connections locals [ List_of_port_connectionsContextExt extendedContext ] :
	ordered_port_connection pp_statement*  ( comma_rule pp_statement* ordered_port_connection pp_statement* )*
	| named_port_connection pp_statement* ( comma_rule pp_statement* named_port_connection pp_statement* )*;
	
ordered_port_connection locals [ Ordered_port_connectionContextExt extendedContext ] : 
	attribute_instance* pp_statement* ports_atext*?;

ports_atext locals [ Ports_atextContextExt extendedContext ] :  (id|ports_token)(id|ports_token)*? ;
	
named_port_connection locals [ Named_port_connectionContextExt extendedContext ] :
	attribute_instance* pp_statement* dot_rule pp_statement* id pp_statement* ( lparen_rule pp_statement* ( atext )? pp_statement* rparen_rule )?;
	
attribute_instance locals [ Attribute_instanceContextExt extendedContext ] : 
	lparenstar_rule pp_statement* attr_spec pp_statement*  (comma_rule pp_statement* attr_spec pp_statement* )*  starrparen_rule pp_statement* ;
	
attr_spec locals [ Attr_specContextExt extendedContext ] : id pp_statement* ( assign_rule pp_statement*  atext )?;

pp_statement locals [ Pp_statementContextExt extendedContext ] : (conditional_statement | define_r | undef_r | include_r | timescale_r |tick_token | resetall_r);

conditional_statement locals [ Conditional_statementContextExt extendedContext ] :
                ((if_p|if_n_def_p) if_id conditional_statement_text conditional_statement_part1 conditional_statement_part2);

conditional_statement_text locals [ Conditional_statement_textContextExt extendedContext ] : text*;

conditional_statement_part1 locals [ Conditional_statement_part1ContextExt extendedContext ] :
                conditional_statement_part1_else_id_statement_or_null* ;
                
conditional_statement_part1_else_id_statement_or_null locals [ Conditional_statement_part1_else_id_statement_or_nullContextExt extendedContext ] :
				 (elseif_p if_id conditional_statement_text);

conditional_statement_part2 locals [ Conditional_statement_part2ContextExt extendedContext ] :
       ( ( else_p conditional_statement_text )? endif_p );

if_id locals [ If_idContextExt extendedContext ] : id (lparen_rule id (comma_rule id)* rparen_rule )?;

define_r locals [ Define_rContextExt extendedContext ]  : define_p ppspace_rule* define_id ppspace_rule* define_text ppspace_rule* ppnl?;

undef_r locals [ Undef_rContextExt extendedContext ] : undef_p id;
 
include_r locals [ Include_rContextExt extendedContext ] : (include_r_def ppnl);

include_r_def locals [ Include_r_defContextExt extendedContext ] : (include_p ppspace_rule* file_name ppspace_rule*);

file_name locals [ File_nameContextExt extendedContext ] : ppstring_rule;

timescale_r locals [ Timescale_rContextExt extendedContext ] : timescale_p ppspace_rule* ppid_timescale_rule  ppspace_rule* ppnl;

define_id locals [ Define_idContextExt extendedContext ] : ppid_rule ppspace_rule* pplparen_rule ppspace_rule* ppid_rule ppspace_rule* (ppcomma_rule ppspace_rule* ppid_rule ppspace_rule* )* pprparen_rule | ppid_rule ;

resetall_r locals [ Resetall_rContextExt extendedContext ] : resetall_p ppspace_rule* ppnl;

tick_token locals [ Tick_tokenContextExt extendedContext ] : (tick_id_rule (lparen_rule tick_token_id (comma_rule tick_token_id)* rparen_rule )?) ;

tick_token_id locals [ Tick_token_idContextExt extendedContext ] : (id|id_with_number_rule) (id|id_with_number_rule)*;

if_p locals [ If_pContextExt extendedContext ] : COMMENT? IF COMMENT?;

if_n_def_p locals [ If_n_def_pContextExt extendedContext ] : COMMENT? IFNDEF COMMENT?;

elseif_p locals [ Elseif_pContextExt extendedContext ] : COMMENT? ELSEIF COMMENT?;

else_p locals [ Else_pContextExt extendedContext ] : COMMENT? ELSE COMMENT?;

endif_p locals [ Endif_pContextExt extendedContext ] : COMMENT? ENDIF COMMENT?;

define_p locals [ Define_pContextExt extendedContext ] : COMMENT? DEFINE COMMENT?;
 
undef_p locals [ Undef_pContextExt extendedContext ] : COMMENT? UNDEF COMMENT?;

resetall_p locals [ Resetall_pContextExt extendedContext ] : COMMENT? RESETALL COMMENT?;

include_p  locals [ Include_pContextExt extendedContext ] : COMMENT? INCLUDE COMMENT?;
 
timescale_p locals [ Timescale_pContextExt extendedContext ] : COMMENT? TIMESCALE COMMENT?;

id locals [ IdContextExt extendedContext ] : COMMENT? ID COMMENT?;

nl locals [ NlContextExt extendedContext ] : COMMENT? NL COMMENT?;

ppnl locals [ PpnlContextExt extendedContext ] : COMMENT? PPNL COMMENT?;

extern_rule locals [ Extern_ruleContextExt extendedContext ] : COMMENT? EXTERN COMMENT?;

static_rule locals [ Static_ruleContextExt extendedContext ] : COMMENT? STATIC COMMENT?;

automatic_rule locals [ Automatic_ruleContextExt extendedContext ] : COMMENT? AUTOMATIC COMMENT?;

module_rule locals [ Module_ruleContextExt extendedContext ] : COMMENT? MODULE COMMENT?;

macromodule_rule locals [ Macromodule_ruleContextExt extendedContext ] :  COMMENT? MACROMODULE COMMENT?;

endmodule_rule locals [ Endmodule_ruleContextExt extendedContext ] : COMMENT? ENDMODULE COMMENT?;

comma_rule locals [ Comma_ruleContextExt extendedContext ] : COMMENT? COMMA COMMENT?;

semi_rule locals [ Semi_ruleContextExt extendedContext ] : COMMENT? SEMI COMMENT?;

colon_rule  locals [ Colon_ruleContextExt extendedContext ] : COMMENT? COLON COMMENT?;

hash_rule locals [ Hash_ruleContextExt extendedContext ]  : COMMENT? HASH COMMENT?;

lparen_rule locals [ Lparen_ruleContextExt extendedContext ]  : COMMENT? LPAREN COMMENT?;

rparen_rule locals [ Rparen_ruleContextExt extendedContext ]  : COMMENT? RPAREN COMMENT?;

dot_rule locals [ Dot_ruleContextExt extendedContext ]  : COMMENT? DOT COMMENT?;	

lbrack_rule locals [ Lbrack_ruleContextExt extendedContext ] : COMMENT? LBRACK COMMENT?;	

rbrack_rule locals [ Rbrack_ruleContextExt extendedContext ] : COMMENT? RBRACK COMMENT?;	

lparenstar_rule locals [ Lparenstar_ruleContextExt extendedContext ] : COMMENT? LPARENSTAR COMMENT?;

starrparen_rule locals [ Starrparen_ruleContextExt extendedContext ] : COMMENT? STARRPAREN COMMENT?;

assign_rule locals [ Assign_ruleContextExt extendedContext ] : COMMENT? ASSIGN COMMENT?;

ppspace_rule locals [ Ppspace_ruleContextExt extendedContext ] : COMMENT? PPSPACE COMMENT?;

ppstring_rule locals [ Ppstring_ruleContextExt extendedContext ] : COMMENT? PPSTRING COMMENT?;

ppid_rule locals [ Ppid_ruleContextExt extendedContext ] : COMMENT? PPID COMMENT?;

ppid_timescale_rule locals [ Ppid_timescale_ruleContextExt extendedContext ] : COMMENT? (PPSPACE|PPID|PPID_NUMBER|pptoken|PPTOKEN) (PPSPACE|PPID|PPID_NUMBER|pptoken|PPTOKEN)* COMMENT?;

pplparen_rule locals [ Pplparen_ruleContextExt extendedContext ]  : COMMENT? PPLPAREN COMMENT?;

pprparen_rule locals [ Pprparen_ruleContextExt extendedContext ]  : COMMENT? PPRPAREN COMMENT?;

ppcomma_rule locals [ Ppcomma_ruleContextExt extendedContext ] : COMMENT? PPCOMMA COMMENT?;

tick_id_rule locals [ Tick_id_ruleContextExt extendedContext ] : COMMENT? TICK_ID COMMENT?;

id_with_number_rule locals [ Id_with_number_ruleContextExt extendedContext ] : COMMENT? ID_WITH_NUMBER COMMENT?;

ports_token locals [ Ports_tokenContextExt extendedContext ] : lparen_rule | rparen_rule | lbrack_rule | rbrack_rule |assign_rule | hash_rule |dot_rule | colon_rule | semi_rule | id_with_number_rule |(COMMENT?  (AT_RATE | QUESTIONMARK | ATMARK | PLUS | MINUS | NOT |COMPLIMENT | AND | NAND | OR | NOR | XOR | XORN | XNOR | STAR | DIV | MODULO | EQUALS | NOT_EQUALS | CASE_EQUALITY | CASE_INEQUALITY | CASE_Q | NOT_CASE_Q | LOG_AND | LOG_OR| LT | LE | GT | GE | RSHIFT | LSHIFT | ARSHIFT | ALSHIFT | DERIVE | DDERIVE | STARSTAR  | LCURL | RCURL | DOUBLE_HASH | HASH_ZERO | DOLLAR | ESCAPE | BEGIN | GENERATE | ASSUME | FOR | ONLYIF | ONLYELSE | COMMENT | ATTHERATELPAREN | ANDANDAND  |LPARENSTARRPAREN | STARTCOLONCOLONSTAR |DOTSTAR | UNSIGNED_LSHIFT_ASSIGN | PERCENTILEEQUAL | ESCAPELCURL | SCALAR_CONSTANT1 | COLONSLASH | XOREQUAL | ATTHERATESTAR | RSHIFT_ASSIGN | UNSIGNED_RSHIFT_ASSIGN | STARGT | MINUSEQUALS | MINUSCOLON | STARTEQUALS | ORDERIVE | SCALAR_CONSTANT0 | OREQUAL | ORIMPLIES | IMPLIES | PLUSEQUALS | COLONCOLON | PLUSCOLON | SLASHEQUALS | DERIVEGT | LSHIFT_ASSIGN | ANDEQUALS ) COMMENT?);

token locals [ TokenContextExt extendedContext ] : lparen_rule | rparen_rule | lbrack_rule | rbrack_rule |assign_rule | hash_rule |dot_rule |comma_rule | colon_rule | semi_rule | id_with_number_rule |(COMMENT?  (STRING | AT_RATE | QUESTIONMARK | ATMARK | PLUS | MINUS | NOT |COMPLIMENT | AND | NAND | OR | NOR | XOR | XORN | XNOR | STAR | DIV | MODULO | EQUALS | NOT_EQUALS | CASE_EQUALITY | CASE_INEQUALITY | CASE_Q | NOT_CASE_Q | LOG_AND | LOG_OR| LT | LE | GT | GE | RSHIFT | LSHIFT | ARSHIFT | ALSHIFT | DERIVE | DDERIVE | STARSTAR  | LCURL | RCURL | DOUBLE_HASH | HASH_ZERO | DOLLAR | ESCAPE | BEGIN | GENERATE  | ASSUME | FOR | ONLYIF | ONLYELSE | COMMENT | ATTHERATELPAREN | ANDANDAND  |LPARENSTARRPAREN | STARTCOLONCOLONSTAR |DOTSTAR | UNSIGNED_LSHIFT_ASSIGN | PERCENTILEEQUAL | ESCAPELCURL | SCALAR_CONSTANT1 | COLONSLASH | XOREQUAL | ATTHERATESTAR | RSHIFT_ASSIGN | UNSIGNED_RSHIFT_ASSIGN | STARGT | MINUSEQUALS | MINUSCOLON | STARTEQUALS | ORDERIVE | SCALAR_CONSTANT0 | OREQUAL | ORIMPLIES | IMPLIES | PLUSEQUALS | COLONCOLON | PLUSCOLON | SLASHEQUALS | DERIVEGT | LSHIFT_ASSIGN | ANDEQUALS ) COMMENT?);

pptoken locals [ PptokenContextExt extendedContext ]  : COMMENT? ( PPNUMBER | PPSTRING | PPAT_RATE |PPQUESTIONMARK | PPTICK_ID | PPATMARK | PPPLUS | PPMINUS | PPNOT | PPCOMPLIMENT | PPAND | PPNAND | PPOR | PPNOR | PPXOR | PPXORN | PPXNOR | PPSTAR | PPDIV | PPMODULO | PPEQUALS | PPNOT_EQUALS | PPCASE_EQUALITY | PPCASE_INEQUALITY | PPCASE_Q | PPNOT_CASE_Q | PPLOG_AND | PPLOG_OR| PPLT | PPLE | PPGT | PPGE | PPRSHIFT | PPLSHIFT | PPARSHIFT | PPALSHIFT | PPDERIVE | PPDDERIVE | PPLBRACK| PPRBRACK | PPLPAREN | PPRPAREN | PPSTARSTAR | PPASSIGN | PPLCURL | PPRCURL | PPDOT |COMMA | PPSEMI | PPCOLON | PPHASH | PPDOUBLE_HASH | PPHASH_ZERO | PPDOLLAR | PPESCAPE | PPBEGIN | PPGENERATE  | PPASSUME | PPFOR | PPONLYIF | PPONLYELSE | PPDOTSTAR | PPUNSIGNED_LSHIFT_ASSIGN | PPSTARTCOLONCOLONSTAR | PPATTHERATESTAR | PPESCAPELCURL | PPCOLONSLASH | PPSCALAR_CONSTANT1 | PPXOREQUAL | PPRSHIFT_ASSIGN | PPPERCENTILEEQUAL | PPUNSIGNED_RSHIFT_ASSIGN | PPMINUSCOLON | PPMINUSEQUALS | PPORDERIVE | PPSTARTEQUALS | PPSCALAR_CONSTANT0 | PPIMPLIES | PPORIMPLIES | PPPLUSEQUALS | PPSLASHEQUALS | PPPLUSCOLON | PPDERIVEGT | PPLSHIFT_ASSIGN | PPANDEQUALS | PPCOLONCOLON | PPOREQUAL | PPSTARGT  | PPANDANDAND | PPATTHERATELPAREN | PPLPARENSTARRPAREN);// | PPBACKSLASH) COMMENT?;

define_text locals [ Define_textContextExt extendedContext ] : (PPSPACE|PPID|PPID_NUMBER|pptoken|PPTOKEN) (PPSPACE|PPID|PPID_NUMBER|pptoken|PPTOKEN)*;
