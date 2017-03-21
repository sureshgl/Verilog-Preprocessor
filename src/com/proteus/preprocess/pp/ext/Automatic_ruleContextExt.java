package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Automatic_ruleContext;

public class Automatic_ruleContextExt extends AbstractBaseExt{

	@Getter private Automatic_ruleContext ctx;

	public Automatic_ruleContextExt(Automatic_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).automatic_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Automatic_ruleContext){
				this.ctx = (Automatic_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Automatic_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
