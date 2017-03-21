package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Ppcomma_ruleContext;

public class Ppcomma_ruleContextExt extends AbstractBaseExt{

	@Getter private Ppcomma_ruleContext ctx;

	public Ppcomma_ruleContextExt(Ppcomma_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ppcomma_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ppcomma_ruleContext){
				this.ctx = (Ppcomma_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ppcomma_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
