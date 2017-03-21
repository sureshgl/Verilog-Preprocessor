package com.proteus.preprocess.pp;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.preprocess.pp.ext.*;
import com.proteus.preprocess.pp.gen.PPParser;
import com.proteus.preprocess.pp.gen.PPParserBaseVisitor;
public class PopulateExtendedContextVisitor extends PPParserBaseVisitor<ParserRuleContext>{
	@Override public org.antlr.v4.runtime.ParserRuleContext visitStart(PPParser.StartContext ctx) {
		super.visitStart(ctx);
		ctx.extendedContext = new StartContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_declaration(PPParser.Module_declarationContext ctx) {
		super.visitModule_declaration(ctx);
		ctx.extendedContext = new Module_declarationContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_header(PPParser.Module_headerContext ctx) {
		super.visitModule_header(ctx);
		ctx.extendedContext = new Module_headerContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLifetime(PPParser.LifetimeContext ctx) {
		super.visitLifetime(ctx);
		ctx.extendedContext = new LifetimeContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_keyword(PPParser.Module_keywordContext ctx) {
		super.visitModule_keyword(ctx);
		ctx.extendedContext = new Module_keywordContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAtext(PPParser.AtextContext ctx) {
		super.visitAtext(ctx);
		ctx.extendedContext = new AtextContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitText(PPParser.TextContext ctx) {
		super.visitText(ctx);
		ctx.extendedContext = new TextContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNpp_statements(PPParser.Npp_statementsContext ctx) {
		super.visitNpp_statements(ctx);
		ctx.extendedContext = new Npp_statementsContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNpp_statement(PPParser.Npp_statementContext ctx) {
		super.visitNpp_statement(ctx);
		ctx.extendedContext = new Npp_statementContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_instantiation(PPParser.Module_instantiationContext ctx) {
		super.visitModule_instantiation(ctx);
		ctx.extendedContext = new Module_instantiationContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_value_assignment(PPParser.Parameter_value_assignmentContext ctx) {
		super.visitParameter_value_assignment(ctx);
		ctx.extendedContext = new Parameter_value_assignmentContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_parameter_assignments(PPParser.List_of_parameter_assignmentsContext ctx) {
		super.visitList_of_parameter_assignments(ctx);
		ctx.extendedContext = new List_of_parameter_assignmentsContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMintypmax_expression(PPParser.Mintypmax_expressionContext ctx) {
		super.visitMintypmax_expression(ctx);
		ctx.extendedContext = new Mintypmax_expressionContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_parameter_assignment(PPParser.Named_parameter_assignmentContext ctx) {
		super.visitNamed_parameter_assignment(ctx);
		ctx.extendedContext = new Named_parameter_assignmentContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_instance(PPParser.Hierarchical_instanceContext ctx) {
		super.visitHierarchical_instance(ctx);
		ctx.extendedContext = new Hierarchical_instanceContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitName_of_instance(PPParser.Name_of_instanceContext ctx) {
		super.visitName_of_instance(ctx);
		ctx.extendedContext = new Name_of_instanceContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_connections(PPParser.List_of_port_connectionsContext ctx) {
		super.visitList_of_port_connections(ctx);
		ctx.extendedContext = new List_of_port_connectionsContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrdered_port_connection(PPParser.Ordered_port_connectionContext ctx) {
		super.visitOrdered_port_connection(ctx);
		ctx.extendedContext = new Ordered_port_connectionContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPorts_atext(PPParser.Ports_atextContext ctx) {
		super.visitPorts_atext(ctx);
		ctx.extendedContext = new Ports_atextContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_port_connection(PPParser.Named_port_connectionContext ctx) {
		super.visitNamed_port_connection(ctx);
		ctx.extendedContext = new Named_port_connectionContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttribute_instance(PPParser.Attribute_instanceContext ctx) {
		super.visitAttribute_instance(ctx);
		ctx.extendedContext = new Attribute_instanceContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttr_spec(PPParser.Attr_specContext ctx) {
		super.visitAttr_spec(ctx);
		ctx.extendedContext = new Attr_specContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPp_statement(PPParser.Pp_statementContext ctx) {
		super.visitPp_statement(ctx);
		ctx.extendedContext = new Pp_statementContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement(PPParser.Conditional_statementContext ctx) {
		super.visitConditional_statement(ctx);
		ctx.extendedContext = new Conditional_statementContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_text(PPParser.Conditional_statement_textContext ctx) {
		super.visitConditional_statement_text(ctx);
		ctx.extendedContext = new Conditional_statement_textContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_part1(PPParser.Conditional_statement_part1Context ctx) {
		super.visitConditional_statement_part1(ctx);
		ctx.extendedContext = new Conditional_statement_part1ContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_part1_else_id_statement_or_null(PPParser.Conditional_statement_part1_else_id_statement_or_nullContext ctx) {
		super.visitConditional_statement_part1_else_id_statement_or_null(ctx);
		ctx.extendedContext = new Conditional_statement_part1_else_id_statement_or_nullContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_part2(PPParser.Conditional_statement_part2Context ctx) {
		super.visitConditional_statement_part2(ctx);
		ctx.extendedContext = new Conditional_statement_part2ContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIf_id(PPParser.If_idContext ctx) {
		super.visitIf_id(ctx);
		ctx.extendedContext = new If_idContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_r(PPParser.Define_rContext ctx) {
		super.visitDefine_r(ctx);
		ctx.extendedContext = new Define_rContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUndef_r(PPParser.Undef_rContext ctx) {
		super.visitUndef_r(ctx);
		ctx.extendedContext = new Undef_rContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInclude_r(PPParser.Include_rContext ctx) {
		super.visitInclude_r(ctx);
		ctx.extendedContext = new Include_rContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInclude_r_def(PPParser.Include_r_defContext ctx) {
		super.visitInclude_r_def(ctx);
		ctx.extendedContext = new Include_r_defContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFile_name(PPParser.File_nameContext ctx) {
		super.visitFile_name(ctx);
		ctx.extendedContext = new File_nameContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimescale_r(PPParser.Timescale_rContext ctx) {
		super.visitTimescale_r(ctx);
		ctx.extendedContext = new Timescale_rContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_id(PPParser.Define_idContext ctx) {
		super.visitDefine_id(ctx);
		ctx.extendedContext = new Define_idContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitResetall_r(PPParser.Resetall_rContext ctx) {
		super.visitResetall_r(ctx);
		ctx.extendedContext = new Resetall_rContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTick_token(PPParser.Tick_tokenContext ctx) {
		super.visitTick_token(ctx);
		ctx.extendedContext = new Tick_tokenContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTick_token_id(PPParser.Tick_token_idContext ctx) {
		super.visitTick_token_id(ctx);
		ctx.extendedContext = new Tick_token_idContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIf_p(PPParser.If_pContext ctx) {
		super.visitIf_p(ctx);
		ctx.extendedContext = new If_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIf_n_def_p(PPParser.If_n_def_pContext ctx) {
		super.visitIf_n_def_p(ctx);
		ctx.extendedContext = new If_n_def_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitElseif_p(PPParser.Elseif_pContext ctx) {
		super.visitElseif_p(ctx);
		ctx.extendedContext = new Elseif_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitElse_p(PPParser.Else_pContext ctx) {
		super.visitElse_p(ctx);
		ctx.extendedContext = new Else_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndif_p(PPParser.Endif_pContext ctx) {
		super.visitEndif_p(ctx);
		ctx.extendedContext = new Endif_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_p(PPParser.Define_pContext ctx) {
		super.visitDefine_p(ctx);
		ctx.extendedContext = new Define_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUndef_p(PPParser.Undef_pContext ctx) {
		super.visitUndef_p(ctx);
		ctx.extendedContext = new Undef_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitResetall_p(PPParser.Resetall_pContext ctx) {
		super.visitResetall_p(ctx);
		ctx.extendedContext = new Resetall_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInclude_p(PPParser.Include_pContext ctx) {
		super.visitInclude_p(ctx);
		ctx.extendedContext = new Include_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimescale_p(PPParser.Timescale_pContext ctx) {
		super.visitTimescale_p(ctx);
		ctx.extendedContext = new Timescale_pContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitId(PPParser.IdContext ctx) {
		super.visitId(ctx);
		ctx.extendedContext = new IdContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNl(PPParser.NlContext ctx) {
		super.visitNl(ctx);
		ctx.extendedContext = new NlContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpnl(PPParser.PpnlContext ctx) {
		super.visitPpnl(ctx);
		ctx.extendedContext = new PpnlContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExtern_rule(PPParser.Extern_ruleContext ctx) {
		super.visitExtern_rule(ctx);
		ctx.extendedContext = new Extern_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStatic_rule(PPParser.Static_ruleContext ctx) {
		super.visitStatic_rule(ctx);
		ctx.extendedContext = new Static_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAutomatic_rule(PPParser.Automatic_ruleContext ctx) {
		super.visitAutomatic_rule(ctx);
		ctx.extendedContext = new Automatic_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_rule(PPParser.Module_ruleContext ctx) {
		super.visitModule_rule(ctx);
		ctx.extendedContext = new Module_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMacromodule_rule(PPParser.Macromodule_ruleContext ctx) {
		super.visitMacromodule_rule(ctx);
		ctx.extendedContext = new Macromodule_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndmodule_rule(PPParser.Endmodule_ruleContext ctx) {
		super.visitEndmodule_rule(ctx);
		ctx.extendedContext = new Endmodule_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitComma_rule(PPParser.Comma_ruleContext ctx) {
		super.visitComma_rule(ctx);
		ctx.extendedContext = new Comma_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSemi_rule(PPParser.Semi_ruleContext ctx) {
		super.visitSemi_rule(ctx);
		ctx.extendedContext = new Semi_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitColon_rule(PPParser.Colon_ruleContext ctx) {
		super.visitColon_rule(ctx);
		ctx.extendedContext = new Colon_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHash_rule(PPParser.Hash_ruleContext ctx) {
		super.visitHash_rule(ctx);
		ctx.extendedContext = new Hash_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLparen_rule(PPParser.Lparen_ruleContext ctx) {
		super.visitLparen_rule(ctx);
		ctx.extendedContext = new Lparen_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRparen_rule(PPParser.Rparen_ruleContext ctx) {
		super.visitRparen_rule(ctx);
		ctx.extendedContext = new Rparen_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDot_rule(PPParser.Dot_ruleContext ctx) {
		super.visitDot_rule(ctx);
		ctx.extendedContext = new Dot_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLbrack_rule(PPParser.Lbrack_ruleContext ctx) {
		super.visitLbrack_rule(ctx);
		ctx.extendedContext = new Lbrack_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRbrack_rule(PPParser.Rbrack_ruleContext ctx) {
		super.visitRbrack_rule(ctx);
		ctx.extendedContext = new Rbrack_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLparenstar_rule(PPParser.Lparenstar_ruleContext ctx) {
		super.visitLparenstar_rule(ctx);
		ctx.extendedContext = new Lparenstar_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStarrparen_rule(PPParser.Starrparen_ruleContext ctx) {
		super.visitStarrparen_rule(ctx);
		ctx.extendedContext = new Starrparen_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssign_rule(PPParser.Assign_ruleContext ctx) {
		super.visitAssign_rule(ctx);
		ctx.extendedContext = new Assign_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpspace_rule(PPParser.Ppspace_ruleContext ctx) {
		super.visitPpspace_rule(ctx);
		ctx.extendedContext = new Ppspace_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpstring_rule(PPParser.Ppstring_ruleContext ctx) {
		super.visitPpstring_rule(ctx);
		ctx.extendedContext = new Ppstring_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpid_rule(PPParser.Ppid_ruleContext ctx) {
		super.visitPpid_rule(ctx);
		ctx.extendedContext = new Ppid_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpid_timescale_rule(PPParser.Ppid_timescale_ruleContext ctx) {
		super.visitPpid_timescale_rule(ctx);
		ctx.extendedContext = new Ppid_timescale_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPplparen_rule(PPParser.Pplparen_ruleContext ctx) {
		super.visitPplparen_rule(ctx);
		ctx.extendedContext = new Pplparen_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPprparen_rule(PPParser.Pprparen_ruleContext ctx) {
		super.visitPprparen_rule(ctx);
		ctx.extendedContext = new Pprparen_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpcomma_rule(PPParser.Ppcomma_ruleContext ctx) {
		super.visitPpcomma_rule(ctx);
		ctx.extendedContext = new Ppcomma_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTick_id_rule(PPParser.Tick_id_ruleContext ctx) {
		super.visitTick_id_rule(ctx);
		ctx.extendedContext = new Tick_id_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitId_with_number_rule(PPParser.Id_with_number_ruleContext ctx) {
		super.visitId_with_number_rule(ctx);
		ctx.extendedContext = new Id_with_number_ruleContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPorts_token(PPParser.Ports_tokenContext ctx) {
		super.visitPorts_token(ctx);
		ctx.extendedContext = new Ports_tokenContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitToken(PPParser.TokenContext ctx) {
		super.visitToken(ctx);
		ctx.extendedContext = new TokenContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPptoken(PPParser.PptokenContext ctx) {
		super.visitPptoken(ctx);
		ctx.extendedContext = new PptokenContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_text(PPParser.Define_textContext ctx) {
		super.visitDefine_text(ctx);
		ctx.extendedContext = new Define_textContextExt(ctx);
		return ctx;
	}

}
