// Generated from Verilog.g4 by ANTLR 4.5
package com.proteus.preprocess.verilog.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VerilogParser}.
 */
public interface VerilogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VerilogParser#source_text}.
	 * @param ctx the parse tree
	 */
	void enterSource_text(VerilogParser.Source_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#source_text}.
	 * @param ctx the parse tree
	 */
	void exitSource_text(VerilogParser.Source_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(VerilogParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(VerilogParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModule_declaration(VerilogParser.Module_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModule_declaration(VerilogParser.Module_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_nonansi_header}.
	 * @param ctx the parse tree
	 */
	void enterModule_nonansi_header(VerilogParser.Module_nonansi_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_nonansi_header}.
	 * @param ctx the parse tree
	 */
	void exitModule_nonansi_header(VerilogParser.Module_nonansi_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_ansi_header}.
	 * @param ctx the parse tree
	 */
	void enterModule_ansi_header(VerilogParser.Module_ansi_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_ansi_header}.
	 * @param ctx the parse tree
	 */
	void exitModule_ansi_header(VerilogParser.Module_ansi_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void enterModule_keyword(VerilogParser.Module_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void exitModule_keyword(VerilogParser.Module_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(VerilogParser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(VerilogParser.Interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_nonansi_header}.
	 * @param ctx the parse tree
	 */
	void enterInterface_nonansi_header(VerilogParser.Interface_nonansi_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_nonansi_header}.
	 * @param ctx the parse tree
	 */
	void exitInterface_nonansi_header(VerilogParser.Interface_nonansi_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_ansi_header}.
	 * @param ctx the parse tree
	 */
	void enterInterface_ansi_header(VerilogParser.Interface_ansi_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_ansi_header}.
	 * @param ctx the parse tree
	 */
	void exitInterface_ansi_header(VerilogParser.Interface_ansi_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#program_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProgram_declaration(VerilogParser.Program_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#program_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProgram_declaration(VerilogParser.Program_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#program_nonansi_header}.
	 * @param ctx the parse tree
	 */
	void enterProgram_nonansi_header(VerilogParser.Program_nonansi_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#program_nonansi_header}.
	 * @param ctx the parse tree
	 */
	void exitProgram_nonansi_header(VerilogParser.Program_nonansi_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#program_ansi_header}.
	 * @param ctx the parse tree
	 */
	void enterProgram_ansi_header(VerilogParser.Program_ansi_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#program_ansi_header}.
	 * @param ctx the parse tree
	 */
	void exitProgram_ansi_header(VerilogParser.Program_ansi_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_declaration}.
	 * @param ctx the parse tree
	 */
	void enterChecker_declaration(VerilogParser.Checker_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_declaration}.
	 * @param ctx the parse tree
	 */
	void exitChecker_declaration(VerilogParser.Checker_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(VerilogParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(VerilogParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(VerilogParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(VerilogParser.Package_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timeunits_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTimeunits_declaration(VerilogParser.Timeunits_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timeunits_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTimeunits_declaration(VerilogParser.Timeunits_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_port_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_port_list(VerilogParser.Parameter_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_port_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_port_list(VerilogParser.Parameter_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_parameter_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterList_of_parameter_port_declaration(VerilogParser.List_of_parameter_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_parameter_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitList_of_parameter_port_declaration(VerilogParser.List_of_parameter_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_port_declaration(VerilogParser.Parameter_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_port_declaration(VerilogParser.Parameter_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_ports}.
	 * @param ctx the parse tree
	 */
	void enterList_of_ports(VerilogParser.List_of_portsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_ports}.
	 * @param ctx the parse tree
	 */
	void exitList_of_ports(VerilogParser.List_of_portsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_port_declarations}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_declarations(VerilogParser.List_of_port_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_port_declarations}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_declarations(VerilogParser.List_of_port_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPort_declaration(VerilogParser.Port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPort_declaration(VerilogParser.Port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(VerilogParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(VerilogParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_expression}.
	 * @param ctx the parse tree
	 */
	void enterPort_expression(VerilogParser.Port_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_expression}.
	 * @param ctx the parse tree
	 */
	void exitPort_expression(VerilogParser.Port_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_reference}.
	 * @param ctx the parse tree
	 */
	void enterPort_reference(VerilogParser.Port_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_reference}.
	 * @param ctx the parse tree
	 */
	void exitPort_reference(VerilogParser.Port_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_direction}.
	 * @param ctx the parse tree
	 */
	void enterPort_direction(VerilogParser.Port_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_direction}.
	 * @param ctx the parse tree
	 */
	void exitPort_direction(VerilogParser.Port_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_port_header}.
	 * @param ctx the parse tree
	 */
	void enterNet_port_header(VerilogParser.Net_port_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_port_header}.
	 * @param ctx the parse tree
	 */
	void exitNet_port_header(VerilogParser.Net_port_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_port_header}.
	 * @param ctx the parse tree
	 */
	void enterVariable_port_header(VerilogParser.Variable_port_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_port_header}.
	 * @param ctx the parse tree
	 */
	void exitVariable_port_header(VerilogParser.Variable_port_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_port_header}.
	 * @param ctx the parse tree
	 */
	void enterInterface_port_header(VerilogParser.Interface_port_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_port_header}.
	 * @param ctx the parse tree
	 */
	void exitInterface_port_header(VerilogParser.Interface_port_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ansi_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAnsi_port_declaration(VerilogParser.Ansi_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ansi_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAnsi_port_declaration(VerilogParser.Ansi_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#elaboration_system_task}.
	 * @param ctx the parse tree
	 */
	void enterElaboration_system_task(VerilogParser.Elaboration_system_taskContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#elaboration_system_task}.
	 * @param ctx the parse tree
	 */
	void exitElaboration_system_task(VerilogParser.Elaboration_system_taskContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#finish_number}.
	 * @param ctx the parse tree
	 */
	void enterFinish_number(VerilogParser.Finish_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#finish_number}.
	 * @param ctx the parse tree
	 */
	void exitFinish_number(VerilogParser.Finish_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_common_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_common_item(VerilogParser.Module_common_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_common_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_common_item(VerilogParser.Module_common_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_item(VerilogParser.Module_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_item(VerilogParser.Module_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_or_generate_item(VerilogParser.Module_or_generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_or_generate_item(VerilogParser.Module_or_generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#non_port_module_item}.
	 * @param ctx the parse tree
	 */
	void enterNon_port_module_item(VerilogParser.Non_port_module_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#non_port_module_item}.
	 * @param ctx the parse tree
	 */
	void exitNon_port_module_item(VerilogParser.Non_port_module_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 */
	void enterParameter_override(VerilogParser.Parameter_overrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 */
	void exitParameter_override(VerilogParser.Parameter_overrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bind_directive}.
	 * @param ctx the parse tree
	 */
	void enterBind_directive(VerilogParser.Bind_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bind_directive}.
	 * @param ctx the parse tree
	 */
	void exitBind_directive(VerilogParser.Bind_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bind_target_scope}.
	 * @param ctx the parse tree
	 */
	void enterBind_target_scope(VerilogParser.Bind_target_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bind_target_scope}.
	 * @param ctx the parse tree
	 */
	void exitBind_target_scope(VerilogParser.Bind_target_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bind_target_instance}.
	 * @param ctx the parse tree
	 */
	void enterBind_target_instance(VerilogParser.Bind_target_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bind_target_instance}.
	 * @param ctx the parse tree
	 */
	void exitBind_target_instance(VerilogParser.Bind_target_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bind_target_instance_list}.
	 * @param ctx the parse tree
	 */
	void enterBind_target_instance_list(VerilogParser.Bind_target_instance_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bind_target_instance_list}.
	 * @param ctx the parse tree
	 */
	void exitBind_target_instance_list(VerilogParser.Bind_target_instance_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bind_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterBind_instantiation(VerilogParser.Bind_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bind_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitBind_instantiation(VerilogParser.Bind_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#config_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConfig_declaration(VerilogParser.Config_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#config_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConfig_declaration(VerilogParser.Config_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#design_statement}.
	 * @param ctx the parse tree
	 */
	void enterDesign_statement(VerilogParser.Design_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#design_statement}.
	 * @param ctx the parse tree
	 */
	void exitDesign_statement(VerilogParser.Design_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#config_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterConfig_rule_statement(VerilogParser.Config_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#config_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitConfig_rule_statement(VerilogParser.Config_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause(VerilogParser.Default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause(VerilogParser.Default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inst_clause}.
	 * @param ctx the parse tree
	 */
	void enterInst_clause(VerilogParser.Inst_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inst_clause}.
	 * @param ctx the parse tree
	 */
	void exitInst_clause(VerilogParser.Inst_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inst_name}.
	 * @param ctx the parse tree
	 */
	void enterInst_name(VerilogParser.Inst_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inst_name}.
	 * @param ctx the parse tree
	 */
	void exitInst_name(VerilogParser.Inst_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cell_clause}.
	 * @param ctx the parse tree
	 */
	void enterCell_clause(VerilogParser.Cell_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cell_clause}.
	 * @param ctx the parse tree
	 */
	void exitCell_clause(VerilogParser.Cell_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#liblist_clause}.
	 * @param ctx the parse tree
	 */
	void enterLiblist_clause(VerilogParser.Liblist_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#liblist_clause}.
	 * @param ctx the parse tree
	 */
	void exitLiblist_clause(VerilogParser.Liblist_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_clause(VerilogParser.Use_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_clause(VerilogParser.Use_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModule_or_generate_item_declaration(VerilogParser.Module_or_generate_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModule_or_generate_item_declaration(VerilogParser.Module_or_generate_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void enterInterface_or_generate_item(VerilogParser.Interface_or_generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void exitInterface_or_generate_item(VerilogParser.Interface_or_generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#extern_tf_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtern_tf_declaration(VerilogParser.Extern_tf_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#extern_tf_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtern_tf_declaration(VerilogParser.Extern_tf_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_item}.
	 * @param ctx the parse tree
	 */
	void enterInterface_item(VerilogParser.Interface_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_item}.
	 * @param ctx the parse tree
	 */
	void exitInterface_item(VerilogParser.Interface_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#non_port_interface_item}.
	 * @param ctx the parse tree
	 */
	void enterNon_port_interface_item(VerilogParser.Non_port_interface_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#non_port_interface_item}.
	 * @param ctx the parse tree
	 */
	void exitNon_port_interface_item(VerilogParser.Non_port_interface_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#program_item}.
	 * @param ctx the parse tree
	 */
	void enterProgram_item(VerilogParser.Program_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#program_item}.
	 * @param ctx the parse tree
	 */
	void exitProgram_item(VerilogParser.Program_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#non_port_program_item}.
	 * @param ctx the parse tree
	 */
	void enterNon_port_program_item(VerilogParser.Non_port_program_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#non_port_program_item}.
	 * @param ctx the parse tree
	 */
	void exitNon_port_program_item(VerilogParser.Non_port_program_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#program_generate_item}.
	 * @param ctx the parse tree
	 */
	void enterProgram_generate_item(VerilogParser.Program_generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#program_generate_item}.
	 * @param ctx the parse tree
	 */
	void exitProgram_generate_item(VerilogParser.Program_generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_port_list}.
	 * @param ctx the parse tree
	 */
	void enterChecker_port_list(VerilogParser.Checker_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_port_list}.
	 * @param ctx the parse tree
	 */
	void exitChecker_port_list(VerilogParser.Checker_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_port_item}.
	 * @param ctx the parse tree
	 */
	void enterChecker_port_item(VerilogParser.Checker_port_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_port_item}.
	 * @param ctx the parse tree
	 */
	void exitChecker_port_item(VerilogParser.Checker_port_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void enterChecker_or_generate_item(VerilogParser.Checker_or_generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void exitChecker_or_generate_item(VerilogParser.Checker_or_generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterChecker_or_generate_item_declaration(VerilogParser.Checker_or_generate_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitChecker_or_generate_item_declaration(VerilogParser.Checker_or_generate_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_generate_item}.
	 * @param ctx the parse tree
	 */
	void enterChecker_generate_item(VerilogParser.Checker_generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_generate_item}.
	 * @param ctx the parse tree
	 */
	void exitChecker_generate_item(VerilogParser.Checker_generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_always_construct}.
	 * @param ctx the parse tree
	 */
	void enterChecker_always_construct(VerilogParser.Checker_always_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_always_construct}.
	 * @param ctx the parse tree
	 */
	void exitChecker_always_construct(VerilogParser.Checker_always_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_item}.
	 * @param ctx the parse tree
	 */
	void enterClass_item(VerilogParser.Class_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_item}.
	 * @param ctx the parse tree
	 */
	void exitClass_item(VerilogParser.Class_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_property}.
	 * @param ctx the parse tree
	 */
	void enterClass_property(VerilogParser.Class_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_property}.
	 * @param ctx the parse tree
	 */
	void exitClass_property(VerilogParser.Class_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_method}.
	 * @param ctx the parse tree
	 */
	void enterClass_method(VerilogParser.Class_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_method}.
	 * @param ctx the parse tree
	 */
	void exitClass_method(VerilogParser.Class_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_constructor_prototype}.
	 * @param ctx the parse tree
	 */
	void enterClass_constructor_prototype(VerilogParser.Class_constructor_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_constructor_prototype}.
	 * @param ctx the parse tree
	 */
	void exitClass_constructor_prototype(VerilogParser.Class_constructor_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_constraint}.
	 * @param ctx the parse tree
	 */
	void enterClass_constraint(VerilogParser.Class_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_constraint}.
	 * @param ctx the parse tree
	 */
	void exitClass_constraint(VerilogParser.Class_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_item_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_item_qualifier(VerilogParser.Class_item_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_item_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_item_qualifier(VerilogParser.Class_item_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterProperty_qualifier(VerilogParser.Property_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitProperty_qualifier(VerilogParser.Property_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#random_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterRandom_qualifier(VerilogParser.Random_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#random_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitRandom_qualifier(VerilogParser.Random_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#method_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterMethod_qualifier(VerilogParser.Method_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#method_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitMethod_qualifier(VerilogParser.Method_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#method_prototype}.
	 * @param ctx the parse tree
	 */
	void enterMethod_prototype(VerilogParser.Method_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#method_prototype}.
	 * @param ctx the parse tree
	 */
	void exitMethod_prototype(VerilogParser.Method_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_constructor_declaration(VerilogParser.Class_constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_constructor_declaration(VerilogParser.Class_constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constraint_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_declaration(VerilogParser.Constraint_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constraint_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_declaration(VerilogParser.Constraint_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constraint_block}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_block(VerilogParser.Constraint_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constraint_block}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_block(VerilogParser.Constraint_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constraint_block_item}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_block_item(VerilogParser.Constraint_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constraint_block_item}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_block_item(VerilogParser.Constraint_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#solve_before_list}.
	 * @param ctx the parse tree
	 */
	void enterSolve_before_list(VerilogParser.Solve_before_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#solve_before_list}.
	 * @param ctx the parse tree
	 */
	void exitSolve_before_list(VerilogParser.Solve_before_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#solve_before_primary}.
	 * @param ctx the parse tree
	 */
	void enterSolve_before_primary(VerilogParser.Solve_before_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#solve_before_primary}.
	 * @param ctx the parse tree
	 */
	void exitSolve_before_primary(VerilogParser.Solve_before_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constraint_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_expression(VerilogParser.Constraint_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constraint_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_expression(VerilogParser.Constraint_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constraint_set}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_set(VerilogParser.Constraint_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constraint_set}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_set(VerilogParser.Constraint_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dist_list}.
	 * @param ctx the parse tree
	 */
	void enterDist_list(VerilogParser.Dist_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dist_list}.
	 * @param ctx the parse tree
	 */
	void exitDist_list(VerilogParser.Dist_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dist_item}.
	 * @param ctx the parse tree
	 */
	void enterDist_item(VerilogParser.Dist_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dist_item}.
	 * @param ctx the parse tree
	 */
	void exitDist_item(VerilogParser.Dist_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dist_weight}.
	 * @param ctx the parse tree
	 */
	void enterDist_weight(VerilogParser.Dist_weightContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dist_weight}.
	 * @param ctx the parse tree
	 */
	void exitDist_weight(VerilogParser.Dist_weightContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constraint_prototype}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_prototype(VerilogParser.Constraint_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constraint_prototype}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_prototype(VerilogParser.Constraint_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#extern_constraint_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtern_constraint_declaration(VerilogParser.Extern_constraint_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#extern_constraint_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtern_constraint_declaration(VerilogParser.Extern_constraint_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(VerilogParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(VerilogParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_item(VerilogParser.Package_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_item(VerilogParser.Package_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_or_generate_item_declaration(VerilogParser.Package_or_generate_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_or_generate_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_or_generate_item_declaration(VerilogParser.Package_or_generate_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#anonymous_program}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_program(VerilogParser.Anonymous_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#anonymous_program}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_program(VerilogParser.Anonymous_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#anonymous_program_item}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_program_item(VerilogParser.Anonymous_program_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#anonymous_program_item}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_program_item(VerilogParser.Anonymous_program_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_declaration(VerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_declaration(VerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(VerilogParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(VerilogParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specparam_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSpecparam_declaration(VerilogParser.Specparam_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specparam_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSpecparam_declaration(VerilogParser.Specparam_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInout_declaration(VerilogParser.Inout_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInout_declaration(VerilogParser.Inout_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInput_declaration(VerilogParser.Input_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInput_declaration(VerilogParser.Input_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOutput_declaration(VerilogParser.Output_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOutput_declaration(VerilogParser.Output_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_port_declaration(VerilogParser.Interface_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_port_declaration(VerilogParser.Interface_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ref_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRef_declaration(VerilogParser.Ref_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ref_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRef_declaration(VerilogParser.Ref_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_declaration}.
	 * @param ctx the parse tree
	 */
	void enterData_declaration(VerilogParser.Data_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_declaration}.
	 * @param ctx the parse tree
	 */
	void exitData_declaration(VerilogParser.Data_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_import_declaration(VerilogParser.Package_import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_import_declaration(VerilogParser.Package_import_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_import_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_import_item(VerilogParser.Package_import_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_import_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_import_item(VerilogParser.Package_import_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_export_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_export_declaration(VerilogParser.Package_export_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_export_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_export_declaration(VerilogParser.Package_export_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_declaration(VerilogParser.Genvar_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_declaration(VerilogParser.Genvar_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNet_declaration(VerilogParser.Net_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNet_declaration(VerilogParser.Net_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(VerilogParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(VerilogParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void enterLifetime(VerilogParser.LifetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void exitLifetime(VerilogParser.LifetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#casting_type}.
	 * @param ctx the parse tree
	 */
	void enterCasting_type(VerilogParser.Casting_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#casting_type}.
	 * @param ctx the parse tree
	 */
	void exitCasting_type(VerilogParser.Casting_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(VerilogParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(VerilogParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_type_or_implicit}.
	 * @param ctx the parse tree
	 */
	void enterData_type_or_implicit(VerilogParser.Data_type_or_implicitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_type_or_implicit}.
	 * @param ctx the parse tree
	 */
	void exitData_type_or_implicit(VerilogParser.Data_type_or_implicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#implicit_data_type}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_data_type(VerilogParser.Implicit_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#implicit_data_type}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_data_type(VerilogParser.Implicit_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#enum_base_type}.
	 * @param ctx the parse tree
	 */
	void enterEnum_base_type(VerilogParser.Enum_base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#enum_base_type}.
	 * @param ctx the parse tree
	 */
	void exitEnum_base_type(VerilogParser.Enum_base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#enum_name_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name_declaration(VerilogParser.Enum_name_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#enum_name_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name_declaration(VerilogParser.Enum_name_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_scope}.
	 * @param ctx the parse tree
	 */
	void enterClass_scope(VerilogParser.Class_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_scope}.
	 * @param ctx the parse tree
	 */
	void exitClass_scope(VerilogParser.Class_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(VerilogParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(VerilogParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(VerilogParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(VerilogParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#integer_atom_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_atom_type(VerilogParser.Integer_atom_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#integer_atom_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_atom_type(VerilogParser.Integer_atom_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#integer_vector_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_vector_type(VerilogParser.Integer_vector_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#integer_vector_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_vector_type(VerilogParser.Integer_vector_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#non_integer_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_integer_type(VerilogParser.Non_integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#non_integer_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_integer_type(VerilogParser.Non_integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_type}.
	 * @param ctx the parse tree
	 */
	void enterNet_type(VerilogParser.Net_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_type}.
	 * @param ctx the parse tree
	 */
	void exitNet_type(VerilogParser.Net_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_port_type}.
	 * @param ctx the parse tree
	 */
	void enterNet_port_type(VerilogParser.Net_port_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_port_type}.
	 * @param ctx the parse tree
	 */
	void exitNet_port_type(VerilogParser.Net_port_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_port_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_port_type(VerilogParser.Variable_port_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_port_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_port_type(VerilogParser.Variable_port_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#var_data_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_data_type(VerilogParser.Var_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#var_data_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_data_type(VerilogParser.Var_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#signing}.
	 * @param ctx the parse tree
	 */
	void enterSigning(VerilogParser.SigningContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#signing}.
	 * @param ctx the parse tree
	 */
	void exitSigning(VerilogParser.SigningContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(VerilogParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(VerilogParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#struct_union_member}.
	 * @param ctx the parse tree
	 */
	void enterStruct_union_member(VerilogParser.Struct_union_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#struct_union_member}.
	 * @param ctx the parse tree
	 */
	void exitStruct_union_member(VerilogParser.Struct_union_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_type_or_void}.
	 * @param ctx the parse tree
	 */
	void enterData_type_or_void(VerilogParser.Data_type_or_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_type_or_void}.
	 * @param ctx the parse tree
	 */
	void exitData_type_or_void(VerilogParser.Data_type_or_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#struct_union}.
	 * @param ctx the parse tree
	 */
	void enterStruct_union(VerilogParser.Struct_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#struct_union}.
	 * @param ctx the parse tree
	 */
	void exitStruct_union(VerilogParser.Struct_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#type_reference}.
	 * @param ctx the parse tree
	 */
	void enterType_reference(VerilogParser.Type_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#type_reference}.
	 * @param ctx the parse tree
	 */
	void exitType_reference(VerilogParser.Type_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 */
	void enterDrive_strength(VerilogParser.Drive_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 */
	void exitDrive_strength(VerilogParser.Drive_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#strength0}.
	 * @param ctx the parse tree
	 */
	void enterStrength0(VerilogParser.Strength0Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#strength0}.
	 * @param ctx the parse tree
	 */
	void exitStrength0(VerilogParser.Strength0Context ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#strength1}.
	 * @param ctx the parse tree
	 */
	void enterStrength1(VerilogParser.Strength1Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#strength1}.
	 * @param ctx the parse tree
	 */
	void exitStrength1(VerilogParser.Strength1Context ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#charge_strength}.
	 * @param ctx the parse tree
	 */
	void enterCharge_strength(VerilogParser.Charge_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#charge_strength}.
	 * @param ctx the parse tree
	 */
	void exitCharge_strength(VerilogParser.Charge_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delay3}.
	 * @param ctx the parse tree
	 */
	void enterDelay3(VerilogParser.Delay3Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay3}.
	 * @param ctx the parse tree
	 */
	void exitDelay3(VerilogParser.Delay3Context ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delay2}.
	 * @param ctx the parse tree
	 */
	void enterDelay2(VerilogParser.Delay2Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay2}.
	 * @param ctx the parse tree
	 */
	void exitDelay2(VerilogParser.Delay2Context ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void enterDelay_value(VerilogParser.Delay_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void exitDelay_value(VerilogParser.Delay_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_defparam_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_defparam_assignments(VerilogParser.List_of_defparam_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_defparam_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_defparam_assignments(VerilogParser.List_of_defparam_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_genvar_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_genvar_identifiers(VerilogParser.List_of_genvar_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_genvar_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_genvar_identifiers(VerilogParser.List_of_genvar_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_interface_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_interface_identifiers(VerilogParser.List_of_interface_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_interface_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_interface_identifiers(VerilogParser.List_of_interface_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_param_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_param_assignments(VerilogParser.List_of_param_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_param_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_param_assignments(VerilogParser.List_of_param_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_identifiers(VerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_identifiers(VerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_udp_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_udp_port_identifiers(VerilogParser.List_of_udp_port_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_udp_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_udp_port_identifiers(VerilogParser.List_of_udp_port_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_specparam_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_specparam_assignments(VerilogParser.List_of_specparam_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_specparam_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_specparam_assignments(VerilogParser.List_of_specparam_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_tf_variable_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_tf_variable_identifiers(VerilogParser.List_of_tf_variable_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_tf_variable_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_tf_variable_identifiers(VerilogParser.List_of_tf_variable_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_type_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_type_assignments(VerilogParser.List_of_type_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_type_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_type_assignments(VerilogParser.List_of_type_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_variable_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_decl_assignments(VerilogParser.List_of_variable_decl_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_variable_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_decl_assignments(VerilogParser.List_of_variable_decl_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_identifiers(VerilogParser.List_of_variable_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_identifiers(VerilogParser.List_of_variable_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_variable_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_port_identifiers(VerilogParser.List_of_variable_port_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_variable_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_port_identifiers(VerilogParser.List_of_variable_port_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_virtual_interface_decl}.
	 * @param ctx the parse tree
	 */
	void enterList_of_virtual_interface_decl(VerilogParser.List_of_virtual_interface_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_virtual_interface_decl}.
	 * @param ctx the parse tree
	 */
	void exitList_of_virtual_interface_decl(VerilogParser.List_of_virtual_interface_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#defparam_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDefparam_assignment(VerilogParser.Defparam_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#defparam_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDefparam_assignment(VerilogParser.Defparam_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_net_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_decl_assignments(VerilogParser.List_of_net_decl_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_net_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_decl_assignments(VerilogParser.List_of_net_decl_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNet_decl_assignment(VerilogParser.Net_decl_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNet_decl_assignment(VerilogParser.Net_decl_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParam_assignment(VerilogParser.Param_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParam_assignment(VerilogParser.Param_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specparam_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSpecparam_assignment(VerilogParser.Specparam_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specparam_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSpecparam_assignment(VerilogParser.Specparam_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#type_assignment}.
	 * @param ctx the parse tree
	 */
	void enterType_assignment(VerilogParser.Type_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#type_assignment}.
	 * @param ctx the parse tree
	 */
	void exitType_assignment(VerilogParser.Type_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pulse_control_specparam}.
	 * @param ctx the parse tree
	 */
	void enterPulse_control_specparam(VerilogParser.Pulse_control_specparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pulse_control_specparam}.
	 * @param ctx the parse tree
	 */
	void exitPulse_control_specparam(VerilogParser.Pulse_control_specparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#error_limit_value}.
	 * @param ctx the parse tree
	 */
	void enterError_limit_value(VerilogParser.Error_limit_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#error_limit_value}.
	 * @param ctx the parse tree
	 */
	void exitError_limit_value(VerilogParser.Error_limit_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#reject_limit_value}.
	 * @param ctx the parse tree
	 */
	void enterReject_limit_value(VerilogParser.Reject_limit_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#reject_limit_value}.
	 * @param ctx the parse tree
	 */
	void exitReject_limit_value(VerilogParser.Reject_limit_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#limit_value}.
	 * @param ctx the parse tree
	 */
	void enterLimit_value(VerilogParser.Limit_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#limit_value}.
	 * @param ctx the parse tree
	 */
	void exitLimit_value(VerilogParser.Limit_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_assignment(VerilogParser.Variable_decl_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_assignment(VerilogParser.Variable_decl_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_new}.
	 * @param ctx the parse tree
	 */
	void enterClass_new(VerilogParser.Class_newContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_new}.
	 * @param ctx the parse tree
	 */
	void exitClass_new(VerilogParser.Class_newContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dynamic_array_new}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_array_new(VerilogParser.Dynamic_array_newContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dynamic_array_new}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_array_new(VerilogParser.Dynamic_array_newContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unpacked_dimension}.
	 * @param ctx the parse tree
	 */
	void enterUnpacked_dimension(VerilogParser.Unpacked_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unpacked_dimension}.
	 * @param ctx the parse tree
	 */
	void exitUnpacked_dimension(VerilogParser.Unpacked_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#packed_dimension}.
	 * @param ctx the parse tree
	 */
	void enterPacked_dimension(VerilogParser.Packed_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#packed_dimension}.
	 * @param ctx the parse tree
	 */
	void exitPacked_dimension(VerilogParser.Packed_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#associative_dimension}.
	 * @param ctx the parse tree
	 */
	void enterAssociative_dimension(VerilogParser.Associative_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#associative_dimension}.
	 * @param ctx the parse tree
	 */
	void exitAssociative_dimension(VerilogParser.Associative_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_dimension}.
	 * @param ctx the parse tree
	 */
	void enterVariable_dimension(VerilogParser.Variable_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_dimension}.
	 * @param ctx the parse tree
	 */
	void exitVariable_dimension(VerilogParser.Variable_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#queue_dimension}.
	 * @param ctx the parse tree
	 */
	void enterQueue_dimension(VerilogParser.Queue_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#queue_dimension}.
	 * @param ctx the parse tree
	 */
	void exitQueue_dimension(VerilogParser.Queue_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unsized_dimension}.
	 * @param ctx the parse tree
	 */
	void enterUnsized_dimension(VerilogParser.Unsized_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unsized_dimension}.
	 * @param ctx the parse tree
	 */
	void exitUnsized_dimension(VerilogParser.Unsized_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_data_type_or_implicit}.
	 * @param ctx the parse tree
	 */
	void enterFunction_data_type_or_implicit(VerilogParser.Function_data_type_or_implicitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_data_type_or_implicit}.
	 * @param ctx the parse tree
	 */
	void exitFunction_data_type_or_implicit(VerilogParser.Function_data_type_or_implicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(VerilogParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(VerilogParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_body_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body_declaration(VerilogParser.Function_body_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_body_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body_declaration(VerilogParser.Function_body_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prototype(VerilogParser.Function_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prototype(VerilogParser.Function_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dpi_import_export}.
	 * @param ctx the parse tree
	 */
	void enterDpi_import_export(VerilogParser.Dpi_import_exportContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dpi_import_export}.
	 * @param ctx the parse tree
	 */
	void exitDpi_import_export(VerilogParser.Dpi_import_exportContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dpi_spec_string}.
	 * @param ctx the parse tree
	 */
	void enterDpi_spec_string(VerilogParser.Dpi_spec_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dpi_spec_string}.
	 * @param ctx the parse tree
	 */
	void exitDpi_spec_string(VerilogParser.Dpi_spec_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dpi_function_import_property}.
	 * @param ctx the parse tree
	 */
	void enterDpi_function_import_property(VerilogParser.Dpi_function_import_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dpi_function_import_property}.
	 * @param ctx the parse tree
	 */
	void exitDpi_function_import_property(VerilogParser.Dpi_function_import_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dpi_task_import_property}.
	 * @param ctx the parse tree
	 */
	void enterDpi_task_import_property(VerilogParser.Dpi_task_import_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dpi_task_import_property}.
	 * @param ctx the parse tree
	 */
	void exitDpi_task_import_property(VerilogParser.Dpi_task_import_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dpi_function_proto}.
	 * @param ctx the parse tree
	 */
	void enterDpi_function_proto(VerilogParser.Dpi_function_protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dpi_function_proto}.
	 * @param ctx the parse tree
	 */
	void exitDpi_function_proto(VerilogParser.Dpi_function_protoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dpi_task_proto}.
	 * @param ctx the parse tree
	 */
	void enterDpi_task_proto(VerilogParser.Dpi_task_protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dpi_task_proto}.
	 * @param ctx the parse tree
	 */
	void exitDpi_task_proto(VerilogParser.Dpi_task_protoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_declaration(VerilogParser.Task_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_declaration(VerilogParser.Task_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_body_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_body_declaration(VerilogParser.Task_body_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_body_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_body_declaration(VerilogParser.Task_body_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tf_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTf_item_declaration(VerilogParser.Tf_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTf_item_declaration(VerilogParser.Tf_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tf_port_list}.
	 * @param ctx the parse tree
	 */
	void enterTf_port_list(VerilogParser.Tf_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_port_list}.
	 * @param ctx the parse tree
	 */
	void exitTf_port_list(VerilogParser.Tf_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tf_port_item}.
	 * @param ctx the parse tree
	 */
	void enterTf_port_item(VerilogParser.Tf_port_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_port_item}.
	 * @param ctx the parse tree
	 */
	void exitTf_port_item(VerilogParser.Tf_port_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tf_port_direction}.
	 * @param ctx the parse tree
	 */
	void enterTf_port_direction(VerilogParser.Tf_port_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_port_direction}.
	 * @param ctx the parse tree
	 */
	void exitTf_port_direction(VerilogParser.Tf_port_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTf_port_declaration(VerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTf_port_declaration(VerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_prototype}.
	 * @param ctx the parse tree
	 */
	void enterTask_prototype(VerilogParser.Task_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_prototype}.
	 * @param ctx the parse tree
	 */
	void exitTask_prototype(VerilogParser.Task_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item_declaration(VerilogParser.Block_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item_declaration(VerilogParser.Block_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#overload_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOverload_declaration(VerilogParser.Overload_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#overload_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOverload_declaration(VerilogParser.Overload_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#overload_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverload_operator(VerilogParser.Overload_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#overload_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverload_operator(VerilogParser.Overload_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#overload_proto_formals}.
	 * @param ctx the parse tree
	 */
	void enterOverload_proto_formals(VerilogParser.Overload_proto_formalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#overload_proto_formals}.
	 * @param ctx the parse tree
	 */
	void exitOverload_proto_formals(VerilogParser.Overload_proto_formalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#virtual_interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_interface_declaration(VerilogParser.Virtual_interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#virtual_interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_interface_declaration(VerilogParser.Virtual_interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModport_declaration(VerilogParser.Modport_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModport_declaration(VerilogParser.Modport_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_item}.
	 * @param ctx the parse tree
	 */
	void enterModport_item(VerilogParser.Modport_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_item}.
	 * @param ctx the parse tree
	 */
	void exitModport_item(VerilogParser.Modport_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_ports_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModport_ports_declaration(VerilogParser.Modport_ports_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_ports_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModport_ports_declaration(VerilogParser.Modport_ports_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_clocking_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModport_clocking_declaration(VerilogParser.Modport_clocking_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_clocking_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModport_clocking_declaration(VerilogParser.Modport_clocking_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_simple_ports_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModport_simple_ports_declaration(VerilogParser.Modport_simple_ports_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_simple_ports_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModport_simple_ports_declaration(VerilogParser.Modport_simple_ports_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_simple_port}.
	 * @param ctx the parse tree
	 */
	void enterModport_simple_port(VerilogParser.Modport_simple_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_simple_port}.
	 * @param ctx the parse tree
	 */
	void exitModport_simple_port(VerilogParser.Modport_simple_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_tf_ports_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModport_tf_ports_declaration(VerilogParser.Modport_tf_ports_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_tf_ports_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModport_tf_ports_declaration(VerilogParser.Modport_tf_ports_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_tf_port}.
	 * @param ctx the parse tree
	 */
	void enterModport_tf_port(VerilogParser.Modport_tf_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_tf_port}.
	 * @param ctx the parse tree
	 */
	void exitModport_tf_port(VerilogParser.Modport_tf_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#import_export}.
	 * @param ctx the parse tree
	 */
	void enterImport_export(VerilogParser.Import_exportContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#import_export}.
	 * @param ctx the parse tree
	 */
	void exitImport_export(VerilogParser.Import_exportContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#concurrent_assertion_item}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_assertion_item(VerilogParser.Concurrent_assertion_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#concurrent_assertion_item}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_assertion_item(VerilogParser.Concurrent_assertion_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_assertion_statement(VerilogParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#concurrent_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_assertion_statement(VerilogParser.Concurrent_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assert_property_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssert_property_statement(VerilogParser.Assert_property_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assert_property_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssert_property_statement(VerilogParser.Assert_property_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assume_property_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssume_property_statement(VerilogParser.Assume_property_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assume_property_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssume_property_statement(VerilogParser.Assume_property_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cover_property_statement}.
	 * @param ctx the parse tree
	 */
	void enterCover_property_statement(VerilogParser.Cover_property_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cover_property_statement}.
	 * @param ctx the parse tree
	 */
	void exitCover_property_statement(VerilogParser.Cover_property_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#expect_property_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpect_property_statement(VerilogParser.Expect_property_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#expect_property_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpect_property_statement(VerilogParser.Expect_property_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cover_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterCover_sequence_statement(VerilogParser.Cover_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cover_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitCover_sequence_statement(VerilogParser.Cover_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#restrict_property_statement}.
	 * @param ctx the parse tree
	 */
	void enterRestrict_property_statement(VerilogParser.Restrict_property_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#restrict_property_statement}.
	 * @param ctx the parse tree
	 */
	void exitRestrict_property_statement(VerilogParser.Restrict_property_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_instance}.
	 * @param ctx the parse tree
	 */
	void enterProperty_instance(VerilogParser.Property_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_instance}.
	 * @param ctx the parse tree
	 */
	void exitProperty_instance(VerilogParser.Property_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void enterProperty_list_of_arguments(VerilogParser.Property_list_of_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void exitProperty_list_of_arguments(VerilogParser.Property_list_of_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_actual_arg}.
	 * @param ctx the parse tree
	 */
	void enterProperty_actual_arg(VerilogParser.Property_actual_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_actual_arg}.
	 * @param ctx the parse tree
	 */
	void exitProperty_actual_arg(VerilogParser.Property_actual_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assertion_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_item_declaration(VerilogParser.Assertion_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assertion_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_item_declaration(VerilogParser.Assertion_item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(VerilogParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(VerilogParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_port_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_port_list(VerilogParser.Property_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_port_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_port_list(VerilogParser.Property_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_port_item}.
	 * @param ctx the parse tree
	 */
	void enterProperty_port_item(VerilogParser.Property_port_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_port_item}.
	 * @param ctx the parse tree
	 */
	void exitProperty_port_item(VerilogParser.Property_port_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_lvar_port_direction}.
	 * @param ctx the parse tree
	 */
	void enterProperty_lvar_port_direction(VerilogParser.Property_lvar_port_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_lvar_port_direction}.
	 * @param ctx the parse tree
	 */
	void exitProperty_lvar_port_direction(VerilogParser.Property_lvar_port_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_formal_type}.
	 * @param ctx the parse tree
	 */
	void enterProperty_formal_type(VerilogParser.Property_formal_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_formal_type}.
	 * @param ctx the parse tree
	 */
	void exitProperty_formal_type(VerilogParser.Property_formal_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_spec}.
	 * @param ctx the parse tree
	 */
	void enterProperty_spec(VerilogParser.Property_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_spec}.
	 * @param ctx the parse tree
	 */
	void exitProperty_spec(VerilogParser.Property_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_statement_spec}.
	 * @param ctx the parse tree
	 */
	void enterProperty_statement_spec(VerilogParser.Property_statement_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_statement_spec}.
	 * @param ctx the parse tree
	 */
	void exitProperty_statement_spec(VerilogParser.Property_statement_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_statement}.
	 * @param ctx the parse tree
	 */
	void enterProperty_statement(VerilogParser.Property_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_statement}.
	 * @param ctx the parse tree
	 */
	void exitProperty_statement(VerilogParser.Property_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_case_item}.
	 * @param ctx the parse tree
	 */
	void enterProperty_case_item(VerilogParser.Property_case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_case_item}.
	 * @param ctx the parse tree
	 */
	void exitProperty_case_item(VerilogParser.Property_case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_expr}.
	 * @param ctx the parse tree
	 */
	void enterProperty_expr(VerilogParser.Property_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_expr}.
	 * @param ctx the parse tree
	 */
	void exitProperty_expr(VerilogParser.Property_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSequence_declaration(VerilogParser.Sequence_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSequence_declaration(VerilogParser.Sequence_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_port_list}.
	 * @param ctx the parse tree
	 */
	void enterSequence_port_list(VerilogParser.Sequence_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_port_list}.
	 * @param ctx the parse tree
	 */
	void exitSequence_port_list(VerilogParser.Sequence_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_port_item}.
	 * @param ctx the parse tree
	 */
	void enterSequence_port_item(VerilogParser.Sequence_port_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_port_item}.
	 * @param ctx the parse tree
	 */
	void exitSequence_port_item(VerilogParser.Sequence_port_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_lvar_port_direction}.
	 * @param ctx the parse tree
	 */
	void enterSequence_lvar_port_direction(VerilogParser.Sequence_lvar_port_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_lvar_port_direction}.
	 * @param ctx the parse tree
	 */
	void exitSequence_lvar_port_direction(VerilogParser.Sequence_lvar_port_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_formal_type}.
	 * @param ctx the parse tree
	 */
	void enterSequence_formal_type(VerilogParser.Sequence_formal_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_formal_type}.
	 * @param ctx the parse tree
	 */
	void exitSequence_formal_type(VerilogParser.Sequence_formal_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_expr}.
	 * @param ctx the parse tree
	 */
	void enterSequence_expr(VerilogParser.Sequence_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_expr}.
	 * @param ctx the parse tree
	 */
	void exitSequence_expr(VerilogParser.Sequence_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cycle_delay_range}.
	 * @param ctx the parse tree
	 */
	void enterCycle_delay_range(VerilogParser.Cycle_delay_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cycle_delay_range}.
	 * @param ctx the parse tree
	 */
	void exitCycle_delay_range(VerilogParser.Cycle_delay_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_method_call}.
	 * @param ctx the parse tree
	 */
	void enterSequence_method_call(VerilogParser.Sequence_method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_method_call}.
	 * @param ctx the parse tree
	 */
	void exitSequence_method_call(VerilogParser.Sequence_method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_match_item}.
	 * @param ctx the parse tree
	 */
	void enterSequence_match_item(VerilogParser.Sequence_match_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_match_item}.
	 * @param ctx the parse tree
	 */
	void exitSequence_match_item(VerilogParser.Sequence_match_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_instance}.
	 * @param ctx the parse tree
	 */
	void enterSequence_instance(VerilogParser.Sequence_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_instance}.
	 * @param ctx the parse tree
	 */
	void exitSequence_instance(VerilogParser.Sequence_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void enterSequence_list_of_arguments(VerilogParser.Sequence_list_of_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void exitSequence_list_of_arguments(VerilogParser.Sequence_list_of_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_actual_arg}.
	 * @param ctx the parse tree
	 */
	void enterSequence_actual_arg(VerilogParser.Sequence_actual_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_actual_arg}.
	 * @param ctx the parse tree
	 */
	void exitSequence_actual_arg(VerilogParser.Sequence_actual_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#boolean_abbrev}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_abbrev(VerilogParser.Boolean_abbrevContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#boolean_abbrev}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_abbrev(VerilogParser.Boolean_abbrevContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_abbrev}.
	 * @param ctx the parse tree
	 */
	void enterSequence_abbrev(VerilogParser.Sequence_abbrevContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_abbrev}.
	 * @param ctx the parse tree
	 */
	void exitSequence_abbrev(VerilogParser.Sequence_abbrevContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#consecutive_repetition}.
	 * @param ctx the parse tree
	 */
	void enterConsecutive_repetition(VerilogParser.Consecutive_repetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#consecutive_repetition}.
	 * @param ctx the parse tree
	 */
	void exitConsecutive_repetition(VerilogParser.Consecutive_repetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#non_consecutive_repetition}.
	 * @param ctx the parse tree
	 */
	void enterNon_consecutive_repetition(VerilogParser.Non_consecutive_repetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#non_consecutive_repetition}.
	 * @param ctx the parse tree
	 */
	void exitNon_consecutive_repetition(VerilogParser.Non_consecutive_repetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#goto_repetition}.
	 * @param ctx the parse tree
	 */
	void enterGoto_repetition(VerilogParser.Goto_repetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#goto_repetition}.
	 * @param ctx the parse tree
	 */
	void exitGoto_repetition(VerilogParser.Goto_repetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#const_or_range_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_or_range_expression(VerilogParser.Const_or_range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#const_or_range_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_or_range_expression(VerilogParser.Const_or_range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cycle_delay_const_range_expression}.
	 * @param ctx the parse tree
	 */
	void enterCycle_delay_const_range_expression(VerilogParser.Cycle_delay_const_range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cycle_delay_const_range_expression}.
	 * @param ctx the parse tree
	 */
	void exitCycle_delay_const_range_expression(VerilogParser.Cycle_delay_const_range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#expression_or_dist}.
	 * @param ctx the parse tree
	 */
	void enterExpression_or_dist(VerilogParser.Expression_or_distContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#expression_or_dist}.
	 * @param ctx the parse tree
	 */
	void exitExpression_or_dist(VerilogParser.Expression_or_distContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assertion_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_variable_declaration(VerilogParser.Assertion_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assertion_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_variable_declaration(VerilogParser.Assertion_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLet_declaration(VerilogParser.Let_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLet_declaration(VerilogParser.Let_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_identifier}.
	 * @param ctx the parse tree
	 */
	void enterLet_identifier(VerilogParser.Let_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_identifier}.
	 * @param ctx the parse tree
	 */
	void exitLet_identifier(VerilogParser.Let_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_port_list}.
	 * @param ctx the parse tree
	 */
	void enterLet_port_list(VerilogParser.Let_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_port_list}.
	 * @param ctx the parse tree
	 */
	void exitLet_port_list(VerilogParser.Let_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_port_item}.
	 * @param ctx the parse tree
	 */
	void enterLet_port_item(VerilogParser.Let_port_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_port_item}.
	 * @param ctx the parse tree
	 */
	void exitLet_port_item(VerilogParser.Let_port_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_formal_type}.
	 * @param ctx the parse tree
	 */
	void enterLet_formal_type(VerilogParser.Let_formal_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_formal_type}.
	 * @param ctx the parse tree
	 */
	void exitLet_formal_type(VerilogParser.Let_formal_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_expression}.
	 * @param ctx the parse tree
	 */
	void enterLet_expression(VerilogParser.Let_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_expression}.
	 * @param ctx the parse tree
	 */
	void exitLet_expression(VerilogParser.Let_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void enterLet_list_of_arguments(VerilogParser.Let_list_of_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void exitLet_list_of_arguments(VerilogParser.Let_list_of_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#let_actual_arg}.
	 * @param ctx the parse tree
	 */
	void enterLet_actual_arg(VerilogParser.Let_actual_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#let_actual_arg}.
	 * @param ctx the parse tree
	 */
	void exitLet_actual_arg(VerilogParser.Let_actual_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#covergroup_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCovergroup_declaration(VerilogParser.Covergroup_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#covergroup_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCovergroup_declaration(VerilogParser.Covergroup_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#coverage_spec_or_option}.
	 * @param ctx the parse tree
	 */
	void enterCoverage_spec_or_option(VerilogParser.Coverage_spec_or_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#coverage_spec_or_option}.
	 * @param ctx the parse tree
	 */
	void exitCoverage_spec_or_option(VerilogParser.Coverage_spec_or_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#coverage_option}.
	 * @param ctx the parse tree
	 */
	void enterCoverage_option(VerilogParser.Coverage_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#coverage_option}.
	 * @param ctx the parse tree
	 */
	void exitCoverage_option(VerilogParser.Coverage_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#coverage_spec}.
	 * @param ctx the parse tree
	 */
	void enterCoverage_spec(VerilogParser.Coverage_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#coverage_spec}.
	 * @param ctx the parse tree
	 */
	void exitCoverage_spec(VerilogParser.Coverage_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#coverage_event}.
	 * @param ctx the parse tree
	 */
	void enterCoverage_event(VerilogParser.Coverage_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#coverage_event}.
	 * @param ctx the parse tree
	 */
	void exitCoverage_event(VerilogParser.Coverage_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#block_event_expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock_event_expression(VerilogParser.Block_event_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#block_event_expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock_event_expression(VerilogParser.Block_event_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_btf_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_btf_identifier(VerilogParser.Hierarchical_btf_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_btf_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_btf_identifier(VerilogParser.Hierarchical_btf_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cover_point}.
	 * @param ctx the parse tree
	 */
	void enterCover_point(VerilogParser.Cover_pointContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cover_point}.
	 * @param ctx the parse tree
	 */
	void exitCover_point(VerilogParser.Cover_pointContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bins_or_empty}.
	 * @param ctx the parse tree
	 */
	void enterBins_or_empty(VerilogParser.Bins_or_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bins_or_empty}.
	 * @param ctx the parse tree
	 */
	void exitBins_or_empty(VerilogParser.Bins_or_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bins_or_options}.
	 * @param ctx the parse tree
	 */
	void enterBins_or_options(VerilogParser.Bins_or_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bins_or_options}.
	 * @param ctx the parse tree
	 */
	void exitBins_or_options(VerilogParser.Bins_or_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bins_keyword}.
	 * @param ctx the parse tree
	 */
	void enterBins_keyword(VerilogParser.Bins_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bins_keyword}.
	 * @param ctx the parse tree
	 */
	void exitBins_keyword(VerilogParser.Bins_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#range_list}.
	 * @param ctx the parse tree
	 */
	void enterRange_list(VerilogParser.Range_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#range_list}.
	 * @param ctx the parse tree
	 */
	void exitRange_list(VerilogParser.Range_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#trans_list}.
	 * @param ctx the parse tree
	 */
	void enterTrans_list(VerilogParser.Trans_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#trans_list}.
	 * @param ctx the parse tree
	 */
	void exitTrans_list(VerilogParser.Trans_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#trans_set}.
	 * @param ctx the parse tree
	 */
	void enterTrans_set(VerilogParser.Trans_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#trans_set}.
	 * @param ctx the parse tree
	 */
	void exitTrans_set(VerilogParser.Trans_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#trans_range_list}.
	 * @param ctx the parse tree
	 */
	void enterTrans_range_list(VerilogParser.Trans_range_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#trans_range_list}.
	 * @param ctx the parse tree
	 */
	void exitTrans_range_list(VerilogParser.Trans_range_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#trans_item}.
	 * @param ctx the parse tree
	 */
	void enterTrans_item(VerilogParser.Trans_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#trans_item}.
	 * @param ctx the parse tree
	 */
	void exitTrans_item(VerilogParser.Trans_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#repeat_range}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_range(VerilogParser.Repeat_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#repeat_range}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_range(VerilogParser.Repeat_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cover_cross}.
	 * @param ctx the parse tree
	 */
	void enterCover_cross(VerilogParser.Cover_crossContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cover_cross}.
	 * @param ctx the parse tree
	 */
	void exitCover_cross(VerilogParser.Cover_crossContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_coverpoints}.
	 * @param ctx the parse tree
	 */
	void enterList_of_coverpoints(VerilogParser.List_of_coverpointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_coverpoints}.
	 * @param ctx the parse tree
	 */
	void exitList_of_coverpoints(VerilogParser.List_of_coverpointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cross_item}.
	 * @param ctx the parse tree
	 */
	void enterCross_item(VerilogParser.Cross_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cross_item}.
	 * @param ctx the parse tree
	 */
	void exitCross_item(VerilogParser.Cross_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#select_bins_or_empty}.
	 * @param ctx the parse tree
	 */
	void enterSelect_bins_or_empty(VerilogParser.Select_bins_or_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#select_bins_or_empty}.
	 * @param ctx the parse tree
	 */
	void exitSelect_bins_or_empty(VerilogParser.Select_bins_or_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bins_selection_or_option}.
	 * @param ctx the parse tree
	 */
	void enterBins_selection_or_option(VerilogParser.Bins_selection_or_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bins_selection_or_option}.
	 * @param ctx the parse tree
	 */
	void exitBins_selection_or_option(VerilogParser.Bins_selection_or_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bins_selection}.
	 * @param ctx the parse tree
	 */
	void enterBins_selection(VerilogParser.Bins_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bins_selection}.
	 * @param ctx the parse tree
	 */
	void exitBins_selection(VerilogParser.Bins_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expression(VerilogParser.Select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expression(VerilogParser.Select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#select_condition}.
	 * @param ctx the parse tree
	 */
	void enterSelect_condition(VerilogParser.Select_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#select_condition}.
	 * @param ctx the parse tree
	 */
	void exitSelect_condition(VerilogParser.Select_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bins_expression}.
	 * @param ctx the parse tree
	 */
	void enterBins_expression(VerilogParser.Bins_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bins_expression}.
	 * @param ctx the parse tree
	 */
	void exitBins_expression(VerilogParser.Bins_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#open_range_list}.
	 * @param ctx the parse tree
	 */
	void enterOpen_range_list(VerilogParser.Open_range_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#open_range_list}.
	 * @param ctx the parse tree
	 */
	void exitOpen_range_list(VerilogParser.Open_range_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#open_value_range}.
	 * @param ctx the parse tree
	 */
	void enterOpen_value_range(VerilogParser.Open_value_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#open_value_range}.
	 * @param ctx the parse tree
	 */
	void exitOpen_value_range(VerilogParser.Open_value_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterGate_instantiation(VerilogParser.Gate_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitGate_instantiation(VerilogParser.Gate_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterCmos_switch_instance(VerilogParser.Cmos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cmos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitCmos_switch_instance(VerilogParser.Cmos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterEnable_gate_instance(VerilogParser.Enable_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#enable_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitEnable_gate_instance(VerilogParser.Enable_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterMos_switch_instance(VerilogParser.Mos_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#mos_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitMos_switch_instance(VerilogParser.Mos_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterN_input_gate_instance(VerilogParser.N_input_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#n_input_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitN_input_gate_instance(VerilogParser.N_input_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterN_output_gate_instance(VerilogParser.N_output_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#n_output_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitN_output_gate_instance(VerilogParser.N_output_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterPass_switch_instance(VerilogParser.Pass_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pass_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitPass_switch_instance(VerilogParser.Pass_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void enterPass_enable_switch_instance(VerilogParser.Pass_enable_switch_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pass_enable_switch_instance}.
	 * @param ctx the parse tree
	 */
	void exitPass_enable_switch_instance(VerilogParser.Pass_enable_switch_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterPull_gate_instance(VerilogParser.Pull_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pull_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitPull_gate_instance(VerilogParser.Pull_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pulldown_strength}.
	 * @param ctx the parse tree
	 */
	void enterPulldown_strength(VerilogParser.Pulldown_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pulldown_strength}.
	 * @param ctx the parse tree
	 */
	void exitPulldown_strength(VerilogParser.Pulldown_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pullup_strength}.
	 * @param ctx the parse tree
	 */
	void enterPullup_strength(VerilogParser.Pullup_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pullup_strength}.
	 * @param ctx the parse tree
	 */
	void exitPullup_strength(VerilogParser.Pullup_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#enable_terminal}.
	 * @param ctx the parse tree
	 */
	void enterEnable_terminal(VerilogParser.Enable_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#enable_terminal}.
	 * @param ctx the parse tree
	 */
	void exitEnable_terminal(VerilogParser.Enable_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inout_terminal}.
	 * @param ctx the parse tree
	 */
	void enterInout_terminal(VerilogParser.Inout_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inout_terminal}.
	 * @param ctx the parse tree
	 */
	void exitInout_terminal(VerilogParser.Inout_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#input_terminal}.
	 * @param ctx the parse tree
	 */
	void enterInput_terminal(VerilogParser.Input_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#input_terminal}.
	 * @param ctx the parse tree
	 */
	void exitInput_terminal(VerilogParser.Input_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ncontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void enterNcontrol_terminal(VerilogParser.Ncontrol_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ncontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void exitNcontrol_terminal(VerilogParser.Ncontrol_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_terminal}.
	 * @param ctx the parse tree
	 */
	void enterOutput_terminal(VerilogParser.Output_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_terminal}.
	 * @param ctx the parse tree
	 */
	void exitOutput_terminal(VerilogParser.Output_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pcontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void enterPcontrol_terminal(VerilogParser.Pcontrol_terminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pcontrol_terminal}.
	 * @param ctx the parse tree
	 */
	void exitPcontrol_terminal(VerilogParser.Pcontrol_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterCmos_switchtype(VerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitCmos_switchtype(VerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterEnable_gatetype(VerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitEnable_gatetype(VerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterMos_switchtype(VerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitMos_switchtype(VerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterN_input_gatetype(VerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitN_input_gatetype(VerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#n_output_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterN_output_gatetype(VerilogParser.N_output_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#n_output_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitN_output_gatetype(VerilogParser.N_output_gatetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pass_en_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterPass_en_switchtype(VerilogParser.Pass_en_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pass_en_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitPass_en_switchtype(VerilogParser.Pass_en_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pass_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterPass_switchtype(VerilogParser.Pass_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pass_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitPass_switchtype(VerilogParser.Pass_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterModule_instantiation(VerilogParser.Module_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitModule_instantiation(VerilogParser.Module_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParameter_value_assignment(VerilogParser.Parameter_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParameter_value_assignment(VerilogParser.Parameter_value_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_parameter_assignments(VerilogParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_parameter_assignments(VerilogParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ordered_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_parameter_assignment(VerilogParser.Ordered_parameter_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ordered_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_parameter_assignment(VerilogParser.Ordered_parameter_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNamed_parameter_assignment(VerilogParser.Named_parameter_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNamed_parameter_assignment(VerilogParser.Named_parameter_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_instance}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_instance(VerilogParser.Hierarchical_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_instance}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_instance(VerilogParser.Hierarchical_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#name_of_instance}.
	 * @param ctx the parse tree
	 */
	void enterName_of_instance(VerilogParser.Name_of_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#name_of_instance}.
	 * @param ctx the parse tree
	 */
	void exitName_of_instance(VerilogParser.Name_of_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_connections(VerilogParser.List_of_port_connectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_connections(VerilogParser.List_of_port_connectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_port_connection(VerilogParser.Ordered_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_port_connection(VerilogParser.Ordered_port_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterNamed_port_connection(VerilogParser.Named_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitNamed_port_connection(VerilogParser.Named_port_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInterface_instantiation(VerilogParser.Interface_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInterface_instantiation(VerilogParser.Interface_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#program_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterProgram_instantiation(VerilogParser.Program_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#program_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitProgram_instantiation(VerilogParser.Program_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterChecker_instantiation(VerilogParser.Checker_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitChecker_instantiation(VerilogParser.Checker_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_checker_port_connections}.
	 * @param ctx the parse tree
	 */
	void enterList_of_checker_port_connections(VerilogParser.List_of_checker_port_connectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_checker_port_connections}.
	 * @param ctx the parse tree
	 */
	void exitList_of_checker_port_connections(VerilogParser.List_of_checker_port_connectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ordered_checker_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_checker_port_connection(VerilogParser.Ordered_checker_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ordered_checker_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_checker_port_connection(VerilogParser.Ordered_checker_port_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#named_checker_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterNamed_checker_port_connection(VerilogParser.Named_checker_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#named_checker_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitNamed_checker_port_connection(VerilogParser.Named_checker_port_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_region}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_region(VerilogParser.Generate_regionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_region}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_region(VerilogParser.Generate_regionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#loop_generate_construct}.
	 * @param ctx the parse tree
	 */
	void enterLoop_generate_construct(VerilogParser.Loop_generate_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#loop_generate_construct}.
	 * @param ctx the parse tree
	 */
	void exitLoop_generate_construct(VerilogParser.Loop_generate_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_initialization}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_initialization(VerilogParser.Genvar_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_initialization}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_initialization(VerilogParser.Genvar_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#conditional_generate_construct}.
	 * @param ctx the parse tree
	 */
	void enterConditional_generate_construct(VerilogParser.Conditional_generate_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#conditional_generate_construct}.
	 * @param ctx the parse tree
	 */
	void exitConditional_generate_construct(VerilogParser.Conditional_generate_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#if_generate_construct}.
	 * @param ctx the parse tree
	 */
	void enterIf_generate_construct(VerilogParser.If_generate_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#if_generate_construct}.
	 * @param ctx the parse tree
	 */
	void exitIf_generate_construct(VerilogParser.If_generate_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_generate_construct}.
	 * @param ctx the parse tree
	 */
	void enterCase_generate_construct(VerilogParser.Case_generate_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_generate_construct}.
	 * @param ctx the parse tree
	 */
	void exitCase_generate_construct(VerilogParser.Case_generate_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_generate_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_generate_item(VerilogParser.Case_generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_generate_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_generate_item(VerilogParser.Case_generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_block}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_block(VerilogParser.Generate_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_block}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_block(VerilogParser.Generate_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_item}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_item(VerilogParser.Generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_item}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_item(VerilogParser.Generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_nonansi_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_nonansi_declaration(VerilogParser.Udp_nonansi_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_nonansi_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_nonansi_declaration(VerilogParser.Udp_nonansi_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_iteration}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_iteration(VerilogParser.Genvar_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_iteration}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_iteration(VerilogParser.Genvar_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_ansi_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_ansi_declaration(VerilogParser.Udp_ansi_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_ansi_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_ansi_declaration(VerilogParser.Udp_ansi_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_declaration(VerilogParser.Udp_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_declaration(VerilogParser.Udp_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_port_list}.
	 * @param ctx the parse tree
	 */
	void enterUdp_port_list(VerilogParser.Udp_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_port_list}.
	 * @param ctx the parse tree
	 */
	void exitUdp_port_list(VerilogParser.Udp_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_declaration_port_list}.
	 * @param ctx the parse tree
	 */
	void enterUdp_declaration_port_list(VerilogParser.Udp_declaration_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_declaration_port_list}.
	 * @param ctx the parse tree
	 */
	void exitUdp_declaration_port_list(VerilogParser.Udp_declaration_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_port_declaration(VerilogParser.Udp_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_port_declaration(VerilogParser.Udp_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_output_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_output_declaration(VerilogParser.Udp_output_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_output_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_output_declaration(VerilogParser.Udp_output_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_input_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_input_declaration(VerilogParser.Udp_input_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_input_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_input_declaration(VerilogParser.Udp_input_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_reg_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_reg_declaration(VerilogParser.Udp_reg_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_reg_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_reg_declaration(VerilogParser.Udp_reg_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_body}.
	 * @param ctx the parse tree
	 */
	void enterUdp_body(VerilogParser.Udp_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_body}.
	 * @param ctx the parse tree
	 */
	void exitUdp_body(VerilogParser.Udp_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#combinational_body}.
	 * @param ctx the parse tree
	 */
	void enterCombinational_body(VerilogParser.Combinational_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#combinational_body}.
	 * @param ctx the parse tree
	 */
	void exitCombinational_body(VerilogParser.Combinational_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#combinational_entry}.
	 * @param ctx the parse tree
	 */
	void enterCombinational_entry(VerilogParser.Combinational_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#combinational_entry}.
	 * @param ctx the parse tree
	 */
	void exitCombinational_entry(VerilogParser.Combinational_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequential_body}.
	 * @param ctx the parse tree
	 */
	void enterSequential_body(VerilogParser.Sequential_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequential_body}.
	 * @param ctx the parse tree
	 */
	void exitSequential_body(VerilogParser.Sequential_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_initial_statement}.
	 * @param ctx the parse tree
	 */
	void enterUdp_initial_statement(VerilogParser.Udp_initial_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_initial_statement}.
	 * @param ctx the parse tree
	 */
	void exitUdp_initial_statement(VerilogParser.Udp_initial_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#init_val}.
	 * @param ctx the parse tree
	 */
	void enterInit_val(VerilogParser.Init_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#init_val}.
	 * @param ctx the parse tree
	 */
	void exitInit_val(VerilogParser.Init_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequential_entry}.
	 * @param ctx the parse tree
	 */
	void enterSequential_entry(VerilogParser.Sequential_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequential_entry}.
	 * @param ctx the parse tree
	 */
	void exitSequential_entry(VerilogParser.Sequential_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#seq_input_list}.
	 * @param ctx the parse tree
	 */
	void enterSeq_input_list(VerilogParser.Seq_input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#seq_input_list}.
	 * @param ctx the parse tree
	 */
	void exitSeq_input_list(VerilogParser.Seq_input_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#level_input_list}.
	 * @param ctx the parse tree
	 */
	void enterLevel_input_list(VerilogParser.Level_input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#level_input_list}.
	 * @param ctx the parse tree
	 */
	void exitLevel_input_list(VerilogParser.Level_input_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_input_list}.
	 * @param ctx the parse tree
	 */
	void enterEdge_input_list(VerilogParser.Edge_input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_input_list}.
	 * @param ctx the parse tree
	 */
	void exitEdge_input_list(VerilogParser.Edge_input_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_indicator}.
	 * @param ctx the parse tree
	 */
	void enterEdge_indicator(VerilogParser.Edge_indicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_indicator}.
	 * @param ctx the parse tree
	 */
	void exitEdge_indicator(VerilogParser.Edge_indicatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#current_state}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_state(VerilogParser.Current_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#current_state}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_state(VerilogParser.Current_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#next_state}.
	 * @param ctx the parse tree
	 */
	void enterNext_state(VerilogParser.Next_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#next_state}.
	 * @param ctx the parse tree
	 */
	void exitNext_state(VerilogParser.Next_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_symbol}.
	 * @param ctx the parse tree
	 */
	void enterOutput_symbol(VerilogParser.Output_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_symbol}.
	 * @param ctx the parse tree
	 */
	void exitOutput_symbol(VerilogParser.Output_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#level_symbol}.
	 * @param ctx the parse tree
	 */
	void enterLevel_symbol(VerilogParser.Level_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#level_symbol}.
	 * @param ctx the parse tree
	 */
	void exitLevel_symbol(VerilogParser.Level_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_symbol}.
	 * @param ctx the parse tree
	 */
	void enterEdge_symbol(VerilogParser.Edge_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_symbol}.
	 * @param ctx the parse tree
	 */
	void exitEdge_symbol(VerilogParser.Edge_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterUdp_instantiation(VerilogParser.Udp_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitUdp_instantiation(VerilogParser.Udp_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_instance}.
	 * @param ctx the parse tree
	 */
	void enterUdp_instance(VerilogParser.Udp_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_instance}.
	 * @param ctx the parse tree
	 */
	void exitUdp_instance(VerilogParser.Udp_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void enterContinuous_assign(VerilogParser.Continuous_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void exitContinuous_assign(VerilogParser.Continuous_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_assignments(VerilogParser.List_of_net_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_assignments(VerilogParser.List_of_net_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_assignments(VerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_assignments(VerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_alias}.
	 * @param ctx the parse tree
	 */
	void enterNet_alias(VerilogParser.Net_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_alias}.
	 * @param ctx the parse tree
	 */
	void exitNet_alias(VerilogParser.Net_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNet_assignment(VerilogParser.Net_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNet_assignment(VerilogParser.Net_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 */
	void enterInitial_construct(VerilogParser.Initial_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 */
	void exitInitial_construct(VerilogParser.Initial_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#always_construct}.
	 * @param ctx the parse tree
	 */
	void enterAlways_construct(VerilogParser.Always_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#always_construct}.
	 * @param ctx the parse tree
	 */
	void exitAlways_construct(VerilogParser.Always_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#always_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAlways_keyword(VerilogParser.Always_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#always_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAlways_keyword(VerilogParser.Always_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#final_construct}.
	 * @param ctx the parse tree
	 */
	void enterFinal_construct(VerilogParser.Final_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#final_construct}.
	 * @param ctx the parse tree
	 */
	void exitFinal_construct(VerilogParser.Final_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void enterBlocking_assignment(VerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void exitBlocking_assignment(VerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#operator_assignment}.
	 * @param ctx the parse tree
	 */
	void enterOperator_assignment(VerilogParser.Operator_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#operator_assignment}.
	 * @param ctx the parse tree
	 */
	void exitOperator_assignment(VerilogParser.Operator_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(VerilogParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(VerilogParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#nonblocking_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNonblocking_assignment(VerilogParser.Nonblocking_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#nonblocking_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNonblocking_assignment(VerilogParser.Nonblocking_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#procedural_continuous_assignment}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_continuous_assignment(VerilogParser.Procedural_continuous_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#procedural_continuous_assignment}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_continuous_assignment(VerilogParser.Procedural_continuous_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#action_block}.
	 * @param ctx the parse tree
	 */
	void enterAction_block(VerilogParser.Action_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#action_block}.
	 * @param ctx the parse tree
	 */
	void exitAction_block(VerilogParser.Action_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#seq_block}.
	 * @param ctx the parse tree
	 */
	void enterSeq_block(VerilogParser.Seq_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#seq_block}.
	 * @param ctx the parse tree
	 */
	void exitSeq_block(VerilogParser.Seq_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#par_block}.
	 * @param ctx the parse tree
	 */
	void enterPar_block(VerilogParser.Par_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#par_block}.
	 * @param ctx the parse tree
	 */
	void exitPar_block(VerilogParser.Par_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#join_keyword}.
	 * @param ctx the parse tree
	 */
	void enterJoin_keyword(VerilogParser.Join_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#join_keyword}.
	 * @param ctx the parse tree
	 */
	void exitJoin_keyword(VerilogParser.Join_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#statement_or_null}.
	 * @param ctx the parse tree
	 */
	void enterStatement_or_null(VerilogParser.Statement_or_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#statement_or_null}.
	 * @param ctx the parse tree
	 */
	void exitStatement_or_null(VerilogParser.Statement_or_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VerilogParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VerilogParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#statement_item}.
	 * @param ctx the parse tree
	 */
	void enterStatement_item(VerilogParser.Statement_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#statement_item}.
	 * @param ctx the parse tree
	 */
	void exitStatement_item(VerilogParser.Statement_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(VerilogParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(VerilogParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_statement_or_null}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement_or_null(VerilogParser.Function_statement_or_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_statement_or_null}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement_or_null(VerilogParser.Function_statement_or_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier_list(VerilogParser.Variable_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier_list(VerilogParser.Variable_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#procedural_timing_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_timing_control_statement(VerilogParser.Procedural_timing_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#procedural_timing_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_timing_control_statement(VerilogParser.Procedural_timing_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 */
	void enterDelay_or_event_control(VerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 */
	void exitDelay_or_event_control(VerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delay_control}.
	 * @param ctx the parse tree
	 */
	void enterDelay_control(VerilogParser.Delay_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay_control}.
	 * @param ctx the parse tree
	 */
	void exitDelay_control(VerilogParser.Delay_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_control}.
	 * @param ctx the parse tree
	 */
	void enterEvent_control(VerilogParser.Event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_control}.
	 * @param ctx the parse tree
	 */
	void exitEvent_control(VerilogParser.Event_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_expression(VerilogParser.Event_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_expression(VerilogParser.Event_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#procedural_timing_control}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_timing_control(VerilogParser.Procedural_timing_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#procedural_timing_control}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_timing_control(VerilogParser.Procedural_timing_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(VerilogParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(VerilogParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void enterWait_statement(VerilogParser.Wait_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void exitWait_statement(VerilogParser.Wait_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEvent_trigger(VerilogParser.Event_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEvent_trigger(VerilogParser.Event_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 */
	void enterDisable_statement(VerilogParser.Disable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 */
	void exitDisable_statement(VerilogParser.Disable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(VerilogParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(VerilogParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unique_priority}.
	 * @param ctx the parse tree
	 */
	void enterUnique_priority(VerilogParser.Unique_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unique_priority}.
	 * @param ctx the parse tree
	 */
	void exitUnique_priority(VerilogParser.Unique_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(VerilogParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(VerilogParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_keyword}.
	 * @param ctx the parse tree
	 */
	void enterCase_keyword(VerilogParser.Case_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_keyword}.
	 * @param ctx the parse tree
	 */
	void exitCase_keyword(VerilogParser.Case_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(VerilogParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(VerilogParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_item(VerilogParser.Case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_item(VerilogParser.Case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_pattern_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_pattern_item(VerilogParser.Case_pattern_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_pattern_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_pattern_item(VerilogParser.Case_pattern_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_inside_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_inside_item(VerilogParser.Case_inside_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_inside_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_inside_item(VerilogParser.Case_inside_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_item_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_expression(VerilogParser.Case_item_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_item_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_expression(VerilogParser.Case_item_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#randcase_statement}.
	 * @param ctx the parse tree
	 */
	void enterRandcase_statement(VerilogParser.Randcase_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#randcase_statement}.
	 * @param ctx the parse tree
	 */
	void exitRandcase_statement(VerilogParser.Randcase_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#randcase_item}.
	 * @param ctx the parse tree
	 */
	void enterRandcase_item(VerilogParser.Randcase_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#randcase_item}.
	 * @param ctx the parse tree
	 */
	void exitRandcase_item(VerilogParser.Randcase_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(VerilogParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(VerilogParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment_pattern}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_pattern(VerilogParser.Assignment_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment_pattern}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_pattern(VerilogParser.Assignment_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#structure_pattern_key}.
	 * @param ctx the parse tree
	 */
	void enterStructure_pattern_key(VerilogParser.Structure_pattern_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#structure_pattern_key}.
	 * @param ctx the parse tree
	 */
	void exitStructure_pattern_key(VerilogParser.Structure_pattern_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#array_pattern_key}.
	 * @param ctx the parse tree
	 */
	void enterArray_pattern_key(VerilogParser.Array_pattern_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#array_pattern_key}.
	 * @param ctx the parse tree
	 */
	void exitArray_pattern_key(VerilogParser.Array_pattern_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment_pattern_key}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_pattern_key(VerilogParser.Assignment_pattern_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment_pattern_key}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_pattern_key(VerilogParser.Assignment_pattern_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(VerilogParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(VerilogParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment_pattern_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_pattern_expression(VerilogParser.Assignment_pattern_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment_pattern_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_pattern_expression(VerilogParser.Assignment_pattern_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment_pattern_expression_type}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_pattern_expression_type(VerilogParser.Assignment_pattern_expression_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment_pattern_expression_type}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_pattern_expression_type(VerilogParser.Assignment_pattern_expression_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_assignment_pattern_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_assignment_pattern_expression(VerilogParser.Constant_assignment_pattern_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_assignment_pattern_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_assignment_pattern_expression(VerilogParser.Constant_assignment_pattern_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment_pattern_net_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_pattern_net_lvalue(VerilogParser.Assignment_pattern_net_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment_pattern_net_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_pattern_net_lvalue(VerilogParser.Assignment_pattern_net_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment_pattern_variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_pattern_variable_lvalue(VerilogParser.Assignment_pattern_variable_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment_pattern_variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_pattern_variable_lvalue(VerilogParser.Assignment_pattern_variable_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(VerilogParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(VerilogParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void enterFor_initialization(VerilogParser.For_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void exitFor_initialization(VerilogParser.For_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#for_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFor_variable_declaration(VerilogParser.For_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#for_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFor_variable_declaration(VerilogParser.For_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#for_step}.
	 * @param ctx the parse tree
	 */
	void enterFor_step(VerilogParser.For_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#for_step}.
	 * @param ctx the parse tree
	 */
	void exitFor_step(VerilogParser.For_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#for_step_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFor_step_assignment(VerilogParser.For_step_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#for_step_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFor_step_assignment(VerilogParser.For_step_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#loop_variables}.
	 * @param ctx the parse tree
	 */
	void enterLoop_variables(VerilogParser.Loop_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#loop_variables}.
	 * @param ctx the parse tree
	 */
	void exitLoop_variables(VerilogParser.Loop_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#subroutine_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_call_statement(VerilogParser.Subroutine_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#subroutine_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_call_statement(VerilogParser.Subroutine_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assertion_item}.
	 * @param ctx the parse tree
	 */
	void enterAssertion_item(VerilogParser.Assertion_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assertion_item}.
	 * @param ctx the parse tree
	 */
	void exitAssertion_item(VerilogParser.Assertion_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#deferred_immediate_assertion_item}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_immediate_assertion_item(VerilogParser.Deferred_immediate_assertion_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#deferred_immediate_assertion_item}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_immediate_assertion_item(VerilogParser.Deferred_immediate_assertion_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#procedural_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_assertion_statement(VerilogParser.Procedural_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#procedural_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_assertion_statement(VerilogParser.Procedural_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#immediate_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterImmediate_assertion_statement(VerilogParser.Immediate_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#immediate_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitImmediate_assertion_statement(VerilogParser.Immediate_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_immediate_assertion_statement(VerilogParser.Simple_immediate_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_immediate_assertion_statement(VerilogParser.Simple_immediate_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_immediate_assert_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_immediate_assert_statement(VerilogParser.Simple_immediate_assert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_immediate_assert_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_immediate_assert_statement(VerilogParser.Simple_immediate_assert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_immediate_assume_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_immediate_assume_statement(VerilogParser.Simple_immediate_assume_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_immediate_assume_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_immediate_assume_statement(VerilogParser.Simple_immediate_assume_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_immediate_cover_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_immediate_cover_statement(VerilogParser.Simple_immediate_cover_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_immediate_cover_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_immediate_cover_statement(VerilogParser.Simple_immediate_cover_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#deferred_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_immediate_assertion_statement(VerilogParser.Deferred_immediate_assertion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#deferred_immediate_assertion_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_immediate_assertion_statement(VerilogParser.Deferred_immediate_assertion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#deferred_immediate_assert_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_immediate_assert_statement(VerilogParser.Deferred_immediate_assert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#deferred_immediate_assert_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_immediate_assert_statement(VerilogParser.Deferred_immediate_assert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#deferred_immediate_assume_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_immediate_assume_statement(VerilogParser.Deferred_immediate_assume_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#deferred_immediate_assume_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_immediate_assume_statement(VerilogParser.Deferred_immediate_assume_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#deferred_immediate_cover_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_immediate_cover_statement(VerilogParser.Deferred_immediate_cover_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#deferred_immediate_cover_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_immediate_cover_statement(VerilogParser.Deferred_immediate_cover_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClocking_declaration(VerilogParser.Clocking_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClocking_declaration(VerilogParser.Clocking_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_event}.
	 * @param ctx the parse tree
	 */
	void enterClocking_event(VerilogParser.Clocking_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_event}.
	 * @param ctx the parse tree
	 */
	void exitClocking_event(VerilogParser.Clocking_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_item}.
	 * @param ctx the parse tree
	 */
	void enterClocking_item(VerilogParser.Clocking_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_item}.
	 * @param ctx the parse tree
	 */
	void exitClocking_item(VerilogParser.Clocking_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#default_skew}.
	 * @param ctx the parse tree
	 */
	void enterDefault_skew(VerilogParser.Default_skewContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#default_skew}.
	 * @param ctx the parse tree
	 */
	void exitDefault_skew(VerilogParser.Default_skewContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_direction}.
	 * @param ctx the parse tree
	 */
	void enterClocking_direction(VerilogParser.Clocking_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_direction}.
	 * @param ctx the parse tree
	 */
	void exitClocking_direction(VerilogParser.Clocking_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_clocking_decl_assign}.
	 * @param ctx the parse tree
	 */
	void enterList_of_clocking_decl_assign(VerilogParser.List_of_clocking_decl_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_clocking_decl_assign}.
	 * @param ctx the parse tree
	 */
	void exitList_of_clocking_decl_assign(VerilogParser.List_of_clocking_decl_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_decl_assign}.
	 * @param ctx the parse tree
	 */
	void enterClocking_decl_assign(VerilogParser.Clocking_decl_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_decl_assign}.
	 * @param ctx the parse tree
	 */
	void exitClocking_decl_assign(VerilogParser.Clocking_decl_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_skew}.
	 * @param ctx the parse tree
	 */
	void enterClocking_skew(VerilogParser.Clocking_skewContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_skew}.
	 * @param ctx the parse tree
	 */
	void exitClocking_skew(VerilogParser.Clocking_skewContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_drive}.
	 * @param ctx the parse tree
	 */
	void enterClocking_drive(VerilogParser.Clocking_driveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_drive}.
	 * @param ctx the parse tree
	 */
	void exitClocking_drive(VerilogParser.Clocking_driveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cycle_delay}.
	 * @param ctx the parse tree
	 */
	void enterCycle_delay(VerilogParser.Cycle_delayContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cycle_delay}.
	 * @param ctx the parse tree
	 */
	void exitCycle_delay(VerilogParser.Cycle_delayContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clockvar}.
	 * @param ctx the parse tree
	 */
	void enterClockvar(VerilogParser.ClockvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clockvar}.
	 * @param ctx the parse tree
	 */
	void exitClockvar(VerilogParser.ClockvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clockvar_expression}.
	 * @param ctx the parse tree
	 */
	void enterClockvar_expression(VerilogParser.Clockvar_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clockvar_expression}.
	 * @param ctx the parse tree
	 */
	void exitClockvar_expression(VerilogParser.Clockvar_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#randsequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterRandsequence_statement(VerilogParser.Randsequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#randsequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitRandsequence_statement(VerilogParser.Randsequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#production}.
	 * @param ctx the parse tree
	 */
	void enterProduction(VerilogParser.ProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#production}.
	 * @param ctx the parse tree
	 */
	void exitProduction(VerilogParser.ProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_rule}.
	 * @param ctx the parse tree
	 */
	void enterRs_rule(VerilogParser.Rs_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_rule}.
	 * @param ctx the parse tree
	 */
	void exitRs_rule(VerilogParser.Rs_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_production_list}.
	 * @param ctx the parse tree
	 */
	void enterRs_production_list(VerilogParser.Rs_production_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_production_list}.
	 * @param ctx the parse tree
	 */
	void exitRs_production_list(VerilogParser.Rs_production_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#weight_specification}.
	 * @param ctx the parse tree
	 */
	void enterWeight_specification(VerilogParser.Weight_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#weight_specification}.
	 * @param ctx the parse tree
	 */
	void exitWeight_specification(VerilogParser.Weight_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_code_block}.
	 * @param ctx the parse tree
	 */
	void enterRs_code_block(VerilogParser.Rs_code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_code_block}.
	 * @param ctx the parse tree
	 */
	void exitRs_code_block(VerilogParser.Rs_code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_prod}.
	 * @param ctx the parse tree
	 */
	void enterRs_prod(VerilogParser.Rs_prodContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_prod}.
	 * @param ctx the parse tree
	 */
	void exitRs_prod(VerilogParser.Rs_prodContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#production_item}.
	 * @param ctx the parse tree
	 */
	void enterProduction_item(VerilogParser.Production_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#production_item}.
	 * @param ctx the parse tree
	 */
	void exitProduction_item(VerilogParser.Production_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_if_else}.
	 * @param ctx the parse tree
	 */
	void enterRs_if_else(VerilogParser.Rs_if_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_if_else}.
	 * @param ctx the parse tree
	 */
	void exitRs_if_else(VerilogParser.Rs_if_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_repeat}.
	 * @param ctx the parse tree
	 */
	void enterRs_repeat(VerilogParser.Rs_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_repeat}.
	 * @param ctx the parse tree
	 */
	void exitRs_repeat(VerilogParser.Rs_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_case}.
	 * @param ctx the parse tree
	 */
	void enterRs_case(VerilogParser.Rs_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_case}.
	 * @param ctx the parse tree
	 */
	void exitRs_case(VerilogParser.Rs_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#rs_case_item}.
	 * @param ctx the parse tree
	 */
	void enterRs_case_item(VerilogParser.Rs_case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#rs_case_item}.
	 * @param ctx the parse tree
	 */
	void exitRs_case_item(VerilogParser.Rs_case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_block}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_block(VerilogParser.Specify_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_block}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_block(VerilogParser.Specify_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_item}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_item(VerilogParser.Specify_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_item}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_item(VerilogParser.Specify_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#pulsestyle_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPulsestyle_declaration(VerilogParser.Pulsestyle_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#pulsestyle_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPulsestyle_declaration(VerilogParser.Pulsestyle_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#showcancelled_declaration}.
	 * @param ctx the parse tree
	 */
	void enterShowcancelled_declaration(VerilogParser.Showcancelled_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#showcancelled_declaration}.
	 * @param ctx the parse tree
	 */
	void exitShowcancelled_declaration(VerilogParser.Showcancelled_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPath_declaration(VerilogParser.Path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPath_declaration(VerilogParser.Path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_path_declaration(VerilogParser.Simple_path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_path_declaration(VerilogParser.Simple_path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parallel_path_description}.
	 * @param ctx the parse tree
	 */
	void enterParallel_path_description(VerilogParser.Parallel_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parallel_path_description}.
	 * @param ctx the parse tree
	 */
	void exitParallel_path_description(VerilogParser.Parallel_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#full_path_description}.
	 * @param ctx the parse tree
	 */
	void enterFull_path_description(VerilogParser.Full_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#full_path_description}.
	 * @param ctx the parse tree
	 */
	void exitFull_path_description(VerilogParser.Full_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_path_inputs}.
	 * @param ctx the parse tree
	 */
	void enterList_of_path_inputs(VerilogParser.List_of_path_inputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_path_inputs}.
	 * @param ctx the parse tree
	 */
	void exitList_of_path_inputs(VerilogParser.List_of_path_inputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_path_outputs}.
	 * @param ctx the parse tree
	 */
	void enterList_of_path_outputs(VerilogParser.List_of_path_outputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_path_outputs}.
	 * @param ctx the parse tree
	 */
	void exitList_of_path_outputs(VerilogParser.List_of_path_outputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_input_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_input_terminal_descriptor(VerilogParser.Specify_input_terminal_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_input_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_input_terminal_descriptor(VerilogParser.Specify_input_terminal_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_output_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_output_terminal_descriptor(VerilogParser.Specify_output_terminal_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_output_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_output_terminal_descriptor(VerilogParser.Specify_output_terminal_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#input_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInput_identifier(VerilogParser.Input_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#input_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInput_identifier(VerilogParser.Input_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_identifier}.
	 * @param ctx the parse tree
	 */
	void enterOutput_identifier(VerilogParser.Output_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_identifier}.
	 * @param ctx the parse tree
	 */
	void exitOutput_identifier(VerilogParser.Output_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#path_delay_value}.
	 * @param ctx the parse tree
	 */
	void enterPath_delay_value(VerilogParser.Path_delay_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#path_delay_value}.
	 * @param ctx the parse tree
	 */
	void exitPath_delay_value(VerilogParser.Path_delay_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_path_delay_expressions}.
	 * @param ctx the parse tree
	 */
	void enterList_of_path_delay_expressions(VerilogParser.List_of_path_delay_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_path_delay_expressions}.
	 * @param ctx the parse tree
	 */
	void exitList_of_path_delay_expressions(VerilogParser.List_of_path_delay_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#t_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterT_path_delay_expression(VerilogParser.T_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#t_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitT_path_delay_expression(VerilogParser.T_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#trise_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTrise_path_delay_expression(VerilogParser.Trise_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#trise_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTrise_path_delay_expression(VerilogParser.Trise_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tfall_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTfall_path_delay_expression(VerilogParser.Tfall_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tfall_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTfall_path_delay_expression(VerilogParser.Tfall_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tz_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTz_path_delay_expression(VerilogParser.Tz_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tz_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTz_path_delay_expression(VerilogParser.Tz_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#t01_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterT01_path_delay_expression(VerilogParser.T01_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#t01_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitT01_path_delay_expression(VerilogParser.T01_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#t10_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterT10_path_delay_expression(VerilogParser.T10_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#t10_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitT10_path_delay_expression(VerilogParser.T10_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#t0z_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterT0z_path_delay_expression(VerilogParser.T0z_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#t0z_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitT0z_path_delay_expression(VerilogParser.T0z_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tz1_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTz1_path_delay_expression(VerilogParser.Tz1_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tz1_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTz1_path_delay_expression(VerilogParser.Tz1_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#t1z_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterT1z_path_delay_expression(VerilogParser.T1z_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#t1z_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitT1z_path_delay_expression(VerilogParser.T1z_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tz0_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTz0_path_delay_expression(VerilogParser.Tz0_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tz0_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTz0_path_delay_expression(VerilogParser.Tz0_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#t0x_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterT0x_path_delay_expression(VerilogParser.T0x_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#t0x_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitT0x_path_delay_expression(VerilogParser.T0x_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tx1_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTx1_path_delay_expression(VerilogParser.Tx1_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tx1_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTx1_path_delay_expression(VerilogParser.Tx1_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#t1x_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterT1x_path_delay_expression(VerilogParser.T1x_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#t1x_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitT1x_path_delay_expression(VerilogParser.T1x_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tx0_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTx0_path_delay_expression(VerilogParser.Tx0_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tx0_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTx0_path_delay_expression(VerilogParser.Tx0_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#txz_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTxz_path_delay_expression(VerilogParser.Txz_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#txz_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTxz_path_delay_expression(VerilogParser.Txz_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tzx_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterTzx_path_delay_expression(VerilogParser.Tzx_path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tzx_path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitTzx_path_delay_expression(VerilogParser.Tzx_path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterPath_delay_expression(VerilogParser.Path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitPath_delay_expression(VerilogParser.Path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_sensitive_path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEdge_sensitive_path_declaration(VerilogParser.Edge_sensitive_path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_sensitive_path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEdge_sensitive_path_declaration(VerilogParser.Edge_sensitive_path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parallel_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void enterParallel_edge_sensitive_path_description(VerilogParser.Parallel_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parallel_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void exitParallel_edge_sensitive_path_description(VerilogParser.Parallel_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#full_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void enterFull_edge_sensitive_path_description(VerilogParser.Full_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#full_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void exitFull_edge_sensitive_path_description(VerilogParser.Full_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_source_expression}.
	 * @param ctx the parse tree
	 */
	void enterData_source_expression(VerilogParser.Data_source_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_source_expression}.
	 * @param ctx the parse tree
	 */
	void exitData_source_expression(VerilogParser.Data_source_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEdge_identifier(VerilogParser.Edge_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEdge_identifier(VerilogParser.Edge_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#state_dependent_path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterState_dependent_path_declaration(VerilogParser.State_dependent_path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#state_dependent_path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitState_dependent_path_declaration(VerilogParser.State_dependent_path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#polarity_operator}.
	 * @param ctx the parse tree
	 */
	void enterPolarity_operator(VerilogParser.Polarity_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#polarity_operator}.
	 * @param ctx the parse tree
	 */
	void exitPolarity_operator(VerilogParser.Polarity_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#system_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterSystem_timing_check(VerilogParser.System_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitSystem_timing_check(VerilogParser.System_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#setup_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterSetup_timing_check(VerilogParser.Setup_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#setup_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitSetup_timing_check(VerilogParser.Setup_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hold_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterHold_timing_check(VerilogParser.Hold_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hold_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitHold_timing_check(VerilogParser.Hold_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#setuphold_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterSetuphold_timing_check(VerilogParser.Setuphold_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#setuphold_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitSetuphold_timing_check(VerilogParser.Setuphold_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#recovery_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_timing_check(VerilogParser.Recovery_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#recovery_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_timing_check(VerilogParser.Recovery_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#removal_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterRemoval_timing_check(VerilogParser.Removal_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#removal_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitRemoval_timing_check(VerilogParser.Removal_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#recrem_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterRecrem_timing_check(VerilogParser.Recrem_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#recrem_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitRecrem_timing_check(VerilogParser.Recrem_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#skew_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterSkew_timing_check(VerilogParser.Skew_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#skew_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitSkew_timing_check(VerilogParser.Skew_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timeskew_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterTimeskew_timing_check(VerilogParser.Timeskew_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timeskew_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitTimeskew_timing_check(VerilogParser.Timeskew_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#fullskew_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterFullskew_timing_check(VerilogParser.Fullskew_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#fullskew_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitFullskew_timing_check(VerilogParser.Fullskew_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#period_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterPeriod_timing_check(VerilogParser.Period_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#period_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitPeriod_timing_check(VerilogParser.Period_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#width_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterWidth_timing_check(VerilogParser.Width_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#width_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitWidth_timing_check(VerilogParser.Width_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#nochange_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterNochange_timing_check(VerilogParser.Nochange_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#nochange_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitNochange_timing_check(VerilogParser.Nochange_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timecheck_condition}.
	 * @param ctx the parse tree
	 */
	void enterTimecheck_condition(VerilogParser.Timecheck_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timecheck_condition}.
	 * @param ctx the parse tree
	 */
	void exitTimecheck_condition(VerilogParser.Timecheck_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#controlled_reference_event}.
	 * @param ctx the parse tree
	 */
	void enterControlled_reference_event(VerilogParser.Controlled_reference_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#controlled_reference_event}.
	 * @param ctx the parse tree
	 */
	void exitControlled_reference_event(VerilogParser.Controlled_reference_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_event}.
	 * @param ctx the parse tree
	 */
	void enterData_event(VerilogParser.Data_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_event}.
	 * @param ctx the parse tree
	 */
	void exitData_event(VerilogParser.Data_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delayed_data}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_data(VerilogParser.Delayed_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delayed_data}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_data(VerilogParser.Delayed_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delayed_reference}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_reference(VerilogParser.Delayed_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delayed_reference}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_reference(VerilogParser.Delayed_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#end_edge_offset}.
	 * @param ctx the parse tree
	 */
	void enterEnd_edge_offset(VerilogParser.End_edge_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#end_edge_offset}.
	 * @param ctx the parse tree
	 */
	void exitEnd_edge_offset(VerilogParser.End_edge_offsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_based_flag}.
	 * @param ctx the parse tree
	 */
	void enterEvent_based_flag(VerilogParser.Event_based_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_based_flag}.
	 * @param ctx the parse tree
	 */
	void exitEvent_based_flag(VerilogParser.Event_based_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#notifier}.
	 * @param ctx the parse tree
	 */
	void enterNotifier(VerilogParser.NotifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#notifier}.
	 * @param ctx the parse tree
	 */
	void exitNotifier(VerilogParser.NotifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#reference_event}.
	 * @param ctx the parse tree
	 */
	void enterReference_event(VerilogParser.Reference_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#reference_event}.
	 * @param ctx the parse tree
	 */
	void exitReference_event(VerilogParser.Reference_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#remain_active_flag}.
	 * @param ctx the parse tree
	 */
	void enterRemain_active_flag(VerilogParser.Remain_active_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#remain_active_flag}.
	 * @param ctx the parse tree
	 */
	void exitRemain_active_flag(VerilogParser.Remain_active_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timestamp_condition}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_condition(VerilogParser.Timestamp_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timestamp_condition}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_condition(VerilogParser.Timestamp_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#start_edge_offset}.
	 * @param ctx the parse tree
	 */
	void enterStart_edge_offset(VerilogParser.Start_edge_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#start_edge_offset}.
	 * @param ctx the parse tree
	 */
	void exitStart_edge_offset(VerilogParser.Start_edge_offsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#threshold}.
	 * @param ctx the parse tree
	 */
	void enterThreshold(VerilogParser.ThresholdContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#threshold}.
	 * @param ctx the parse tree
	 */
	void exitThreshold(VerilogParser.ThresholdContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timing_check_limit}.
	 * @param ctx the parse tree
	 */
	void enterTiming_check_limit(VerilogParser.Timing_check_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_check_limit}.
	 * @param ctx the parse tree
	 */
	void exitTiming_check_limit(VerilogParser.Timing_check_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timing_check_event}.
	 * @param ctx the parse tree
	 */
	void enterTiming_check_event(VerilogParser.Timing_check_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_check_event}.
	 * @param ctx the parse tree
	 */
	void exitTiming_check_event(VerilogParser.Timing_check_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#controlled_timing_check_event}.
	 * @param ctx the parse tree
	 */
	void enterControlled_timing_check_event(VerilogParser.Controlled_timing_check_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#controlled_timing_check_event}.
	 * @param ctx the parse tree
	 */
	void exitControlled_timing_check_event(VerilogParser.Controlled_timing_check_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timing_check_event_control}.
	 * @param ctx the parse tree
	 */
	void enterTiming_check_event_control(VerilogParser.Timing_check_event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_check_event_control}.
	 * @param ctx the parse tree
	 */
	void exitTiming_check_event_control(VerilogParser.Timing_check_event_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_terminal_descriptor(VerilogParser.Specify_terminal_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_terminal_descriptor(VerilogParser.Specify_terminal_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_control_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEdge_control_specifier(VerilogParser.Edge_control_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_control_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEdge_control_specifier(VerilogParser.Edge_control_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterEdge_descriptor(VerilogParser.Edge_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitEdge_descriptor(VerilogParser.Edge_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timing_check_condition}.
	 * @param ctx the parse tree
	 */
	void enterTiming_check_condition(VerilogParser.Timing_check_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_check_condition}.
	 * @param ctx the parse tree
	 */
	void exitTiming_check_condition(VerilogParser.Timing_check_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#scalar_timing_check_condition}.
	 * @param ctx the parse tree
	 */
	void enterScalar_timing_check_condition(VerilogParser.Scalar_timing_check_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#scalar_timing_check_condition}.
	 * @param ctx the parse tree
	 */
	void exitScalar_timing_check_condition(VerilogParser.Scalar_timing_check_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#scalar_constant}.
	 * @param ctx the parse tree
	 */
	void enterScalar_constant(VerilogParser.Scalar_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#scalar_constant}.
	 * @param ctx the parse tree
	 */
	void exitScalar_constant(VerilogParser.Scalar_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(VerilogParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(VerilogParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConstant_concatenation(VerilogParser.Constant_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConstant_concatenation(VerilogParser.Constant_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConstant_multiple_concatenation(VerilogParser.Constant_multiple_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConstant_multiple_concatenation(VerilogParser.Constant_multiple_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_concatenation(VerilogParser.Module_path_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_concatenation(VerilogParser.Module_path_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_multiple_concatenation(VerilogParser.Module_path_multiple_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_multiple_concatenation(VerilogParser.Module_path_multiple_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_concatenation(VerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_concatenation(VerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#streaming_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_concatenation(VerilogParser.Streaming_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#streaming_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_concatenation(VerilogParser.Streaming_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#stream_operator}.
	 * @param ctx the parse tree
	 */
	void enterStream_operator(VerilogParser.Stream_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#stream_operator}.
	 * @param ctx the parse tree
	 */
	void exitStream_operator(VerilogParser.Stream_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#slice_size}.
	 * @param ctx the parse tree
	 */
	void enterSlice_size(VerilogParser.Slice_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#slice_size}.
	 * @param ctx the parse tree
	 */
	void exitSlice_size(VerilogParser.Slice_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#stream_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterStream_concatenation(VerilogParser.Stream_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#stream_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitStream_concatenation(VerilogParser.Stream_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#stream_expression}.
	 * @param ctx the parse tree
	 */
	void enterStream_expression(VerilogParser.Stream_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#stream_expression}.
	 * @param ctx the parse tree
	 */
	void exitStream_expression(VerilogParser.Stream_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#array_range_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_range_expression(VerilogParser.Array_range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#array_range_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_range_expression(VerilogParser.Array_range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#empty_queue}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_queue(VerilogParser.Empty_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#empty_queue}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_queue(VerilogParser.Empty_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 */
	void enterConstant_function_call(VerilogParser.Constant_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 */
	void exitConstant_function_call(VerilogParser.Constant_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tf_call}.
	 * @param ctx the parse tree
	 */
	void enterTf_call(VerilogParser.Tf_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_call}.
	 * @param ctx the parse tree
	 */
	void exitTf_call(VerilogParser.Tf_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#system_tf_call}.
	 * @param ctx the parse tree
	 */
	void enterSystem_tf_call(VerilogParser.System_tf_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_tf_call}.
	 * @param ctx the parse tree
	 */
	void exitSystem_tf_call(VerilogParser.System_tf_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#subroutine_call}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_call(VerilogParser.Subroutine_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#subroutine_call}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_call(VerilogParser.Subroutine_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_subroutine_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_subroutine_call(VerilogParser.Function_subroutine_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_subroutine_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_subroutine_call(VerilogParser.Function_subroutine_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_arguments(VerilogParser.List_of_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_arguments(VerilogParser.List_of_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(VerilogParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(VerilogParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#method_call_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_body(VerilogParser.Method_call_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#method_call_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_body(VerilogParser.Method_call_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#built_in_method_call}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_method_call(VerilogParser.Built_in_method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#built_in_method_call}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_method_call(VerilogParser.Built_in_method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#array_manipulation_call}.
	 * @param ctx the parse tree
	 */
	void enterArray_manipulation_call(VerilogParser.Array_manipulation_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#array_manipulation_call}.
	 * @param ctx the parse tree
	 */
	void exitArray_manipulation_call(VerilogParser.Array_manipulation_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#randomize_call}.
	 * @param ctx the parse tree
	 */
	void enterRandomize_call(VerilogParser.Randomize_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#randomize_call}.
	 * @param ctx the parse tree
	 */
	void exitRandomize_call(VerilogParser.Randomize_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#method_call_root}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_root(VerilogParser.Method_call_rootContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#method_call_root}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_root(VerilogParser.Method_call_rootContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#array_method_name}.
	 * @param ctx the parse tree
	 */
	void enterArray_method_name(VerilogParser.Array_method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#array_method_name}.
	 * @param ctx the parse tree
	 */
	void exitArray_method_name(VerilogParser.Array_method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inc_or_dec_expression}.
	 * @param ctx the parse tree
	 */
	void enterInc_or_dec_expression(VerilogParser.Inc_or_dec_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inc_or_dec_expression}.
	 * @param ctx the parse tree
	 */
	void exitInc_or_dec_expression(VerilogParser.Inc_or_dec_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_binary_and}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_binary_and(VerilogParser.Const_expr_binary_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_binary_and}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_binary_and(VerilogParser.Const_expr_binary_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_mutl}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_mutl(VerilogParser.Const_expr_mutlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_mutl}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_mutl(VerilogParser.Const_expr_mutlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_add}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_add(VerilogParser.Const_expr_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_add}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_add(VerilogParser.Const_expr_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_equality}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_equality(VerilogParser.Const_expr_equalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_equality}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_equality(VerilogParser.Const_expr_equalityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_comp}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_comp(VerilogParser.Const_expr_compContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_comp}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_comp(VerilogParser.Const_expr_compContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_log_or}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_log_or(VerilogParser.Const_expr_log_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_log_or}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_log_or(VerilogParser.Const_expr_log_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_binary_or}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_binary_or(VerilogParser.Const_expr_binary_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_binary_or}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_binary_or(VerilogParser.Const_expr_binary_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_only_primary}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_only_primary(VerilogParser.Const_expr_only_primaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_only_primary}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_only_primary(VerilogParser.Const_expr_only_primaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_binary_xor}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_binary_xor(VerilogParser.Const_expr_binary_xorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_binary_xor}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_binary_xor(VerilogParser.Const_expr_binary_xorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_log_and}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_log_and(VerilogParser.Const_expr_log_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_log_and}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_log_and(VerilogParser.Const_expr_log_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_shift}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_shift(VerilogParser.Const_expr_shiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_shift}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_shift(VerilogParser.Const_expr_shiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_st_st}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_st_st(VerilogParser.Const_expr_st_stContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_st_st}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_st_st(VerilogParser.Const_expr_st_stContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_conditional}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_conditional(VerilogParser.Const_expr_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_conditional}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_conditional(VerilogParser.Const_expr_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_expr_unary_op}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr_unary_op(VerilogParser.Const_expr_unary_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_expr_unary_op}
	 * labeled alternative in {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr_unary_op(VerilogParser.Const_expr_unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_mintypmax_expression(VerilogParser.Constant_mintypmax_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_mintypmax_expression(VerilogParser.Constant_mintypmax_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_param_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_param_expression(VerilogParser.Constant_param_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_param_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_param_expression(VerilogParser.Constant_param_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#param_expression}.
	 * @param ctx the parse tree
	 */
	void enterParam_expression(VerilogParser.Param_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#param_expression}.
	 * @param ctx the parse tree
	 */
	void exitParam_expression(VerilogParser.Param_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_range_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_range_expression(VerilogParser.Constant_range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_range_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_range_expression(VerilogParser.Constant_range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_part_select_range}.
	 * @param ctx the parse tree
	 */
	void enterConstant_part_select_range(VerilogParser.Constant_part_select_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_part_select_range}.
	 * @param ctx the parse tree
	 */
	void exitConstant_part_select_range(VerilogParser.Constant_part_select_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_range}.
	 * @param ctx the parse tree
	 */
	void enterConstant_range(VerilogParser.Constant_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_range}.
	 * @param ctx the parse tree
	 */
	void exitConstant_range(VerilogParser.Constant_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_indexed_range}.
	 * @param ctx the parse tree
	 */
	void enterConstant_indexed_range(VerilogParser.Constant_indexed_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_indexed_range}.
	 * @param ctx the parse tree
	 */
	void exitConstant_indexed_range(VerilogParser.Constant_indexed_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#expr_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_(VerilogParser.Expr_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#expr_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_(VerilogParser.Expr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_binary_or}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_binary_or(VerilogParser.Expression_binary_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_binary_or}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_binary_or(VerilogParser.Expression_binary_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_binary_xor}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_binary_xor(VerilogParser.Expression_binary_xorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_binary_xor}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_binary_xor(VerilogParser.Expression_binary_xorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_add}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_add(VerilogParser.Expression_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_add}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_add(VerilogParser.Expression_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_log_or}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_log_or(VerilogParser.Expression_log_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_log_or}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_log_or(VerilogParser.Expression_log_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_only_primary}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_only_primary(VerilogParser.Expression_only_primaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_only_primary}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_only_primary(VerilogParser.Expression_only_primaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_log_and}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_log_and(VerilogParser.Expression_log_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_log_and}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_log_and(VerilogParser.Expression_log_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_inc_or_dec}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_inc_or_dec(VerilogParser.Expression_inc_or_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_inc_or_dec}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_inc_or_dec(VerilogParser.Expression_inc_or_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_tagged_union}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_tagged_union(VerilogParser.Expression_tagged_unionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_tagged_union}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_tagged_union(VerilogParser.Expression_tagged_unionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_conditional_exp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_conditional_exp(VerilogParser.Expression_conditional_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_conditional_exp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_conditional_exp(VerilogParser.Expression_conditional_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_comp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_comp(VerilogParser.Expression_compContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_comp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_comp(VerilogParser.Expression_compContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_inside_exp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_inside_exp(VerilogParser.Expression_inside_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_inside_exp}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_inside_exp(VerilogParser.Expression_inside_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_mult}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_mult(VerilogParser.Expression_multContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_mult}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_mult(VerilogParser.Expression_multContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_binary_and}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_binary_and(VerilogParser.Expression_binary_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_binary_and}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_binary_and(VerilogParser.Expression_binary_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_equality}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_equality(VerilogParser.Expression_equalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_equality}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_equality(VerilogParser.Expression_equalityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_shift}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_shift(VerilogParser.Expression_shiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_shift}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_shift(VerilogParser.Expression_shiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_op_assign}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_op_assign(VerilogParser.Expression_op_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_op_assign}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_op_assign(VerilogParser.Expression_op_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_st_st}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_st_st(VerilogParser.Expression_st_stContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_st_st}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_st_st(VerilogParser.Expression_st_stContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_unary_op}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_unary_op(VerilogParser.Expression_unary_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_unary_op}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_unary_op(VerilogParser.Expression_unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#matches_pattern}.
	 * @param ctx the parse tree
	 */
	void enterMatches_pattern(VerilogParser.Matches_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#matches_pattern}.
	 * @param ctx the parse tree
	 */
	void exitMatches_pattern(VerilogParser.Matches_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tagged_union_expression}.
	 * @param ctx the parse tree
	 */
	void enterTagged_union_expression(VerilogParser.Tagged_union_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tagged_union_expression}.
	 * @param ctx the parse tree
	 */
	void exitTagged_union_expression(VerilogParser.Tagged_union_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#value_range}.
	 * @param ctx the parse tree
	 */
	void enterValue_range(VerilogParser.Value_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#value_range}.
	 * @param ctx the parse tree
	 */
	void exitValue_range(VerilogParser.Value_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void enterMintypmax_expression(VerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void exitMintypmax_expression(VerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_expression(VerilogParser.Module_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_expression(VerilogParser.Module_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_conditional_expression(VerilogParser.Module_path_conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_conditional_expression(VerilogParser.Module_path_conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_binary_expression(VerilogParser.Module_path_binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_binary_expression(VerilogParser.Module_path_binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_unary_expression(VerilogParser.Module_path_unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_unary_expression(VerilogParser.Module_path_unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_mintypmax_expression(VerilogParser.Module_path_mintypmax_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_mintypmax_expression(VerilogParser.Module_path_mintypmax_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#part_select_range}.
	 * @param ctx the parse tree
	 */
	void enterPart_select_range(VerilogParser.Part_select_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#part_select_range}.
	 * @param ctx the parse tree
	 */
	void exitPart_select_range(VerilogParser.Part_select_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#indexed_range}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_range(VerilogParser.Indexed_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#indexed_range}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_range(VerilogParser.Indexed_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_expression}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_expression(VerilogParser.Genvar_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_expression}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_expression(VerilogParser.Genvar_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_primary}.
	 * @param ctx the parse tree
	 */
	void enterConstant_primary(VerilogParser.Constant_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_primary}.
	 * @param ctx the parse tree
	 */
	void exitConstant_primary(VerilogParser.Constant_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_primary}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_primary(VerilogParser.Module_path_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_primary}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_primary(VerilogParser.Module_path_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#primary_no_function_call}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_no_function_call(VerilogParser.Primary_no_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#primary_no_function_call}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_no_function_call(VerilogParser.Primary_no_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(VerilogParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(VerilogParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_qualifier(VerilogParser.Class_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_qualifier(VerilogParser.Class_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void enterRange_expression(VerilogParser.Range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void exitRange_expression(VerilogParser.Range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#primary_literal}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_literal(VerilogParser.Primary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#primary_literal}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_literal(VerilogParser.Primary_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void enterTime_literal(VerilogParser.Time_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void exitTime_literal(VerilogParser.Time_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#implicit_class_handle}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_class_handle(VerilogParser.Implicit_class_handleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#implicit_class_handle}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_class_handle(VerilogParser.Implicit_class_handleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bit_select}.
	 * @param ctx the parse tree
	 */
	void enterBit_select(VerilogParser.Bit_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bit_select}.
	 * @param ctx the parse tree
	 */
	void exitBit_select(VerilogParser.Bit_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(VerilogParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(VerilogParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#nonrange_select}.
	 * @param ctx the parse tree
	 */
	void enterNonrange_select(VerilogParser.Nonrange_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#nonrange_select}.
	 * @param ctx the parse tree
	 */
	void exitNonrange_select(VerilogParser.Nonrange_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_bit_select}.
	 * @param ctx the parse tree
	 */
	void enterConstant_bit_select(VerilogParser.Constant_bit_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_bit_select}.
	 * @param ctx the parse tree
	 */
	void exitConstant_bit_select(VerilogParser.Constant_bit_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_select}.
	 * @param ctx the parse tree
	 */
	void enterConstant_select(VerilogParser.Constant_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_select}.
	 * @param ctx the parse tree
	 */
	void exitConstant_select(VerilogParser.Constant_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_cast}.
	 * @param ctx the parse tree
	 */
	void enterConstant_cast(VerilogParser.Constant_castContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_cast}.
	 * @param ctx the parse tree
	 */
	void exitConstant_cast(VerilogParser.Constant_castContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_let_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_let_expression(VerilogParser.Constant_let_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_let_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_let_expression(VerilogParser.Constant_let_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(VerilogParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(VerilogParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterNet_lvalue(VerilogParser.Net_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitNet_lvalue(VerilogParser.Net_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterVariable_lvalue(VerilogParser.Variable_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitVariable_lvalue(VerilogParser.Variable_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#nonrange_variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterNonrange_variable_lvalue(VerilogParser.Nonrange_variable_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#nonrange_variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitNonrange_variable_lvalue(VerilogParser.Nonrange_variable_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(VerilogParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(VerilogParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(VerilogParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(VerilogParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inc_or_dec_operator}.
	 * @param ctx the parse tree
	 */
	void enterInc_or_dec_operator(VerilogParser.Inc_or_dec_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inc_or_dec_operator}.
	 * @param ctx the parse tree
	 */
	void exitInc_or_dec_operator(VerilogParser.Inc_or_dec_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_module_path_operator(VerilogParser.Unary_module_path_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_module_path_operator(VerilogParser.Unary_module_path_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#binary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_module_path_operator(VerilogParser.Binary_module_path_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#binary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_module_path_operator(VerilogParser.Binary_module_path_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unbased_unsized_literal}.
	 * @param ctx the parse tree
	 */
	void enterUnbased_unsized_literal(VerilogParser.Unbased_unsized_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unbased_unsized_literal}.
	 * @param ctx the parse tree
	 */
	void exitUnbased_unsized_literal(VerilogParser.Unbased_unsized_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(VerilogParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(VerilogParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_instance(VerilogParser.Attribute_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_instance(VerilogParser.Attribute_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void enterAttr_spec(VerilogParser.Attr_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void exitAttr_spec(VerilogParser.Attr_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void enterAttr_name(VerilogParser.Attr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void exitAttr_name(VerilogParser.Attr_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#array_identifier}.
	 * @param ctx the parse tree
	 */
	void enterArray_identifier(VerilogParser.Array_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#array_identifier}.
	 * @param ctx the parse tree
	 */
	void exitArray_identifier(VerilogParser.Array_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBlock_identifier(VerilogParser.Block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBlock_identifier(VerilogParser.Block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bin_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBin_identifier(VerilogParser.Bin_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bin_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBin_identifier(VerilogParser.Bin_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#c_identifier}.
	 * @param ctx the parse tree
	 */
	void enterC_identifier(VerilogParser.C_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#c_identifier}.
	 * @param ctx the parse tree
	 */
	void exitC_identifier(VerilogParser.C_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cell_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCell_identifier(VerilogParser.Cell_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cell_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCell_identifier(VerilogParser.Cell_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#checker_identifier}.
	 * @param ctx the parse tree
	 */
	void enterChecker_identifier(VerilogParser.Checker_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#checker_identifier}.
	 * @param ctx the parse tree
	 */
	void exitChecker_identifier(VerilogParser.Checker_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_identifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_identifier(VerilogParser.Class_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_identifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_identifier(VerilogParser.Class_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#class_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_variable_identifier(VerilogParser.Class_variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#class_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_variable_identifier(VerilogParser.Class_variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#clocking_identifier}.
	 * @param ctx the parse tree
	 */
	void enterClocking_identifier(VerilogParser.Clocking_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#clocking_identifier}.
	 * @param ctx the parse tree
	 */
	void exitClocking_identifier(VerilogParser.Clocking_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#config_identifier}.
	 * @param ctx the parse tree
	 */
	void enterConfig_identifier(VerilogParser.Config_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#config_identifier}.
	 * @param ctx the parse tree
	 */
	void exitConfig_identifier(VerilogParser.Config_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#const_identifier}.
	 * @param ctx the parse tree
	 */
	void enterConst_identifier(VerilogParser.Const_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#const_identifier}.
	 * @param ctx the parse tree
	 */
	void exitConst_identifier(VerilogParser.Const_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constraint_identifier}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_identifier(VerilogParser.Constraint_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constraint_identifier}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_identifier(VerilogParser.Constraint_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#covergroup_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCovergroup_identifier(VerilogParser.Covergroup_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#covergroup_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCovergroup_identifier(VerilogParser.Covergroup_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#covergroup_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCovergroup_variable_identifier(VerilogParser.Covergroup_variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#covergroup_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCovergroup_variable_identifier(VerilogParser.Covergroup_variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cover_point_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCover_point_identifier(VerilogParser.Cover_point_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cover_point_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCover_point_identifier(VerilogParser.Cover_point_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cross_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCross_identifier(VerilogParser.Cross_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cross_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCross_identifier(VerilogParser.Cross_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dynamic_array_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_array_variable_identifier(VerilogParser.Dynamic_array_variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dynamic_array_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_array_variable_identifier(VerilogParser.Dynamic_array_variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#enum_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_identifier(VerilogParser.Enum_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#enum_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_identifier(VerilogParser.Enum_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#escaped_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_identifier(VerilogParser.Escaped_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#escaped_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_identifier(VerilogParser.Escaped_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#formal_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFormal_identifier(VerilogParser.Formal_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#formal_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFormal_identifier(VerilogParser.Formal_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_identifier(VerilogParser.Function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_identifier(VerilogParser.Function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_block_identifier(VerilogParser.Generate_block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_block_identifier(VerilogParser.Generate_block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_identifier(VerilogParser.Genvar_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_identifier(VerilogParser.Genvar_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_array_identifier(VerilogParser.Hierarchical_array_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_array_identifier(VerilogParser.Hierarchical_array_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_block_identifier(VerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_block_identifier(VerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_event_identifier(VerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_event_identifier(VerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_identifier(VerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_identifier(VerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_net_identifier(VerilogParser.Hierarchical_net_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_net_identifier(VerilogParser.Hierarchical_net_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_parameter_identifier(VerilogParser.Hierarchical_parameter_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_parameter_identifier(VerilogParser.Hierarchical_parameter_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_property_identifier(VerilogParser.Hierarchical_property_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_property_identifier(VerilogParser.Hierarchical_property_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_sequence_identifier(VerilogParser.Hierarchical_sequence_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_sequence_identifier(VerilogParser.Hierarchical_sequence_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_task_identifier(VerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_task_identifier(VerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_tf_identifier(VerilogParser.Hierarchical_tf_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_tf_identifier(VerilogParser.Hierarchical_tf_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_variable_identifier(VerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_variable_identifier(VerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VerilogParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VerilogParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#index_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterIndex_variable_identifier(VerilogParser.Index_variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#index_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitIndex_variable_identifier(VerilogParser.Index_variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInterface_identifier(VerilogParser.Interface_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInterface_identifier(VerilogParser.Interface_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#interface_instance_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInterface_instance_identifier(VerilogParser.Interface_instance_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#interface_instance_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInterface_instance_identifier(VerilogParser.Interface_instance_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inout_port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInout_port_identifier(VerilogParser.Inout_port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inout_port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInout_port_identifier(VerilogParser.Inout_port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#input_port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInput_port_identifier(VerilogParser.Input_port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#input_port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInput_port_identifier(VerilogParser.Input_port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#instance_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInstance_identifier(VerilogParser.Instance_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#instance_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInstance_identifier(VerilogParser.Instance_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#library_identifier}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_identifier(VerilogParser.Library_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#library_identifier}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_identifier(VerilogParser.Library_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#member_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMember_identifier(VerilogParser.Member_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#member_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMember_identifier(VerilogParser.Member_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void enterMethod_identifier(VerilogParser.Method_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#method_identifier}.
	 * @param ctx the parse tree
	 */
	void exitMethod_identifier(VerilogParser.Method_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#modport_identifier}.
	 * @param ctx the parse tree
	 */
	void enterModport_identifier(VerilogParser.Modport_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#modport_identifier}.
	 * @param ctx the parse tree
	 */
	void exitModport_identifier(VerilogParser.Modport_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 */
	void enterModule_identifier(VerilogParser.Module_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 */
	void exitModule_identifier(VerilogParser.Module_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_identifier}.
	 * @param ctx the parse tree
	 */
	void enterNet_identifier(VerilogParser.Net_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_identifier}.
	 * @param ctx the parse tree
	 */
	void exitNet_identifier(VerilogParser.Net_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterOutput_port_identifier(VerilogParser.Output_port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitOutput_port_identifier(VerilogParser.Output_port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPackage_identifier(VerilogParser.Package_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPackage_identifier(VerilogParser.Package_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#package_scope}.
	 * @param ctx the parse tree
	 */
	void enterPackage_scope(VerilogParser.Package_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#package_scope}.
	 * @param ctx the parse tree
	 */
	void exitPackage_scope(VerilogParser.Package_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_identifier(VerilogParser.Parameter_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_identifier(VerilogParser.Parameter_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPort_identifier(VerilogParser.Port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPort_identifier(VerilogParser.Port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#production_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProduction_identifier(VerilogParser.Production_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#production_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProduction_identifier(VerilogParser.Production_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#program_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProgram_identifier(VerilogParser.Program_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#program_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProgram_identifier(VerilogParser.Program_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#property_identifier}.
	 * @param ctx the parse tree
	 */
	void enterProperty_identifier(VerilogParser.Property_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#property_identifier}.
	 * @param ctx the parse tree
	 */
	void exitProperty_identifier(VerilogParser.Property_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_class_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_class_identifier(VerilogParser.Ps_class_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_class_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_class_identifier(VerilogParser.Ps_class_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_covergroup_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_covergroup_identifier(VerilogParser.Ps_covergroup_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_covergroup_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_covergroup_identifier(VerilogParser.Ps_covergroup_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_identifier(VerilogParser.Ps_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_identifier(VerilogParser.Ps_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_or_hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_or_hierarchical_array_identifier(VerilogParser.Ps_or_hierarchical_array_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_array_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_or_hierarchical_array_identifier(VerilogParser.Ps_or_hierarchical_array_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_or_hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_or_hierarchical_net_identifier(VerilogParser.Ps_or_hierarchical_net_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_or_hierarchical_net_identifier(VerilogParser.Ps_or_hierarchical_net_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_or_hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_or_hierarchical_property_identifier(VerilogParser.Ps_or_hierarchical_property_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_property_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_or_hierarchical_property_identifier(VerilogParser.Ps_or_hierarchical_property_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_or_hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_or_hierarchical_sequence_identifier(VerilogParser.Ps_or_hierarchical_sequence_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_sequence_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_or_hierarchical_sequence_identifier(VerilogParser.Ps_or_hierarchical_sequence_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_or_hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_or_hierarchical_tf_identifier(VerilogParser.Ps_or_hierarchical_tf_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_or_hierarchical_tf_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_or_hierarchical_tf_identifier(VerilogParser.Ps_or_hierarchical_tf_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_parameter_identifier(VerilogParser.Ps_parameter_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_parameter_identifier(VerilogParser.Ps_parameter_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ps_type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPs_type_identifier(VerilogParser.Ps_type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ps_type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPs_type_identifier(VerilogParser.Ps_type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequence_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSequence_identifier(VerilogParser.Sequence_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequence_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSequence_identifier(VerilogParser.Sequence_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#signal_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSignal_identifier(VerilogParser.Signal_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#signal_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSignal_identifier(VerilogParser.Signal_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSimple_identifier(VerilogParser.Simple_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSimple_identifier(VerilogParser.Simple_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specparam_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSpecparam_identifier(VerilogParser.Specparam_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specparam_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSpecparam_identifier(VerilogParser.Specparam_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#system_tf_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSystem_tf_identifier(VerilogParser.System_tf_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_tf_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSystem_tf_identifier(VerilogParser.System_tf_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterTask_identifier(VerilogParser.Task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitTask_identifier(VerilogParser.Task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#tf_identifier}.
	 * @param ctx the parse tree
	 */
	void enterTf_identifier(VerilogParser.Tf_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_identifier}.
	 * @param ctx the parse tree
	 */
	void exitTf_identifier(VerilogParser.Tf_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#terminal_identifier}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_identifier(VerilogParser.Terminal_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#terminal_identifier}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_identifier(VerilogParser.Terminal_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#topmodule_identifier}.
	 * @param ctx the parse tree
	 */
	void enterTopmodule_identifier(VerilogParser.Topmodule_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#topmodule_identifier}.
	 * @param ctx the parse tree
	 */
	void exitTopmodule_identifier(VerilogParser.Topmodule_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(VerilogParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(VerilogParser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_identifier}.
	 * @param ctx the parse tree
	 */
	void enterUdp_identifier(VerilogParser.Udp_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_identifier}.
	 * @param ctx the parse tree
	 */
	void exitUdp_identifier(VerilogParser.Udp_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bins_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBins_identifier(VerilogParser.Bins_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bins_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBins_identifier(VerilogParser.Bins_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(VerilogParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(VerilogParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(VerilogParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(VerilogParser.NumberContext ctx);
}