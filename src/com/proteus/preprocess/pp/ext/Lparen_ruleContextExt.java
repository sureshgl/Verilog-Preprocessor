package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Lparen_ruleContext;

public class Lparen_ruleContextExt extends AbstractBaseExt{

	@Getter private Lparen_ruleContext ctx;

	public Lparen_ruleContextExt(Lparen_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).lparen_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Lparen_ruleContext){
				this.ctx = (Lparen_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Lparen_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
