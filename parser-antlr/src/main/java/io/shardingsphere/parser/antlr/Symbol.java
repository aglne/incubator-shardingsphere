// Generated from Symbol.g4 by ANTLR 4.7.1
package io.shardingsphere.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Symbol extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_SYM=1, OR_SYM=2, NOT_SYM=3, SAFE_EQ=4, UNARY_BIT_COMPLEMENT=5, BIT_INCLUSIVE_OR=6, 
		BIT_AND=7, SIGNED_LEFT_SHIFT=8, SIGNED_RIGHT_SHIFT=9, BIT_EXCLUSIVE_OR=10, 
		MOD_SYM=11, ADD_OP=12, SUB_OP=13, MUL_OP=14, DIV_OP=15, DOT=16, EQ=17, 
		EQ_OR_ASSIGN=18, NEQ=19, NEQ_SYM=20, GT=21, GTE=22, LT=23, LTE=24, LEFT_PAREN=25, 
		RIGHT_PAREN=26, LEFT_BRACE=27, RIGHT_BRACE=28, COMMA=29, DOUBLE_QUOTA=30, 
		SINGLE_QUOTA=31, BACK_QUOTA=32, UL_=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND_SYM", "OR_SYM", "NOT_SYM", "SAFE_EQ", "UNARY_BIT_COMPLEMENT", "BIT_INCLUSIVE_OR", 
		"BIT_AND", "SIGNED_LEFT_SHIFT", "SIGNED_RIGHT_SHIFT", "BIT_EXCLUSIVE_OR", 
		"MOD_SYM", "ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", "DOT", "EQ", "EQ_OR_ASSIGN", 
		"NEQ", "NEQ_SYM", "GT", "GTE", "LT", "LTE", "LEFT_PAREN", "RIGHT_PAREN", 
		"LEFT_BRACE", "RIGHT_BRACE", "COMMA", "DOUBLE_QUOTA", "SINGLE_QUOTA", 
		"BACK_QUOTA", "UL_", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "'||'", "'!'", "'<=>'", "'~'", "'|'", "'&'", "'<<'", "'>>'", 
		"'^'", "'%'", "'+'", "'-'", "'*'", "'/'", "'.'", "'=='", "'='", "'!='", 
		"'<>'", "'>'", "'>='", "'<'", "'<='", "'('", "')'", "'{'", "'}'", "','", 
		"'\"'", "'''", "'`'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND_SYM", "OR_SYM", "NOT_SYM", "SAFE_EQ", "UNARY_BIT_COMPLEMENT", 
		"BIT_INCLUSIVE_OR", "BIT_AND", "SIGNED_LEFT_SHIFT", "SIGNED_RIGHT_SHIFT", 
		"BIT_EXCLUSIVE_OR", "MOD_SYM", "ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", 
		"DOT", "EQ", "EQ_OR_ASSIGN", "NEQ", "NEQ_SYM", "GT", "GTE", "LT", "LTE", 
		"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "COMMA", "DOUBLE_QUOTA", 
		"SINGLE_QUOTA", "BACK_QUOTA", "UL_"
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


	public Symbol(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Symbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O"+
		"\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2\3\2\34"+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K"+
		"Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\2\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3y\3\2\2\2"+
		"\5|\3\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0085\3\2\2\2\r\u0087\3\2"+
		"\2\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u008e\3\2\2\2\25\u0091\3\2\2"+
		"\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2"+
		"\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a2\3\2\2\2\'\u00a4"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00aa\3\2\2\2-\u00ac\3\2\2\2/\u00af\3\2\2\2\61"+
		"\u00b1\3\2\2\2\63\u00b4\3\2\2\2\65\u00b6\3\2\2\2\67\u00b8\3\2\2\29\u00ba"+
		"\3\2\2\2;\u00bc\3\2\2\2=\u00be\3\2\2\2?\u00c0\3\2\2\2A\u00c2\3\2\2\2C"+
		"\u00c4\3\2\2\2E\u00c6\3\2\2\2G\u00c8\3\2\2\2I\u00ca\3\2\2\2K\u00cc\3\2"+
		"\2\2M\u00ce\3\2\2\2O\u00d0\3\2\2\2Q\u00d2\3\2\2\2S\u00d4\3\2\2\2U\u00d6"+
		"\3\2\2\2W\u00d8\3\2\2\2Y\u00da\3\2\2\2[\u00dc\3\2\2\2]\u00de\3\2\2\2_"+
		"\u00e0\3\2\2\2a\u00e2\3\2\2\2c\u00e4\3\2\2\2e\u00e6\3\2\2\2g\u00e8\3\2"+
		"\2\2i\u00ea\3\2\2\2k\u00ec\3\2\2\2m\u00ee\3\2\2\2o\u00f0\3\2\2\2q\u00f2"+
		"\3\2\2\2s\u00f4\3\2\2\2u\u00f6\3\2\2\2w\u00f8\3\2\2\2yz\7(\2\2z{\7(\2"+
		"\2{\4\3\2\2\2|}\7~\2\2}~\7~\2\2~\6\3\2\2\2\177\u0080\7#\2\2\u0080\b\3"+
		"\2\2\2\u0081\u0082\7>\2\2\u0082\u0083\7?\2\2\u0083\u0084\7@\2\2\u0084"+
		"\n\3\2\2\2\u0085\u0086\7\u0080\2\2\u0086\f\3\2\2\2\u0087\u0088\7~\2\2"+
		"\u0088\16\3\2\2\2\u0089\u008a\7(\2\2\u008a\20\3\2\2\2\u008b\u008c\7>\2"+
		"\2\u008c\u008d\7>\2\2\u008d\22\3\2\2\2\u008e\u008f\7@\2\2\u008f\u0090"+
		"\7@\2\2\u0090\24\3\2\2\2\u0091\u0092\7`\2\2\u0092\26\3\2\2\2\u0093\u0094"+
		"\7\'\2\2\u0094\30\3\2\2\2\u0095\u0096\7-\2\2\u0096\32\3\2\2\2\u0097\u0098"+
		"\7/\2\2\u0098\34\3\2\2\2\u0099\u009a\7,\2\2\u009a\36\3\2\2\2\u009b\u009c"+
		"\7\61\2\2\u009c \3\2\2\2\u009d\u009e\7\60\2\2\u009e\"\3\2\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0\u00a1\7?\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3&\3"+
		"\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7?\2\2\u00a6(\3\2\2\2\u00a7\u00a8"+
		"\7>\2\2\u00a8\u00a9\7@\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab,\3"+
		"\2\2\2\u00ac\u00ad\7@\2\2\u00ad\u00ae\7?\2\2\u00ae.\3\2\2\2\u00af\u00b0"+
		"\7>\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3\62"+
		"\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5\64\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7"+
		"\66\3\2\2\2\u00b8\u00b9\7}\2\2\u00b98\3\2\2\2\u00ba\u00bb\7\177\2\2\u00bb"+
		":\3\2\2\2\u00bc\u00bd\7.\2\2\u00bd<\3\2\2\2\u00be\u00bf\7$\2\2\u00bf>"+
		"\3\2\2\2\u00c0\u00c1\7)\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7b\2\2\u00c3B\3"+
		"\2\2\2\u00c4\u00c5\7a\2\2\u00c5D\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7F\3"+
		"\2\2\2\u00c8\u00c9\t\3\2\2\u00c9H\3\2\2\2\u00ca\u00cb\t\4\2\2\u00cbJ\3"+
		"\2\2\2\u00cc\u00cd\t\5\2\2\u00cdL\3\2\2\2\u00ce\u00cf\t\6\2\2\u00cfN\3"+
		"\2\2\2\u00d0\u00d1\t\7\2\2\u00d1P\3\2\2\2\u00d2\u00d3\t\b\2\2\u00d3R\3"+
		"\2\2\2\u00d4\u00d5\t\t\2\2\u00d5T\3\2\2\2\u00d6\u00d7\t\n\2\2\u00d7V\3"+
		"\2\2\2\u00d8\u00d9\t\13\2\2\u00d9X\3\2\2\2\u00da\u00db\t\f\2\2\u00dbZ"+
		"\3\2\2\2\u00dc\u00dd\t\r\2\2\u00dd\\\3\2\2\2\u00de\u00df\t\16\2\2\u00df"+
		"^\3\2\2\2\u00e0\u00e1\t\17\2\2\u00e1`\3\2\2\2\u00e2\u00e3\t\20\2\2\u00e3"+
		"b\3\2\2\2\u00e4\u00e5\t\21\2\2\u00e5d\3\2\2\2\u00e6\u00e7\t\22\2\2\u00e7"+
		"f\3\2\2\2\u00e8\u00e9\t\23\2\2\u00e9h\3\2\2\2\u00ea\u00eb\t\24\2\2\u00eb"+
		"j\3\2\2\2\u00ec\u00ed\t\25\2\2\u00edl\3\2\2\2\u00ee\u00ef\t\26\2\2\u00ef"+
		"n\3\2\2\2\u00f0\u00f1\t\27\2\2\u00f1p\3\2\2\2\u00f2\u00f3\t\30\2\2\u00f3"+
		"r\3\2\2\2\u00f4\u00f5\t\31\2\2\u00f5t\3\2\2\2\u00f6\u00f7\t\32\2\2\u00f7"+
		"v\3\2\2\2\u00f8\u00f9\t\33\2\2\u00f9x\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}