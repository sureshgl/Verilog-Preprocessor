/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar Verilogpp;

DIRECTIVE:
             '`' ID;

ID: [a-zA-Z_] [a-zA-Z0-9_$]*; 

STRING: '"' ( ~[\n\r] )* '"';

WS  :  ' '|'\t' 
    ;
    
NEWLINE: '\n'
		|'\r''\n';
		
OLC : '//' .*? '\r'? '\n' ;
BC : '/*' .*? '*/' ;

DUMMY : .;
