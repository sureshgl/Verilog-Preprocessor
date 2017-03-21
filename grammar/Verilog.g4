/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Verilog;


//A.1.1 Library Source Text
/*library_text : 
	( library_description )*;
library_description :
	library_declaration
	| include_statement
	| config_declaration
	| SEMI;
	
library_declaration :
	'library' library_identifier file_path_spec ( COMMA file_path_spec )*
	( '-incdir' file_path_spec ( COMMA file_path_spec )* )? SEMI;

include_statement : 'include' file_path_spec SEMI;

file_path_spec
	:	identifier;
	
*/
//A.1.2 SystemVerilog source text
source_text : 
	timeunits_declaration? description* EOF;

description :
	module_declaration
	| udp_declaration
	| interface_declaration
	| program_declaration
	| checker_declaration
	| package_declaration
	| attribute_instance* (package_item|bind_directive)
	//| config_declaration*
	;

module_declaration :
	module_nonansi_header timeunits_declaration? module_item*
		'endmodule' ( COLON module_identifier )?
	|
        module_ansi_header timeunits_declaration? non_port_module_item*
		'endmodule' ( COLON module_identifier )?
	//| attribute_instance* module_keyword  lifetime? module_identifier LPAREN '.*' RPAREN SEMI
	//	timeunits_declaration?  module_item* 'endmodule' ( COLON module_identifier )?
	| 'extern' (module_nonansi_header|module_ansi_header);
	
module_nonansi_header :
	attribute_instance* module_keyword lifetime? module_identifier
	( package_import_declaration )*  parameter_port_list? list_of_ports SEMI;

module_ansi_header :
	attribute_instance* module_keyword lifetime? module_identifier
	( package_import_declaration )* parameter_port_list? list_of_port_declarations? SEMI;


module_keyword : 
	'module' | 'macromodule';

interface_declaration :
	interface_nonansi_header timeunits_declaration? interface_item*
		'endinterface' ( COLON interface_identifier )?
	| interface_ansi_header timeunits_declaration? non_port_interface_item*
		'endinterface' ( COLON interface_identifier )?
	| attribute_instance* 'interface' interface_identifier LPAREN '.*' RPAREN SEMI
		timeunits_declaration? interface_item*
		'endinterface' ( COLON interface_identifier )?
	| 'extern' (interface_nonansi_header|interface_ansi_header)
;
	
interface_nonansi_header :
	attribute_instance* 'interface' lifetime? interface_identifier
		(package_import_declaration)* parameter_port_list? list_of_ports SEMI;
		
interface_ansi_header :
	attribute_instance* 'interface' lifetime? interface_identifier
		package_import_declaration* parameter_port_list? list_of_port_declarations? ;

program_declaration :
	program_nonansi_header timeunits_declaration? program_item*
		'endprogram' ( COLON program_identifier)?
	| program_ansi_header timeunits_declaration? ( non_port_program_item)*
		'endprogram' ( COLON program_identifier )?
	| attribute_instance* 'program' program_identifier LPAREN '.*' RPAREN SEMI
		timeunits_declaration? program_item*
		'endprogram' ( COLON program_identifier )?
	| 'extern' (program_nonansi_header|program_ansi_header)
;

program_nonansi_header :
	attribute_instance* 'program' lifetime? program_identifier
		( package_import_declaration )* parameter_port_list? list_of_ports SEMI;

program_ansi_header :
	attribute_instance* 'program' lifetime? program_identifier
		( package_import_declaration )* parameter_port_list? list_of_port_declarations? SEMI;
 
checker_declaration :
	'checker' checker_identifier ( LPAREN checker_port_list? RPAREN )? SEMI
		checker_or_generate_item*
		'endchecker' ( COLON checker_identifier )?;
		
class_declaration :
	('virtual')? 'class' lifetime? class_identifier parameter_port_list?
	( 'extends' class_type ( LPAREN list_of_arguments RPAREN )? )? SEMI
	class_item*
	'endclass' ( COLON class_identifier)?;
	
package_declaration :
	attribute_instance* 'package' lifetime? package_identifier SEMI
	timeunits_declaration? ( attribute_instance* package_item )*
	'endpackage' ( COLON package_identifier )?;
	
timeunits_declaration :
	TIMEUNIT time_literal ( '/' time_literal )? SEMI
	//| TIMEPRECISION time_literal SEMI (TIMEUNIT time_literal SEMI)?
	//| TIMEUNIT time_literal SEMI TIMEPRECISION time_literal SEMI
 ;
	
//A.1.3 Module parameters and ports

parameter_port_list :
	HASH LPAREN ((list_of_param_assignments ( COMMA parameter_port_declaration )*)|list_of_parameter_port_declaration)? RPAREN
;

list_of_parameter_port_declaration
	:
	parameter_port_declaration ( COMMA parameter_port_declaration )*	;	
parameter_port_declaration :
	parameter_declaration
	| local_parameter_declaration
	| data_type list_of_param_assignments
	| 'type' list_of_type_assignments;
	
list_of_ports : LPAREN port ( COMMA port )* RPAREN;

list_of_port_declarations :
	LPAREN ( attribute_instance* ansi_port_declaration ( COMMA  attribute_instance* ansi_port_declaration )* )? RPAREN;
	
port_declaration :
	attribute_instance* (inout_declaration|input_declaration|output_declaration|ref_declaration|interface_port_declaration)
;

port :
	( port_expression )?
	| DOT port_identifier LPAREN  port_expression? RPAREN;
	
port_expression :
	port_reference
	| LCURL port_reference ( COMMA port_reference )* RCURL;
	
port_reference :
	port_identifier constant_select;
	
port_direction : 'input' | 'output' | 'inout' | 'ref';

net_port_header : ( port_direction )? net_port_type;

variable_port_header : ( port_direction )? variable_port_type;

interface_port_header :
	interface_identifier ( DOT modport_identifier )?
	| 'interface' ( DOT modport_identifier )?;
	
ansi_port_declaration :
	( net_port_header | interface_port_header )? port_identifier ( unpacked_dimension )*
		( ASSIGN constant_expression )?
	| variable_port_header? port_identifier variable_dimension* ( ASSIGN constant_expression )?
	| ( port_direction )? DOT port_identifier LPAREN  expression? RPAREN;	
	
//A.1.4 Module items
elaboration_system_task :
	'$fatal' ( LPAREN finish_number (COMMA list_of_arguments )? RPAREN )? SEMI
	| '$error' ( LPAREN list_of_arguments? RPAREN )? SEMI
	| '$warning' ( LPAREN list_of_arguments? RPAREN )? SEMI
	| '$info' ( LPAREN list_of_arguments? RPAREN )? SEMI;

finish_number : number;//'0' | '1' | '2';

module_common_item :
	module_or_generate_item_declaration
	| interface_instantiation
	| program_instantiation
	| assertion_item
	| bind_directive
	| continuous_assign
	| net_alias
	| initial_construct
	| final_construct
	| always_construct
	| loop_generate_construct
	| conditional_generate_construct
	| elaboration_system_task;

module_item :
	port_declaration SEMI
	| non_port_module_item;
	
module_or_generate_item :
	attribute_instance* parameter_override
	| attribute_instance* gate_instantiation
	| attribute_instance* udp_instantiation
	| attribute_instance* module_instantiation
	| attribute_instance* module_common_item;
	

non_port_module_item :
	generate_region
	| module_or_generate_item
	| specify_block
	| attribute_instance* specparam_declaration
	| program_declaration
	| module_declaration
	| interface_declaration
	| timeunits_declaration
	| checker_declaration;

parameter_override : 
	'defparam' list_of_defparam_assignments SEMI;
	
bind_directive :
	'bind' bind_target_scope (COLON bind_target_instance_list)? bind_instantiation SEMI
	| 'bind' bind_target_instance bind_instantiation SEMI;
	
bind_target_scope :
	module_identifier
	| interface_identifier;
	
bind_target_instance :
	hierarchical_identifier constant_bit_select;
	
bind_target_instance_list :
	bind_target_instance ( COMMA bind_target_instance )*;
	
bind_instantiation :
	program_instantiation
	| module_instantiation
	| interface_instantiation
	| checker_instantiation;	
	
	
//A.1.5 Configuration source text
config_declaration :
	'config' config_identifier SEMI
		( local_parameter_declaration )*
		design_statement
		( config_rule_statement )*
	'endconfig' ( COLON config_identifier )?;
	
design_statement : 
	'design' ( ( library_identifier DOT )? cell_identifier )* SEMI;
	
config_rule_statement :
	default_clause liblist_clause SEMI
	| inst_clause liblist_clause SEMI
	| inst_clause use_clause SEMI
	| cell_clause liblist_clause SEMI
	| cell_clause use_clause SEMI;
	
default_clause : 
	'default';

inst_clause : 
	'instance' inst_name;
	
inst_name : 
	topmodule_identifier ( DOT instance_identifier )*;

cell_clause : 
	'cell' ( library_identifier DOT )? cell_identifier;
	
liblist_clause : 
	'liblist' (library_identifier)?;
	
use_clause : 
	'use' ( library_identifier DOT )? cell_identifier ( COLON 'config' )?
	| 'use' named_parameter_assignment ( COMMA named_parameter_assignment )* ( COLON 'config' )?
	| 'use' ( library_identifier DOT )? cell_identifier named_parameter_assignment
		( COMMA named_parameter_assignment )* ( COLON 'config' )?;

module_or_generate_item_declaration :
	package_or_generate_item_declaration
	| genvar_declaration
	| clocking_declaration
	| 'default' 'clocking' clocking_identifier SEMI
	| 'default' 'disable' 'iff' expression_or_dist SEMI;
//A.1.6 Interface items
interface_or_generate_item :
	attribute_instance* module_common_item
	| attribute_instance* modport_declaration
	| attribute_instance* extern_tf_declaration;
	
extern_tf_declaration :
	'extern' method_prototype SEMI
	| 'extern' 'forkjoin' task_prototype SEMI;
	
interface_item :
	port_declaration SEMI
	| non_port_interface_item;
	
non_port_interface_item :
	generate_region
	| interface_or_generate_item
	| program_declaration
	| interface_declaration
	| checker_declaration
	| timeunits_declaration;

//A.1.7 Program items
program_item :
	port_declaration SEMI
	| non_port_program_item;
	
non_port_program_item :
	attribute_instance* continuous_assign
	| attribute_instance* module_or_generate_item_declaration
	| attribute_instance* initial_construct
	| attribute_instance* final_construct
	| attribute_instance* concurrent_assertion_item
	| attribute_instance* timeunits_declaration
	| program_generate_item;

program_generate_item :
	loop_generate_construct
	| conditional_generate_construct
	| generate_region
	| elaboration_system_task;
	
//A.1.8 Checker items
checker_port_list :
	checker_port_item (COMMA checker_port_item)*;
	
checker_port_item :
	attribute_instance* property_formal_type port_identifier variable_dimension*
	( ASSIGN property_actual_arg )?;
	
checker_or_generate_item :
	checker_or_generate_item_declaration
	| initial_construct
	| checker_always_construct
	| final_construct
	| assertion_item
	| checker_generate_item;
	
checker_or_generate_item_declaration :
	data_declaration
	| function_declaration
	| assertion_item_declaration
	| covergroup_declaration
	| overload_declaration
	| genvar_declaration
	| clocking_declaration
	| 'default' 'clocking' clocking_identifier SEMI
	| 'default' 'disable' 'iff' expression_or_dist SEMI
	| SEMI;

checker_generate_item :
	loop_generate_construct
	| conditional_generate_construct
	| generate_region
	| elaboration_system_task;
	
checker_always_construct : 'always' statement;

//A.1.9 Class items
class_item :
	attribute_instance* class_property
	| attribute_instance* class_method
	| attribute_instance* class_constraint
	| attribute_instance* class_declaration
	| attribute_instance* covergroup_declaration
	| local_parameter_declaration SEMI
	| parameter_declaration SEMI
	| SEMI;

class_property :
	( property_qualifier )* data_declaration
	| 'const' class_item_qualifier* data_type const_identifier ( ASSIGN constant_expression )? SEMI;

class_method :
	method_qualifier* task_declaration
	| method_qualifier* function_declaration
	| 'extern' method_qualifier* method_prototype SEMI
	| method_qualifier* class_constructor_declaration
	| 'extern' method_qualifier* class_constructor_prototype;
	
class_constructor_prototype :
	'function' 'new' LPAREN tf_port_list? RPAREN SEMI;
	
class_constraint :
	constraint_prototype
	| constraint_declaration;
	
class_item_qualifier :
	'static'
	| 'protected'
	| 'local';

property_qualifier :
	random_qualifier
	| class_item_qualifier;
	
random_qualifier :
	'rand'
	| 'randc';

method_qualifier :
	'pure'? 'virtual'
	| class_item_qualifier;
	
method_prototype :
	task_prototype
	| function_prototype;
	
class_constructor_declaration :
	'function' class_scope? 'new' ( LPAREN tf_port_list? RPAREN )? SEMI
		block_item_declaration?
		( 'super' DOT 'new' ( LPAREN list_of_arguments RPAREN )? SEMI )?
		function_statement_or_null*
		'endfunction' ( COLON 'new' )?;

//A.1.10 Constraints
constraint_declaration : 
	('static')? 'constraint' constraint_identifier constraint_block;

constraint_block : 
	LCURL constraint_block_item* RCURL;
	
constraint_block_item :
	'solve' solve_before_list 'before' solve_before_list SEMI
	| constraint_expression;
	
solve_before_list : 
	solve_before_primary ( COMMA solve_before_primary )*;

solve_before_primary : 
	( implicit_class_handle DOT | class_scope )? hierarchical_identifier select;
	
constraint_expression :
	expression_or_dist SEMI
	| expression '->' constraint_set
	| 'if' LPAREN expression RPAREN constraint_set ( 'else' constraint_set )?
	| 'foreach' LPAREN ps_or_hierarchical_array_identifier LBRACK loop_variables RBRACK RPAREN constraint_set;
	
constraint_set :
	constraint_expression
	| LCURL ( constraint_expression )* RCURL;
	
dist_list : 
	dist_item ( COMMA dist_item )*;
	
dist_item : 
	value_range dist_weight?;
	
dist_weight :
	':=' expression
	| ':/' expression;
	
constraint_prototype : 
	'static'? 'constraint' constraint_identifier SEMI;

extern_constraint_declaration :
	'static'? 'constraint' class_scope constraint_identifier constraint_block;
	
identifier_list : 
	identifier ( COMMA identifier )*;

//A.1.11 Package items

package_item :
	package_or_generate_item_declaration
	| anonymous_program
	| package_export_declaration
	| timeunits_declaration;

package_or_generate_item_declaration :
	net_declaration
	| data_declaration
	| task_declaration
	| function_declaration
	| dpi_import_export
	| extern_constraint_declaration
	| class_declaration
	| class_constructor_declaration
	| local_parameter_declaration SEMI
	| parameter_declaration SEMI
	| covergroup_declaration
	| overload_declaration
	| assertion_item_declaration
	| SEMI;
	
anonymous_program : 'program' SEMI anonymous_program_item* 'endprogram';

anonymous_program_item :
	task_declaration
	| function_declaration
	| class_declaration
	| covergroup_declaration
	| class_constructor_declaration
	| SEMI;

//A.2.1.1 Module parameter declarations
local_parameter_declaration :
	'localparam' data_type_or_implicit list_of_param_assignments
	| 'localparam' 'type' list_of_type_assignments;
	
parameter_declaration :
	'parameter' data_type_or_implicit list_of_param_assignments
	| 'parameter' 'type' list_of_type_assignments;
	
specparam_declaration :
	'specparam' packed_dimension? list_of_specparam_assignments SEMI;

//A.2.1.2 Port declarations
inout_declaration :
	'inout' net_port_type list_of_port_identifiers;

input_declaration :
	'input' net_port_type list_of_port_identifiers
	| 'input' variable_port_type list_of_variable_identifiers;

output_declaration :
	'output' net_port_type list_of_port_identifiers
	| 'output' variable_port_type list_of_variable_port_identifiers;

interface_port_declaration :
	interface_identifier list_of_interface_identifiers
	| interface_identifier DOT modport_identifier list_of_interface_identifiers;

ref_declaration : 
	'ref' variable_port_type list_of_port_identifiers;

//A.2.1.3 Type declarations
data_declaration :
	( 'const' )? ( 'var' )? ( lifetime )? data_type_or_implicit list_of_variable_decl_assignments SEMI
	| type_declaration
	| package_import_declaration
	| virtual_interface_declaration;
	
package_import_declaration :
	'import' package_import_item ( COMMA package_import_item )* SEMI;

package_import_item :
	package_identifier '::' identifier
	| package_identifier '::' '*';

package_export_declaration :
	'export' '*::*' SEMI
	| 'export' package_import_item ( COMMA package_import_item )* SEMI;


genvar_declaration : 'genvar' list_of_genvar_identifiers SEMI;

net_declaration :
	net_type ( drive_strength | charge_strength )? ( 'vectored' | 'scalared' )?
		data_type_or_implicit delay3? list_of_net_decl_assignments SEMI;
		
type_declaration :
	'typedef' data_type type_identifier ( variable_dimension )* SEMI
	| 'typedef' interface_instance_identifier constant_bit_select DOT type_identifier type_identifier SEMI
	| 'typedef' ( 'enum' | 'struct' | 'union' | 'class' )? type_identifier SEMI;
	
	
lifetime : 'static' | 'automatic';

//A.2.2.1 Net and variable types
//TODO Removed the following rule from below:
//casting_type : 
//	simple_type | constant_primary | signing | 'string' | 'const';

casting_type : 
	simple_type | signing | 'string' | 'const';

data_type :
	integer_vector_type signing? ( packed_dimension )*
	| integer_atom_type signing?
	| non_integer_type
	| struct_union ( 'packed' (signing)? )? LCURL struct_union_member ( struct_union_member )* RCURL
		packed_dimension*
	| 'enum' enum_base_type? LCURL enum_name_declaration ( COMMA enum_name_declaration )* RCURL
		packed_dimension*
	| 'string'
	| 'chandle'
	| 'virtual' ('interface')? interface_identifier
	|( class_scope | package_scope )? type_identifier packed_dimension*
	| class_type
	| 'event'
	| ps_covergroup_identifier
	| type_reference;

data_type_or_implicit :
	data_type
	| implicit_data_type;

implicit_data_type : 
	(signing)? packed_dimension*;

enum_base_type :
	integer_atom_type (signing)?
	| integer_vector_type signing? (packed_dimension)?
	| type_identifier (packed_dimension)?;

enum_name_declaration :
	enum_identifier ( LBRACK (Zero_Or_One|EDGE_SPEC|Decimal_number) ( COLON (Zero_Or_One|EDGE_SPEC|Decimal_number) )? RBRACK )? ( ASSIGN constant_expression )?;

class_scope : 
	class_type '::';

class_type :
	ps_class_identifier ( parameter_value_assignment )?
		( '::' class_identifier (parameter_value_assignment)? )*;

integer_type : 
	integer_vector_type | integer_atom_type;

integer_atom_type : 
	'byte' | 'shortint' | 'int' | 'longint' | 'integer' | 'time';

integer_vector_type : 
	'bit' | 'logic' | 'reg';
	
non_integer_type : 
	'shortreal' | 'real' | 'realtime';
	
net_type : 
	'supply0' | 'supply1' | 'tri' | 'triand' | 'trior' | 'trireg'| 'tri0' | 'tri1' | 'uwire'| 'wire' | 'wand' | 'wor';
	
net_port_type :
	net_type? data_type_or_implicit;
	
variable_port_type : 
	var_data_type;

var_data_type : 
	data_type | 'var' data_type_or_implicit;

signing : 'signed' | 'unsigned';

simple_type : 
	integer_type | non_integer_type | ps_type_identifier | ps_parameter_identifier;
	
struct_union_member :
	attribute_instance* random_qualifier? data_type_or_void list_of_variable_decl_assignments SEMI;

data_type_or_void : 
	data_type | 'void';

struct_union : 
	'struct' | 'union' ( 'tagged' )?;

type_reference :
	'type' LPAREN expression RPAREN
	| 'type' LPAREN data_type RPAREN;
	
//A.2.2.2 Strengths
drive_strength :
	LPAREN strength0 COMMA strength1 RPAREN
	| LPAREN strength1 COMMA strength0 RPAREN
	| LPAREN strength0 COMMA 'highz1' RPAREN
	| LPAREN strength1 COMMA 'highz0' RPAREN
	| LPAREN 'highz0' COMMA strength1 RPAREN
	| LPAREN 'highz1' COMMA strength0 RPAREN;
strength0 : 'supply0' | 'strong0' | 'pull0' | 'weak0';
strength1 : 'supply1' | 'strong1' | 'pull1' | 'weak1';
charge_strength : LPAREN 'small' RPAREN | LPAREN 'medium' RPAREN | LPAREN 'large' RPAREN;

//A.2.2.3 Delays
delay3 : 
	HASH delay_value | HASH LPAREN mintypmax_expression ( COMMA mintypmax_expression ( COMMA mintypmax_expression )? )? RPAREN;
	
delay2 : 
	HASH delay_value | HASH LPAREN mintypmax_expression ( COMMA mintypmax_expression )? RPAREN;

delay_value :
	EDGE_SPEC
	| Zero_Or_One
	| Decimal_number
	| Real_number
	| ps_identifier
	| time_literal
	| '1step';

//A.2.3 Declaration lists
list_of_defparam_assignments : 
	defparam_assignment ( COMMA defparam_assignment )*;

list_of_genvar_identifiers : 
	genvar_identifier ( COMMA genvar_identifier )*;
	
list_of_interface_identifiers : 
	interface_identifier unpacked_dimension*
		( COMMA interface_identifier unpacked_dimension* )*;
		
		

list_of_param_assignments : 
	param_assignment ( COMMA param_assignment )*;
	
list_of_port_identifiers : 
	port_identifier unpacked_dimension*
		( COMMA port_identifier ( unpacked_dimension )* )*;

list_of_udp_port_identifiers : 
	port_identifier ( COMMA port_identifier )*;

list_of_specparam_assignments : 
	specparam_assignment ( COMMA specparam_assignment )*;
	
list_of_tf_variable_identifiers : port_identifier ( variable_dimension )* ( ASSIGN expression )?
	( COMMA port_identifier variable_dimension* ( ASSIGN expression )? )*;
	
list_of_type_assignments : 
	type_assignment ( COMMA type_assignment )*;

list_of_variable_decl_assignments : 
	variable_decl_assignment ( COMMA variable_decl_assignment )*;
	
list_of_variable_identifiers : variable_identifier variable_dimension*
	( COMMA variable_identifier variable_dimension* )*;
	
list_of_variable_port_identifiers : 
	port_identifier variable_dimension* ( ASSIGN constant_expression )?
		( COMMA port_identifier  variable_dimension* ( ASSIGN constant_expression )? )*;
		
list_of_virtual_interface_decl :
	variable_identifier ( ASSIGN interface_instance_identifier )?
		( COMMA variable_identifier ( ASSIGN interface_instance_identifier )? )*;
		
//A.2.4 Declaration assignments
defparam_assignment : 
	hierarchical_parameter_identifier ASSIGN constant_mintypmax_expression;
list_of_net_decl_assignments : 
	net_decl_assignment ( COMMA net_decl_assignment )*;

net_decl_assignment : 
	net_identifier unpacked_dimension* ( ASSIGN expression )?;

param_assignment :
	parameter_identifier ( unpacked_dimension )* ( ASSIGN constant_param_expression )*;

specparam_assignment :
	specparam_identifier ASSIGN constant_mintypmax_expression
	| pulse_control_specparam;

type_assignment :
	type_identifier ( ASSIGN data_type )?;

pulse_control_specparam :
	'PATHPULSE$' ASSIGN LPAREN reject_limit_value ( COMMA error_limit_value )? RPAREN
	| 'PATHPULSE$' specify_input_terminal_descriptor DOLLAR specify_output_terminal_descriptor
		ASSIGN LPAREN reject_limit_value ( COMMA error_limit_value )? RPAREN;

error_limit_value : limit_value;

reject_limit_value : limit_value;

limit_value : constant_mintypmax_expression;

variable_decl_assignment :
	variable_identifier  variable_dimension* ( ASSIGN expression )?
	| dynamic_array_variable_identifier unsized_dimension ( variable_dimension )*
		( ASSIGN dynamic_array_new )?
	| class_variable_identifier ( ASSIGN class_new )?;
	
class_new : 
	'new' ( LPAREN list_of_arguments RPAREN | expression )?;
	
dynamic_array_new : 
	'new' LBRACK expression RBRACK ( LPAREN expression RPAREN )?;	
	
//A.2.5 Declaration ranges
unpacked_dimension :
	LBRACK constant_range RBRACK
	| LBRACK constant_expression RBRACK;
packed_dimension :
	LBRACK constant_range RBRACK
	| unsized_dimension;

associative_dimension :
	LBRACK data_type RBRACK
	| LBRACK '*' RBRACK;

variable_dimension :
	unsized_dimension
	| unpacked_dimension
	| associative_dimension
	| queue_dimension;
	
queue_dimension : LBRACK DOLLAR ( COLON constant_expression )? RBRACK;

unsized_dimension : LBRACK RBRACK;

//A.2.6 Function declarations
function_data_type_or_implicit :
	data_type_or_void
	| implicit_data_type;

function_declaration : 'function' lifetime? function_body_declaration;

function_body_declaration :
	function_data_type_or_implicit
		( interface_identifier DOT | class_scope )? function_identifier SEMI
		( tf_item_declaration )*
		( function_statement_or_null )*
		'endfunction' ( COLON function_identifier )?
	| function_data_type_or_implicit
		( interface_identifier DOT | class_scope )? function_identifier LPAREN  tf_port_list? RPAREN SEMI
		block_item_declaration*
		function_statement_or_null*
		'endfunction' ( COLON function_identifier )?;

function_prototype : 'function' data_type_or_void function_identifier LPAREN tf_port_list? RPAREN;

dpi_import_export :
	'import' dpi_spec_string dpi_function_import_property? (c_identifier ASSIGN )? dpi_function_proto SEMI
	| 'import' dpi_spec_string dpi_task_import_property? (c_identifier ASSIGN )? dpi_task_proto SEMI
	| 'export' dpi_spec_string ( c_identifier ASSIGN )? 'function' function_identifier SEMI
	| 'export' dpi_spec_string ( c_identifier ASSIGN )? 'task' task_identifier SEMI;
	
dpi_spec_string : '"DPI-C"'| '"DPI"';

dpi_function_import_property : 'context' | 'pure';

dpi_task_import_property : 'context';

dpi_function_proto : function_prototype;
dpi_task_proto : task_prototype;

//A.2.7 Task declarations
task_declaration : 
	'task' lifetime? task_body_declaration;

task_body_declaration :
	( interface_identifier DOT | class_scope )? task_identifier SEMI
		( tf_item_declaration )*
		( statement_or_null )*
		'endtask' ( COLON task_identifier )?
	| ( interface_identifier DOT | class_scope )? task_identifier LPAREN tf_port_list? RPAREN SEMI
		( block_item_declaration )*
		statement_or_null*
		'endtask' ( COLON task_identifier )?;

tf_item_declaration :
	block_item_declaration
	| tf_port_declaration;

tf_port_list :
	tf_port_item ( COMMA tf_port_item )*;

tf_port_item :
	attribute_instance*
		( tf_port_direction )? ( 'var' )? data_type_or_implicit
		( port_identifier variable_dimension* ( ASSIGN expression )? )?;
		
tf_port_direction : 
	port_direction | 'const' 'ref';
tf_port_declaration :
	attribute_instance* tf_port_direction ('var')? data_type_or_implicit list_of_tf_variable_identifiers
		SEMI;
task_prototype : 
	'task' task_identifier LPAREN  tf_port_list? RPAREN;

//A.2.8 Block item declarations
block_item_declaration :
	attribute_instance* data_declaration
	| attribute_instance* local_parameter_declaration SEMI
	| attribute_instance* parameter_declaration SEMI
	| attribute_instance* overload_declaration
	| attribute_instance* let_declaration;
	
overload_declaration :
	'bind' overload_operator 'function' data_type function_identifier LPAREN overload_proto_formals RPAREN SEMI;

overload_operator : PLUS | INCREMENT | MINUS | DECREMENT | STAR | STARSTAR | DIV | MODULO | EQUALS | NOT_EQUALS | LT | LE | GT | GE | ASSIGN;

overload_proto_formals : data_type (COMMA data_type)*;

//A.2.9 Interface declarations
virtual_interface_declaration :
	'virtual' ( 'interface' )? interface_identifier ( parameter_value_assignment)? (DOT modport_identifier)?
		list_of_virtual_interface_decl SEMI;
		
modport_declaration : 'modport' modport_item ( COMMA modport_item )* SEMI;

modport_item : 
	modport_identifier LPAREN modport_ports_declaration ( COMMA modport_ports_declaration )* RPAREN;
	
modport_ports_declaration :
	attribute_instance* modport_simple_ports_declaration
	| attribute_instance* modport_tf_ports_declaration
	| attribute_instance* modport_clocking_declaration;
	
modport_clocking_declaration : 'clocking' clocking_identifier;

modport_simple_ports_declaration :
	port_direction modport_simple_port ( COMMA modport_simple_port )*;

modport_simple_port :
	port_identifier
	| DOT port_identifier LPAREN  expression? RPAREN;

modport_tf_ports_declaration :
	import_export modport_tf_port ( COMMA modport_tf_port )*;
	
modport_tf_port :
	method_prototype
	| tf_identifier;

import_export : 'import' | 'export';


//A.2.10 Assertion declarations
concurrent_assertion_item :
	( block_identifier COLON )? concurrent_assertion_statement
	| checker_instantiation;

concurrent_assertion_statement :
	assert_property_statement
	| assume_property_statement
	| cover_property_statement
	| cover_sequence_statement
	| restrict_property_statement;
	
assert_property_statement:
	'assert' 'property' LPAREN property_spec RPAREN action_block;
	
assume_property_statement:
	'assume' 'property' LPAREN property_spec RPAREN action_block;
	
cover_property_statement:
	'cover' 'property' LPAREN property_spec RPAREN statement_or_null;
expect_property_statement :
	'expect' LPAREN property_spec RPAREN action_block;

cover_sequence_statement:
	'cover' 'sequence' LPAREN clocking_event? ( 'disable' 'iff' LPAREN expression_or_dist RPAREN )?
		sequence_expr RPAREN statement_or_null;
		
restrict_property_statement:
	'restrict' 'property' LPAREN property_spec RPAREN SEMI;
	
property_instance :
	ps_or_hierarchical_property_identifier ( LPAREN property_list_of_arguments? RPAREN )?;
	
property_list_of_arguments :
	property_actual_arg? ( COMMA property_actual_arg? )* ( COMMA DOT identifier LPAREN property_actual_arg? RPAREN )*
	|DOT identifier LPAREN property_actual_arg? RPAREN ( COMMA DOT identifier LPAREN property_actual_arg? RPAREN )*;

property_actual_arg :
	property_expr
	| sequence_actual_arg;

assertion_item_declaration :
	property_declaration
	| sequence_declaration
	| let_declaration;

property_declaration :
	'property' property_identifier ( LPAREN property_port_list? RPAREN )? SEMI
		assertion_variable_declaration*
		property_statement_spec
	'endproperty' ( COLON property_identifier )?;
	
property_port_list :
	property_port_item (COMMA property_port_item)*;
	
property_port_item :
	attribute_instance* ( 'local' property_lvar_port_direction? )? property_formal_type
		port_identifier variable_dimension* ( ASSIGN property_actual_arg )*;

property_lvar_port_direction : 'input';

property_formal_type :
	sequence_formal_type
	| 'property';
	
property_spec :
	(clocking_event)? ( 'disable' 'iff' LPAREN expression_or_dist RPAREN )? property_expr;
	
property_statement_spec :
	clocking_event? ( 'disable' 'iff' LPAREN expression_or_dist RPAREN )? property_statement;
	
property_statement :
	property_expr SEMI
	| 'case' LPAREN expression_or_dist RPAREN property_case_item property_case_item* 'endcase'
	| 'if' LPAREN expression_or_dist RPAREN property_expr ( 'else' property_expr )?;
	
property_case_item:
	expression_or_dist ( COMMA expression_or_dist )* COLON property_statement
	| 'default' ( COLON )? property_statement;
	
property_expr :
        sequence_expr
        | LPAREN property_expr RPAREN
        | 'not' property_expr
        | property_expr 'or' property_expr
        | property_expr 'and' property_expr
        | sequence_expr '|->' property_expr
        | sequence_expr '|=>' property_expr
        | 'if' LPAREN expression_or_dist RPAREN property_expr ( 'else' property_expr )?
        | property_instance
        | clocking_event property_expr;

sequence_declaration :
	'sequence' sequence_identifier ( LPAREN sequence_port_list? RPAREN )? SEMI
	assertion_variable_declaration*
	sequence_expr SEMI
	'endsequence' ( COLON sequence_identifier)?;
	
sequence_port_list :
	sequence_port_item ( COMMA sequence_port_item)*;

sequence_port_item :
	attribute_instance* ( 'local' sequence_lvar_port_direction? )? sequence_formal_type
	port_identifier variable_dimension* (ASSIGN sequence_actual_arg)?;
	
sequence_lvar_port_direction : 'input' | 'inout' | 'output';

sequence_formal_type :
	data_type_or_implicit
	| 'sequence'
	| 'event'
	| 'untyped';
	
sequence_expr :
    cycle_delay_range sequence_expr ( cycle_delay_range sequence_expr )*
| sequence_expr cycle_delay_range sequence_expr (cycle_delay_range sequence_expr)*
| expression_or_dist ( boolean_abbrev )?
| LPAREN expression_or_dist (COMMA sequence_match_item )* RPAREN (boolean_abbrev)?
| sequence_instance (sequence_abbrev)?
| LPAREN sequence_expr (COMMA sequence_match_item )* RPAREN (sequence_abbrev)?
| sequence_expr 'and' sequence_expr
| sequence_expr 'intersect' sequence_expr
| sequence_expr 'or' sequence_expr
| 'first_match' LPAREN sequence_expr (COMMA sequence_match_item )* RPAREN 
| expression_or_dist 'throughout' sequence_expr
| sequence_expr 'within' sequence_expr
| clocking_event sequence_expr  
    /*              
	(cycle_delay_range sequence_expr cycle_delay_range* sequence_expr* 
    | expression_or_dist boolean_abbrev? 
    | sequence_instance sequence_abbrev? 
    | LPAREN sequence_expr (COMMA sequence_match_item )* RPAREN sequence_abbrev? 
    | 'first_match' LPAREN sequence_expr (COMMA sequence_match_item)* RPAREN 
    | expression_or_dist 'throughout' sequence_expr 
    | clocking_event sequence_expr) 
    (cycle_delay_range sequence_expr cycle_delay_range* sequence_expr* 
    | 'and' sequence_expr 
    | 'intersect' sequence_expr 
    | 'or' sequence_expr 
    | 'within' sequence_expr)*
    */
              ;

cycle_delay_range :
	DOUBLE_HASH constant_primary
	| DOUBLE_HASH LBRACK cycle_delay_const_range_expression RBRACK
	| DOUBLE_HASH LBRACK '*' RBRACK
	| DOUBLE_HASH LBRACK '+' RBRACK;

sequence_method_call :
	sequence_instance DOT method_identifier;
	
sequence_match_item :
	operator_assignment
	| inc_or_dec_expression
	| subroutine_call;

sequence_instance :
	ps_or_hierarchical_sequence_identifier ( LPAREN sequence_list_of_arguments? RPAREN )?;
	
sequence_list_of_arguments :
	sequence_actual_arg? ( COMMA sequence_actual_arg? )* ( COMMA DOT identifier LPAREN sequence_actual_arg? RPAREN )*
	| DOT identifier LPAREN sequence_actual_arg? RPAREN ( COMMA DOT identifier LPAREN sequence_actual_arg? RPAREN )*;
	
sequence_actual_arg :
	event_expression
	| sequence_expr;
	
boolean_abbrev :
	consecutive_repetition
	| non_consecutive_repetition
	| goto_repetition;
sequence_abbrev : 
	consecutive_repetition;
	
consecutive_repetition :
	LBRACK'*' const_or_range_expression RBRACK
	| LBRACK'*'RBRACK
	| LBRACK'+'RBRACK;
	
non_consecutive_repetition : 
	LBRACK ASSIGN const_or_range_expression RBRACK;
	
goto_repetition : 
	LBRACK'->' const_or_range_expression RBRACK;

const_or_range_expression :
	constant_expression
	| cycle_delay_const_range_expression;

cycle_delay_const_range_expression :
	constant_expression COLON constant_expression
	| constant_expression COLON DOLLAR;

expression_or_dist : 
	expression ( 'dist' LCURL dist_list RCURL)?;
	
assertion_variable_declaration :
	var_data_type list_of_variable_decl_assignments SEMI;
let_declaration :
	'let' let_identifier ( LPAREN let_port_list? RPAREN )? ASSIGN expression SEMI;
	
let_identifier :
identifier;

let_port_list :
	let_port_item (COMMA let_port_item)*;

let_port_item :
	attribute_instance* let_formal_type port_identifier variable_dimension* ( ASSIGN expression )?;
	
let_formal_type :
	data_type_or_implicit;
	
let_expression :
	package_scope? let_identifier ( LPAREN let_list_of_arguments? RPAREN )?;
	
let_list_of_arguments :
	let_actual_arg? (COMMA let_actual_arg? )* (COMMA DOT identifier LPAREN let_actual_arg? RPAREN )*
	| DOT identifier LPAREN let_actual_arg? RPAREN ( COMMA DOT identifier LPAREN let_actual_arg? RPAREN )*;

let_actual_arg :
	expression;
	
	
//A.2.11 Covergroup declarations
covergroup_declaration :
	'covergroup' covergroup_identifier ( LPAREN ( tf_port_list )? RPAREN )? ( coverage_event )? SEMI
	( coverage_spec_or_option )*
	'endgroup' ( COLON covergroup_identifier )?;
	
coverage_spec_or_option :
(attribute_instance)* coverage_spec
| (attribute_instance)* coverage_option SEMI;

coverage_option :
	'option.' member_identifier ASSIGN expression
	| 'type_option.' member_identifier ASSIGN constant_expression;
	
coverage_spec :
	cover_point
	| cover_cross;
	
coverage_event :
	clocking_event
	| 'with' 'function' 'sample' LPAREN ( tf_port_list )? RPAREN
	| '@@(' block_event_expression RPAREN;
	
block_event_expression :
	('begin' hierarchical_btf_identifier | 'end' hierarchical_btf_identifier) ('or' block_event_expression)*;
	
hierarchical_btf_identifier :
	hierarchical_tf_identifier
	| hierarchical_block_identifier
	| hierarchical_identifier ( class_scope )? method_identifier;
	
cover_point : ( cover_point_identifier COLON )? 'coverpoint' expression ( 'iff' LPAREN expression RPAREN )? bins_or_empty;

bins_or_empty :
	LCURL (attribute_instance)* ( bins_or_options SEMI )* RCURL
	| SEMI;
	
bins_or_options :
coverage_option
	| ( 'wildcard' )? bins_keyword bin_identifier ( LBRACK ( expression )? RBRACK )? ASSIGN LCURL open_range_list RCURL ( 'iff' LPAREN
		expression RPAREN )?
	| ( 'wildcard')? bins_keyword bin_identifier ( LBRACK RBRACK )? ASSIGN trans_list ( 'iff' LPAREN expression RPAREN )?
	| bins_keyword bin_identifier ( LBRACK ( expression )? RBRACK )? ASSIGN 'default' ( 'iff' LPAREN expression RPAREN )?
	| bins_keyword bin_identifier ASSIGN 'default' 'sequence' ( 'iff' LPAREN expression RPAREN )?;

bins_keyword: 'bins' | 'illegal_bins' | 'ignore_bins';

range_list : 
	value_range ( COMMA value_range )*;
	
trans_list : 
	LPAREN trans_set RPAREN ( COMMA LPAREN trans_set RPAREN )*;
	
trans_set : 
	trans_range_list ( '=>' trans_range_list )*;
	
trans_range_list :
trans_item
| trans_item LBRACK '*' repeat_range RBRACK
| trans_item LBRACK '->' repeat_range RBRACK
| trans_item LBRACK  ASSIGN repeat_range RBRACK;

trans_item : range_list;

repeat_range :
	expression
	| expression COLON expression;
	
cover_cross :
	( cross_identifier COLON )? 'cross' list_of_coverpoints ( 'iff' LPAREN expression RPAREN )? select_bins_or_empty;
	
list_of_coverpoints : cross_item COMMA cross_item ( COMMA cross_item )*;

cross_item :
	cover_point_identifier
	| variable_identifier;
	
select_bins_or_empty :
	LCURL ( bins_selection_or_option SEMI )* RCURL
	| SEMI;
	
bins_selection_or_option :
	attribute_instance* coverage_option
	| attribute_instance* bins_selection;
	
bins_selection : 
	bins_keyword bin_identifier ASSIGN select_expression ( 'iff' LPAREN expression RPAREN )?;
	
select_expression :
	(select_condition | '!' select_condition | LPAREN select_expression RPAREN) ('&&' select_expression | '||' select_expression)*;
	
select_condition : 
	'binsof' LPAREN bins_expression RPAREN ( 'intersect' LCURL open_range_list RCURL )?;

bins_expression :
	variable_identifier
	| cover_point_identifier ( DOT bins_identifier )?;
open_range_list : open_value_range ( COMMA open_value_range )*;
open_value_range : value_range;

//A.3.1 Primitive instantiation and instances
gate_instantiation :
	cmos_switchtype (delay3)? cmos_switch_instance ( COMMA cmos_switch_instance )* SEMI
	| enable_gatetype (drive_strength)? (delay3)? enable_gate_instance ( COMMA enable_gate_instance )* SEMI
	| mos_switchtype (delay3)? mos_switch_instance ( COMMA mos_switch_instance )* SEMI
	| n_input_gatetype (drive_strength)? (delay2)? n_input_gate_instance ( COMMA n_input_gate_instance )* SEMI
	| n_output_gatetype (drive_strength)? (delay2)? n_output_gate_instance
		( COMMA n_output_gate_instance )* SEMI
	| pass_en_switchtype (delay2)? pass_enable_switch_instance ( COMMA pass_enable_switch_instance )* SEMI
	| pass_switchtype pass_switch_instance ( COMMA pass_switch_instance )* SEMI
	| 'pulldown' (pulldown_strength)? pull_gate_instance ( COMMA pull_gate_instance )* SEMI
	| 'pullup' (pullup_strength)? pull_gate_instance ( COMMA pull_gate_instance )* SEMI;

cmos_switch_instance : 
	( name_of_instance )? LPAREN output_terminal COMMA input_terminal COMMA
		ncontrol_terminal COMMA pcontrol_terminal RPAREN;

enable_gate_instance : 
	( name_of_instance )? LPAREN output_terminal COMMA input_terminal COMMA enable_terminal RPAREN;

mos_switch_instance : 
	( name_of_instance )? LPAREN output_terminal COMMA input_terminal COMMA enable_terminal RPAREN;

n_input_gate_instance : 
	( name_of_instance )? LPAREN output_terminal COMMA input_terminal ( COMMA input_terminal )* RPAREN;
	
n_output_gate_instance : 
	( name_of_instance )? LPAREN output_terminal ( COMMA output_terminal )* COMMA
	input_terminal RPAREN;
	
pass_switch_instance : 
	( name_of_instance )? LPAREN inout_terminal COMMA inout_terminal RPAREN;
	
pass_enable_switch_instance : 
	( name_of_instance )? LPAREN inout_terminal COMMA inout_terminal COMMA
		enable_terminal RPAREN;
		
pull_gate_instance : 
	( name_of_instance )? LPAREN output_terminal RPAREN;
	
//A.3.2 Primitive strengths
pulldown_strength :
	LPAREN strength0 COMMA strength1 RPAREN
	| LPAREN strength1 COMMA strength0 RPAREN
	| LPAREN strength0 RPAREN;

pullup_strength :
	LPAREN strength0 COMMA strength1 RPAREN
	| LPAREN strength1 COMMA strength0 RPAREN
	| LPAREN strength1 RPAREN;
	
//A.3.3 Primitive terminals
enable_terminal : expression;

inout_terminal : net_lvalue;

input_terminal : expression;

ncontrol_terminal : expression;

output_terminal : net_lvalue;

pcontrol_terminal : expression;

//A.3.4 Primitive gate and switch types
cmos_switchtype : 
	'cmos' | 'rcmos';

enable_gatetype : 
	'bufif0' | 'bufif1' | 'notif0' | 'notif1';
	
mos_switchtype : 
	'nmos' | 'pmos' | 'rnmos' | 'rpmos';
	
n_input_gatetype : 
	'and' | 'nand' | 'or'| 'nor' | 'xor' | 'xnor';
	
n_output_gatetype : 'buf' | 'not';

pass_en_switchtype : 'tranif0' | 'tranif1' | 'rtranif1' | 'rtranif0';

pass_switchtype:
	'tran' | 'rtran';
	
//A.4.1.1 Module instantiation
module_instantiation :
module_identifier ( parameter_value_assignment )? hierarchical_instance ( COMMA hierarchical_instance )*
SEMI;

parameter_value_assignment : HASH LPAREN ( list_of_parameter_assignments )? RPAREN;

list_of_parameter_assignments :
	ordered_parameter_assignment ( COMMA ordered_parameter_assignment )*
	| named_parameter_assignment ( COMMA named_parameter_assignment )*;
	
ordered_parameter_assignment : 
	param_expression;

named_parameter_assignment : 
	DOT parameter_identifier LPAREN ( param_expression )? RPAREN;

hierarchical_instance : 
	name_of_instance LPAREN ( list_of_port_connections )? RPAREN;

name_of_instance : 
	instance_identifier ( unpacked_dimension )*;
	
list_of_port_connections :
	ordered_port_connection ( COMMA ordered_port_connection )*
	| named_port_connection ( COMMA named_port_connection )*;
	
ordered_port_connection : 
	attribute_instance* ( expression )?;
	
named_port_connection :
	attribute_instance* DOT port_identifier ( LPAREN ( expression )? RPAREN )?
	| attribute_instance* '.*';
	
//A.4.1.2 Interface instantiation
interface_instantiation :
	interface_identifier ( parameter_value_assignment )? hierarchical_instance ( COMMA hierarchical_instance
	)* SEMI;
	
//A.4.1.3 Program instantiation
program_instantiation :
	program_identifier ( parameter_value_assignment )? hierarchical_instance ( COMMA hierarchical_instance )*
		SEMI;

//A.4.1.4 Checker instantiation
checker_instantiation :
	checker_identifier name_of_instance LPAREN (list_of_checker_port_connections)? RPAREN SEMI;
	
list_of_checker_port_connections :
	ordered_checker_port_connection ( COMMA ordered_checker_port_connection )*
	| named_checker_port_connection ( COMMA named_checker_port_connection )*;
	
ordered_checker_port_connection : 
	attribute_instance* ( property_actual_arg )?;
	
named_checker_port_connection :
	attribute_instance* DOT port_identifier ( LPAREN ( property_actual_arg )? RPAREN )?
	| attribute_instance* '.*';

//A.4.2 Generated instantiation
generate_region :
	'generate' ( generate_block)* 'endgenerate';
	
loop_generate_construct :
	'for' LPAREN genvar_initialization SEMI genvar_expression SEMI genvar_iteration RPAREN
		generate_block;
		
genvar_initialization :
	( 'genvar' )? genvar_identifier ASSIGN constant_expression;
	

	
conditional_generate_construct :
	if_generate_construct
	| case_generate_construct;
	
if_generate_construct :
	'if' LPAREN constant_expression RPAREN generate_block ( 'else' generate_block )?;
	
case_generate_construct :
	'case' LPAREN constant_expression RPAREN case_generate_item ( case_generate_item )* 'endcase';
	
case_generate_item :
	constant_expression ( COMMA constant_expression )* COLON generate_block
	| 'default' ( COLON )? generate_block;
	
generate_block :
        generate_item
        |
        ( generate_block_identifier COLON )? 'begin' ( COLON generate_block_identifier )?
		( generate_item |generate_block)*
		'end' ( COLON generate_block_identifier )?;
		
generate_item :
	module_or_generate_item
        //| generate_block
	| interface_or_generate_item
	| checker_or_generate_item;
	
//A.5.1 UDP declaration

udp_nonansi_declaration :
	attribute_instance* 'primitive' udp_identifier LPAREN udp_port_list RPAREN SEMI;
genvar_iteration :
	genvar_identifier assignment_operator genvar_expression
	| inc_or_dec_operator genvar_identifier
	| genvar_identifier inc_or_dec_operator;
udp_ansi_declaration :
	attribute_instance* 'primitive' udp_identifier LPAREN udp_declaration_port_list RPAREN SEMI;
	
udp_declaration :
	udp_nonansi_declaration udp_port_declaration ( udp_port_declaration )*
		udp_body
		'endprimitive' ( COLON udp_identifier )?
	| udp_ansi_declaration
		udp_body
		'endprimitive' ( COLON udp_identifier )?
	| 'extern' udp_nonansi_declaration
	| 'extern' udp_ansi_declaration
	| attribute_instance* 'primitive' udp_identifier LPAREN '.*' RPAREN SEMI
		( udp_port_declaration )*
		udp_body
		'endprimitive' ( COLON udp_identifier )?;
		
//A.5.2 UDP ports

udp_port_list : 
	output_port_identifier COMMA input_port_identifier ( COMMA input_port_identifier )*;
	
udp_declaration_port_list : 
	udp_output_declaration COMMA udp_input_declaration ( COMMA udp_input_declaration )*;
	
udp_port_declaration :
	udp_output_declaration SEMI
	| udp_input_declaration SEMI
	| udp_reg_declaration SEMI;
	
udp_output_declaration :
	attribute_instance* 'output' ('reg') ? port_identifier ( ASSIGN constant_expression )?;
	
udp_input_declaration : 
	attribute_instance* 'input' list_of_udp_port_identifiers;
	
udp_reg_declaration : 
	attribute_instance* 'reg' variable_identifier;
	
//A.5.3 UDP body

udp_body : 
	combinational_body | sequential_body;
	
combinational_body : 
	'table' combinational_entry ( combinational_entry )* 'endtable';
	
combinational_entry : 
	level_input_list COLON output_symbol SEMI;
	
sequential_body : 
	( udp_initial_statement )? 'table' sequential_entry ( sequential_entry )* 'endtable';

udp_initial_statement : 
	'initial' output_port_identifier ASSIGN init_val SEMI;
	
init_val : 
	//'1\'b0' | '1\'b1' | '1\'bx' | '1\'bX' | '1\'B0' | '1\'B1' | '1\'Bx' | '1\'BX' |  //Needed
	Binary_number
	| Zero_Or_One
	| EDGE_SPEC;
	
sequential_entry : 
	seq_input_list COLON current_state COLON next_state SEMI;
	
seq_input_list : 
	level_input_list | edge_input_list;
	
level_input_list : 
	level_symbol ( level_symbol )*;
	
edge_input_list : 
	( level_symbol )* edge_indicator ( level_symbol )*;
	
edge_indicator : 
	LPAREN level_symbol level_symbol RPAREN 
	| edge_symbol;
	
current_state : 
	level_symbol;
	
next_state : 
	output_symbol | '-';
	
output_symbol : 
	Binary_number
	| EDGE_SPEC
	| Zero_Or_One;
	
level_symbol : 
	Binary_number
	| EDGE_SPEC
	| Zero_Or_One
             | '?' //| 'b' | 'B'
             | ID //this is wrong. But a short-cut to take 
             ;
	
edge_symbol : 
                ID //'r' | 'R' | 'f' | 'F' | 'p' | 'P' | 'n' | 'N' Again wrong but a short-cut for now
            | STAR;
	
//A.5.4 UDP instantiation

udp_instantiation : 
	udp_identifier ( drive_strength )? ( delay2 )? udp_instance ( COMMA udp_instance )* SEMI;
	
udp_instance : 
	( name_of_instance )? LPAREN output_terminal COMMA input_terminal ( COMMA input_terminal )* RPAREN;


//A.6.1 Continuous assignment and net alias statements
continuous_assign :
	'assign' ( drive_strength)? ( delay3 )? (list_of_net_assignments) SEMI
	//| 'assign' ( delay_control )? list_of_variable_assignments SEMI
	;
	

	
//A.6.2 Procedural blocks and assignments
list_of_net_assignments : 
	net_assignment ( COMMA net_assignment )*;
	
list_of_variable_assignments : 
	variable_assignment ( COMMA variable_assignment )*;
	
net_alias : 
	'alias' net_lvalue ASSIGN net_lvalue ( ASSIGN net_lvalue )* SEMI;
	
net_assignment : 
	net_lvalue ASSIGN expression;
initial_construct : 
	'initial' statement_or_null;
	
always_construct : 
	always_keyword statement;
	
always_keyword : 
	'always' | 'always_comb' | 'always_latch' | 'always_ff';
	
final_construct : 
	'final' function_statement;
	
blocking_assignment :
	variable_lvalue ASSIGN delay_or_event_control expression
	| nonrange_variable_lvalue ASSIGN dynamic_array_new
	| ( implicit_class_handle DOT | class_scope | package_scope )? hierarchical_variable_identifier
		select ASSIGN class_new
	| operator_assignment;
	
operator_assignment : 
	variable_lvalue assignment_operator expression;
	
assignment_operator :
	ASSIGN | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '<<<=' | '>>>=';
	
nonblocking_assignment :
	variable_lvalue '<=' ( delay_or_event_control )? expression;
	
procedural_continuous_assignment :
	'assign' variable_assignment
	| 'deassign' variable_lvalue
	| 'force' variable_assignment
	| 'force' net_assignment
	| 'release' variable_lvalue
	| 'release' net_lvalue;
	
	
//A.6.3 Parallel and sequential blocks
action_block :
	statement_or_null
	| ( statement )? 'else' statement_or_null;
	
seq_block :
	'begin' ( COLON block_identifier )? ( block_item_declaration )* ( statement_or_null )*
		'end' ( COLON block_identifier )?;
		
par_block :
	'fork' ( COLON block_identifier )? ( block_item_declaration )* ( statement_or_null )*
		join_keyword ( COLON block_identifier )?;
		
join_keyword : 
	'join' | 'join_any' | 'join_none';

statement_or_null :
	statement
	| attribute_instance* SEMI;
	
statement : 
	( block_identifier COLON )? attribute_instance* statement_item;
	
statement_item :
	blocking_assignment SEMI
	| nonblocking_assignment SEMI
	| procedural_continuous_assignment SEMI
	| case_statement
	| conditional_statement
	| inc_or_dec_expression SEMI
	| subroutine_call_statement
	| disable_statement
	| event_trigger
	| loop_statement
	| jump_statement
	| par_block
	| procedural_timing_control_statement
	| seq_block
	| wait_statement
	| procedural_assertion_statement
	| clocking_drive SEMI
	| randsequence_statement
	| randcase_statement
	| expect_property_statement;
//A.6.4 Statements
	
function_statement : 
	statement;
	
function_statement_or_null :
	function_statement
	| attribute_instance* SEMI;
	
variable_identifier_list : 
	variable_identifier ( COMMA variable_identifier )*;
	
//A.6.5 Timing control statements

procedural_timing_control_statement :
	procedural_timing_control statement_or_null;
	
delay_or_event_control :
	delay_control
	| event_control
	| 'repeat' LPAREN expression RPAREN event_control;
	
delay_control :
	HASH delay_value
	| HASH LPAREN mintypmax_expression RPAREN;
	
event_control :
	'@' hierarchical_event_identifier
	| '@' LPAREN event_expression RPAREN
	| '@*'
	| '@' '(*)'
	| '@' ps_or_hierarchical_sequence_identifier;
	
event_expression :
	(( edge_identifier )? expression ( 'iff' expression )? | sequence_instance ( 'iff' expression )? | LPAREN event_expression RPAREN) ('or' event_expression | COMMA event_expression)*;

procedural_timing_control :
	delay_control
	| event_control
	| cycle_delay;
	
jump_statement :
	'return' ( expression )? SEMI
	| 'break' SEMI
	| 'continue' SEMI;
	
wait_statement :
	'wait' LPAREN expression RPAREN statement_or_null
	| 'wait' 'fork' SEMI
	| 'wait_order' LPAREN hierarchical_identifier ( COMMA hierarchical_identifier )* RPAREN action_block;
	
event_trigger :
	'->' hierarchical_event_identifier SEMI
	|'->>' ( delay_or_event_control )? hierarchical_event_identifier SEMI;
	
disable_statement :
	'disable' hierarchical_task_identifier SEMI
	| 'disable' hierarchical_block_identifier SEMI
	| 'disable' 'fork' SEMI;
	
//A.6.6 Conditional statements
conditional_statement :
	( unique_priority )? 'if' LPAREN expression RPAREN statement_or_null
		( 'else' 'if' LPAREN expression RPAREN statement_or_null )*
		( 'else' statement_or_null )?;
		
unique_priority : 
	'unique' | 'unique0' | 'priority';
/*	
cond_predicate :
	expression_or_cond_pattern ( '&&&' expression_or_cond_pattern )*;
	
expression_or_cond_pattern :
	binary_expression ('matches' pattern)?;

binary_expression
	:	unary_expression (binary_operator (attribute_instance)? unary_expression)*;

unary_expression
	:	unary_operator (attribute_instance)? primary;
*/		
/*	
cond_pattern : 
	expression 'matches' pattern;
*/	
//A.6.7 Case statements
case_statement :
	( unique_priority )? case_keyword LPAREN case_expression RPAREN
		case_item ( case_item )* 'endcase'
	| ( unique_priority )? case_keyword LPAREN case_expression RPAREN 'matches'
		case_pattern_item ( case_pattern_item )* 'endcase'
	| ( unique_priority )? 'case' LPAREN case_expression RPAREN 'inside'
		case_inside_item ( case_inside_item )* 'endcase';
		
case_keyword : 
	'case' | 'casez' | 'casex';
	
case_expression : 
	expression;
	
case_item :
	case_item_expression ( COMMA case_item_expression )* COLON statement_or_null
	| 'default' ( COLON )? statement_or_null;
	
case_pattern_item :
	pattern ( '&&&' expression )? COLON statement_or_null
	| 'default' ( COLON )? statement_or_null;
	
case_inside_item :
	open_range_list COLON statement_or_null
	| 'default' ( COLON )? statement_or_null;
	
case_item_expression : 
	expression;
	
randcase_statement :
	'randcase' randcase_item ( randcase_item )* 'endcase';
	
randcase_item : 
	expression COLON statement_or_null;
	
//A.6.7.1 Patterns 

pattern :
	DOT variable_identifier
	| '.*'
	| constant_expression
	| 'tagged' member_identifier ( pattern )?
	| '\'{' pattern ( COMMA pattern )* RCURL
	| '\'{' member_identifier COLON pattern ( COMMA member_identifier COLON pattern )* RCURL;
	
assignment_pattern :
	'\'{' expression ( COMMA expression )* RCURL
	| '\'{' structure_pattern_key COLON expression ( COMMA structure_pattern_key COLON expression )* RCURL
	| '\'{' array_pattern_key COLON expression ( COMMA array_pattern_key COLON expression )* RCURL
	| '\'{' constant_expression LCURL expression ( COMMA expression )* RCURL RCURL;
	
structure_pattern_key : 
	member_identifier | assignment_pattern_key;
	
array_pattern_key : 
	constant_expression | assignment_pattern_key;
	
assignment_pattern_key : 
	simple_type | 'default';
	
variable_assignment : 
	variable_lvalue ASSIGN expression;
assignment_pattern_expression :
	( assignment_pattern_expression_type )? assignment_pattern;
	
assignment_pattern_expression_type :
	ps_type_identifier
	| ps_parameter_identifier
	| integer_atom_type
	| type_reference;
	
constant_assignment_pattern_expression : 
	assignment_pattern_expression;
	
assignment_pattern_net_lvalue :
	'\'{' net_lvalue (COMMA net_lvalue )* RCURL;
	
assignment_pattern_variable_lvalue :
	'\'{' variable_lvalue (COMMA variable_lvalue )* RCURL;
	
//A.6.8 Looping statements
loop_statement :
	'forever' statement_or_null
	| 'repeat' LPAREN expression RPAREN statement_or_null
	| 'while' LPAREN expression RPAREN statement_or_null
	| 'for' LPAREN for_initialization SEMI expression SEMI for_step RPAREN
		statement_or_null
	| 'do' statement_or_null 'while' LPAREN expression RPAREN SEMI
	| 'foreach' LPAREN ps_or_hierarchical_array_identifier ( loop_variables )? RPAREN statement;
	
for_initialization :
	list_of_variable_assignments
	| for_variable_declaration ( COMMA for_variable_declaration )*;
	
for_variable_declaration :
	data_type variable_identifier ASSIGN expression ( COMMA variable_identifier ASSIGN expression )*;
	
for_step : 
	for_step_assignment ( COMMA for_step_assignment )*;
	
for_step_assignment :
	operator_assignment
	| inc_or_dec_expression
	| function_subroutine_call;
	
loop_variables : 
	( index_variable_identifier )? ( COMMA ( index_variable_identifier )? )*;
	
//A.6.9 Subroutine call statements
subroutine_call_statement :
	subroutine_call SEMI
	| 'void' '\'' LPAREN function_subroutine_call RPAREN SEMI;
	
//A.6.10 Assertion statements
assertion_item :
	concurrent_assertion_item
	| deferred_immediate_assertion_item;
	
deferred_immediate_assertion_item : 
	( block_identifier COLON )? deferred_immediate_assertion_statement;
	
procedural_assertion_statement :
	concurrent_assertion_statement
	| immediate_assertion_statement
	| checker_instantiation;
	
immediate_assertion_statement :
	simple_immediate_assertion_statement
	| deferred_immediate_assertion_statement;
	
simple_immediate_assertion_statement :
	simple_immediate_assert_statement
	| simple_immediate_assume_statement
	| simple_immediate_cover_statement;
	
simple_immediate_assert_statement :
	'assert' LPAREN expression RPAREN action_block;
	
simple_immediate_assume_statement :
	'assume' LPAREN expression RPAREN action_block;
	
simple_immediate_cover_statement :
	'cover' LPAREN expression RPAREN statement_or_null;
	
deferred_immediate_assertion_statement :
	deferred_immediate_assert_statement
	| deferred_immediate_assume_statement
	| deferred_immediate_cover_statement;
	
deferred_immediate_assert_statement :
	'assert' HASH_ZERO LPAREN expression RPAREN action_block;
	
deferred_immediate_assume_statement :
	'assume' HASH_ZERO LPAREN expression RPAREN action_block;
	
deferred_immediate_cover_statement :
	'cover' HASH_ZERO LPAREN expression RPAREN action_block statement_or_null;
	
//A.6.11 Clocking block
clocking_declaration : 
	( 'default' )? 'clocking' ( clocking_identifier )? clocking_event SEMI
		( clocking_item )*
		'endclocking' ( COLON clocking_identifier )?
	| 'global' 'clocking' ( clocking_identifier )? clocking_event SEMI 'endclocking' ( COLON clocking_identifier )?;
	
clocking_event :
	'@' identifier
	| '@' LPAREN event_expression RPAREN;
	
clocking_item :
	'default' default_skew SEMI
	| clocking_direction list_of_clocking_decl_assign SEMI
	| attribute_instance* assertion_item_declaration;
	
default_skew :
	'input' clocking_skew
	| 'output' clocking_skew
	| 'input' clocking_skew 'output' clocking_skew;
	
clocking_direction :
	'input' ( clocking_skew )?
	| 'output' ( clocking_skew )?
	| 'input' ( clocking_skew )? 'output' ( clocking_skew )?
	| 'inout';
	
list_of_clocking_decl_assign : 
	clocking_decl_assign ( COMMA clocking_decl_assign )*;
	
clocking_decl_assign : 
	signal_identifier ( ASSIGN expression )?;
	
clocking_skew :
	edge_identifier ( delay_control )?
	| delay_control;
	
clocking_drive :
	clockvar_expression '<=' ( cycle_delay )? expression;
	
cycle_delay :
	DOUBLE_HASH (Zero_Or_One | EDGE_SPEC | Decimal_number)
	| DOUBLE_HASH identifier
	| DOUBLE_HASH LPAREN expression RPAREN;
	
clockvar : 
	hierarchical_identifier;
	
clockvar_expression : 
	clockvar select;
	
//A.6.12 Randsequence
randsequence_statement : 
	'randsequence' LPAREN ( production_identifier )? RPAREN
	production ( production )*
	'endsequence';
	
production : 
	( data_type_or_void )? production_identifier ( LPAREN tf_port_list RPAREN )? COLON rs_rule ( '|' rs_rule )* SEMI;
	
rs_rule : 
	rs_production_list ( ':=' weight_specification ( rs_code_block )? )?;
	
rs_production_list :
	rs_prod ( rs_prod )*
	| 'rand' 'join' ( LPAREN expression RPAREN )? production_item production_item ( production_item )*;
	
weight_specification :
	(Zero_Or_One | EDGE_SPEC | Decimal_number )
	| ps_identifier
	| LPAREN expression RPAREN;
	
rs_code_block : 
	LCURL ( data_declaration )* ( statement_or_null )* RCURL;
	
rs_prod :
	production_item
	| rs_code_block
	| rs_if_else
	| rs_repeat
	| rs_case;
	
production_item : 
	production_identifier ( LPAREN list_of_arguments RPAREN )?;
	
rs_if_else : 
	'if' LPAREN expression RPAREN production_item ( 'else' production_item )?;
	
rs_repeat : 
	'repeat' LPAREN expression RPAREN production_item;
	
rs_case : 
	'case' LPAREN case_expression RPAREN rs_case_item ( rs_case_item )* 'endcase';
	
rs_case_item :
	case_item_expression ( COMMA case_item_expression )* COLON production_item SEMI
	| 'default' ( COLON )? production_item SEMI;


//A.7.1 Specify block declaration
	
specify_block:	
	'specify'  specify_item* 'endspecify';
	
specify_item :
	specparam_declaration
	| pulsestyle_declaration
	| showcancelled_declaration
	| path_declaration
	| system_timing_check;
	
pulsestyle_declaration :
	'pulsestyle_onevent' list_of_path_outputs SEMI 
	| 'pulsestyle_ondetect' list_of_path_outputs SEMI;
	
showcancelled_declaration :
	'showcancelled' list_of_path_outputs SEMI
	| 'noshowcancelled' list_of_path_outputs SEMI;

//A.7.2 Specify path declarations
path_declaration :
	simple_path_declaration SEMI
	| edge_sensitive_path_declaration SEMI
	| state_dependent_path_declaration SEMI;
	
simple_path_declaration :
	parallel_path_description ASSIGN path_delay_value
	| full_path_description ASSIGN path_delay_value;

parallel_path_description :
	LPAREN specify_input_terminal_descriptor  polarity_operator?  '=>' specify_output_terminal_descriptor RPAREN;
	
full_path_description :
	LPAREN list_of_path_inputs polarity_operator?  '*>' list_of_path_outputs RPAREN;

list_of_path_inputs :
	specify_input_terminal_descriptor ( COMMA specify_input_terminal_descriptor )* ;

list_of_path_outputs :
	specify_output_terminal_descriptor ( COMMA specify_output_terminal_descriptor )*;

//A.7.2 Specify path declarations

specify_input_terminal_descriptor :
	input_identifier  (LBRACK constant_range_expression RBRACK )? ;

specify_output_terminal_descriptor :
	output_identifier ( LBRACK constant_range_expression RBRACK )? ;

input_identifier : 
	input_port_identifier 
	| inout_port_identifier 
	| interface_identifier DOT port_identifier;
output_identifier : 
	output_port_identifier 
	| inout_port_identifier 
	| interface_identifier DOT port_identifier;

//A.7.4 Specify path delays
	
path_delay_value :
	list_of_path_delay_expressions
	| LPAREN list_of_path_delay_expressions RPAREN;
	
list_of_path_delay_expressions :
	t_path_delay_expression
	| trise_path_delay_expression COMMA tfall_path_delay_expression
	| trise_path_delay_expression COMMA tfall_path_delay_expression COMMA tz_path_delay_expression
	| t01_path_delay_expression COMMA t10_path_delay_expression COMMA t0z_path_delay_expression COMMA tz1_path_delay_expression COMMA t1z_path_delay_expression COMMA tz0_path_delay_expression
	| t01_path_delay_expression COMMA t10_path_delay_expression COMMA t0z_path_delay_expression COMMA
	  tz1_path_delay_expression COMMA t1z_path_delay_expression COMMA tz0_path_delay_expression COMMA
	  t0x_path_delay_expression COMMA tx1_path_delay_expression COMMA t1x_path_delay_expression COMMA
	  tx0_path_delay_expression COMMA txz_path_delay_expression COMMA tzx_path_delay_expression;
	  
t_path_delay_expression : 
	path_delay_expression;
	
trise_path_delay_expression : 
	path_delay_expression;
	
tfall_path_delay_expression : 
	path_delay_expression;
	
tz_path_delay_expression : 
	path_delay_expression;
	
t01_path_delay_expression : 
	path_delay_expression;
	
t10_path_delay_expression : 
	path_delay_expression;
	
t0z_path_delay_expression : 
	path_delay_expression;
	
tz1_path_delay_expression : 
	path_delay_expression;
	
t1z_path_delay_expression : 
	path_delay_expression;
	
tz0_path_delay_expression : 
	path_delay_expression;
	
t0x_path_delay_expression : 
	path_delay_expression;
	
tx1_path_delay_expression : 
	path_delay_expression;
	
t1x_path_delay_expression : 
	path_delay_expression;
	
tx0_path_delay_expression : 
	path_delay_expression;
	
txz_path_delay_expression : 
	path_delay_expression;
	
tzx_path_delay_expression : 
	path_delay_expression;
	
path_delay_expression : 
	constant_mintypmax_expression;
	
edge_sensitive_path_declaration :
	parallel_edge_sensitive_path_description ASSIGN path_delay_value
	| full_edge_sensitive_path_description ASSIGN path_delay_value;
	
parallel_edge_sensitive_path_description :
	LPAREN  edge_identifier? specify_input_terminal_descriptor '=>'
	LPAREN specify_output_terminal_descriptor polarity_operator? COLON data_source_expression RPAREN RPAREN;
	
full_edge_sensitive_path_description :
	LPAREN edge_identifier? list_of_path_inputs '*>'
	LPAREN list_of_path_outputs polarity_operator? COLON data_source_expression RPAREN RPAREN;

data_source_expression : 
	expression;
	
edge_identifier : 
	'posedge' | 'negedge' | 'edge';
	
state_dependent_path_declaration :
	'if' LPAREN module_path_expression RPAREN simple_path_declaration
	| 'if' LPAREN module_path_expression RPAREN edge_sensitive_path_declaration
	| 'ifnone' simple_path_declaration;
	
polarity_operator : '+' | '-';

//A.7.5.1 System timing check commands

system_timing_check :
	setup_timing_check
	| hold_timing_check
	| setuphold_timing_check
	| recovery_timing_check
	| removal_timing_check
	| recrem_timing_check
	| skew_timing_check
	| timeskew_timing_check
	| fullskew_timing_check
	| period_timing_check
	| width_timing_check
	| nochange_timing_check;
	
setup_timing_check :
	'$setup' LPAREN data_event COMMA reference_event COMMA timing_check_limit ( COMMA  notifier )? RPAREN SEMI ;
	
hold_timing_check :
	'$hold' LPAREN reference_event COMMA data_event COMMA timing_check_limit ( COMMA notifier )? RPAREN SEMI ;
	
//TODO
setuphold_timing_check :
	'$setuphold' LPAREN reference_event COMMA data_event COMMA timing_check_limit COMMA timing_check_limit
	( COMMA notifier?  ( COMMA timestamp_condition?  ( COMMA timecheck_condition?
	( COMMA delayed_reference? ( COMMA delayed_data?  )? )? )? )? )? RPAREN SEMI;

recovery_timing_check :
	'$recovery' LPAREN reference_event COMMA data_event COMMA timing_check_limit ( COMMA notifier )? RPAREN SEMI;

removal_timing_check :
	'$removal' LPAREN reference_event COMMA data_event COMMA timing_check_limit ( COMMA  notifier)? RPAREN SEMI;

recrem_timing_check :
	'$recrem' LPAREN reference_event COMMA data_event COMMA timing_check_limit COMMA timing_check_limit
	( COMMA notifier? ( COMMA timestamp_condition? ( COMMA timecheck_condition?
	( COMMA  delayed_reference? ( COMMA delayed_data? )? )? )? )? )? RPAREN SEMI;
	
skew_timing_check :
	'$skew' LPAREN reference_event COMMA data_event COMMA timing_check_limit ( COMMA  notifier )? RPAREN SEMI;

timeskew_timing_check :
	'$timeskew' LPAREN reference_event COMMA data_event COMMA timing_check_limit
	( COMMA notifier? ( COMMA event_based_flag? ( COMMA remain_active_flag? )? )? )? RPAREN SEMI;
	
fullskew_timing_check :
	'$fullskew' LPAREN reference_event COMMA data_event COMMA timing_check_limit COMMA timing_check_limit
	( COMMA  notifier ( COMMA event_based_flag ( COMMA remain_active_flag  )? )? )? RPAREN SEMI;

period_timing_check :
	'$period' LPAREN controlled_reference_event COMMA timing_check_limit ( COMMA  notifier )? RPAREN SEMI;
	
width_timing_check :
	'$width' LPAREN controlled_reference_event COMMA timing_check_limit COMMA threshold ( COMMA notifier)? RPAREN SEMI;

nochange_timing_check :
	'$nochange' LPAREN reference_event COMMA data_event COMMA start_edge_offset COMMA end_edge_offset ( COMMA  notifier)? RPAREN SEMI;

//A.7.5.2 System timing check command arguments
	
timecheck_condition : 
	mintypmax_expression;
controlled_reference_event : 
	controlled_timing_check_event;
data_event : 
	timing_check_event;
delayed_data :
	terminal_identifier
	| terminal_identifier LBRACK constant_mintypmax_expression RBRACK ;

delayed_reference :
	terminal_identifier
	| terminal_identifier LBRACK constant_mintypmax_expression RBRACK ;

end_edge_offset : 
	mintypmax_expression;

event_based_flag : 
	constant_expression;

notifier : 
	variable_identifier;

reference_event : 
	timing_check_event;

remain_active_flag : 
	constant_mintypmax_expression;

timestamp_condition : 
	mintypmax_expression;

start_edge_offset : 
	mintypmax_expression;

threshold : 
	constant_expression;

timing_check_limit : 
	expression;

//A.7.5.3 System timing check event definitions

timing_check_event :
	timing_check_event_control? specify_terminal_descriptor ( '&&&' timing_check_condition )?;

controlled_timing_check_event :
	timing_check_event_control specify_terminal_descriptor ( '&&&' timing_check_condition )?;

timing_check_event_control :
	'posedge'
	| 'negedge'
	| 'edge'
	| edge_control_specifier;

specify_terminal_descriptor :
	specify_input_terminal_descriptor
	| specify_output_terminal_descriptor;
	
edge_control_specifier : 
	'edge' LBRACK edge_descriptor ( COMMA edge_descriptor )* RBRACK;
	
edge_descriptor : 
	EDGE_SPEC | Z_or_X Zero_Or_One | Zero_Or_One Z_or_X;

	
timing_check_condition :
scalar_timing_check_condition
| LPAREN scalar_timing_check_condition RPAREN;

scalar_timing_check_condition :
	expression
	| COMPLIMENT expression
	| expression EQUALS scalar_constant
	| expression CASE_EQUALITY scalar_constant
	| expression NOT_EQUALS scalar_constant
	| expression CASE_INEQUALITY scalar_constant;

scalar_constant : 
	//'1\'b0' | '1\'b1' | '1\'B0' | '1\'B1' | '\'b0' | '\'b1' | '\'B0' | '\'B1' | 
	Binary_number | EDGE_SPEC | Zero_Or_One;

//A.8.1 Concatenations

concatenation :
	LCURL expression ( COMMA expression )* RCURL;
constant_concatenation :
	LCURL constant_expression ( COMMA constant_expression)* RCURL;

constant_multiple_concatenation : 
	LCURL constant_expression constant_concatenation RCURL;
module_path_concatenation : 
	LCURL module_path_expression ( COMMA module_path_expression )* RCURL;
	
module_path_multiple_concatenation : 
	LCURL constant_expression module_path_concatenation RCURL;
multiple_concatenation : 
	LCURL expression concatenation RCURL;
streaming_concatenation : 
	LCURL stream_operator slice_size?  stream_concatenation RCURL;

stream_operator : 
	RSHIFT | LSHIFT ;

slice_size : simple_type 
	| constant_expression;
stream_concatenation : 
	LCURL stream_expression ( COMMA stream_expression )* RCURL;

stream_expression : 
	expression ( 'with' LBRACK array_range_expression RBRACK )?;

array_range_expression :
	expression
	| expression COLON expression
	| expression '+:' expression
	| expression '-:' expression;

empty_queue : LCURL RCURL;

//A.8.2 Subroutine calls
constant_function_call : 
	function_subroutine_call;
tf_call : 
	ps_or_hierarchical_tf_identifier  attribute_instance? ( LPAREN list_of_arguments RPAREN )?;
	
system_tf_call :
	system_tf_identifier ( LPAREN list_of_arguments RPAREN )?
	| system_tf_identifier LPAREN data_type ( COMMA expression )? RPAREN;

subroutine_call :
	tf_call
	| system_tf_call
	| method_call
	| ( 'std::' )? randomize_call;
function_subroutine_call : 
	subroutine_call ;

list_of_arguments :
	expression? ( COMMA expression? )* ( COMMA DOT identifier LPAREN expression RPAREN )*
	| DOT identifier LPAREN expression? RPAREN ( COMMA DOT identifier LPAREN expression? RPAREN )*;

method_call : 
	method_call_root DOT method_call_body;

method_call_body :
	method_identifier attribute_instance? ( LPAREN list_of_arguments RPAREN )?
	| built_in_method_call;

built_in_method_call :
	array_manipulation_call
	| randomize_call;

array_manipulation_call :
	array_method_name attribute_instance? 
	 (LPAREN list_of_arguments RPAREN )?
	( 'with' LPAREN expression RPAREN )?;

randomize_call :
	'randomize' attribute_instance?
	( LPAREN ( variable_identifier_list | 'null' )? RPAREN )?
	( 'with' ( LPAREN identifier_list? RPAREN )? constraint_block )?;

method_call_root : 
	primary_no_function_call 
	| implicit_class_handle;
	
array_method_name :
	method_identifier | 'unique' | 'and' | 'or' | 'xor';

//A.8.3 Expressions
inc_or_dec_expression :
	inc_or_dec_operator attribute_instance?  variable_lvalue
	| variable_lvalue  attribute_instance? inc_or_dec_operator;
/*conditional_expression : 
	cond_predicate ('?'  attribute_instance?  expression COLON expression)?;
*/
constant_expression :
	constant_primary                                                            #const_expr_only_primary
	| unary_operator attribute_instance*  constant_primary                      #const_expr_unary_op
        | constant_expression STARSTAR attribute_instance* constant_expression      #const_expr_st_st
        | constant_expression (STAR| DIV| MODULO) 
          attribute_instance* constant_expression                                   #const_expr_mutl
        | constant_expression (PLUS|MINUS) attribute_instance* constant_expression  #const_expr_add
        | constant_expression (LSHIFT| RSHIFT| ALSHIFT| ARSHIFT) 
                                    attribute_instance* constant_expression         #const_expr_shift
        | constant_expression (LT| GT| LE| GE) 
          attribute_instance* constant_expression                                   #const_expr_comp
        | constant_expression (EQUALS| NOT_EQUALS| CASE_EQUALITY| CASE_INEQUALITY| CASE_Q| NOT_CASE_Q) 
                attribute_instance* constant_expression                             #const_expr_equality
        | constant_expression (AND) attribute_instance* constant_expression                   #const_expr_binary_and
        | constant_expression (XOR| XNOR|XORN) attribute_instance* constant_expression        #const_expr_binary_xor
        | constant_expression (OR) attribute_instance* constant_expression                    #const_expr_binary_or
        | constant_expression (LOG_AND) attribute_instance* constant_expression               #const_expr_log_and
        | constant_expression (LOG_OR) attribute_instance* constant_expression                #const_expr_log_or
        
	| <assoc=right> constant_expression '?' 
      attribute_instance* constant_expression COLON constant_expression             #const_expr_conditional
                    ;

constant_mintypmax_expression :
	constant_expression
	| constant_expression COLON constant_expression COLON constant_expression;
	
constant_param_expression :
	constant_mintypmax_expression | data_type | DOLLAR; 

param_expression : 
	mintypmax_expression | data_type;

constant_range_expression :
	constant_expression
	| constant_part_select_range;

constant_part_select_range :
	constant_range
	| constant_indexed_range;

constant_range : 
	constant_expression COLON constant_expression;

constant_indexed_range :
	constant_expression '+:' constant_expression
	| constant_expression '-:' constant_expression;

expr_:
	expression;

expression :
		primary                                                             #expression_only_primary
        |unary_operator attribute_instance* primary                         #expression_unary_op
        |inc_or_dec_expression                                              #expression_inc_or_dec
	    | LPAREN operator_assignment RPAREN                                 #expression_op_assign 
        | expression STARSTAR attribute_instance* expression                #expression_st_st
        | expression (STAR| DIV| MODULO) attribute_instance* expression     #expression_mult
        | expression (PLUS| MINUS) attribute_instance* expression           #expression_add
        | expression (LSHIFT| RSHIFT| ALSHIFT| ARSHIFT) 
                                    attribute_instance* expression          #expression_shift
        | expression (LT| GT| LE| GE) attribute_instance* expression        #expression_comp
        | expression 'inside' LCURL open_range_list RCURL                   #expression_inside_exp
        | expression (EQUALS| NOT_EQUALS| CASE_EQUALITY| CASE_INEQUALITY| CASE_Q| NOT_CASE_Q) 
                attribute_instance* expression                              #expression_equality
        | expression (AND) attribute_instance* expression                   #expression_binary_and
        | expression (XOR| XNOR|XORN) attribute_instance* expression        #expression_binary_xor
        | expression (OR) attribute_instance* expression                    #expression_binary_or
        | expression (LOG_AND) attribute_instance* expression               #expression_log_and
        | expression (LOG_OR) attribute_instance* expression                #expression_log_or
        
	    | <assoc=right> expression ('?'  attribute_instance*  expression COLON expression)      
                                                                            #expression_conditional_exp
	
	    | tagged_union_expression                                           #expression_tagged_union
	;
	
matches_pattern:
                   'matches' pattern;

tagged_union_expression :
	'tagged' member_identifier expression?;
/* moved into expression
inside_expression : 
	expression 'inside' LCURL open_range_list RCURL;
*/
value_range :
	expression
	| LBRACK expression COLON expression RBRACK;

mintypmax_expression :
	expression
	| expression COLON expression COLON expression;


module_path_expression	:	
	module_path_conditional_expression;

module_path_conditional_expression	:	
	module_path_binary_expression ('?' attribute_instance? module_path_expression COLON module_path_expression)?;
	
module_path_binary_expression	:	
	module_path_unary_expression (binary_module_path_operator attribute_instance? module_path_unary_expression)?;

module_path_unary_expression	:	
	unary_module_path_operator attribute_instance? module_path_primary;

					
/*
module_path_conditional_expression : 
	module_path_expression '?' attribute_instance?  module_path_expression ':' module_path_expression;

module_path_expression :
	module_path_primary (binary_module_path_operator attribute_instance? module_path_expression)*
	| unary_module_path_operator attribute_instance?  module_path_primary (binary_module_path_operator attribute_instance? module_path_expression)*
	| module_path_conditional_expression (binary_module_path_operator attribute_instance? module_path_expression)* ;
*/
module_path_mintypmax_expression :
	module_path_expression
	| module_path_expression COLON module_path_expression COLON module_path_expression;
	
part_select_range : 
	constant_range | indexed_range;
indexed_range :
	expression '+:' constant_expression
	| expression '-:' constant_expression;

genvar_expression : 
	constant_expression;

//A.8.4 Primaries
constant_primary :
	primary_literal
	| ps_parameter_identifier constant_select
	| specparam_identifier ( LBRACK constant_range_expression RBRACK )?
	| genvar_identifier
	| ( package_scope | class_scope )? enum_identifier
	| constant_concatenation ( LBRACK constant_range_expression RBRACK )?
	| constant_multiple_concatenation ( LBRACK constant_range_expression RBRACK )?
	| constant_function_call
	| constant_let_expression
	| LPAREN constant_mintypmax_expression RPAREN
	| constant_cast
	| constant_assignment_pattern_expression
	| type_reference
                 ;

module_path_primary :
	number
	| identifier
	| module_path_concatenation
	| module_path_multiple_concatenation
	| function_subroutine_call
	| LPAREN module_path_mintypmax_expression RPAREN;


primary_no_function_call:
	primary_literal
	| ( implicit_class_handle DOT | class_scope | package_scope )? hierarchical_identifier select
	| empty_queue
	| concatenation ( LBRACK range_expression RBRACK )?
	| multiple_concatenation ( LBRACK range_expression RBRACK )?
	| let_expression
	| LPAREN mintypmax_expression RPAREN
	| cast
	| assignment_pattern_expression
	| streaming_concatenation
	| sequence_method_call
	| 'this'
	| DOLLAR
	| 'null';

	
primary :
	primary_no_function_call
	| function_subroutine_call
	;

class_qualifier : 
	( 'local::' )? ( implicit_class_handle DOT | class_scope )?;

range_expression :
	expression
	| part_select_range;

primary_literal : 
	number | time_literal | unbased_unsized_literal | string_literal;
time_literal :
	Zero_Or_One TIME_UNIT
	| EDGE_SPEC TIME_UNIT
	| Decimal_number TIME_UNIT	
	| Real_number TIME_UNIT;
TIME_UNIT :
	's' | 'ms' | 'us' | 'ns' | 'ps' | 'fs';

implicit_class_handle : 
	'this' DOT 'super'|'this' | 'super' ;

bit_select : 
	( LBRACK expression RBRACK )*;
select :
	( ( DOT member_identifier bit_select )* DOT member_identifier )? bit_select ( LBRACK part_select_range RBRACK )?;
	
nonrange_select :
	( ( DOT member_identifier bit_select )* DOT member_identifier )? bit_select;


constant_bit_select : 
	( LBRACK constant_expression RBRACK )*;

constant_select :
	( ( DOT member_identifier constant_bit_select )* DOT member_identifier )? constant_bit_select
	( LBRACK constant_part_select_range RBRACK )*;

constant_cast :
casting_type '\'' LPAREN constant_expression RPAREN;

constant_let_expression : 
	let_expression;
	
cast :
casting_type '\'' LPAREN expression RPAREN;

//A.8.5 Expression left-side values
net_lvalue :
	ps_or_hierarchical_net_identifier constant_select
	| LCURL net_lvalue ( COMMA net_lvalue)* RCURL 
	| LBRACK assignment_pattern_expression_type RBRACK assignment_pattern_net_lvalue;
	
variable_lvalue :
	( implicit_class_handle DOT | package_scope )? hierarchical_variable_identifier select
	| LCURL variable_lvalue ( COMMA variable_lvalue )* RCURL
	| ( assignment_pattern_expression_type )? assignment_pattern_variable_lvalue
	| streaming_concatenation;

nonrange_variable_lvalue :
	( implicit_class_handle DOT | package_scope )? hierarchical_variable_identifier nonrange_select;
	
//A.8.6 Operators
unary_operator :
	PLUS|MINUS|NOT|COMPLIMENT|AND|NAND|OR|NOR|XOR|XORN|XNOR
	;
	

binary_operator :
	PLUS|MINUS|STAR|DIV|MODULO|EQUALS|NOT_EQUALS|CASE_EQUALITY|CASE_INEQUALITY|CASE_Q|NOT_CASE_Q|LOG_AND|LOG_OR|STARSTAR|
	LT|LE|GT|GE|AND|OR|XOR|XNOR|XORN|RSHIFT|LSHIFT|ARSHIFT|ALSHIFT|DERIVE|DDERIVE
//	|'+' | '-' | '*' | '/' | '%' | '==' | '!=' | '===' | '!==' | '==?' | '!=?' | '&&' | '||' | '**'
//	| '<' | '<=' | '>' | '>=' | '&' | '|' | '^' | '^~' | '~^' |' >>' | '<<' | '>>>' | '<<<'
//	| '->' | '<->'
	;
	
	
inc_or_dec_operator : INCREMENT|DECREMENT;

		
unary_module_path_operator :
	NOT|COMPLIMENT|AND|NAND|OR|NOR|XOR|XNOR|XORN;
//'!' | '~' | '&' | '~&' | '|' | '~|' | '^' | '~^' | '^~';

binary_module_path_operator :
	EQUALS|NOT_EQUALS|LOG_AND|LOG_OR|AND|OR|XOR|XNOR|XORN
//	'==' | '!=' | '&&' | '||' | '&' | '|' | '^' | '^~' | '~^'
	;

//A.8.7 Numbers

unbased_unsized_literal : '\'0' | '\'1' | '\'' Z_or_X ;

string_literal : STRING;

//ATTRIBUTES
attribute_instance : 
	'(*' attr_spec  (COMMA attr_spec)*  '*)';
attr_spec : 
	attr_name ( ASSIGN constant_expression )?;
attr_name : 
	identifier;

//IDENTIFIERS
array_identifier : 
	identifier;
block_identifier : 
	identifier;
bin_identifier : 
	identifier;
c_identifier : 
	simple_identifier;
cell_identifier : 
	identifier;
checker_identifier : 
	identifier;
class_identifier : 
	identifier;
class_variable_identifier : 
	variable_identifier;
clocking_identifier : 
	identifier;
config_identifier : 
	identifier;
const_identifier : 
	identifier;
constraint_identifier : 
	identifier;
covergroup_identifier : 
	identifier;
covergroup_variable_identifier : 
	variable_identifier;
cover_point_identifier : 
	identifier;
cross_identifier : 
	identifier;
dynamic_array_variable_identifier : 
	variable_identifier;
enum_identifier : 
	identifier;
escaped_identifier
	:	ESCAPED_IDENTIFIER;
formal_identifier : 
	identifier;
function_identifier : 
	identifier;
generate_block_identifier : 
	identifier;
genvar_identifier : 
	identifier;
hierarchical_array_identifier : 
	hierarchical_identifier;
hierarchical_block_identifier : 
	hierarchical_identifier;
hierarchical_event_identifier : 
	hierarchical_identifier;
hierarchical_identifier : 
	( '$root' DOT )? ( identifier constant_bit_select DOT )* identifier;
hierarchical_net_identifier : 
	hierarchical_identifier;
hierarchical_parameter_identifier : 
	hierarchical_identifier;
hierarchical_property_identifier : 
	hierarchical_identifier;
hierarchical_sequence_identifier : 
	hierarchical_identifier;
hierarchical_task_identifier : 
	hierarchical_identifier;
hierarchical_tf_identifier : 
	hierarchical_identifier;
hierarchical_variable_identifier : 
	hierarchical_identifier;
identifier :
	simple_identifier
	| escaped_identifier;
index_variable_identifier : 
	identifier;
interface_identifier : 
	identifier;
interface_instance_identifier : 
	identifier;
inout_port_identifier : 
	identifier;
input_port_identifier : 
	identifier;
instance_identifier : 
	identifier;
library_identifier : 
	identifier;
member_identifier : 
	identifier;
method_identifier : 
	identifier;
modport_identifier : 
	identifier;
module_identifier : 
	identifier;
net_identifier : 
	identifier;
output_port_identifier : 
	identifier;
package_identifier : 
	identifier;
package_scope :
	package_identifier '::'
	|  '$unit' '::';
parameter_identifier : 
	identifier;
port_identifier : 
	identifier;
production_identifier : 
	identifier;
program_identifier : 
	identifier;
property_identifier : 
	identifier;
ps_class_identifier : 
	package_scope?  class_identifier;
ps_covergroup_identifier :  
	package_scope?  covergroup_identifier;
ps_identifier : 
	package_scope? identifier;
ps_or_hierarchical_array_identifier :
	( implicit_class_handle DOT | class_scope | package_scope )* hierarchical_array_identifier;
ps_or_hierarchical_net_identifier :  
	package_scope? net_identifier | hierarchical_net_identifier;
ps_or_hierarchical_property_identifier :
	package_scope? property_identifier
	| hierarchical_property_identifier;
ps_or_hierarchical_sequence_identifier :
	package_scope? sequence_identifier
	| hierarchical_sequence_identifier;
ps_or_hierarchical_tf_identifier :  
	package_scope? tf_identifier | hierarchical_tf_identifier;
ps_parameter_identifier :
	package_scope? parameter_identifier
	| ( generate_block_identifier ( LBRACK constant_expression RBRACK )? DOT )* parameter_identifier;
ps_type_identifier : 
	( 'local::' | package_scope )? type_identifier;
sequence_identifier : 
	identifier;
signal_identifier : 
	identifier;
simple_identifier : 
	ID;
specparam_identifier : 
	identifier;
system_tf_identifier : 
	TF_ID;
task_identifier : 
	identifier;
tf_identifier : 
	identifier;
terminal_identifier : 
	identifier;
topmodule_identifier : 
	identifier;
type_identifier : 
	identifier;
udp_identifier : 
	identifier;
bins_identifier:
	identifier;
variable_identifier : 
	identifier;

TIMEUNIT
	:	'timeunit'
	;

TIMEPRECISION
	:	'timeprecision'
	;

Zero_Or_One: [01];

EDGE_SPEC:
             '01'|'10';

number	:
		EDGE_SPEC
	| 	Zero_Or_One
    |   Decimal_number
    |   Octal_number
    |   Binary_number
    |   Hex_number
    |   Real_number
    ;

Real_number
    :   Unsigned_number '.' Unsigned_number
    |   Unsigned_number ( '.' Unsigned_number )? [eE] ( [+-] )? Unsigned_number
    ;

Decimal_number
    :   Unsigned_number
    | ( Size )? Decimal_base Unsigned_number
    | ( Size )? Decimal_base X_digit ( '_' )*
    | ( Size )? Decimal_base Z_digit ( '_' )*
    ;

Binary_number : ( Size )? Binary_base Binary_value ;
Octal_number : ( Size )? Octal_base Octal_value ;
Hex_number : ( Size )? Hex_base Hex_value ;

fragment
Sign : [+-] ;
fragment
Size : Non_zero_unsigned_number ;
fragment
Non_zero_unsigned_number : Non_zero_decimal_digit ( '_' | Decimal_digit )* ;
fragment
Unsigned_number : Decimal_digit ( '_' | Decimal_digit )* ;
fragment
Binary_value : Binary_digit ( '_' | Binary_digit )* ;
fragment
Octal_value : Octal_digit ( '_' | Octal_digit )* ;
fragment
Hex_value : Hex_digit ( '_' | Hex_digit )* ;

fragment
Decimal_base : '\'' [sS]? [dD] ;
fragment
Binary_base : '\'' [sS]? [bB] ;
fragment
Octal_base : '\'' [sS]? [oO] ;
fragment
Hex_base : '\'' [sS]? [hH] ;

fragment
Non_zero_decimal_digit : [1-9] ;
fragment
Decimal_digit : [0-9] ;
fragment
Binary_digit : X_digit | Z_digit | [01] ;
fragment
Octal_digit : X_digit | Z_digit | [0-7] ;
fragment
Hex_digit : X_digit | Z_digit | [0-9a-fA-F] ;
fragment
X_digit : [xX] ;
fragment
Z_digit : [zZ?] ;

Z_or_X: X_digit|Z_digit;

TF_ID	:	'$' [a-zA-Z0-9_$] [a-zA-Z0-9_$]*;	

ID  :	[a-zA-Z_] [a-zA-Z0-9_$]*
    ;

ESCAPED_IDENTIFIER : 
	'\\'~(' '| '\t'| '\r'| '\n')*;

    
COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' 
    |   '/*' .*? '*/' )-> channel(HIDDEN)
    ;

WS  :   [ \t\n\r]+ -> channel(HIDDEN)
    ;


STRING : '"' ( ~[\n\r"] )* '"' ;
	
PLUS	:	'+';
MINUS	:	'-';
NOT	:	'!';
COMPLIMENT
	:	'~';
AND
	:	'&';
NAND
	:	'~&';
OR:	'|';
NOR
	:	'~|';
XOR
	:	'^';
XORN
	:	'~^';
XNOR
	:	'^~';
STAR	:	'*';
DIV	:	'/';
MODULO	:	'%';
EQUALS	:	'==';
NOT_EQUALS
	:	'!=';
CASE_EQUALITY
	:	'===';
CASE_INEQUALITY
	:	'!==';
CASE_Q	:	'==?';
NOT_CASE_Q
	:	'!=?';
LOG_AND	:	'&&';
LOG_OR	:	'||';

LT	:	'<';
LE	:	'<=';
GT	:	'>';
GE	:	'>=';
RSHIFT	:	'>>';
LSHIFT	:	'<<';
ARSHIFT	:	'>>>';
ALSHIFT	:	'<<<';
DERIVE	:	'->';
DDERIVE	:	'<->';									    

LBRACK
	:	'['
	;

RBRACK
	:	']'
	;

LPAREN
	:	'('
	;

RPAREN
	:	')'
	;

STARSTAR
	:	'**'
	;

ASSIGN
	:	'='
	;

LCURL
	:	'{'
	;

RCURL
	:	'}'
	;

DOT	:	'.';
COMMA	:	',';
SEMI	:	';';
COLON	:	':';	
INCREMENT
	:	'++';
DECREMENT
	:	'--';
	

HASH
	:	'#'
	;

DOUBLE_HASH
	:	'##'
	;
	
HASH_ZERO
	:	'#0'
	;		
DOLLAR:
          '$';
