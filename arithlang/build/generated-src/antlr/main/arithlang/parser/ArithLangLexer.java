// Generated from arithlang\parser\ArithLang.g by ANTLR 4.5
package arithlang.parser; import static arithlang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Define=12, Let=13, Dot=14, Number=15, Identifier=16, 
		Letter=17, LetterOrDigit=18, AT=19, ELLIPSIS=20, WS=21, Comment=22, Line_Comment=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "Define", "Let", "Dot", "Number", "Identifier", "Letter", 
		"LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'('", "'+'", "')'", "'*'", "'/'", "'pow'", "'Mrec'", "'Mclr'", 
		"'M+'", "'M-'", "'define'", "'let'", "'.'", null, null, null, null, "'@'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Define", "Let", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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


	public ArithLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArithLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 17:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\6\20b\n"+
		"\20\r\20\16\20c\3\21\3\21\7\21h\n\21\f\21\16\21k\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22s\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23{\n\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u0086\n\27\r\27\16\27"+
		"\u0087\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0090\n\30\f\30\16\30\u0093"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u009e\n\31\f"+
		"\31\16\31\u00a1\13\31\3\31\3\31\3\u0091\2\32\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25"+
		"+\26-\27/\30\61\31\3\2\t\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17"+
		"\17\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2"+
		"\2\2\r=\3\2\2\2\17?\3\2\2\2\21C\3\2\2\2\23H\3\2\2\2\25M\3\2\2\2\27P\3"+
		"\2\2\2\31S\3\2\2\2\33Z\3\2\2\2\35^\3\2\2\2\37a\3\2\2\2!e\3\2\2\2#r\3\2"+
		"\2\2%z\3\2\2\2\'|\3\2\2\2)~\3\2\2\2+\u0080\3\2\2\2-\u0085\3\2\2\2/\u008b"+
		"\3\2\2\2\61\u0099\3\2\2\2\63\64\7/\2\2\64\4\3\2\2\2\65\66\7*\2\2\66\6"+
		"\3\2\2\2\678\7-\2\28\b\3\2\2\29:\7+\2\2:\n\3\2\2\2;<\7,\2\2<\f\3\2\2\2"+
		"=>\7\61\2\2>\16\3\2\2\2?@\7r\2\2@A\7q\2\2AB\7y\2\2B\20\3\2\2\2CD\7O\2"+
		"\2DE\7t\2\2EF\7g\2\2FG\7e\2\2G\22\3\2\2\2HI\7O\2\2IJ\7e\2\2JK\7n\2\2K"+
		"L\7t\2\2L\24\3\2\2\2MN\7O\2\2NO\7-\2\2O\26\3\2\2\2PQ\7O\2\2QR\7/\2\2R"+
		"\30\3\2\2\2ST\7f\2\2TU\7g\2\2UV\7h\2\2VW\7k\2\2WX\7p\2\2XY\7g\2\2Y\32"+
		"\3\2\2\2Z[\7n\2\2[\\\7g\2\2\\]\7v\2\2]\34\3\2\2\2^_\7\60\2\2_\36\3\2\2"+
		"\2`b\5\'\24\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d \3\2\2\2ei\5#\22"+
		"\2fh\5%\23\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\"\3\2\2\2ki\3\2"+
		"\2\2ls\t\2\2\2mn\n\3\2\2ns\6\22\2\2op\t\4\2\2pq\t\5\2\2qs\6\22\3\2rl\3"+
		"\2\2\2rm\3\2\2\2ro\3\2\2\2s$\3\2\2\2t{\t\6\2\2uv\n\3\2\2v{\6\23\4\2wx"+
		"\t\4\2\2xy\t\5\2\2y{\6\23\5\2zt\3\2\2\2zu\3\2\2\2zw\3\2\2\2{&\3\2\2\2"+
		"|}\4\62;\2}(\3\2\2\2~\177\7B\2\2\177*\3\2\2\2\u0080\u0081\7\60\2\2\u0081"+
		"\u0082\7\60\2\2\u0082\u0083\7\60\2\2\u0083,\3\2\2\2\u0084\u0086\t\7\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\27\2\2\u008a.\3\2\2\2\u008b"+
		"\u008c\7\61\2\2\u008c\u008d\7,\2\2\u008d\u0091\3\2\2\2\u008e\u0090\13"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7,"+
		"\2\2\u0095\u0096\7\61\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\30\2\2\u0098"+
		"\60\3\2\2\2\u0099\u009a\7\61\2\2\u009a\u009b\7\61\2\2\u009b\u009f\3\2"+
		"\2\2\u009c\u009e\n\b\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\b\31\2\2\u00a3\62\3\2\2\2\n\2cirz\u0087\u0091\u009f\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}