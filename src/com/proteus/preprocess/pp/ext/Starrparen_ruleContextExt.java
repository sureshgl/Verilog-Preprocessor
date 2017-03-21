package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Starrparen_ruleContext;

public class Starrparen_ruleContextExt extends AbstractBaseExt{

	@Getter private Starrparen_ruleContext ctx;

	public Starrparen_ruleContextExt(Starrparen_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).starrparen_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Starrparen_ruleContext){
				this.ctx = (Starrparen_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Starrparen_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
