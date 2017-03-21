package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Ppspace_ruleContext;

public class Ppspace_ruleContextExt extends AbstractBaseExt{

	@Getter private Ppspace_ruleContext ctx;

	public Ppspace_ruleContextExt(Ppspace_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ppspace_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ppspace_ruleContext){
				this.ctx = (Ppspace_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ppspace_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
