package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Ppstring_ruleContext;

public class Ppstring_ruleContextExt extends AbstractBaseExt{

	@Getter private Ppstring_ruleContext ctx;

	public Ppstring_ruleContextExt(Ppstring_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ppstring_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ppstring_ruleContext){
				this.ctx = (Ppstring_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ppstring_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
