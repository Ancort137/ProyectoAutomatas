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
		EXC_MARK=1, ADD=2, SUB=3, MUL=4, DIV=5, AND=6, OR=7, EQUAL=8, NQUAL=9, 
		LTHAN=10, GTHAN=11, ASSIGN=12, LPAR=13, RPAR=14, LBRACE=15, RBRACE=16, 
		BEGIN_RW=17, END_RW=18, IF_RW=19, ELSE_RW=20, FOR_RW=21, WHILE_RW=22, 
		READ_RW=23, WRITE_RW=24, VAR_RW=25, CONST_RW=26, INTEGER_RW=27, STRING_RW=28, 
		FLOAT_RW=29, BOOLEAN_RW=30, INT=31, FLOAT=32, BOOLEAN=33, STRING=34, ID=35, 
		COMMENT=36, WS=37, POW=38, SQRT=39, ABS=40, RAND=41, RANGE_RW=42, FUNCTION_RW=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TRUE", "FALSE", "NUMBER", "LETTER", "DOT", "COLON", "EXC_MARK", "ADD", 
		"SUB", "MUL", "DIV", "AND", "OR", "EQUAL", "NQUAL", "LTHAN", "GTHAN", 
		"ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "BEGIN_RW", "END_RW", "IF_RW", 
		"ELSE_RW", "FOR_RW", "WHILE_RW", "READ_RW", "WRITE_RW", "VAR_RW", "CONST_RW", 
		"INTEGER_RW", "STRING_RW", "FLOAT_RW", "BOOLEAN_RW", "INT", "FLOAT", "BOOLEAN", 
		"STRING", "ID", "COMMENT", "WS", "POW", "SQRT", "ABS", "RAND", "RANGE_RW", 
		"FUNCTION_RW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'+'", "'-'", "'*'", "'/'", "'$$'", "'##'", "'='", "'<>'", 
		"'<'", "'>'", "'<->'", "'('", "')'", "'{'", "'}'", "'born'", "'die'", 
		"'attack'", "'defend'", "'journey'", "'travel'", "'listen'", "'talk'", 
		"'job'", "'race'", "'mage'", "'knight'", "'priest'", "'thief'", null, 
		null, null, null, null, null, null, "'buff'", "'nerf'", "'clean'", "'roll'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EXC_MARK", "ADD", "SUB", "MUL", "DIV", "AND", "OR", "EQUAL", "NQUAL", 
		"LTHAN", "GTHAN", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "BEGIN_RW", 
		"END_RW", "IF_RW", "ELSE_RW", "FOR_RW", "WHILE_RW", "READ_RW", "WRITE_RW", 
		"VAR_RW", "CONST_RW", "INTEGER_RW", "STRING_RW", "FLOAT_RW", "BOOLEAN_RW", 
		"INT", "FLOAT", "BOOLEAN", "STRING", "ID", "COMMENT", "WS", "POW", "SQRT", 
		"ABS", "RAND", "RANGE_RW", "FUNCTION_RW"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u014b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\6&\u00f6\n&\r&\16&\u00f7"+
		"\3\'\3\'\3\'\3\'\3(\3(\5(\u0100\n(\3)\3)\7)\u0104\n)\f)\16)\u0107\13)"+
		"\3)\3)\3*\6*\u010c\n*\r*\16*\u010d\3*\3*\7*\u0112\n*\f*\16*\u0115\13*"+
		"\3+\3+\3+\3+\7+\u011b\n+\f+\16+\u011e\13+\3+\5+\u0121\n+\3+\3+\3+\3+\3"+
		",\6,\u0128\n,\r,\16,\u0129\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\5\62\u014a\n\62\4\u0105\u011c\2\63\3\2\5\2\7\2\t\2\13\2\r\2\17\3\21\4"+
		"\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61"+
		"\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W"+
		"\'Y([)]*_+a,c-\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u0150\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\3e\3\2\2\2\5l\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2"+
		"\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0083"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0088\3\2\2\2\35\u008b\3\2\2\2\37\u008d\3"+
		"\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0098\3\2\2\2)\u009a"+
		"\3\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a5\3\2\2\2"+
		"\63\u00a9\3\2\2\2\65\u00b0\3\2\2\2\67\u00b7\3\2\2\29\u00bf\3\2\2\2;\u00c6"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00d2\3\2\2\2A\u00d6\3\2\2\2C\u00db\3\2\2\2E"+
		"\u00e0\3\2\2\2G\u00e7\3\2\2\2I\u00ee\3\2\2\2K\u00f5\3\2\2\2M\u00f9\3\2"+
		"\2\2O\u00ff\3\2\2\2Q\u0101\3\2\2\2S\u010b\3\2\2\2U\u0116\3\2\2\2W\u0127"+
		"\3\2\2\2Y\u012d\3\2\2\2[\u0132\3\2\2\2]\u0137\3\2\2\2_\u013d\3\2\2\2a"+
		"\u0142\3\2\2\2c\u0149\3\2\2\2ef\7c\2\2fg\7e\2\2gh\7e\2\2hi\7g\2\2ij\7"+
		"r\2\2jk\7v\2\2k\4\3\2\2\2lm\7t\2\2mn\7g\2\2no\7h\2\2op\7w\2\2pq\7u\2\2"+
		"qr\7g\2\2r\6\3\2\2\2st\t\2\2\2t\b\3\2\2\2uv\t\3\2\2v\n\3\2\2\2wx\7\60"+
		"\2\2x\f\3\2\2\2yz\7<\2\2z\16\3\2\2\2{|\7#\2\2|\20\3\2\2\2}~\7-\2\2~\22"+
		"\3\2\2\2\177\u0080\7/\2\2\u0080\24\3\2\2\2\u0081\u0082\7,\2\2\u0082\26"+
		"\3\2\2\2\u0083\u0084\7\61\2\2\u0084\30\3\2\2\2\u0085\u0086\7&\2\2\u0086"+
		"\u0087\7&\2\2\u0087\32\3\2\2\2\u0088\u0089\7%\2\2\u0089\u008a\7%\2\2\u008a"+
		"\34\3\2\2\2\u008b\u008c\7?\2\2\u008c\36\3\2\2\2\u008d\u008e\7>\2\2\u008e"+
		"\u008f\7@\2\2\u008f \3\2\2\2\u0090\u0091\7>\2\2\u0091\"\3\2\2\2\u0092"+
		"\u0093\7@\2\2\u0093$\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7/\2\2\u0096"+
		"\u0097\7@\2\2\u0097&\3\2\2\2\u0098\u0099\7*\2\2\u0099(\3\2\2\2\u009a\u009b"+
		"\7+\2\2\u009b*\3\2\2\2\u009c\u009d\7}\2\2\u009d,\3\2\2\2\u009e\u009f\7"+
		"\177\2\2\u009f.\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7p\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7"+
		"\7k\2\2\u00a7\u00a8\7g\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7e\2\2\u00ae"+
		"\u00af\7m\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7f\2\2"+
		"\u00b6\66\3\2\2\2\u00b7\u00b8\7l\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7"+
		"w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7{\2\2\u00be8\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		":\3\2\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc<\3\2\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7m\2\2"+
		"\u00d1>\3\2\2\2\u00d2\u00d3\7l\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7d\2"+
		"\2\u00d5@\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7"+
		"e\2\2\u00d9\u00da\7g\2\2\u00daB\3\2\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\u00de\7i\2\2\u00de\u00df\7g\2\2\u00dfD\3\2\2\2\u00e0\u00e1"+
		"\7m\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7i\2\2\u00e4"+
		"\u00e5\7j\2\2\u00e5\u00e6\7v\2\2\u00e6F\3\2\2\2\u00e7\u00e8\7r\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7u\2\2"+
		"\u00ec\u00ed\7v\2\2\u00edH\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7j\2"+
		"\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7h\2\2\u00f3J\3\2"+
		"\2\2\u00f4\u00f6\5\7\4\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8L\3\2\2\2\u00f9\u00fa\5K&\2\u00fa"+
		"\u00fb\5\13\6\2\u00fb\u00fc\5K&\2\u00fcN\3\2\2\2\u00fd\u0100\5\3\2\2\u00fe"+
		"\u0100\5\5\3\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100P\3\2\2\2"+
		"\u0101\u0105\7$\2\2\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7$\2\2\u0109R\3\2\2\2\u010a\u010c\5\t\5\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0113\3\2\2\2\u010f\u0112\5\t\5\2\u0110\u0112\5\7\4\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114T\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117"+
		"\7~\2\2\u0117\u0118\7~\2\2\u0118\u011c\3\2\2\2\u0119\u011b\13\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011d\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\7\17\2\2\u0120"+
		"\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\f"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b+\2\2\u0125V\3\2\2\2\u0126\u0128"+
		"\t\4\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b,\2\2\u012cX\3\2\2\2\u012d"+
		"\u012e\7d\2\2\u012e\u012f\7w\2\2\u012f\u0130\7h\2\2\u0130\u0131\7h\2\2"+
		"\u0131Z\3\2\2\2\u0132\u0133\7p\2\2\u0133\u0134\7g\2\2\u0134\u0135\7t\2"+
		"\2\u0135\u0136\7h\2\2\u0136\\\3\2\2\2\u0137\u0138\7e\2\2\u0138\u0139\7"+
		"n\2\2\u0139\u013a\7g\2\2\u013a\u013b\7c\2\2\u013b\u013c\7p\2\2\u013c^"+
		"\3\2\2\2\u013d\u013e\7t\2\2\u013e\u013f\7q\2\2\u013f\u0140\7n\2\2\u0140"+
		"\u0141\7n\2\2\u0141`\3\2\2\2\u0142\u0143\5\13\6\2\u0143\u0144\5\13\6\2"+
		"\u0144b\3\2\2\2\u0145\u014a\5Y-\2\u0146\u014a\5[.\2\u0147\u014a\5]/\2"+
		"\u0148\u014a\5_\60\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u0148\3\2\2\2\u014ad\3\2\2\2\r\2\u00f7\u00ff\u0105\u010d"+
		"\u0111\u0113\u011c\u0120\u0129\u0149\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}