package com.proteus.preprocess.pp;

import com.proteus.preprocess.pp.ext.AbstractBaseExt;
import com.proteus.preprocess.pp.gen.PPParserBaseVisitor;
import com.proteus.preprocess.pp.gen.PPParser;

public class ExtendedContextVisitor extends PPParserBaseVisitor<AbstractBaseExt>{
	@Override public AbstractBaseExt visitStart(PPParser.StartContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_declaration(PPParser.Module_declarationContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_header(PPParser.Module_headerContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitLifetime(PPParser.LifetimeContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_keyword(PPParser.Module_keywordContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitAtext(PPParser.AtextContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitText(PPParser.TextContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNpp_statements(PPParser.Npp_statementsContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNpp_statement(PPParser.Npp_statementContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_instantiation(PPParser.Module_instantiationContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitParameter_value_assignment(PPParser.Parameter_value_assignmentContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitList_of_parameter_assignments(PPParser.List_of_parameter_assignmentsContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitMintypmax_expression(PPParser.Mintypmax_expressionContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNamed_parameter_assignment(PPParser.Named_parameter_assignmentContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitHierarchical_instance(PPParser.Hierarchical_instanceContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitName_of_instance(PPParser.Name_of_instanceContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitList_of_port_connections(PPParser.List_of_port_connectionsContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitOrdered_port_connection(PPParser.Ordered_port_connectionContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPorts_atext(PPParser.Ports_atextContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNamed_port_connection(PPParser.Named_port_connectionContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitAttribute_instance(PPParser.Attribute_instanceContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitAttr_spec(PPParser.Attr_specContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPp_statement(PPParser.Pp_statementContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitConditional_statement(PPParser.Conditional_statementContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitConditional_statement_text(PPParser.Conditional_statement_textContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitConditional_statement_part1(PPParser.Conditional_statement_part1Context ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitConditional_statement_part1_else_id_statement_or_null(PPParser.Conditional_statement_part1_else_id_statement_or_nullContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitConditional_statement_part2(PPParser.Conditional_statement_part2Context ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitIf_id(PPParser.If_idContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitDefine_r(PPParser.Define_rContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitUndef_r(PPParser.Undef_rContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitInclude_r(PPParser.Include_rContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitInclude_r_def(PPParser.Include_r_defContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitFile_name(PPParser.File_nameContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitTimescale_r(PPParser.Timescale_rContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitDefine_id(PPParser.Define_idContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitResetall_r(PPParser.Resetall_rContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitTick_token(PPParser.Tick_tokenContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitTick_token_id(PPParser.Tick_token_idContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitIf_p(PPParser.If_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitIf_n_def_p(PPParser.If_n_def_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitElseif_p(PPParser.Elseif_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitElse_p(PPParser.Else_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitEndif_p(PPParser.Endif_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitDefine_p(PPParser.Define_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitUndef_p(PPParser.Undef_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitResetall_p(PPParser.Resetall_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitInclude_p(PPParser.Include_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitTimescale_p(PPParser.Timescale_pContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitId(PPParser.IdContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNl(PPParser.NlContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPpnl(PPParser.PpnlContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitExtern_rule(PPParser.Extern_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitStatic_rule(PPParser.Static_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitAutomatic_rule(PPParser.Automatic_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_rule(PPParser.Module_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitMacromodule_rule(PPParser.Macromodule_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitEndmodule_rule(PPParser.Endmodule_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitComma_rule(PPParser.Comma_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitSemi_rule(PPParser.Semi_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitColon_rule(PPParser.Colon_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitHash_rule(PPParser.Hash_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitLparen_rule(PPParser.Lparen_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitRparen_rule(PPParser.Rparen_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitDot_rule(PPParser.Dot_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitLbrack_rule(PPParser.Lbrack_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitRbrack_rule(PPParser.Rbrack_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitLparenstar_rule(PPParser.Lparenstar_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitStarrparen_rule(PPParser.Starrparen_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitAssign_rule(PPParser.Assign_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPpspace_rule(PPParser.Ppspace_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPpstring_rule(PPParser.Ppstring_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPpid_rule(PPParser.Ppid_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPpid_timescale_rule(PPParser.Ppid_timescale_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPplparen_rule(PPParser.Pplparen_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPprparen_rule(PPParser.Pprparen_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPpcomma_rule(PPParser.Ppcomma_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitTick_id_rule(PPParser.Tick_id_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitId_with_number_rule(PPParser.Id_with_number_ruleContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPorts_token(PPParser.Ports_tokenContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitToken(PPParser.TokenContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPptoken(PPParser.PptokenContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitDefine_text(PPParser.Define_textContext ctx) {
		return ctx.extendedContext;
	}

}
