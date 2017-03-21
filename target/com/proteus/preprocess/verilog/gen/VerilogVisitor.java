// Generated from Verilog.g4 by ANTLR 4.5
package com.proteus.preprocess.verilog.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VerilogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VerilogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VerilogParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(VerilogParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(VerilogParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration(VerilogParser.Module_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_nonansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_nonansi_header(VerilogParser.Module_nonansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_ansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_ansi_header(VerilogParser.Module_ansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_keyword(VerilogParser.Module_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(VerilogParser.Interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_nonansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_nonansi_header(VerilogParser.Interface_nonansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_ansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_ansi_header(VerilogParser.Interface_ansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#program_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_declaration(VerilogParser.Program_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#program_nonansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_nonansi_header(VerilogParser.Program_nonansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#program_ansi_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_ansi_header(VerilogParser.Program_ansi_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_declaration(VerilogParser.Checker_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(VerilogParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(VerilogParser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timeunits_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeunits_declaration(VerilogParser.Timeunits_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_port_list(VerilogParser.Parameter_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_parameter_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_parameter_port_declaration(VerilogParser.List_of_parameter_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_port_declaration(VerilogParser.Parameter_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_ports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_ports(VerilogParser.List_of_portsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_port_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_declarations(VerilogParser.List_of_port_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_declaration(VerilogParser.Port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(VerilogParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_expression(VerilogParser.Port_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_reference(VerilogParser.Port_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_direction(VerilogParser.Port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_port_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_port_header(VerilogParser.Net_port_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_port_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_port_header(VerilogParser.Variable_port_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_port_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_header(VerilogParser.Interface_port_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ansi_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnsi_port_declaration(VerilogParser.Ansi_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#elaboration_system_task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboration_system_task(VerilogParser.Elaboration_system_taskContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#finish_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinish_number(VerilogParser.Finish_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_common_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_common_item(VerilogParser.Module_common_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_item(VerilogParser.Module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_or_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_or_generate_item(VerilogParser.Module_or_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#non_port_module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_port_module_item(VerilogParser.Non_port_module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_override(VerilogParser.Parameter_overrideContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bind_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_directive(VerilogParser.Bind_directiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bind_target_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_target_scope(VerilogParser.Bind_target_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bind_target_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_target_instance(VerilogParser.Bind_target_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bind_target_instance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_target_instance_list(VerilogParser.Bind_target_instance_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bind_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_instantiation(VerilogParser.Bind_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#config_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_declaration(VerilogParser.Config_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#design_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_statement(VerilogParser.Design_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#config_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_rule_statement(VerilogParser.Config_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(VerilogParser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inst_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_clause(VerilogParser.Inst_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inst_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_name(VerilogParser.Inst_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cell_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_clause(VerilogParser.Cell_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#liblist_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiblist_clause(VerilogParser.Liblist_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#use_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_clause(VerilogParser.Use_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_or_generate_item_declaration(VerilogParser.Module_or_generate_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_or_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_or_generate_item(VerilogParser.Interface_or_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#extern_tf_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_tf_declaration(VerilogParser.Extern_tf_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_item(VerilogParser.Interface_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#non_port_interface_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_port_interface_item(VerilogParser.Non_port_interface_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#program_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_item(VerilogParser.Program_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#non_port_program_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_port_program_item(VerilogParser.Non_port_program_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#program_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_generate_item(VerilogParser.Program_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_port_list(VerilogParser.Checker_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_port_item(VerilogParser.Checker_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_or_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_or_generate_item(VerilogParser.Checker_or_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_or_generate_item_declaration(VerilogParser.Checker_or_generate_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_generate_item(VerilogParser.Checker_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_always_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_always_construct(VerilogParser.Checker_always_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_item(VerilogParser.Class_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_property(VerilogParser.Class_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method(VerilogParser.Class_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_constructor_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_constructor_prototype(VerilogParser.Class_constructor_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_constraint(VerilogParser.Class_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_item_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_item_qualifier(VerilogParser.Class_item_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_qualifier(VerilogParser.Property_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#random_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom_qualifier(VerilogParser.Random_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#method_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_qualifier(VerilogParser.Method_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#method_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_prototype(VerilogParser.Method_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_constructor_declaration(VerilogParser.Class_constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constraint_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_declaration(VerilogParser.Constraint_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constraint_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_block(VerilogParser.Constraint_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constraint_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_block_item(VerilogParser.Constraint_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#solve_before_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolve_before_list(VerilogParser.Solve_before_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#solve_before_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolve_before_primary(VerilogParser.Solve_before_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constraint_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_expression(VerilogParser.Constraint_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constraint_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_set(VerilogParser.Constraint_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dist_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDist_list(VerilogParser.Dist_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dist_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDist_item(VerilogParser.Dist_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dist_weight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDist_weight(VerilogParser.Dist_weightContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constraint_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_prototype(VerilogParser.Constraint_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#extern_constraint_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_constraint_declaration(VerilogParser.Extern_constraint_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(VerilogParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_item(VerilogParser.Package_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_or_generate_item_declaration(VerilogParser.Package_or_generate_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#anonymous_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_program(VerilogParser.Anonymous_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#anonymous_program_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_program_item(VerilogParser.Anonymous_program_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_declaration(VerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(VerilogParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specparam_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_declaration(VerilogParser.Specparam_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_declaration(VerilogParser.Inout_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_declaration(VerilogParser.Input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_declaration(VerilogParser.Output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_port_declaration(VerilogParser.Interface_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ref_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_declaration(VerilogParser.Ref_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_declaration(VerilogParser.Data_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_import_declaration(VerilogParser.Package_import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_import_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_import_item(VerilogParser.Package_import_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_export_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_export_declaration(VerilogParser.Package_export_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_declaration(VerilogParser.Genvar_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_declaration(VerilogParser.Net_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(VerilogParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#lifetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLifetime(VerilogParser.LifetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#casting_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasting_type(VerilogParser.Casting_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(VerilogParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_type_or_implicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_or_implicit(VerilogParser.Data_type_or_implicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#implicit_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_data_type(VerilogParser.Implicit_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#enum_base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_base_type(VerilogParser.Enum_base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#enum_name_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name_declaration(VerilogParser.Enum_name_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_scope(VerilogParser.Class_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(VerilogParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(VerilogParser.Integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#integer_atom_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_atom_type(VerilogParser.Integer_atom_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#integer_vector_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_vector_type(VerilogParser.Integer_vector_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#non_integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_integer_type(VerilogParser.Non_integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_type(VerilogParser.Net_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_port_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_port_type(VerilogParser.Net_port_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_port_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_port_type(VerilogParser.Variable_port_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#var_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_data_type(VerilogParser.Var_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#signing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigning(VerilogParser.SigningContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(VerilogParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#struct_union_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_union_member(VerilogParser.Struct_union_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_type_or_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_or_void(VerilogParser.Data_type_or_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#struct_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_union(VerilogParser.Struct_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#type_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_reference(VerilogParser.Type_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive_strength(VerilogParser.Drive_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#strength0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength0(VerilogParser.Strength0Context ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#strength1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength1(VerilogParser.Strength1Context ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#charge_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharge_strength(VerilogParser.Charge_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay3(VerilogParser.Delay3Context ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay2(VerilogParser.Delay2Context ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_value(VerilogParser.Delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_defparam_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_defparam_assignments(VerilogParser.List_of_defparam_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_genvar_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_genvar_identifiers(VerilogParser.List_of_genvar_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_interface_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_interface_identifiers(VerilogParser.List_of_interface_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_param_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_param_assignments(VerilogParser.List_of_param_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_identifiers(VerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_udp_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_udp_port_identifiers(VerilogParser.List_of_udp_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_specparam_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_specparam_assignments(VerilogParser.List_of_specparam_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_tf_variable_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_tf_variable_identifiers(VerilogParser.List_of_tf_variable_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_type_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_type_assignments(VerilogParser.List_of_type_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_decl_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_decl_assignments(VerilogParser.List_of_variable_decl_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_identifiers(VerilogParser.List_of_variable_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_port_identifiers(VerilogParser.List_of_variable_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_virtual_interface_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_virtual_interface_decl(VerilogParser.List_of_virtual_interface_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#defparam_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefparam_assignment(VerilogParser.Defparam_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_net_decl_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_decl_assignments(VerilogParser.List_of_net_decl_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_decl_assignment(VerilogParser.Net_decl_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#param_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_assignment(VerilogParser.Param_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specparam_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_assignment(VerilogParser.Specparam_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#type_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_assignment(VerilogParser.Type_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pulse_control_specparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulse_control_specparam(VerilogParser.Pulse_control_specparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#error_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_limit_value(VerilogParser.Error_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#reject_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReject_limit_value(VerilogParser.Reject_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_value(VerilogParser.Limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_decl_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_assignment(VerilogParser.Variable_decl_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_new(VerilogParser.Class_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dynamic_array_new}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_array_new(VerilogParser.Dynamic_array_newContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unpacked_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpacked_dimension(VerilogParser.Unpacked_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#packed_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacked_dimension(VerilogParser.Packed_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#associative_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociative_dimension(VerilogParser.Associative_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_dimension(VerilogParser.Variable_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#queue_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_dimension(VerilogParser.Queue_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unsized_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsized_dimension(VerilogParser.Unsized_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_data_type_or_implicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_data_type_or_implicit(VerilogParser.Function_data_type_or_implicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(VerilogParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_body_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body_declaration(VerilogParser.Function_body_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_prototype(VerilogParser.Function_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dpi_import_export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_import_export(VerilogParser.Dpi_import_exportContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dpi_spec_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_spec_string(VerilogParser.Dpi_spec_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dpi_function_import_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_function_import_property(VerilogParser.Dpi_function_import_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dpi_task_import_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_task_import_property(VerilogParser.Dpi_task_import_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dpi_function_proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_function_proto(VerilogParser.Dpi_function_protoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dpi_task_proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDpi_task_proto(VerilogParser.Dpi_task_protoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_declaration(VerilogParser.Task_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_body_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_body_declaration(VerilogParser.Task_body_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_item_declaration(VerilogParser.Tf_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_list(VerilogParser.Tf_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_item(VerilogParser.Tf_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_direction(VerilogParser.Tf_port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_declaration(VerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_prototype(VerilogParser.Task_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item_declaration(VerilogParser.Block_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#overload_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverload_declaration(VerilogParser.Overload_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#overload_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverload_operator(VerilogParser.Overload_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#overload_proto_formals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverload_proto_formals(VerilogParser.Overload_proto_formalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#virtual_interface_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_interface_declaration(VerilogParser.Virtual_interface_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_declaration(VerilogParser.Modport_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_item(VerilogParser.Modport_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_ports_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_ports_declaration(VerilogParser.Modport_ports_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_clocking_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_clocking_declaration(VerilogParser.Modport_clocking_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_simple_ports_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_simple_ports_declaration(VerilogParser.Modport_simple_ports_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_simple_port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_simple_port(VerilogParser.Modport_simple_portContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_tf_ports_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_tf_ports_declaration(VerilogParser.Modport_tf_ports_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_tf_port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_tf_port(VerilogParser.Modport_tf_portContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#import_export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_export(VerilogParser.Import_exportContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#concurrent_assertion_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_assertion_item(VerilogParser.Concurrent_assertion_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_assertion_statement(VerilogParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assert_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_property_statement(VerilogParser.Assert_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assume_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssume_property_statement(VerilogParser.Assume_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cover_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_property_statement(VerilogParser.Cover_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#expect_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpect_property_statement(VerilogParser.Expect_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cover_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_sequence_statement(VerilogParser.Cover_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#restrict_property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestrict_property_statement(VerilogParser.Restrict_property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_instance(VerilogParser.Property_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_list_of_arguments(VerilogParser.Property_list_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_actual_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_actual_arg(VerilogParser.Property_actual_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assertion_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_item_declaration(VerilogParser.Assertion_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(VerilogParser.Property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_port_list(VerilogParser.Property_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_port_item(VerilogParser.Property_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_lvar_port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_lvar_port_direction(VerilogParser.Property_lvar_port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_formal_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_formal_type(VerilogParser.Property_formal_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_spec(VerilogParser.Property_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_statement_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_statement_spec(VerilogParser.Property_statement_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_statement(VerilogParser.Property_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_case_item(VerilogParser.Property_case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_expr(VerilogParser.Property_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_declaration(VerilogParser.Sequence_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_port_list(VerilogParser.Sequence_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_port_item(VerilogParser.Sequence_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_lvar_port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_lvar_port_direction(VerilogParser.Sequence_lvar_port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_formal_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_formal_type(VerilogParser.Sequence_formal_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_expr(VerilogParser.Sequence_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cycle_delay_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_delay_range(VerilogParser.Cycle_delay_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_method_call(VerilogParser.Sequence_method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_match_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_match_item(VerilogParser.Sequence_match_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_instance(VerilogParser.Sequence_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_list_of_arguments(VerilogParser.Sequence_list_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_actual_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_actual_arg(VerilogParser.Sequence_actual_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#boolean_abbrev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_abbrev(VerilogParser.Boolean_abbrevContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_abbrev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_abbrev(VerilogParser.Sequence_abbrevContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#consecutive_repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsecutive_repetition(VerilogParser.Consecutive_repetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#non_consecutive_repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_consecutive_repetition(VerilogParser.Non_consecutive_repetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#goto_repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_repetition(VerilogParser.Goto_repetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#const_or_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_or_range_expression(VerilogParser.Const_or_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cycle_delay_const_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_delay_const_range_expression(VerilogParser.Cycle_delay_const_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#expression_or_dist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or_dist(VerilogParser.Expression_or_distContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assertion_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_variable_declaration(VerilogParser.Assertion_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_declaration(VerilogParser.Let_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_identifier(VerilogParser.Let_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_port_list(VerilogParser.Let_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_port_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_port_item(VerilogParser.Let_port_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_formal_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_formal_type(VerilogParser.Let_formal_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_expression(VerilogParser.Let_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_list_of_arguments(VerilogParser.Let_list_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#let_actual_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_actual_arg(VerilogParser.Let_actual_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#covergroup_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_declaration(VerilogParser.Covergroup_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#coverage_spec_or_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_spec_or_option(VerilogParser.Coverage_spec_or_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#coverage_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_option(VerilogParser.Coverage_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#coverage_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_spec(VerilogParser.Coverage_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#coverage_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverage_event(VerilogParser.Coverage_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#block_event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_event_expression(VerilogParser.Block_event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_btf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_btf_identifier(VerilogParser.Hierarchical_btf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cover_point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_point(VerilogParser.Cover_pointContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bins_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_or_empty(VerilogParser.Bins_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bins_or_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_or_options(VerilogParser.Bins_or_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bins_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_keyword(VerilogParser.Bins_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#range_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_list(VerilogParser.Range_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#trans_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_list(VerilogParser.Trans_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#trans_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_set(VerilogParser.Trans_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#trans_range_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_range_list(VerilogParser.Trans_range_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#trans_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_item(VerilogParser.Trans_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#repeat_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_range(VerilogParser.Repeat_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cover_cross}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_cross(VerilogParser.Cover_crossContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_coverpoints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_coverpoints(VerilogParser.List_of_coverpointsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cross_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_item(VerilogParser.Cross_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#select_bins_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_bins_or_empty(VerilogParser.Select_bins_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bins_selection_or_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_selection_or_option(VerilogParser.Bins_selection_or_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bins_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_selection(VerilogParser.Bins_selectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#select_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expression(VerilogParser.Select_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#select_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_condition(VerilogParser.Select_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bins_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_expression(VerilogParser.Bins_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#open_range_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_range_list(VerilogParser.Open_range_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#open_value_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_value_range(VerilogParser.Open_value_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_instantiation(VerilogParser.Gate_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cmos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_switch_instance(VerilogParser.Cmos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#enable_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_gate_instance(VerilogParser.Enable_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#mos_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_switch_instance(VerilogParser.Mos_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#n_input_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_gate_instance(VerilogParser.N_input_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#n_output_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_gate_instance(VerilogParser.N_output_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pass_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_switch_instance(VerilogParser.Pass_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_enable_switch_instance(VerilogParser.Pass_enable_switch_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pull_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPull_gate_instance(VerilogParser.Pull_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pulldown_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulldown_strength(VerilogParser.Pulldown_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pullup_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPullup_strength(VerilogParser.Pullup_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#enable_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_terminal(VerilogParser.Enable_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inout_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_terminal(VerilogParser.Inout_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_terminal(VerilogParser.Input_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ncontrol_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNcontrol_terminal(VerilogParser.Ncontrol_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_terminal(VerilogParser.Output_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pcontrol_terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPcontrol_terminal(VerilogParser.Pcontrol_terminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmos_switchtype(VerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_gatetype(VerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMos_switchtype(VerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_input_gatetype(VerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#n_output_gatetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN_output_gatetype(VerilogParser.N_output_gatetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pass_en_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_en_switchtype(VerilogParser.Pass_en_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pass_switchtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_switchtype(VerilogParser.Pass_switchtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instantiation(VerilogParser.Module_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_value_assignment(VerilogParser.Parameter_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_parameter_assignments(VerilogParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ordered_parameter_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_parameter_assignment(VerilogParser.Ordered_parameter_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_parameter_assignment(VerilogParser.Named_parameter_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_instance(VerilogParser.Hierarchical_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#name_of_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_of_instance(VerilogParser.Name_of_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_connections(VerilogParser.List_of_port_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_port_connection(VerilogParser.Ordered_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#named_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_port_connection(VerilogParser.Named_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_instantiation(VerilogParser.Interface_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#program_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_instantiation(VerilogParser.Program_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_instantiation(VerilogParser.Checker_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_checker_port_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_checker_port_connections(VerilogParser.List_of_checker_port_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ordered_checker_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_checker_port_connection(VerilogParser.Ordered_checker_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#named_checker_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_checker_port_connection(VerilogParser.Named_checker_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_region}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_region(VerilogParser.Generate_regionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#loop_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_generate_construct(VerilogParser.Loop_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_initialization(VerilogParser.Genvar_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#conditional_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_generate_construct(VerilogParser.Conditional_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#if_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_generate_construct(VerilogParser.If_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_generate_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_generate_construct(VerilogParser.Case_generate_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_generate_item(VerilogParser.Case_generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block(VerilogParser.Generate_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_item(VerilogParser.Generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_nonansi_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_nonansi_declaration(VerilogParser.Udp_nonansi_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_iteration(VerilogParser.Genvar_iterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_ansi_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_ansi_declaration(VerilogParser.Udp_ansi_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_declaration(VerilogParser.Udp_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_port_list(VerilogParser.Udp_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_declaration_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_declaration_port_list(VerilogParser.Udp_declaration_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_port_declaration(VerilogParser.Udp_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_output_declaration(VerilogParser.Udp_output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_input_declaration(VerilogParser.Udp_input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_reg_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_reg_declaration(VerilogParser.Udp_reg_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_body(VerilogParser.Udp_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#combinational_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinational_body(VerilogParser.Combinational_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#combinational_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinational_entry(VerilogParser.Combinational_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequential_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_body(VerilogParser.Sequential_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_initial_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_initial_statement(VerilogParser.Udp_initial_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#init_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_val(VerilogParser.Init_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequential_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_entry(VerilogParser.Sequential_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#seq_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_input_list(VerilogParser.Seq_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#level_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_input_list(VerilogParser.Level_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_input_list(VerilogParser.Edge_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_indicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_indicator(VerilogParser.Edge_indicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#current_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_state(VerilogParser.Current_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#next_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_state(VerilogParser.Next_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_symbol(VerilogParser.Output_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#level_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_symbol(VerilogParser.Level_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_symbol(VerilogParser.Edge_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_instantiation(VerilogParser.Udp_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_instance(VerilogParser.Udp_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuous_assign(VerilogParser.Continuous_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_assignments(VerilogParser.List_of_net_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_assignments(VerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_alias(VerilogParser.Net_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_assignment(VerilogParser.Net_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_construct(VerilogParser.Initial_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#always_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_construct(VerilogParser.Always_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#always_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_keyword(VerilogParser.Always_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#final_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_construct(VerilogParser.Final_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocking_assignment(VerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#operator_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_assignment(VerilogParser.Operator_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(VerilogParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#nonblocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonblocking_assignment(VerilogParser.Nonblocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#procedural_continuous_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_continuous_assignment(VerilogParser.Procedural_continuous_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#action_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction_block(VerilogParser.Action_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#seq_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_block(VerilogParser.Seq_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#par_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_block(VerilogParser.Par_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#join_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_keyword(VerilogParser.Join_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#statement_or_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_or_null(VerilogParser.Statement_or_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VerilogParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#statement_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_item(VerilogParser.Statement_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(VerilogParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_statement_or_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement_or_null(VerilogParser.Function_statement_or_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_identifier_list(VerilogParser.Variable_identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#procedural_timing_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_timing_control_statement(VerilogParser.Procedural_timing_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_or_event_control(VerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_control(VerilogParser.Delay_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_control(VerilogParser.Event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_expression(VerilogParser.Event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#procedural_timing_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_timing_control(VerilogParser.Procedural_timing_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(VerilogParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_statement(VerilogParser.Wait_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_trigger(VerilogParser.Event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_statement(VerilogParser.Disable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(VerilogParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unique_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_priority(VerilogParser.Unique_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(VerilogParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_keyword(VerilogParser.Case_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(VerilogParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item(VerilogParser.Case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_pattern_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_pattern_item(VerilogParser.Case_pattern_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_inside_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_inside_item(VerilogParser.Case_inside_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_item_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_expression(VerilogParser.Case_item_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#randcase_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandcase_statement(VerilogParser.Randcase_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#randcase_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandcase_item(VerilogParser.Randcase_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(VerilogParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern(VerilogParser.Assignment_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#structure_pattern_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure_pattern_key(VerilogParser.Structure_pattern_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#array_pattern_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_pattern_key(VerilogParser.Array_pattern_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment_pattern_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_key(VerilogParser.Assignment_pattern_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(VerilogParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment_pattern_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_expression(VerilogParser.Assignment_pattern_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment_pattern_expression_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_expression_type(VerilogParser.Assignment_pattern_expression_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_assignment_pattern_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_assignment_pattern_expression(VerilogParser.Constant_assignment_pattern_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment_pattern_net_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_net_lvalue(VerilogParser.Assignment_pattern_net_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment_pattern_variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_pattern_variable_lvalue(VerilogParser.Assignment_pattern_variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(VerilogParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#for_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_initialization(VerilogParser.For_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#for_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_variable_declaration(VerilogParser.For_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#for_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_step(VerilogParser.For_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#for_step_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_step_assignment(VerilogParser.For_step_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#loop_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_variables(VerilogParser.Loop_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#subroutine_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_call_statement(VerilogParser.Subroutine_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assertion_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion_item(VerilogParser.Assertion_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#deferred_immediate_assertion_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assertion_item(VerilogParser.Deferred_immediate_assertion_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#procedural_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_assertion_statement(VerilogParser.Procedural_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#immediate_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate_assertion_statement(VerilogParser.Immediate_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_assertion_statement(VerilogParser.Simple_immediate_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_immediate_assert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_assert_statement(VerilogParser.Simple_immediate_assert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_immediate_assume_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_assume_statement(VerilogParser.Simple_immediate_assume_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_immediate_cover_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_immediate_cover_statement(VerilogParser.Simple_immediate_cover_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#deferred_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assertion_statement(VerilogParser.Deferred_immediate_assertion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#deferred_immediate_assert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assert_statement(VerilogParser.Deferred_immediate_assert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#deferred_immediate_assume_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_assume_statement(VerilogParser.Deferred_immediate_assume_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#deferred_immediate_cover_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_immediate_cover_statement(VerilogParser.Deferred_immediate_cover_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_declaration(VerilogParser.Clocking_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_event(VerilogParser.Clocking_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_item(VerilogParser.Clocking_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#default_skew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_skew(VerilogParser.Default_skewContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_direction(VerilogParser.Clocking_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_clocking_decl_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_clocking_decl_assign(VerilogParser.List_of_clocking_decl_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_decl_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_decl_assign(VerilogParser.Clocking_decl_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_skew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_skew(VerilogParser.Clocking_skewContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_drive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_drive(VerilogParser.Clocking_driveContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cycle_delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_delay(VerilogParser.Cycle_delayContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clockvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockvar(VerilogParser.ClockvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clockvar_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockvar_expression(VerilogParser.Clockvar_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#randsequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandsequence_statement(VerilogParser.Randsequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction(VerilogParser.ProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_rule(VerilogParser.Rs_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_production_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_production_list(VerilogParser.Rs_production_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#weight_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeight_specification(VerilogParser.Weight_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_code_block(VerilogParser.Rs_code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_prod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_prod(VerilogParser.Rs_prodContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#production_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction_item(VerilogParser.Production_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_if_else(VerilogParser.Rs_if_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_repeat(VerilogParser.Rs_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_case(VerilogParser.Rs_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#rs_case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRs_case_item(VerilogParser.Rs_case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_block(VerilogParser.Specify_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_item(VerilogParser.Specify_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#pulsestyle_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulsestyle_declaration(VerilogParser.Pulsestyle_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#showcancelled_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowcancelled_declaration(VerilogParser.Showcancelled_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_declaration(VerilogParser.Path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_path_declaration(VerilogParser.Simple_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parallel_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_path_description(VerilogParser.Parallel_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#full_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_path_description(VerilogParser.Full_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_path_inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_inputs(VerilogParser.List_of_path_inputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_path_outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_outputs(VerilogParser.List_of_path_outputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_input_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_input_terminal_descriptor(VerilogParser.Specify_input_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_output_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_output_terminal_descriptor(VerilogParser.Specify_output_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_identifier(VerilogParser.Input_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_identifier(VerilogParser.Output_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#path_delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_delay_value(VerilogParser.Path_delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_path_delay_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_delay_expressions(VerilogParser.List_of_path_delay_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#t_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_path_delay_expression(VerilogParser.T_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#trise_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrise_path_delay_expression(VerilogParser.Trise_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tfall_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfall_path_delay_expression(VerilogParser.Tfall_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tz_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTz_path_delay_expression(VerilogParser.Tz_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#t01_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT01_path_delay_expression(VerilogParser.T01_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#t10_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT10_path_delay_expression(VerilogParser.T10_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#t0z_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT0z_path_delay_expression(VerilogParser.T0z_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tz1_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTz1_path_delay_expression(VerilogParser.Tz1_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#t1z_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1z_path_delay_expression(VerilogParser.T1z_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tz0_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTz0_path_delay_expression(VerilogParser.Tz0_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#t0x_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT0x_path_delay_expression(VerilogParser.T0x_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tx1_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTx1_path_delay_expression(VerilogParser.Tx1_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#t1x_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT1x_path_delay_expression(VerilogParser.T1x_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tx0_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTx0_path_delay_expression(VerilogParser.Tx0_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#txz_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxz_path_delay_expression(VerilogParser.Txz_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tzx_path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTzx_path_delay_expression(VerilogParser.Tzx_path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_delay_expression(VerilogParser.Path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_sensitive_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_sensitive_path_declaration(VerilogParser.Edge_sensitive_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parallel_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_edge_sensitive_path_description(VerilogParser.Parallel_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#full_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_edge_sensitive_path_description(VerilogParser.Full_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_source_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_source_expression(VerilogParser.Data_source_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_identifier(VerilogParser.Edge_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#state_dependent_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_dependent_path_declaration(VerilogParser.State_dependent_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#polarity_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarity_operator(VerilogParser.Polarity_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_timing_check(VerilogParser.System_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#setup_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup_timing_check(VerilogParser.Setup_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hold_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHold_timing_check(VerilogParser.Hold_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#setuphold_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetuphold_timing_check(VerilogParser.Setuphold_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#recovery_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_timing_check(VerilogParser.Recovery_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#removal_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoval_timing_check(VerilogParser.Removal_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#recrem_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecrem_timing_check(VerilogParser.Recrem_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#skew_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkew_timing_check(VerilogParser.Skew_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timeskew_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeskew_timing_check(VerilogParser.Timeskew_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#fullskew_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullskew_timing_check(VerilogParser.Fullskew_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#period_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod_timing_check(VerilogParser.Period_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#width_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth_timing_check(VerilogParser.Width_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#nochange_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNochange_timing_check(VerilogParser.Nochange_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timecheck_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimecheck_condition(VerilogParser.Timecheck_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#controlled_reference_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlled_reference_event(VerilogParser.Controlled_reference_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_event(VerilogParser.Data_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delayed_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_data(VerilogParser.Delayed_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delayed_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_reference(VerilogParser.Delayed_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#end_edge_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_edge_offset(VerilogParser.End_edge_offsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_based_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_based_flag(VerilogParser.Event_based_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#notifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifier(VerilogParser.NotifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#reference_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_event(VerilogParser.Reference_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#remain_active_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemain_active_flag(VerilogParser.Remain_active_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timestamp_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_condition(VerilogParser.Timestamp_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#start_edge_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_edge_offset(VerilogParser.Start_edge_offsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#threshold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreshold(VerilogParser.ThresholdContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timing_check_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_limit(VerilogParser.Timing_check_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timing_check_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_event(VerilogParser.Timing_check_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#controlled_timing_check_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlled_timing_check_event(VerilogParser.Controlled_timing_check_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timing_check_event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_event_control(VerilogParser.Timing_check_event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_terminal_descriptor(VerilogParser.Specify_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_control_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_control_specifier(VerilogParser.Edge_control_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_descriptor(VerilogParser.Edge_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timing_check_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_condition(VerilogParser.Timing_check_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#scalar_timing_check_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_timing_check_condition(VerilogParser.Scalar_timing_check_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#scalar_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_constant(VerilogParser.Scalar_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(VerilogParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_concatenation(VerilogParser.Constant_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_multiple_concatenation(VerilogParser.Constant_multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_concatenation(VerilogParser.Module_path_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_multiple_concatenation(VerilogParser.Module_path_multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_concatenation(VerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#streaming_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreaming_concatenation(VerilogParser.Streaming_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#stream_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_operator(VerilogParser.Stream_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#slice_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice_size(VerilogParser.Slice_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#stream_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_concatenation(VerilogParser.Stream_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#stream_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_expression(VerilogParser.Stream_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#array_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_range_expression(VerilogParser.Array_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#empty_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_queue(VerilogParser.Empty_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_function_call(VerilogParser.Constant_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_call(VerilogParser.Tf_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_tf_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_tf_call(VerilogParser.System_tf_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#subroutine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_call(VerilogParser.Subroutine_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_subroutine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_subroutine_call(VerilogParser.Function_subroutine_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_arguments(VerilogParser.List_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(VerilogParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#method_call_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_body(VerilogParser.Method_call_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#built_in_method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_method_call(VerilogParser.Built_in_method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#array_manipulation_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_manipulation_call(VerilogParser.Array_manipulation_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#randomize_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomize_call(VerilogParser.Randomize_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#method_call_root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_root(VerilogParser.Method_call_rootContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#array_method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_method_name(VerilogParser.Array_method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inc_or_dec_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_or_dec_expression(VerilogParser.Inc_or_dec_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_binary_and}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_binary_and(VerilogParser.Const_expr_binary_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_mutl}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_mutl(VerilogParser.Const_expr_mutlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_add}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_add(VerilogParser.Const_expr_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_equality}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_equality(VerilogParser.Const_expr_equalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_comp}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_comp(VerilogParser.Const_expr_compContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_log_or}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_log_or(VerilogParser.Const_expr_log_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_binary_or}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_binary_or(VerilogParser.Const_expr_binary_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_only_primary}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_only_primary(VerilogParser.Const_expr_only_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_binary_xor}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_binary_xor(VerilogParser.Const_expr_binary_xorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_log_and}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_log_and(VerilogParser.Const_expr_log_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_shift}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_shift(VerilogParser.Const_expr_shiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_st_st}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_st_st(VerilogParser.Const_expr_st_stContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_conditional}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_conditional(VerilogParser.Const_expr_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_expr_unary_op}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr_unary_op(VerilogParser.Const_expr_unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_mintypmax_expression(VerilogParser.Constant_mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_param_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_param_expression(VerilogParser.Constant_param_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#param_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_expression(VerilogParser.Param_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_range_expression(VerilogParser.Constant_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_part_select_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_part_select_range(VerilogParser.Constant_part_select_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_range(VerilogParser.Constant_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_indexed_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_indexed_range(VerilogParser.Constant_indexed_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#expr_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_(VerilogParser.Expr_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_binary_or}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_binary_or(VerilogParser.Expression_binary_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_binary_xor}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_binary_xor(VerilogParser.Expression_binary_xorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_add}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_add(VerilogParser.Expression_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_log_or}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_log_or(VerilogParser.Expression_log_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_only_primary}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_only_primary(VerilogParser.Expression_only_primaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_log_and}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_log_and(VerilogParser.Expression_log_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_inc_or_dec}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_inc_or_dec(VerilogParser.Expression_inc_or_decContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_tagged_union}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_tagged_union(VerilogParser.Expression_tagged_unionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_conditional_exp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_conditional_exp(VerilogParser.Expression_conditional_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_comp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_comp(VerilogParser.Expression_compContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_inside_exp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_inside_exp(VerilogParser.Expression_inside_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_mult}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_mult(VerilogParser.Expression_multContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_binary_and}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_binary_and(VerilogParser.Expression_binary_andContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_equality}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_equality(VerilogParser.Expression_equalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_shift}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_shift(VerilogParser.Expression_shiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_op_assign}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_op_assign(VerilogParser.Expression_op_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_st_st}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_st_st(VerilogParser.Expression_st_stContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_unary_op}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_unary_op(VerilogParser.Expression_unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#matches_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatches_pattern(VerilogParser.Matches_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tagged_union_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagged_union_expression(VerilogParser.Tagged_union_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#value_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_range(VerilogParser.Value_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMintypmax_expression(VerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_expression(VerilogParser.Module_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_conditional_expression(VerilogParser.Module_path_conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_binary_expression(VerilogParser.Module_path_binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_unary_expression(VerilogParser.Module_path_unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_mintypmax_expression(VerilogParser.Module_path_mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#part_select_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_select_range(VerilogParser.Part_select_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#indexed_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_range(VerilogParser.Indexed_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_expression(VerilogParser.Genvar_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_primary(VerilogParser.Constant_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_primary(VerilogParser.Module_path_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#primary_no_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_no_function_call(VerilogParser.Primary_no_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(VerilogParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_qualifier(VerilogParser.Class_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(VerilogParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#primary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_literal(VerilogParser.Primary_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(VerilogParser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#implicit_class_handle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_class_handle(VerilogParser.Implicit_class_handleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bit_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_select(VerilogParser.Bit_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(VerilogParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#nonrange_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonrange_select(VerilogParser.Nonrange_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_bit_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_bit_select(VerilogParser.Constant_bit_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_select(VerilogParser.Constant_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_cast(VerilogParser.Constant_castContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_let_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_let_expression(VerilogParser.Constant_let_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(VerilogParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_lvalue(VerilogParser.Net_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_lvalue(VerilogParser.Variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#nonrange_variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonrange_variable_lvalue(VerilogParser.Nonrange_variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(VerilogParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(VerilogParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inc_or_dec_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_or_dec_operator(VerilogParser.Inc_or_dec_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unary_module_path_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_module_path_operator(VerilogParser.Unary_module_path_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#binary_module_path_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_module_path_operator(VerilogParser.Binary_module_path_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unbased_unsized_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnbased_unsized_literal(VerilogParser.Unbased_unsized_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(VerilogParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_instance(VerilogParser.Attribute_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_spec(VerilogParser.Attr_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(VerilogParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#array_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_identifier(VerilogParser.Array_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_identifier(VerilogParser.Block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bin_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_identifier(VerilogParser.Bin_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#c_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_identifier(VerilogParser.C_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cell_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_identifier(VerilogParser.Cell_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#checker_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecker_identifier(VerilogParser.Checker_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_identifier(VerilogParser.Class_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#class_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_variable_identifier(VerilogParser.Class_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#clocking_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocking_identifier(VerilogParser.Clocking_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#config_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_identifier(VerilogParser.Config_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#const_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_identifier(VerilogParser.Const_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constraint_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_identifier(VerilogParser.Constraint_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#covergroup_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_identifier(VerilogParser.Covergroup_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#covergroup_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCovergroup_variable_identifier(VerilogParser.Covergroup_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cover_point_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCover_point_identifier(VerilogParser.Cover_point_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cross_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCross_identifier(VerilogParser.Cross_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dynamic_array_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_array_variable_identifier(VerilogParser.Dynamic_array_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#enum_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_identifier(VerilogParser.Enum_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#escaped_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_identifier(VerilogParser.Escaped_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#formal_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_identifier(VerilogParser.Formal_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_identifier(VerilogParser.Function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block_identifier(VerilogParser.Generate_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_identifier(VerilogParser.Genvar_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_array_identifier(VerilogParser.Hierarchical_array_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_block_identifier(VerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_event_identifier(VerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_identifier(VerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_net_identifier(VerilogParser.Hierarchical_net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_parameter_identifier(VerilogParser.Hierarchical_parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_property_identifier(VerilogParser.Hierarchical_property_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_sequence_identifier(VerilogParser.Hierarchical_sequence_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_task_identifier(VerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_tf_identifier(VerilogParser.Hierarchical_tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_variable_identifier(VerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VerilogParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#index_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_variable_identifier(VerilogParser.Index_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_identifier(VerilogParser.Interface_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#interface_instance_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_instance_identifier(VerilogParser.Interface_instance_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inout_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInout_port_identifier(VerilogParser.Inout_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_port_identifier(VerilogParser.Input_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#instance_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_identifier(VerilogParser.Instance_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#library_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_identifier(VerilogParser.Library_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#member_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_identifier(VerilogParser.Member_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#method_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_identifier(VerilogParser.Method_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#modport_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModport_identifier(VerilogParser.Modport_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_identifier(VerilogParser.Module_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_identifier(VerilogParser.Net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_port_identifier(VerilogParser.Output_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_identifier(VerilogParser.Package_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#package_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_scope(VerilogParser.Package_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_identifier(VerilogParser.Parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_identifier(VerilogParser.Port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#production_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction_identifier(VerilogParser.Production_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#program_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_identifier(VerilogParser.Program_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#property_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_identifier(VerilogParser.Property_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_class_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_class_identifier(VerilogParser.Ps_class_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_covergroup_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_covergroup_identifier(VerilogParser.Ps_covergroup_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_identifier(VerilogParser.Ps_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_array_identifier(VerilogParser.Ps_or_hierarchical_array_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_net_identifier(VerilogParser.Ps_or_hierarchical_net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_property_identifier(VerilogParser.Ps_or_hierarchical_property_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_sequence_identifier(VerilogParser.Ps_or_hierarchical_sequence_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_or_hierarchical_tf_identifier(VerilogParser.Ps_or_hierarchical_tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_parameter_identifier(VerilogParser.Ps_parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ps_type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs_type_identifier(VerilogParser.Ps_type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequence_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_identifier(VerilogParser.Sequence_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#signal_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_identifier(VerilogParser.Signal_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_identifier(VerilogParser.Simple_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specparam_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_identifier(VerilogParser.Specparam_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_tf_identifier(VerilogParser.System_tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_identifier(VerilogParser.Task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_identifier(VerilogParser.Tf_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#terminal_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_identifier(VerilogParser.Terminal_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#topmodule_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopmodule_identifier(VerilogParser.Topmodule_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(VerilogParser.Type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_identifier(VerilogParser.Udp_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bins_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBins_identifier(VerilogParser.Bins_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_identifier(VerilogParser.Variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(VerilogParser.NumberContext ctx);
}