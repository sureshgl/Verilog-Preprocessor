package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.pp.gen.PPParser.Undef_rContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Undef_rContextExt extends AbstractBaseExt{

	@Getter private Undef_rContext ctx;

	public Undef_rContextExt(Undef_rContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).undef_r());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Undef_rContext){
				this.ctx = (Undef_rContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Undef_rContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			MacroKey macroKey = new MacroKey();
			macroKey.setMacroName(ctx.id().ID().getText());
			macroKey.setNoOfParameters(0);
			prs.getMacroMap().remove(macroKey);
		}
		addToContexts(null);
		return null;
	}
}
