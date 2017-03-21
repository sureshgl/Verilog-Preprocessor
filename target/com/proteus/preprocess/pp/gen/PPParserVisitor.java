// Generated from PPParser.g4 by ANTLR 4.5
package com.proteus.preprocess.pp.gen;

        import com.proteus.preprocess.pp.ext.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PPParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PPParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PPParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#module_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration(PPParser.Module_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#module_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_header(PPParser.Module_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#lifetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLifetime(PPParser.LifetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#module_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_keyword(PPParser.Module_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#atext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtext(PPParser.AtextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(PPParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#npp_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNpp_statements(PPParser.Npp_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#npp_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNpp_statement(PPParser.Npp_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#module_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instantiation(PPParser.Module_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_value_assignment(PPParser.Parameter_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_parameter_assignments(PPParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMintypmax_expression(PPParser.Mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_parameter_assignment(PPParser.Named_parameter_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#hierarchical_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_instance(PPParser.Hierarchical_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#name_of_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_of_instance(PPParser.Name_of_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_connections(PPParser.List_of_port_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_port_connection(PPParser.Ordered_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ports_atext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPorts_atext(PPParser.Ports_atextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#named_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_port_connection(PPParser.Named_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#attribute_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_instance(PPParser.Attribute_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#attr_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_spec(PPParser.Attr_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#pp_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPp_statement(PPParser.Pp_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(PPParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#conditional_statement_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement_text(PPParser.Conditional_statement_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#conditional_statement_part1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement_part1(PPParser.Conditional_statement_part1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#conditional_statement_part1_else_id_statement_or_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement_part1_else_id_statement_or_null(PPParser.Conditional_statement_part1_else_id_statement_or_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#conditional_statement_part2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement_part2(PPParser.Conditional_statement_part2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#if_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_id(PPParser.If_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#define_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_r(PPParser.Define_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#undef_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef_r(PPParser.Undef_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#include_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_r(PPParser.Include_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#include_r_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_r_def(PPParser.Include_r_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(PPParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#timescale_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimescale_r(PPParser.Timescale_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#define_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_id(PPParser.Define_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#resetall_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetall_r(PPParser.Resetall_rContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#tick_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTick_token(PPParser.Tick_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#tick_token_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTick_token_id(PPParser.Tick_token_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#if_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_p(PPParser.If_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#if_n_def_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_n_def_p(PPParser.If_n_def_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#elseif_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_p(PPParser.Elseif_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#else_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_p(PPParser.Else_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#endif_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif_p(PPParser.Endif_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#define_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_p(PPParser.Define_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#undef_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndef_p(PPParser.Undef_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#resetall_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetall_p(PPParser.Resetall_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#include_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_p(PPParser.Include_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#timescale_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimescale_p(PPParser.Timescale_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PPParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#nl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNl(PPParser.NlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ppnl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpnl(PPParser.PpnlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#extern_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_rule(PPParser.Extern_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#static_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_rule(PPParser.Static_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#automatic_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomatic_rule(PPParser.Automatic_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#module_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_rule(PPParser.Module_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#macromodule_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacromodule_rule(PPParser.Macromodule_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#endmodule_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndmodule_rule(PPParser.Endmodule_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#comma_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_rule(PPParser.Comma_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#semi_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi_rule(PPParser.Semi_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#colon_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_rule(PPParser.Colon_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#hash_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_rule(PPParser.Hash_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#lparen_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparen_rule(PPParser.Lparen_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#rparen_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRparen_rule(PPParser.Rparen_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#dot_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_rule(PPParser.Dot_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#lbrack_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbrack_rule(PPParser.Lbrack_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#rbrack_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbrack_rule(PPParser.Rbrack_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#lparenstar_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparenstar_rule(PPParser.Lparenstar_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#starrparen_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarrparen_rule(PPParser.Starrparen_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#assign_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_rule(PPParser.Assign_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ppspace_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpspace_rule(PPParser.Ppspace_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ppstring_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpstring_rule(PPParser.Ppstring_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ppid_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpid_rule(PPParser.Ppid_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ppid_timescale_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpid_timescale_rule(PPParser.Ppid_timescale_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#pplparen_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPplparen_rule(PPParser.Pplparen_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#pprparen_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPprparen_rule(PPParser.Pprparen_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ppcomma_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPpcomma_rule(PPParser.Ppcomma_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#tick_id_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTick_id_rule(PPParser.Tick_id_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#id_with_number_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_with_number_rule(PPParser.Id_with_number_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#ports_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPorts_token(PPParser.Ports_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(PPParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#pptoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPptoken(PPParser.PptokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PPParser#define_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_text(PPParser.Define_textContext ctx);
}