// Generated from MileParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MileParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EXC_MARK=1, PLUS=2, MINUS=3, AND=4, OR=5, EQUAL=6, NQUAL=7, LTHAN=8, GTHAN=9, 
		ASSIGN=10, LPAR=11, RPAR=12, LBRACE=13, RBRACE=14, BEGIN_RW=15, END_RW=16, 
		IF_RW=17, ELSE_RW=18, FOR_RW=19, WHILE_RW=20, READ_RW=21, WRITE_RW=22, 
		INTEGER_RW=23, STRING_RW=24, FLOAT_RW=25, BOOLEAN_RW=26, INT=27, FLOAT=28, 
		BOOLEAN=29, STRING=30, ID=31, COMMENT=32, WS=33, POW=34, SQRT=35, ABS=36, 
		RAND=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TRUE", "FALSE", "NUMBER", "LETTER", "DOT", "EXC_MARK", "PLUS", "MINUS", 
		"AND", "OR", "EQUAL", "NQUAL", "LTHAN", "GTHAN", "ASSIGN", "LPAR", "RPAR", 
		"LBRACE", "RBRACE", "BEGIN_RW", "END_RW", "IF_RW", "ELSE_RW", "FOR_RW", 
		"WHILE_RW", "READ_RW", "WRITE_RW", "INTEGER_RW", "STRING_RW", "FLOAT_RW", 
		"BOOLEAN_RW", "INT", "FLOAT", "BOOLEAN", "STRING", "ID", "COMMENT", "WS", 
		"POW", "SQRT", "ABS", "RAND"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'+'", "'-'", "'$$'", "'##'", "'='", "'<>'", "'<'", "'>'", 
		"'<->'", "'('", "')'", "'{'", "'}'", "'born'", "'die'", "'attack'", "'defend'", 
		"'journey'", "'travel'", "'listen'", "'talk'", "'mage'", "'knight'", "'priest'", 
		"'thief'", null, null, null, null, null, null, null, "'buff'", "'nerf'", 
		"'clean'", "'roll'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EXC_MARK", "PLUS", "MINUS", "AND", "OR", "EQUAL", "NQUAL", "LTHAN", 
		"GTHAN", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "BEGIN_RW", "END_RW", 
		"IF_RW", "ELSE_RW", "FOR_RW", "WHILE_RW", "READ_RW", "WRITE_RW", "INTEGER_RW", 
		"STRING_RW", "FLOAT_RW", "BOOLEAN_RW", "INT", "FLOAT", "BOOLEAN", "STRING", 
		"ID", "COMMENT", "WS", "POW", "SQRT", "ABS", "RAND"
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


	public MileParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MileParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0125\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\6!\u00d9\n!\r!\16!\u00da\3\"\3\""+
		"\3\"\3\"\3#\3#\5#\u00e3\n#\3$\3$\7$\u00e7\n$\f$\16$\u00ea\13$\3$\3$\3"+
		"%\6%\u00ef\n%\r%\16%\u00f0\3%\3%\7%\u00f5\n%\f%\16%\u00f8\13%\3&\3&\3"+
		"&\3&\7&\u00fe\n&\f&\16&\u0101\13&\3&\5&\u0104\n&\3&\3&\3&\3&\3\'\6\'\u010b"+
		"\n\'\r\'\16\'\u010c\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\4\u00e8\u00ff\2,\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21"+
		"\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24"+
		"\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'"+
		"\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u0128\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W"+
		"\3\2\2\2\5^\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3"+
		"\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25t\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2\33"+
		"|\3\2\2\2\35~\3\2\2\2\37\u0080\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%"+
		"\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008c\3\2\2\2+\u0091\3\2\2\2-\u0095\3"+
		"\2\2\2/\u009c\3\2\2\2\61\u00a3\3\2\2\2\63\u00ab\3\2\2\2\65\u00b2\3\2\2"+
		"\2\67\u00b9\3\2\2\29\u00be\3\2\2\2;\u00c3\3\2\2\2=\u00ca\3\2\2\2?\u00d1"+
		"\3\2\2\2A\u00d8\3\2\2\2C\u00dc\3\2\2\2E\u00e2\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00ee\3\2\2\2K\u00f9\3\2\2\2M\u010a\3\2\2\2O\u0110\3\2\2\2Q\u0115\3\2"+
		"\2\2S\u011a\3\2\2\2U\u0120\3\2\2\2WX\7c\2\2XY\7e\2\2YZ\7e\2\2Z[\7g\2\2"+
		"[\\\7r\2\2\\]\7v\2\2]\4\3\2\2\2^_\7t\2\2_`\7g\2\2`a\7h\2\2ab\7w\2\2bc"+
		"\7u\2\2cd\7g\2\2d\6\3\2\2\2ef\t\2\2\2f\b\3\2\2\2gh\t\3\2\2h\n\3\2\2\2"+
		"ij\7\60\2\2j\f\3\2\2\2kl\7#\2\2l\16\3\2\2\2mn\7-\2\2n\20\3\2\2\2op\7/"+
		"\2\2p\22\3\2\2\2qr\7&\2\2rs\7&\2\2s\24\3\2\2\2tu\7%\2\2uv\7%\2\2v\26\3"+
		"\2\2\2wx\7?\2\2x\30\3\2\2\2yz\7>\2\2z{\7@\2\2{\32\3\2\2\2|}\7>\2\2}\34"+
		"\3\2\2\2~\177\7@\2\2\177\36\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7/"+
		"\2\2\u0082\u0083\7@\2\2\u0083 \3\2\2\2\u0084\u0085\7*\2\2\u0085\"\3\2"+
		"\2\2\u0086\u0087\7+\2\2\u0087$\3\2\2\2\u0088\u0089\7}\2\2\u0089&\3\2\2"+
		"\2\u008a\u008b\7\177\2\2\u008b(\3\2\2\2\u008c\u008d\7d\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7t\2\2\u008f\u0090\7p\2\2\u0090*\3\2\2\2\u0091\u0092"+
		"\7f\2\2\u0092\u0093\7k\2\2\u0093\u0094\7g\2\2\u0094,\3\2\2\2\u0095\u0096"+
		"\7c\2\2\u0096\u0097\7v\2\2\u0097\u0098\7v\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7e\2\2\u009a\u009b\7m\2\2\u009b.\3\2\2\2\u009c\u009d\7f\2\2\u009d"+
		"\u009e\7g\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7f\2\2\u00a2\60\3\2\2\2\u00a3\u00a4\7l\2\2\u00a4\u00a5\7"+
		"q\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7{\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7n\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7u\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8\66\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7"+
		"n\2\2\u00bc\u00bd\7m\2\2\u00bd8\3\2\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0"+
		"\7c\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7g\2\2\u00c2:\3\2\2\2\u00c3\u00c4"+
		"\7m\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7i\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\u00c9\7v\2\2\u00c9<\3\2\2\2\u00ca\u00cb\7r\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7u\2\2"+
		"\u00cf\u00d0\7v\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7j\2"+
		"\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7h\2\2\u00d6@\3\2"+
		"\2\2\u00d7\u00d9\5\7\4\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00dbB\3\2\2\2\u00dc\u00dd\5A!\2\u00dd"+
		"\u00de\5\13\6\2\u00de\u00df\5A!\2\u00dfD\3\2\2\2\u00e0\u00e3\5\3\2\2\u00e1"+
		"\u00e3\5\5\3\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3F\3\2\2\2"+
		"\u00e4\u00e8\7$\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7$\2\2\u00ecH\3\2\2\2\u00ed\u00ef\5\t\5\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f5\5\t\5\2\u00f3\u00f5\5\7\4\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7J\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa"+
		"\7~\2\2\u00fa\u00fb\7~\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\13\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7\17\2\2\u0103"+
		"\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\f"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b&\2\2\u0108L\3\2\2\2\u0109\u010b"+
		"\t\4\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b\'\2\2\u010fN\3\2\2\2"+
		"\u0110\u0111\7d\2\2\u0111\u0112\7w\2\2\u0112\u0113\7h\2\2\u0113\u0114"+
		"\7h\2\2\u0114P\3\2\2\2\u0115\u0116\7p\2\2\u0116\u0117\7g\2\2\u0117\u0118"+
		"\7t\2\2\u0118\u0119\7h\2\2\u0119R\3\2\2\2\u011a\u011b\7e\2\2\u011b\u011c"+
		"\7n\2\2\u011c\u011d\7g\2\2\u011d\u011e\7c\2\2\u011e\u011f\7p\2\2\u011f"+
		"T\3\2\2\2\u0120\u0121\7t\2\2\u0121\u0122\7q\2\2\u0122\u0123\7n\2\2\u0123"+
		"\u0124\7n\2\2\u0124V\3\2\2\2\f\2\u00da\u00e2\u00e8\u00f0\u00f4\u00f6\u00ff"+
		"\u0103\u010c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}