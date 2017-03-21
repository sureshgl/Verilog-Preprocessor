package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Rbrack_ruleContext;

public class Rbrack_ruleContextExt extends AbstractBaseExt{

	@Getter private Rbrack_ruleContext ctx;

	public Rbrack_ruleContextExt(Rbrack_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).rbrack_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Rbrack_ruleContext){
				this.ctx = (Rbrack_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Rbrack_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
