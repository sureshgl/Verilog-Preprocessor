package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Conditional_statement_textContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Conditional_statement_textContextExt extends AbstractBaseExt{

	@Getter private Conditional_statement_textContext ctx;

	public Conditional_statement_textContextExt(Conditional_statement_textContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).conditional_statement_text());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Conditional_statement_textContext){
				this.ctx = (Conditional_statement_textContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Conditional_statement_textContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	public TextContext preprocessing(PreprocessRunnerSession proteusRunnerSession){
		TextContext textContext = null;
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					textContext = getExtendedContextVisitor().visit(childCtx).preprocessing(proteusRunnerSession);
				}
			}
            if(!ctx.extendedContext.getFormattedText().equals("")){
                textContext =  (TextContext) new PopulateExtendedContextVisitor().visit(getPrimeParser(ctx.extendedContext.getFormattedText()).text());
            }
        }	
		return textContext;
	}

}
