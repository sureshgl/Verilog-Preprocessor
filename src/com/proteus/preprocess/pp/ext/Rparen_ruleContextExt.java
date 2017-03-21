package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Rparen_ruleContext;

public class Rparen_ruleContextExt extends AbstractBaseExt{

	@Getter private Rparen_ruleContext ctx;

	public Rparen_ruleContextExt(Rparen_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).rparen_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Rparen_ruleContext){
				this.ctx = (Rparen_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Rparen_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
