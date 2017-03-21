package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Pplparen_ruleContext;

public class Pplparen_ruleContextExt extends AbstractBaseExt{

	@Getter private Pplparen_ruleContext ctx;

	public Pplparen_ruleContextExt(Pplparen_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pplparen_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pplparen_ruleContext){
				this.ctx = (Pplparen_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pplparen_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
