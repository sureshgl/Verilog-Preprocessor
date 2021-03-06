// Generated from Verilogpp.g4 by ANTLR 4.5
package com.proteus.preprocess.verilogpp.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Verilogpp extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIRECTIVE=1, ID=2, STRING=3, WS=4, NEWLINE=5, OLC=6, BC=7, DUMMY=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIRECTIVE", "ID", "STRING", "WS", "NEWLINE", "OLC", "BC", "DUMMY"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIRECTIVE", "ID", "STRING", "WS", "NEWLINE", "OLC", "BC", "DUMMY"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Verilogpp(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Verilogpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nI\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\7\7\7\62\n\7\f\7\16\7\65"+
		"\13\7\3\7\5\78\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b@\n\b\f\b\16\bC\13\b\3\b"+
		"\3\b\3\b\3\t\3\t\4\63A\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\6\5"+
		"\2C\\aac|\7\2&&\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"N\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\3\23\3\2\2\2\5\26\3\2\2\2\7\35\3\2\2\2\t&\3\2\2\2\13+"+
		"\3\2\2\2\r-\3\2\2\2\17;\3\2\2\2\21G\3\2\2\2\23\24\7b\2\2\24\25\5\5\3\2"+
		"\25\4\3\2\2\2\26\32\t\2\2\2\27\31\t\3\2\2\30\27\3\2\2\2\31\34\3\2\2\2"+
		"\32\30\3\2\2\2\32\33\3\2\2\2\33\6\3\2\2\2\34\32\3\2\2\2\35!\7$\2\2\36"+
		" \n\4\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!"+
		"\3\2\2\2$%\7$\2\2%\b\3\2\2\2&\'\t\5\2\2\'\n\3\2\2\2(,\7\f\2\2)*\7\17\2"+
		"\2*,\7\f\2\2+(\3\2\2\2+)\3\2\2\2,\f\3\2\2\2-.\7\61\2\2./\7\61\2\2/\63"+
		"\3\2\2\2\60\62\13\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\64\3\2\2\2\63\61"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\668\7\17\2\2\67\66\3\2\2\2\678\3"+
		"\2\2\289\3\2\2\29:\7\f\2\2:\16\3\2\2\2;<\7\61\2\2<=\7,\2\2=A\3\2\2\2>"+
		"@\13\2\2\2?>\3\2\2\2@C\3\2\2\2AB\3\2\2\2A?\3\2\2\2BD\3\2\2\2CA\3\2\2\2"+
		"DE\7,\2\2EF\7\61\2\2F\20\3\2\2\2GH\13\2\2\2H\22\3\2\2\2\t\2\32!+\63\67"+
		"A\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}