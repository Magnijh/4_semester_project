// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
package LCTlang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LCTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Function=3, For=4, Loop=5, If=6, Else=7, Square_root=8, 
		OR=9, AND=10, Return=11, Var=12, Output=13, End=14, Then=15, Solve=16, 
		Times=17, LeftParen=18, RightParen=19, LeftBracket=20, RightBracket=21, 
		LeftBrace=22, RightBrace=23, Colon=24, Semicolon=25, Comma=26, Plus=27, 
		Minus=28, Multiply=29, Divide=30, Power=31, Modulo=32, LessThan=33, MoreThan=34, 
		Assign=35, LessEqual=36, MoreEqual=37, NotEqual=38, Not=39, Equal=40, 
		Increment=41, Decrement=42, True=43, False=44, String=45, Int=46, Float=47, 
		Identifier=48, BLOK_COMMENT=49, LINE_COMMENT=50, Whitespace=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Newline", "Function", "For", "Loop", "If", "Else", "Square_root", 
			"OR", "AND", "Return", "Var", "Output", "End", "Then", "Solve", "Times", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Colon", "Semicolon", "Comma", "Plus", "Minus", "Multiply", 
			"Divide", "Power", "Modulo", "LessThan", "MoreThan", "Assign", "LessEqual", 
			"MoreEqual", "NotEqual", "Not", "Equal", "Increment", "Decrement", "True", 
			"False", "String", "Int", "Float", "Identifier", "BLOK_COMMENT", "LINE_COMMENT", 
			"Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'intersection'", "'log10'", "'function'", "'for'", "'loop'", "'if'", 
			"'else'", "'sqrt'", "'OR'", "'AND'", "'return'", "'var'", "'output'", 
			"'end'", "'then'", "'solve'", "'times'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "':'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'%'", "'<'", "'>'", "'='", "'<='", "'>='", "'!='", "'!'", "'=='", "'++'", 
			"'--'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Function", "For", "Loop", "If", "Else", "Square_root", 
			"OR", "AND", "Return", "Var", "Output", "End", "Then", "Solve", "Times", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Colon", "Semicolon", "Comma", "Plus", "Minus", "Multiply", 
			"Divide", "Power", "Modulo", "LessThan", "MoreThan", "Assign", "LessEqual", 
			"MoreEqual", "NotEqual", "Not", "Equal", "Increment", "Decrement", "True", 
			"False", "String", "Int", "Float", "Identifier", "BLOK_COMMENT", "LINE_COMMENT", 
			"Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LCTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LCT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0158\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0081\n\4\3\4\5\4\u0084\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\7/\u0118\n/\f/\16/\u011b\13/\3/"+
		"\3/\3\60\6\60\u0120\n\60\r\60\16\60\u0121\3\61\7\61\u0125\n\61\f\61\16"+
		"\61\u0128\13\61\3\61\5\61\u012b\n\61\3\61\6\61\u012e\n\61\r\61\16\61\u012f"+
		"\3\62\3\62\7\62\u0134\n\62\f\62\16\62\u0137\13\62\3\63\3\63\3\63\3\63"+
		"\7\63\u013d\n\63\f\63\16\63\u0140\13\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\7\64\u014b\n\64\f\64\16\64\u014e\13\64\3\64\3\64\3\65"+
		"\6\65\u0153\n\65\r\65\16\65\u0154\3\65\3\65\3\u013e\2\66\3\3\5\4\7\2\t"+
		"\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%"+
		"\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#"+
		"G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65\3\2\t\4\2\f\f$$\3\2"+
		"\62;\3\2\60\60\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2\u0161\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5x\3\2\2"+
		"\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u008e\3\2\2\2\r\u0092\3\2\2\2\17"+
		"\u0097\3\2\2\2\21\u009a\3\2\2\2\23\u009f\3\2\2\2\25\u00a4\3\2\2\2\27\u00a7"+
		"\3\2\2\2\31\u00ab\3\2\2\2\33\u00b2\3\2\2\2\35\u00b6\3\2\2\2\37\u00bd\3"+
		"\2\2\2!\u00c1\3\2\2\2#\u00c6\3\2\2\2%\u00cc\3\2\2\2\'\u00d2\3\2\2\2)\u00d4"+
		"\3\2\2\2+\u00d6\3\2\2\2-\u00d8\3\2\2\2/\u00da\3\2\2\2\61\u00dc\3\2\2\2"+
		"\63\u00de\3\2\2\2\65\u00e0\3\2\2\2\67\u00e2\3\2\2\29\u00e4\3\2\2\2;\u00e6"+
		"\3\2\2\2=\u00e8\3\2\2\2?\u00ea\3\2\2\2A\u00ec\3\2\2\2C\u00ee\3\2\2\2E"+
		"\u00f0\3\2\2\2G\u00f2\3\2\2\2I\u00f4\3\2\2\2K\u00f6\3\2\2\2M\u00f9\3\2"+
		"\2\2O\u00fc\3\2\2\2Q\u00ff\3\2\2\2S\u0101\3\2\2\2U\u0104\3\2\2\2W\u0107"+
		"\3\2\2\2Y\u010a\3\2\2\2[\u010f\3\2\2\2]\u0115\3\2\2\2_\u011f\3\2\2\2a"+
		"\u012a\3\2\2\2c\u0131\3\2\2\2e\u0138\3\2\2\2g\u0146\3\2\2\2i\u0152\3\2"+
		"\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2no\7g\2\2op\7t\2\2pq\7u\2\2qr\7g\2\2rs"+
		"\7e\2\2st\7v\2\2tu\7k\2\2uv\7q\2\2vw\7p\2\2w\4\3\2\2\2xy\7n\2\2yz\7q\2"+
		"\2z{\7i\2\2{|\7\63\2\2|}\7\62\2\2}\6\3\2\2\2~\u0080\7\17\2\2\177\u0081"+
		"\7\f\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0084\7\f\2\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\b\3\2\2\2\u0085"+
		"\u0086\7h\2\2\u0086\u0087\7w\2\2\u0087\u0088\7p\2\2\u0088\u0089\7e\2\2"+
		"\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7p\2\2\u008d\n\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7q\2\2\u0090\u0091"+
		"\7t\2\2\u0091\f\3\2\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7r\2\2\u0096\16\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7h\2\2\u0099\20\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d"+
		"\7u\2\2\u009d\u009e\7g\2\2\u009e\22\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1"+
		"\7s\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7v\2\2\u00a3\24\3\2\2\2\u00a4\u00a5"+
		"\7Q\2\2\u00a5\u00a6\7T\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9"+
		"\7P\2\2\u00a9\u00aa\7F\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7c\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7v\2\2"+
		"\u00bc\36\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7"+
		"f\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7x\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"$\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7o\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7u\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7*\2\2\u00d3"+
		"(\3\2\2\2\u00d4\u00d5\7+\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7]\2\2\u00d7,"+
		"\3\2\2\2\u00d8\u00d9\7_\2\2\u00d9.\3\2\2\2\u00da\u00db\7}\2\2\u00db\60"+
		"\3\2\2\2\u00dc\u00dd\7\177\2\2\u00dd\62\3\2\2\2\u00de\u00df\7<\2\2\u00df"+
		"\64\3\2\2\2\u00e0\u00e1\7=\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3"+
		"8\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7<"+
		"\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb"+
		"@\3\2\2\2\u00ec\u00ed\7`\2\2\u00edB\3\2\2\2\u00ee\u00ef\7\'\2\2\u00ef"+
		"D\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1F\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3H"+
		"\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb\7?\2\2\u00fbN\3"+
		"\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\7?\2\2\u00feP\3\2\2\2\u00ff\u0100"+
		"\7#\2\2\u0100R\3\2\2\2\u0101\u0102\7?\2\2\u0102\u0103\7?\2\2\u0103T\3"+
		"\2\2\2\u0104\u0105\7-\2\2\u0105\u0106\7-\2\2\u0106V\3\2\2\2\u0107\u0108"+
		"\7/\2\2\u0108\u0109\7/\2\2\u0109X\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7w\2\2\u010d\u010e\7g\2\2\u010eZ\3\2\2\2\u010f\u0110"+
		"\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113"+
		"\u0114\7g\2\2\u0114\\\3\2\2\2\u0115\u0119\7$\2\2\u0116\u0118\n\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7$\2\2\u011d"+
		"^\3\2\2\2\u011e\u0120\t\3\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122`\3\2\2\2\u0123\u0125\t"+
		"\3\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\t\4"+
		"\2\2\u012a\u0126\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012e\t\3\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130b\3\2\2\2\u0131\u0135\t\5\2\2\u0132\u0134"+
		"\t\6\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136d\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\61\2\2"+
		"\u0139\u013a\7,\2\2\u013a\u013e\3\2\2\2\u013b\u013d\13\2\2\2\u013c\u013b"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7,\2\2\u0142\u0143\7\61"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\63\2\2\u0145f\3\2\2\2\u0146\u0147"+
		"\7\61\2\2\u0147\u0148\7\61\2\2\u0148\u014c\3\2\2\2\u0149\u014b\n\7\2\2"+
		"\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\b\64\2\2"+
		"\u0150h\3\2\2\2\u0151\u0153\t\b\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\b\65\2\2\u0157j\3\2\2\2\16\2\u0080\u0083\u0119\u0121\u0126\u012a"+
		"\u012f\u0135\u013e\u014c\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}