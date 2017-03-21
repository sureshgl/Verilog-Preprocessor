package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Lbrack_ruleContext;

public class Lbrack_ruleContextExt extends AbstractBaseExt{

	@Getter private Lbrack_ruleContext ctx;

	public Lbrack_ruleContextExt(Lbrack_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).lbrack_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Lbrack_ruleContext){
				this.ctx = (Lbrack_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Lbrack_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
