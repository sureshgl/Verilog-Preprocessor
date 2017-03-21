package com.proteus.preprocess.pp.ext;

import java.io.File;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Include_pContext;
import com.proteus.preprocess.pp.gen.PPParser.Include_r_defContext;
import com.proteus.preprocess.pp.gen.PPParser.StartContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.FileParser;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Include_r_defContextExt extends AbstractBaseExt{

	@Getter private Include_r_defContext ctx;

	public Include_r_defContextExt(Include_r_defContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).include_r_def());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Include_r_defContext){
				this.ctx = (Include_r_defContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Include_r_defContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		TextContext textContext = null;
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			if(ctx.getChild(0) instanceof Include_pContext){
				if(ctx.file_name()!=null && ctx.file_name().getText().length()>0){
					File f= new File(prs.getProcessingFile().getParent(), ctx.file_name().getText().substring(1, ctx.file_name().getText().length()-1));
					if(f.exists()){
						FileParser fp = new FileParser();
						StartContext sc = fp.getFileContent(f);
						sc.extendedContext.preprocessing(prs);
						textContext =  (TextContext) new PopulateExtendedContextVisitor().visit(getPrimeParser(sc.extendedContext.getFormattedText()).text());
					}else if(prs.getAllInputFilesInOrder().contains(ctx.file_name().getText().substring(1, ctx.file_name().getText().length()-1))){
						FileParser fp = new FileParser();
						for(File file : prs.getAllInputFilesInOrder()){
							if (file.getName().equals(ctx.file_name().getText().substring(1, ctx.file_name().getText().length()-1))) {
								StartContext sc = fp.getFileContent(file);
								sc.extendedContext.preprocessing(prs);
								textContext =  (TextContext) new PopulateExtendedContextVisitor().visit(getPrimeParser(sc.extendedContext.getFormattedText()).text());
							}
						}
					}else{
						logger.error("inlucded file is not found "+ ctx.getText());
					}
				}
			}
		}
		return textContext;
	}

}
