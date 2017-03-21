package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Pprparen_ruleContext;

public class Pprparen_ruleContextExt extends AbstractBaseExt{

	@Getter private Pprparen_ruleContext ctx;

	public Pprparen_ruleContextExt(Pprparen_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pprparen_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pprparen_ruleContext){
				this.ctx = (Pprparen_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pprparen_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
