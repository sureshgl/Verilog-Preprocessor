package com.proteus.preprocess.pp;

import org.antlr.v4.runtime.ParserRuleContext;
import com.proteus.preprocess.pp.gen.PPParser;
import com.proteus.preprocess.pp.gen.PPParserBaseVisitor;
import com.proteus.preprocess.pp.ext.*;

public class SetExtendedContextVisitor extends PPParserBaseVisitor<ParserRuleContext>{
	private AbstractBaseExt extendedContext;
	public SetExtendedContextVisitor( AbstractBaseExt extendedCtx){
		this.extendedContext = extendedCtx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStart(PPParser.StartContext ctx) {
		if ( extendedContext != null && extendedContext instanceof StartContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((StartContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_declaration(PPParser.Module_declarationContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_header(PPParser.Module_headerContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_headerContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_headerContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLifetime(PPParser.LifetimeContext ctx) {
		if ( extendedContext != null && extendedContext instanceof LifetimeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((LifetimeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_keyword(PPParser.Module_keywordContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_keywordContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_keywordContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAtext(PPParser.AtextContext ctx) {
		if ( extendedContext != null && extendedContext instanceof AtextContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((AtextContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitText(PPParser.TextContext ctx) {
		if ( extendedContext != null && extendedContext instanceof TextContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TextContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNpp_statements(PPParser.Npp_statementsContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Npp_statementsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Npp_statementsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNpp_statement(PPParser.Npp_statementContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Npp_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Npp_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_instantiation(PPParser.Module_instantiationContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitParameter_value_assignment(PPParser.Parameter_value_assignmentContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Parameter_value_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Parameter_value_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_parameter_assignments(PPParser.List_of_parameter_assignmentsContext ctx) {
		if ( extendedContext != null && extendedContext instanceof List_of_parameter_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_parameter_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMintypmax_expression(PPParser.Mintypmax_expressionContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Mintypmax_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Mintypmax_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_parameter_assignment(PPParser.Named_parameter_assignmentContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Named_parameter_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_parameter_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_instance(PPParser.Hierarchical_instanceContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Hierarchical_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitName_of_instance(PPParser.Name_of_instanceContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Name_of_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Name_of_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_connections(PPParser.List_of_port_connectionsContext ctx) {
		if ( extendedContext != null && extendedContext instanceof List_of_port_connectionsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_connectionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitOrdered_port_connection(PPParser.Ordered_port_connectionContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ordered_port_connectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ordered_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPorts_atext(PPParser.Ports_atextContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ports_atextContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ports_atextContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_port_connection(PPParser.Named_port_connectionContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Named_port_connectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttribute_instance(PPParser.Attribute_instanceContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Attribute_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attribute_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAttr_spec(PPParser.Attr_specContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Attr_specContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Attr_specContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPp_statement(PPParser.Pp_statementContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Pp_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pp_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement(PPParser.Conditional_statementContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Conditional_statementContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_statementContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_text(PPParser.Conditional_statement_textContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Conditional_statement_textContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_statement_textContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_part1(PPParser.Conditional_statement_part1Context ctx) {
		if ( extendedContext != null && extendedContext instanceof Conditional_statement_part1ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_statement_part1ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_part1_else_id_statement_or_null(PPParser.Conditional_statement_part1_else_id_statement_or_nullContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Conditional_statement_part1_else_id_statement_or_nullContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_statement_part1_else_id_statement_or_nullContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConditional_statement_part2(PPParser.Conditional_statement_part2Context ctx) {
		if ( extendedContext != null && extendedContext instanceof Conditional_statement_part2ContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Conditional_statement_part2ContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIf_id(PPParser.If_idContext ctx) {
		if ( extendedContext != null && extendedContext instanceof If_idContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((If_idContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_r(PPParser.Define_rContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Define_rContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Define_rContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUndef_r(PPParser.Undef_rContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Undef_rContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Undef_rContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInclude_r(PPParser.Include_rContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Include_rContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Include_rContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInclude_r_def(PPParser.Include_r_defContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Include_r_defContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Include_r_defContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitFile_name(PPParser.File_nameContext ctx) {
		if ( extendedContext != null && extendedContext instanceof File_nameContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((File_nameContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimescale_r(PPParser.Timescale_rContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Timescale_rContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timescale_rContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_id(PPParser.Define_idContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Define_idContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Define_idContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitResetall_r(PPParser.Resetall_rContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Resetall_rContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Resetall_rContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTick_token(PPParser.Tick_tokenContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Tick_tokenContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tick_tokenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTick_token_id(PPParser.Tick_token_idContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Tick_token_idContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tick_token_idContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIf_p(PPParser.If_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof If_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((If_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIf_n_def_p(PPParser.If_n_def_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof If_n_def_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((If_n_def_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitElseif_p(PPParser.Elseif_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Elseif_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Elseif_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitElse_p(PPParser.Else_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Else_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Else_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndif_p(PPParser.Endif_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Endif_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Endif_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_p(PPParser.Define_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Define_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Define_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitUndef_p(PPParser.Undef_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Undef_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Undef_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitResetall_p(PPParser.Resetall_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Resetall_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Resetall_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitInclude_p(PPParser.Include_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Include_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Include_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTimescale_p(PPParser.Timescale_pContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Timescale_pContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Timescale_pContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitId(PPParser.IdContext ctx) {
		if ( extendedContext != null && extendedContext instanceof IdContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IdContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNl(PPParser.NlContext ctx) {
		if ( extendedContext != null && extendedContext instanceof NlContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpnl(PPParser.PpnlContext ctx) {
		if ( extendedContext != null && extendedContext instanceof PpnlContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PpnlContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExtern_rule(PPParser.Extern_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Extern_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Extern_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStatic_rule(PPParser.Static_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Static_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Static_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAutomatic_rule(PPParser.Automatic_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Automatic_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Automatic_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_rule(PPParser.Module_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMacromodule_rule(PPParser.Macromodule_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Macromodule_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Macromodule_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEndmodule_rule(PPParser.Endmodule_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Endmodule_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Endmodule_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitComma_rule(PPParser.Comma_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Comma_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Comma_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSemi_rule(PPParser.Semi_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Semi_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Semi_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitColon_rule(PPParser.Colon_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Colon_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Colon_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHash_rule(PPParser.Hash_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Hash_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hash_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLparen_rule(PPParser.Lparen_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Lparen_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Lparen_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRparen_rule(PPParser.Rparen_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Rparen_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rparen_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDot_rule(PPParser.Dot_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Dot_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Dot_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLbrack_rule(PPParser.Lbrack_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Lbrack_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Lbrack_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRbrack_rule(PPParser.Rbrack_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Rbrack_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Rbrack_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitLparenstar_rule(PPParser.Lparenstar_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Lparenstar_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Lparenstar_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitStarrparen_rule(PPParser.Starrparen_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Starrparen_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Starrparen_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitAssign_rule(PPParser.Assign_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Assign_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Assign_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpspace_rule(PPParser.Ppspace_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ppspace_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ppspace_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpstring_rule(PPParser.Ppstring_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ppstring_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ppstring_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpid_rule(PPParser.Ppid_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ppid_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ppid_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpid_timescale_rule(PPParser.Ppid_timescale_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ppid_timescale_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ppid_timescale_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPplparen_rule(PPParser.Pplparen_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Pplparen_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pplparen_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPprparen_rule(PPParser.Pprparen_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Pprparen_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Pprparen_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPpcomma_rule(PPParser.Ppcomma_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ppcomma_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ppcomma_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitTick_id_rule(PPParser.Tick_id_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Tick_id_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Tick_id_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitId_with_number_rule(PPParser.Id_with_number_ruleContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Id_with_number_ruleContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Id_with_number_ruleContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPorts_token(PPParser.Ports_tokenContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Ports_tokenContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Ports_tokenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitToken(PPParser.TokenContext ctx) {
		if ( extendedContext != null && extendedContext instanceof TokenContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((TokenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPptoken(PPParser.PptokenContext ctx) {
		if ( extendedContext != null && extendedContext instanceof PptokenContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PptokenContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDefine_text(PPParser.Define_textContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Define_textContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Define_textContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

}
