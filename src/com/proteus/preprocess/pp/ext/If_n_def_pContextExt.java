package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.If_n_def_pContext;

public class If_n_def_pContextExt extends AbstractBaseExt{

	@Getter private If_n_def_pContext ctx;

	public If_n_def_pContextExt(If_n_def_pContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).if_n_def_p());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof If_n_def_pContext){
				this.ctx = (If_n_def_pContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+If_n_def_pContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
