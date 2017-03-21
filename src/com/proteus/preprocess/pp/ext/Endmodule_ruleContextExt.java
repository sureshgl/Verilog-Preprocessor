package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Endmodule_ruleContext;

public class Endmodule_ruleContextExt extends AbstractBaseExt{

	@Getter private Endmodule_ruleContext ctx;

	public Endmodule_ruleContextExt(Endmodule_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endmodule_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Endmodule_ruleContext){
				this.ctx = (Endmodule_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Endmodule_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
}
