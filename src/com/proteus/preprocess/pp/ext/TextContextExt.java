package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.pp.gen.PPParser.AtextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class TextContextExt extends AbstractBaseExt{

	@Getter private TextContext ctx;

	public TextContextExt(TextContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).text());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof TextContext){
				this.ctx = (TextContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+TextContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	public TextContext preprocessing(PreprocessRunnerSession proteusRunnerSession){
		ParserRuleContext ctx = getContext();
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			for(ParseTree childCtx : ctx.children){
				if(!(childCtx instanceof TerminalNode) && childCtx.getText().length() >0){
					if(!(childCtx instanceof AtextContext)){
						TextContext textContext = getExtendedContextVisitor().visit(childCtx).preprocessing(proteusRunnerSession);
						if ( textContext != null) {
							addToContexts(textContext);
						}
					}
				}
			}	
		}
		return null;
	}
}
