// Generated from MileParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MileParserParser extends Parser {
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
	public static final int
		RULE_s = 0, RULE_program = 1, RULE_stat = 2, RULE_start_block = 3, RULE_end_block = 4, 
		RULE_operation = 5, RULE_if_block = 6, RULE_condition_block = 7, RULE_else_block = 8, 
		RULE_block = 9, RULE_for_block = 10, RULE_while_block = 11, RULE_loop_condition = 12, 
		RULE_range = 13, RULE_assign = 14, RULE_variable_type = 15, RULE_declaration = 16, 
		RULE_data_type = 17, RULE_read_block = 18, RULE_write_block = 19, RULE_math_function = 20;
	public static final String[] ruleNames = {
		"s", "program", "stat", "start_block", "end_block", "operation", "if_block", 
		"condition_block", "else_block", "block", "for_block", "while_block", 
		"loop_condition", "range", "assign", "variable_type", "declaration", "data_type", 
		"read_block", "write_block", "math_function"
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

	@Override
	public String getGrammarFileName() { return "MileParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MileParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MileParserParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			operation(0);
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Start_blockContext start_block() {
			return getRuleContext(Start_blockContext.class,0);
		}
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			start_block();
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				stat();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << FOR_RW) | (1L << WHILE_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << VAR_RW) | (1L << CONST_RW) | (1L << ID) | (1L << FUNCTION_RW))) != 0) );
			setState(51);
			end_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Read_blockContext read_block() {
			return getRuleContext(Read_blockContext.class,0);
		}
		public Write_blockContext write_block() {
			return getRuleContext(Write_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public Math_functionContext math_function() {
			return getRuleContext(Math_functionContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				operation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				if_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				read_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				write_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				for_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				while_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				math_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN_RW() { return getToken(MileParserParser.BEGIN_RW, 0); }
		public Start_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitStart_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_blockContext start_block() throws RecognitionException {
		Start_blockContext _localctx = new Start_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(BEGIN_RW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_blockContext extends ParserRuleContext {
		public TerminalNode END_RW() { return getToken(MileParserParser.END_RW, 0); }
		public End_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitEnd_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_blockContext end_block() throws RecognitionException {
		End_blockContext _localctx = new End_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_end_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(END_RW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MileParserParser.EQUAL, 0); }
		public TerminalNode NQUAL() { return getToken(MileParserParser.NQUAL, 0); }
		public TerminalNode LTHAN() { return getToken(MileParserParser.LTHAN, 0); }
		public TerminalNode GTHAN() { return getToken(MileParserParser.GTHAN, 0); }
		public CompContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends OperationContext {
		public TerminalNode LPAR() { return getToken(MileParserParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MileParserParser.RPAR, 0); }
		public ParensContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode OR() { return getToken(MileParserParser.OR, 0); }
		public OrContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode AND() { return getToken(MileParserParser.AND, 0); }
		public AndContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MileParserParser.DIV, 0); }
		public DivideContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends OperationContext {
		public TerminalNode ID() { return getToken(MileParserParser.ID, 0); }
		public IdContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MileParserParser.MUL, 0); }
		public MultiplyContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MileParserParser.ADD, 0); }
		public PlusContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstractContext extends OperationContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode SUB() { return getToken(MileParserParser.SUB, 0); }
		public SubstractContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitSubstract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				match(ID);
				}
				break;
			case LPAR:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(LPAR);
				setState(71);
				operation(0);
				setState(72);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(76);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(77);
						match(ADD);
						setState(78);
						operation(10);
						}
						break;
					case 2:
						{
						_localctx = new SubstractContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(79);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(80);
						match(SUB);
						setState(81);
						operation(9);
						}
						break;
					case 3:
						{
						_localctx = new CompContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(82);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(83);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NQUAL) | (1L << LTHAN) | (1L << GTHAN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						operation(8);
						}
						break;
					case 4:
						{
						_localctx = new MultiplyContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(85);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(86);
						match(MUL);
						setState(87);
						operation(7);
						}
						break;
					case 5:
						{
						_localctx = new DivideContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(88);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(89);
						match(DIV);
						setState(90);
						operation(6);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(91);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(92);
						match(AND);
						setState(93);
						operation(5);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(94);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(95);
						match(OR);
						setState(96);
						operation(4);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF_RW() { return getToken(MileParserParser.IF_RW, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode ELSE_RW() { return getToken(MileParserParser.ELSE_RW, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF_RW);
			setState(103);
			condition_block();
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104);
				match(ELSE_RW);
				setState(105);
				else_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MileParserParser.LPAR, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MileParserParser.RPAR, 0); }
		public List<TerminalNode> EXC_MARK() { return getTokens(MileParserParser.EXC_MARK); }
		public TerminalNode EXC_MARK(int i) {
			return getToken(MileParserParser.EXC_MARK, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition_block);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(LPAR);
				setState(109);
				operation(0);
				setState(110);
				match(RPAR);
				setState(111);
				match(EXC_MARK);
				setState(112);
				block();
				setState(113);
				match(EXC_MARK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(LPAR);
				setState(116);
				operation(0);
				setState(117);
				match(RPAR);
				setState(118);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public List<TerminalNode> EXC_MARK() { return getTokens(MileParserParser.EXC_MARK); }
		public TerminalNode EXC_MARK(int i) {
			return getToken(MileParserParser.EXC_MARK, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_block);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXC_MARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(EXC_MARK);
				setState(123);
				block();
				setState(124);
				match(EXC_MARK);
				}
				break;
			case LPAR:
			case IF_RW:
			case FOR_RW:
			case WHILE_RW:
			case READ_RW:
			case WRITE_RW:
			case VAR_RW:
			case CONST_RW:
			case ID:
			case FUNCTION_RW:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << FOR_RW) | (1L << WHILE_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << VAR_RW) | (1L << CONST_RW) | (1L << ID) | (1L << FUNCTION_RW))) != 0)) {
				{
				{
				setState(129);
				stat();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR_RW() { return getToken(MileParserParser.FOR_RW, 0); }
		public Loop_conditionContext loop_condition() {
			return getRuleContext(Loop_conditionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(MileParserParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MileParserParser.RBRACE, 0); }
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitFor_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FOR_RW);
			setState(136);
			loop_condition();
			setState(137);
			match(LBRACE);
			setState(138);
			block();
			setState(139);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE_RW() { return getToken(MileParserParser.WHILE_RW, 0); }
		public Loop_conditionContext loop_condition() {
			return getRuleContext(Loop_conditionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(MileParserParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MileParserParser.RBRACE, 0); }
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(WHILE_RW);
			setState(142);
			loop_condition();
			setState(143);
			match(LBRACE);
			setState(144);
			block();
			setState(145);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_conditionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(MileParserParser.LPAR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MileParserParser.RPAR, 0); }
		public Loop_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitLoop_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_conditionContext loop_condition() throws RecognitionException {
		Loop_conditionContext _localctx = new Loop_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LPAR);
			setState(148);
			range();
			setState(149);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MileParserParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MileParserParser.INT, i);
		}
		public TerminalNode RANGE_RW() { return getToken(MileParserParser.RANGE_RW, 0); }
		public List<TerminalNode> ID() { return getTokens(MileParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MileParserParser.ID, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_range);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(INT);
				setState(152);
				match(RANGE_RW);
				setState(153);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(ID);
				setState(155);
				match(RANGE_RW);
				setState(156);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(INT);
				setState(158);
				match(RANGE_RW);
				setState(159);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(ID);
				setState(161);
				match(RANGE_RW);
				setState(162);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MileParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MileParserParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(MileParserParser.ASSIGN, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode INT() { return getToken(MileParserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MileParserParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(MileParserParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(MileParserParser.BOOLEAN, 0); }
		public Math_functionContext math_function() {
			return getRuleContext(Math_functionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(ASSIGN);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(168);
				operation(0);
				}
				break;
			case 2:
				{
				setState(169);
				match(ID);
				}
				break;
			case 3:
				{
				setState(170);
				match(INT);
				}
				break;
			case 4:
				{
				setState(171);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(172);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(173);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				setState(174);
				math_function();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_RW() { return getToken(MileParserParser.INTEGER_RW, 0); }
		public TerminalNode FLOAT_RW() { return getToken(MileParserParser.FLOAT_RW, 0); }
		public TerminalNode STRING_RW() { return getToken(MileParserParser.STRING_RW, 0); }
		public TerminalNode BOOLEAN_RW() { return getToken(MileParserParser.BOOLEAN_RW, 0); }
		public Variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitVariable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_typeContext variable_type() throws RecognitionException {
		Variable_typeContext _localctx = new Variable_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_RW) | (1L << STRING_RW) | (1L << FLOAT_RW) | (1L << BOOLEAN_RW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Variable_typeContext variable_type() {
			return getRuleContext(Variable_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MileParserParser.ID, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				data_type();
				setState(180);
				variable_type();
				setState(181);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				data_type();
				setState(184);
				variable_type();
				setState(185);
				assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode VAR_RW() { return getToken(MileParserParser.VAR_RW, 0); }
		public TerminalNode CONST_RW() { return getToken(MileParserParser.CONST_RW, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==VAR_RW || _la==CONST_RW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_blockContext extends ParserRuleContext {
		public Read_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_block; }
	 
		public Read_blockContext() { }
		public void copyFrom(Read_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadContext extends Read_blockContext {
		public TerminalNode READ_RW() { return getToken(MileParserParser.READ_RW, 0); }
		public TerminalNode LPAR() { return getToken(MileParserParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(MileParserParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(MileParserParser.RPAR, 0); }
		public ReadContext(Read_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_blockContext read_block() throws RecognitionException {
		Read_blockContext _localctx = new Read_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_read_block);
		try {
			_localctx = new ReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(READ_RW);
			setState(192);
			match(LPAR);
			setState(193);
			match(ID);
			setState(194);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_blockContext extends ParserRuleContext {
		public Write_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_block; }
	 
		public Write_blockContext() { }
		public void copyFrom(Write_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends Write_blockContext {
		public TerminalNode WRITE_RW() { return getToken(MileParserParser.WRITE_RW, 0); }
		public TerminalNode LPAR() { return getToken(MileParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MileParserParser.RPAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(MileParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MileParserParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(MileParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MileParserParser.ID, i);
		}
		public List<Math_functionContext> math_function() {
			return getRuleContexts(Math_functionContext.class);
		}
		public Math_functionContext math_function(int i) {
			return getRuleContext(Math_functionContext.class,i);
		}
		public PrintContext(Write_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_blockContext write_block() throws RecognitionException {
		Write_blockContext _localctx = new Write_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_write_block);
		int _la;
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(WRITE_RW);
			setState(197);
			match(LPAR);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(198);
					match(STRING);
					}
					break;
				case ID:
					{
					setState(199);
					match(ID);
					}
					break;
				case FUNCTION_RW:
					{
					setState(200);
					math_function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << FUNCTION_RW))) != 0) );
			setState(205);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_functionContext extends ParserRuleContext {
		public Math_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_function; }
	 
		public Math_functionContext() { }
		public void copyFrom(Math_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends Math_functionContext {
		public TerminalNode FUNCTION_RW() { return getToken(MileParserParser.FUNCTION_RW, 0); }
		public TerminalNode LPAR() { return getToken(MileParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MileParserParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(MileParserParser.ID, 0); }
		public TerminalNode INT() { return getToken(MileParserParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MileParserParser.FLOAT, 0); }
		public Math_functionContext math_function() {
			return getRuleContext(Math_functionContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public FunctionContext(Math_functionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_functionContext math_function() throws RecognitionException {
		Math_functionContext _localctx = new Math_functionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_math_function);
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(FUNCTION_RW);
			setState(208);
			match(LPAR);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(209);
				match(ID);
				}
				break;
			case 2:
				{
				setState(210);
				match(INT);
				}
				break;
			case 3:
				{
				setState(211);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(212);
				math_function();
				}
				break;
			case 5:
				{
				setState(213);
				operation(0);
				}
				break;
			}
			setState(216);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\6\3\62\n"+
		"\3\r\3\16\3\63\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7d\n"+
		"\7\f\7\16\7g\13\7\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3\13\7"+
		"\13\u0085\n\13\f\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a7\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00b2\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00be\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\6\25\u00cc\n\25\r\25\16\25\u00cd\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d9\n\26\3\26\3\26\3\26\2\3\f\27\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\n\r\3\2\35 \3\2\33"+
		"\34\u00ef\2,\3\2\2\2\4/\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fL\3"+
		"\2\2\2\16h\3\2\2\2\20z\3\2\2\2\22\u0081\3\2\2\2\24\u0086\3\2\2\2\26\u0089"+
		"\3\2\2\2\30\u008f\3\2\2\2\32\u0095\3\2\2\2\34\u00a6\3\2\2\2\36\u00a8\3"+
		"\2\2\2 \u00b3\3\2\2\2\"\u00bd\3\2\2\2$\u00bf\3\2\2\2&\u00c1\3\2\2\2(\u00c6"+
		"\3\2\2\2*\u00d1\3\2\2\2,-\5\f\7\2-.\7\2\2\3.\3\3\2\2\2/\61\5\b\5\2\60"+
		"\62\5\6\4\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\5\n\6\2\66\5\3\2\2\2\67A\5\"\22\28A\5\36\20\29A\5\f"+
		"\7\2:A\5\16\b\2;A\5&\24\2<A\5(\25\2=A\5\26\f\2>A\5\30\r\2?A\5*\26\2@\67"+
		"\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@"+
		">\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BC\7\23\2\2C\t\3\2\2\2DE\7\24\2\2E\13\3"+
		"\2\2\2FG\b\7\1\2GM\7%\2\2HI\7\17\2\2IJ\5\f\7\2JK\7\20\2\2KM\3\2\2\2LF"+
		"\3\2\2\2LH\3\2\2\2Me\3\2\2\2NO\f\13\2\2OP\7\4\2\2Pd\5\f\7\fQR\f\n\2\2"+
		"RS\7\5\2\2Sd\5\f\7\13TU\f\t\2\2UV\t\2\2\2Vd\5\f\7\nWX\f\b\2\2XY\7\6\2"+
		"\2Yd\5\f\7\tZ[\f\7\2\2[\\\7\7\2\2\\d\5\f\7\b]^\f\6\2\2^_\7\b\2\2_d\5\f"+
		"\7\7`a\f\5\2\2ab\7\t\2\2bd\5\f\7\6cN\3\2\2\2cQ\3\2\2\2cT\3\2\2\2cW\3\2"+
		"\2\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3"+
		"\2\2\2ge\3\2\2\2hi\7\25\2\2il\5\20\t\2jk\7\26\2\2km\5\22\n\2lj\3\2\2\2"+
		"lm\3\2\2\2m\17\3\2\2\2no\7\17\2\2op\5\f\7\2pq\7\20\2\2qr\7\3\2\2rs\5\24"+
		"\13\2st\7\3\2\2t{\3\2\2\2uv\7\17\2\2vw\5\f\7\2wx\7\20\2\2xy\5\6\4\2y{"+
		"\3\2\2\2zn\3\2\2\2zu\3\2\2\2{\21\3\2\2\2|}\7\3\2\2}~\5\24\13\2~\177\7"+
		"\3\2\2\177\u0082\3\2\2\2\u0080\u0082\5\6\4\2\u0081|\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\23\3\2\2\2\u0083\u0085\5\6\4\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008a\7\27\2\2\u008a\u008b\5\32\16\2\u008b"+
		"\u008c\7\21\2\2\u008c\u008d\5\24\13\2\u008d\u008e\7\22\2\2\u008e\27\3"+
		"\2\2\2\u008f\u0090\7\30\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7\21\2\2"+
		"\u0092\u0093\5\24\13\2\u0093\u0094\7\22\2\2\u0094\31\3\2\2\2\u0095\u0096"+
		"\7\17\2\2\u0096\u0097\5\34\17\2\u0097\u0098\7\20\2\2\u0098\33\3\2\2\2"+
		"\u0099\u009a\7!\2\2\u009a\u009b\7,\2\2\u009b\u00a7\7!\2\2\u009c\u009d"+
		"\7%\2\2\u009d\u009e\7,\2\2\u009e\u00a7\7%\2\2\u009f\u00a0\7!\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a7\7%\2\2\u00a2\u00a3\7%\2\2\u00a3\u00a4\7,\2\2"+
		"\u00a4\u00a7\7!\2\2\u00a5\u00a7\7!\2\2\u00a6\u0099\3\2\2\2\u00a6\u009c"+
		"\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\35\3\2\2\2\u00a8\u00a9\7%\2\2\u00a9\u00b1\7\16\2\2\u00aa\u00b2\5\f\7"+
		"\2\u00ab\u00b2\7%\2\2\u00ac\u00b2\7!\2\2\u00ad\u00b2\7\"\2\2\u00ae\u00b2"+
		"\7$\2\2\u00af\u00b2\7#\2\2\u00b0\u00b2\5*\26\2\u00b1\u00aa\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\37\3\2\2\2\u00b3\u00b4"+
		"\t\3\2\2\u00b4!\3\2\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\5 \21\2\u00b7"+
		"\u00b8\7%\2\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\5 \21"+
		"\2\u00bb\u00bc\5\36\20\2\u00bc\u00be\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0%\3\2\2\2\u00c1"+
		"\u00c2\7\31\2\2\u00c2\u00c3\7\17\2\2\u00c3\u00c4\7%\2\2\u00c4\u00c5\7"+
		"\20\2\2\u00c5\'\3\2\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00cb\7\17\2\2\u00c8"+
		"\u00cc\7$\2\2\u00c9\u00cc\7%\2\2\u00ca\u00cc\5*\26\2\u00cb\u00c8\3\2\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\20\2\2"+
		"\u00d0)\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\u00d8\7\17\2\2\u00d3\u00d9\7"+
		"%\2\2\u00d4\u00d9\7!\2\2\u00d5\u00d9\7\"\2\2\u00d6\u00d9\5*\26\2\u00d7"+
		"\u00d9\5\f\7\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7\20\2\2\u00db+\3\2\2\2\21\63@Lcelz\u0081\u0086"+
		"\u00a6\u00b1\u00bd\u00cb\u00cd\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}