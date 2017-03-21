// Generated from PPParser.g4 by ANTLR 4.5
package com.proteus.preprocess.pp.gen;

        import com.proteus.preprocess.pp.ext.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PPParser}.
 */
public interface PPParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PPParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PPParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PPParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModule_declaration(PPParser.Module_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModule_declaration(PPParser.Module_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#module_header}.
	 * @param ctx the parse tree
	 */
	void enterModule_header(PPParser.Module_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#module_header}.
	 * @param ctx the parse tree
	 */
	void exitModule_header(PPParser.Module_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void enterLifetime(PPParser.LifetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void exitLifetime(PPParser.LifetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void enterModule_keyword(PPParser.Module_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void exitModule_keyword(PPParser.Module_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#atext}.
	 * @param ctx the parse tree
	 */
	void enterAtext(PPParser.AtextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#atext}.
	 * @param ctx the parse tree
	 */
	void exitAtext(PPParser.AtextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(PPParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(PPParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#npp_statements}.
	 * @param ctx the parse tree
	 */
	void enterNpp_statements(PPParser.Npp_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#npp_statements}.
	 * @param ctx the parse tree
	 */
	void exitNpp_statements(PPParser.Npp_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#npp_statement}.
	 * @param ctx the parse tree
	 */
	void enterNpp_statement(PPParser.Npp_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#npp_statement}.
	 * @param ctx the parse tree
	 */
	void exitNpp_statement(PPParser.Npp_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterModule_instantiation(PPParser.Module_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitModule_instantiation(PPParser.Module_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParameter_value_assignment(PPParser.Parameter_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParameter_value_assignment(PPParser.Parameter_value_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_parameter_assignments(PPParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_parameter_assignments(PPParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void enterMintypmax_expression(PPParser.Mintypmax_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void exitMintypmax_expression(PPParser.Mintypmax_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNamed_parameter_assignment(PPParser.Named_parameter_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNamed_parameter_assignment(PPParser.Named_parameter_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#hierarchical_instance}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_instance(PPParser.Hierarchical_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#hierarchical_instance}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_instance(PPParser.Hierarchical_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#name_of_instance}.
	 * @param ctx the parse tree
	 */
	void enterName_of_instance(PPParser.Name_of_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#name_of_instance}.
	 * @param ctx the parse tree
	 */
	void exitName_of_instance(PPParser.Name_of_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_connections(PPParser.List_of_port_connectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_connections(PPParser.List_of_port_connectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_port_connection(PPParser.Ordered_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_port_connection(PPParser.Ordered_port_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ports_atext}.
	 * @param ctx the parse tree
	 */
	void enterPorts_atext(PPParser.Ports_atextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ports_atext}.
	 * @param ctx the parse tree
	 */
	void exitPorts_atext(PPParser.Ports_atextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterNamed_port_connection(PPParser.Named_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitNamed_port_connection(PPParser.Named_port_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_instance(PPParser.Attribute_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_instance(PPParser.Attribute_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void enterAttr_spec(PPParser.Attr_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void exitAttr_spec(PPParser.Attr_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#pp_statement}.
	 * @param ctx the parse tree
	 */
	void enterPp_statement(PPParser.Pp_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#pp_statement}.
	 * @param ctx the parse tree
	 */
	void exitPp_statement(PPParser.Pp_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(PPParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(PPParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#conditional_statement_text}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement_text(PPParser.Conditional_statement_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#conditional_statement_text}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement_text(PPParser.Conditional_statement_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#conditional_statement_part1}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement_part1(PPParser.Conditional_statement_part1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#conditional_statement_part1}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement_part1(PPParser.Conditional_statement_part1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#conditional_statement_part1_else_id_statement_or_null}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement_part1_else_id_statement_or_null(PPParser.Conditional_statement_part1_else_id_statement_or_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#conditional_statement_part1_else_id_statement_or_null}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement_part1_else_id_statement_or_null(PPParser.Conditional_statement_part1_else_id_statement_or_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#conditional_statement_part2}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement_part2(PPParser.Conditional_statement_part2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#conditional_statement_part2}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement_part2(PPParser.Conditional_statement_part2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#if_id}.
	 * @param ctx the parse tree
	 */
	void enterIf_id(PPParser.If_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#if_id}.
	 * @param ctx the parse tree
	 */
	void exitIf_id(PPParser.If_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#define_r}.
	 * @param ctx the parse tree
	 */
	void enterDefine_r(PPParser.Define_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#define_r}.
	 * @param ctx the parse tree
	 */
	void exitDefine_r(PPParser.Define_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#undef_r}.
	 * @param ctx the parse tree
	 */
	void enterUndef_r(PPParser.Undef_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#undef_r}.
	 * @param ctx the parse tree
	 */
	void exitUndef_r(PPParser.Undef_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#include_r}.
	 * @param ctx the parse tree
	 */
	void enterInclude_r(PPParser.Include_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#include_r}.
	 * @param ctx the parse tree
	 */
	void exitInclude_r(PPParser.Include_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#include_r_def}.
	 * @param ctx the parse tree
	 */
	void enterInclude_r_def(PPParser.Include_r_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#include_r_def}.
	 * @param ctx the parse tree
	 */
	void exitInclude_r_def(PPParser.Include_r_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(PPParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(PPParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#timescale_r}.
	 * @param ctx the parse tree
	 */
	void enterTimescale_r(PPParser.Timescale_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#timescale_r}.
	 * @param ctx the parse tree
	 */
	void exitTimescale_r(PPParser.Timescale_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#define_id}.
	 * @param ctx the parse tree
	 */
	void enterDefine_id(PPParser.Define_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#define_id}.
	 * @param ctx the parse tree
	 */
	void exitDefine_id(PPParser.Define_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#resetall_r}.
	 * @param ctx the parse tree
	 */
	void enterResetall_r(PPParser.Resetall_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#resetall_r}.
	 * @param ctx the parse tree
	 */
	void exitResetall_r(PPParser.Resetall_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#tick_token}.
	 * @param ctx the parse tree
	 */
	void enterTick_token(PPParser.Tick_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#tick_token}.
	 * @param ctx the parse tree
	 */
	void exitTick_token(PPParser.Tick_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#tick_token_id}.
	 * @param ctx the parse tree
	 */
	void enterTick_token_id(PPParser.Tick_token_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#tick_token_id}.
	 * @param ctx the parse tree
	 */
	void exitTick_token_id(PPParser.Tick_token_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#if_p}.
	 * @param ctx the parse tree
	 */
	void enterIf_p(PPParser.If_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#if_p}.
	 * @param ctx the parse tree
	 */
	void exitIf_p(PPParser.If_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#if_n_def_p}.
	 * @param ctx the parse tree
	 */
	void enterIf_n_def_p(PPParser.If_n_def_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#if_n_def_p}.
	 * @param ctx the parse tree
	 */
	void exitIf_n_def_p(PPParser.If_n_def_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#elseif_p}.
	 * @param ctx the parse tree
	 */
	void enterElseif_p(PPParser.Elseif_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#elseif_p}.
	 * @param ctx the parse tree
	 */
	void exitElseif_p(PPParser.Elseif_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#else_p}.
	 * @param ctx the parse tree
	 */
	void enterElse_p(PPParser.Else_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#else_p}.
	 * @param ctx the parse tree
	 */
	void exitElse_p(PPParser.Else_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#endif_p}.
	 * @param ctx the parse tree
	 */
	void enterEndif_p(PPParser.Endif_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#endif_p}.
	 * @param ctx the parse tree
	 */
	void exitEndif_p(PPParser.Endif_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#define_p}.
	 * @param ctx the parse tree
	 */
	void enterDefine_p(PPParser.Define_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#define_p}.
	 * @param ctx the parse tree
	 */
	void exitDefine_p(PPParser.Define_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#undef_p}.
	 * @param ctx the parse tree
	 */
	void enterUndef_p(PPParser.Undef_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#undef_p}.
	 * @param ctx the parse tree
	 */
	void exitUndef_p(PPParser.Undef_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#resetall_p}.
	 * @param ctx the parse tree
	 */
	void enterResetall_p(PPParser.Resetall_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#resetall_p}.
	 * @param ctx the parse tree
	 */
	void exitResetall_p(PPParser.Resetall_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#include_p}.
	 * @param ctx the parse tree
	 */
	void enterInclude_p(PPParser.Include_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#include_p}.
	 * @param ctx the parse tree
	 */
	void exitInclude_p(PPParser.Include_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#timescale_p}.
	 * @param ctx the parse tree
	 */
	void enterTimescale_p(PPParser.Timescale_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#timescale_p}.
	 * @param ctx the parse tree
	 */
	void exitTimescale_p(PPParser.Timescale_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PPParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PPParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(PPParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(PPParser.NlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ppnl}.
	 * @param ctx the parse tree
	 */
	void enterPpnl(PPParser.PpnlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ppnl}.
	 * @param ctx the parse tree
	 */
	void exitPpnl(PPParser.PpnlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#extern_rule}.
	 * @param ctx the parse tree
	 */
	void enterExtern_rule(PPParser.Extern_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#extern_rule}.
	 * @param ctx the parse tree
	 */
	void exitExtern_rule(PPParser.Extern_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#static_rule}.
	 * @param ctx the parse tree
	 */
	void enterStatic_rule(PPParser.Static_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#static_rule}.
	 * @param ctx the parse tree
	 */
	void exitStatic_rule(PPParser.Static_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#automatic_rule}.
	 * @param ctx the parse tree
	 */
	void enterAutomatic_rule(PPParser.Automatic_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#automatic_rule}.
	 * @param ctx the parse tree
	 */
	void exitAutomatic_rule(PPParser.Automatic_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#module_rule}.
	 * @param ctx the parse tree
	 */
	void enterModule_rule(PPParser.Module_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#module_rule}.
	 * @param ctx the parse tree
	 */
	void exitModule_rule(PPParser.Module_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#macromodule_rule}.
	 * @param ctx the parse tree
	 */
	void enterMacromodule_rule(PPParser.Macromodule_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#macromodule_rule}.
	 * @param ctx the parse tree
	 */
	void exitMacromodule_rule(PPParser.Macromodule_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#endmodule_rule}.
	 * @param ctx the parse tree
	 */
	void enterEndmodule_rule(PPParser.Endmodule_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#endmodule_rule}.
	 * @param ctx the parse tree
	 */
	void exitEndmodule_rule(PPParser.Endmodule_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#comma_rule}.
	 * @param ctx the parse tree
	 */
	void enterComma_rule(PPParser.Comma_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#comma_rule}.
	 * @param ctx the parse tree
	 */
	void exitComma_rule(PPParser.Comma_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#semi_rule}.
	 * @param ctx the parse tree
	 */
	void enterSemi_rule(PPParser.Semi_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#semi_rule}.
	 * @param ctx the parse tree
	 */
	void exitSemi_rule(PPParser.Semi_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#colon_rule}.
	 * @param ctx the parse tree
	 */
	void enterColon_rule(PPParser.Colon_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#colon_rule}.
	 * @param ctx the parse tree
	 */
	void exitColon_rule(PPParser.Colon_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#hash_rule}.
	 * @param ctx the parse tree
	 */
	void enterHash_rule(PPParser.Hash_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#hash_rule}.
	 * @param ctx the parse tree
	 */
	void exitHash_rule(PPParser.Hash_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#lparen_rule}.
	 * @param ctx the parse tree
	 */
	void enterLparen_rule(PPParser.Lparen_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#lparen_rule}.
	 * @param ctx the parse tree
	 */
	void exitLparen_rule(PPParser.Lparen_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#rparen_rule}.
	 * @param ctx the parse tree
	 */
	void enterRparen_rule(PPParser.Rparen_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#rparen_rule}.
	 * @param ctx the parse tree
	 */
	void exitRparen_rule(PPParser.Rparen_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#dot_rule}.
	 * @param ctx the parse tree
	 */
	void enterDot_rule(PPParser.Dot_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#dot_rule}.
	 * @param ctx the parse tree
	 */
	void exitDot_rule(PPParser.Dot_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#lbrack_rule}.
	 * @param ctx the parse tree
	 */
	void enterLbrack_rule(PPParser.Lbrack_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#lbrack_rule}.
	 * @param ctx the parse tree
	 */
	void exitLbrack_rule(PPParser.Lbrack_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#rbrack_rule}.
	 * @param ctx the parse tree
	 */
	void enterRbrack_rule(PPParser.Rbrack_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#rbrack_rule}.
	 * @param ctx the parse tree
	 */
	void exitRbrack_rule(PPParser.Rbrack_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#lparenstar_rule}.
	 * @param ctx the parse tree
	 */
	void enterLparenstar_rule(PPParser.Lparenstar_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#lparenstar_rule}.
	 * @param ctx the parse tree
	 */
	void exitLparenstar_rule(PPParser.Lparenstar_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#starrparen_rule}.
	 * @param ctx the parse tree
	 */
	void enterStarrparen_rule(PPParser.Starrparen_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#starrparen_rule}.
	 * @param ctx the parse tree
	 */
	void exitStarrparen_rule(PPParser.Starrparen_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#assign_rule}.
	 * @param ctx the parse tree
	 */
	void enterAssign_rule(PPParser.Assign_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#assign_rule}.
	 * @param ctx the parse tree
	 */
	void exitAssign_rule(PPParser.Assign_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ppspace_rule}.
	 * @param ctx the parse tree
	 */
	void enterPpspace_rule(PPParser.Ppspace_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ppspace_rule}.
	 * @param ctx the parse tree
	 */
	void exitPpspace_rule(PPParser.Ppspace_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ppstring_rule}.
	 * @param ctx the parse tree
	 */
	void enterPpstring_rule(PPParser.Ppstring_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ppstring_rule}.
	 * @param ctx the parse tree
	 */
	void exitPpstring_rule(PPParser.Ppstring_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ppid_rule}.
	 * @param ctx the parse tree
	 */
	void enterPpid_rule(PPParser.Ppid_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ppid_rule}.
	 * @param ctx the parse tree
	 */
	void exitPpid_rule(PPParser.Ppid_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ppid_timescale_rule}.
	 * @param ctx the parse tree
	 */
	void enterPpid_timescale_rule(PPParser.Ppid_timescale_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ppid_timescale_rule}.
	 * @param ctx the parse tree
	 */
	void exitPpid_timescale_rule(PPParser.Ppid_timescale_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#pplparen_rule}.
	 * @param ctx the parse tree
	 */
	void enterPplparen_rule(PPParser.Pplparen_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#pplparen_rule}.
	 * @param ctx the parse tree
	 */
	void exitPplparen_rule(PPParser.Pplparen_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#pprparen_rule}.
	 * @param ctx the parse tree
	 */
	void enterPprparen_rule(PPParser.Pprparen_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#pprparen_rule}.
	 * @param ctx the parse tree
	 */
	void exitPprparen_rule(PPParser.Pprparen_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ppcomma_rule}.
	 * @param ctx the parse tree
	 */
	void enterPpcomma_rule(PPParser.Ppcomma_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ppcomma_rule}.
	 * @param ctx the parse tree
	 */
	void exitPpcomma_rule(PPParser.Ppcomma_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#tick_id_rule}.
	 * @param ctx the parse tree
	 */
	void enterTick_id_rule(PPParser.Tick_id_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#tick_id_rule}.
	 * @param ctx the parse tree
	 */
	void exitTick_id_rule(PPParser.Tick_id_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#id_with_number_rule}.
	 * @param ctx the parse tree
	 */
	void enterId_with_number_rule(PPParser.Id_with_number_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#id_with_number_rule}.
	 * @param ctx the parse tree
	 */
	void exitId_with_number_rule(PPParser.Id_with_number_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#ports_token}.
	 * @param ctx the parse tree
	 */
	void enterPorts_token(PPParser.Ports_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#ports_token}.
	 * @param ctx the parse tree
	 */
	void exitPorts_token(PPParser.Ports_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(PPParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(PPParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#pptoken}.
	 * @param ctx the parse tree
	 */
	void enterPptoken(PPParser.PptokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#pptoken}.
	 * @param ctx the parse tree
	 */
	void exitPptoken(PPParser.PptokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PPParser#define_text}.
	 * @param ctx the parse tree
	 */
	void enterDefine_text(PPParser.Define_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PPParser#define_text}.
	 * @param ctx the parse tree
	 */
	void exitDefine_text(PPParser.Define_textContext ctx);
}