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
		COMMENT=36, WS=37, POW=38, SQRT=39, ABS=40, RAND=41, FUNCTION_RW=42;
	public static final int
		RULE_s = 0, RULE_program = 1, RULE_stat = 2, RULE_start_block = 3, RULE_end_block = 4, 
		RULE_operation = 5, RULE_if_block = 6, RULE_condition_block = 7, RULE_else_block = 8, 
		RULE_block = 9, RULE_assign = 10, RULE_variable_type = 11, RULE_declaration = 12, 
		RULE_data_type = 13, RULE_read_block = 14, RULE_write_block = 15, RULE_math_function = 16;
	public static final String[] ruleNames = {
		"s", "program", "stat", "start_block", "end_block", "operation", "if_block", 
		"condition_block", "else_block", "block", "assign", "variable_type", "declaration", 
		"data_type", "read_block", "write_block", "math_function"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'+'", "'-'", "'*'", "'/'", "'$$'", "'##'", "'='", "'<>'", 
		"'<'", "'>'", "'<->'", "'('", "')'", "'{'", "'}'", "'born'", "'die'", 
		"'attack'", "'defend'", "'journey'", "'travel'", "'listen'", "'talk'", 
		"'job'", "'class'", "'mage'", "'knight'", "'priest'", "'thief'", null, 
		null, null, null, null, null, null, "'buff'", "'nerf'", "'clean'", "'roll'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EXC_MARK", "ADD", "SUB", "MUL", "DIV", "AND", "OR", "EQUAL", "NQUAL", 
		"LTHAN", "GTHAN", "ASSIGN", "LPAR", "RPAR", "LBRACE", "RBRACE", "BEGIN_RW", 
		"END_RW", "IF_RW", "ELSE_RW", "FOR_RW", "WHILE_RW", "READ_RW", "WRITE_RW", 
		"VAR_RW", "CONST_RW", "INTEGER_RW", "STRING_RW", "FLOAT_RW", "BOOLEAN_RW", 
		"INT", "FLOAT", "BOOLEAN", "STRING", "ID", "COMMENT", "WS", "POW", "SQRT", 
		"ABS", "RAND", "FUNCTION_RW"
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
			setState(34);
			operation(0);
			setState(35);
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
			setState(37);
			start_block();
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				stat();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << VAR_RW) | (1L << CONST_RW) | (1L << INTEGER_RW) | (1L << STRING_RW) | (1L << FLOAT_RW) | (1L << BOOLEAN_RW) | (1L << ID))) != 0) );
			setState(43);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				operation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				if_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				read_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				write_block();
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
			setState(53);
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
			setState(55);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				match(ID);
				}
				break;
			case LPAR:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(LPAR);
				setState(60);
				operation(0);
				setState(61);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(65);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(66);
						match(ADD);
						setState(67);
						operation(9);
						}
						break;
					case 2:
						{
						_localctx = new CompContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(68);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(69);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NQUAL) | (1L << LTHAN) | (1L << GTHAN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						operation(8);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(71);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(72);
						match(MUL);
						setState(73);
						operation(7);
						}
						break;
					case 4:
						{
						_localctx = new DivideContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
						match(DIV);
						setState(76);
						operation(6);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(77);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(78);
						match(AND);
						setState(79);
						operation(5);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(80);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(81);
						match(OR);
						setState(82);
						operation(4);
						}
						break;
					}
					} 
				}
				setState(87);
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
			setState(88);
			match(IF_RW);
			setState(89);
			condition_block();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(90);
				match(ELSE_RW);
				setState(91);
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(LPAR);
				setState(95);
				operation(0);
				setState(96);
				match(RPAR);
				setState(97);
				match(EXC_MARK);
				setState(98);
				block();
				setState(99);
				match(EXC_MARK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(LPAR);
				setState(102);
				operation(0);
				setState(103);
				match(RPAR);
				setState(104);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXC_MARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(EXC_MARK);
				setState(109);
				block();
				setState(110);
				match(EXC_MARK);
				}
				break;
			case LPAR:
			case IF_RW:
			case READ_RW:
			case WRITE_RW:
			case VAR_RW:
			case CONST_RW:
			case INTEGER_RW:
			case STRING_RW:
			case FLOAT_RW:
			case BOOLEAN_RW:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << VAR_RW) | (1L << CONST_RW) | (1L << INTEGER_RW) | (1L << STRING_RW) | (1L << FLOAT_RW) | (1L << BOOLEAN_RW) | (1L << ID))) != 0)) {
				{
				{
				setState(115);
				stat();
				}
				}
				setState(120);
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
		enterRule(_localctx, 20, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(ASSIGN);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(123);
				operation(0);
				}
				break;
			case 2:
				{
				setState(124);
				match(ID);
				}
				break;
			case 3:
				{
				setState(125);
				match(INT);
				}
				break;
			case 4:
				{
				setState(126);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(127);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(128);
				match(BOOLEAN);
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
		enterRule(_localctx, 22, RULE_variable_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 24, RULE_declaration);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_RW:
			case CONST_RW:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				data_type();
				setState(134);
				variable_type();
				setState(135);
				match(ID);
				}
				break;
			case INTEGER_RW:
			case STRING_RW:
			case FLOAT_RW:
			case BOOLEAN_RW:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				variable_type();
				setState(138);
				assign();
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
		enterRule(_localctx, 26, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		enterRule(_localctx, 28, RULE_read_block);
		try {
			_localctx = new ReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(READ_RW);
			setState(145);
			match(LPAR);
			setState(146);
			match(ID);
			setState(147);
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
		public PrintContext(Write_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_blockContext write_block() throws RecognitionException {
		Write_blockContext _localctx = new Write_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_write_block);
		int _la;
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(WRITE_RW);
			setState(150);
			match(LPAR);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==ID );
			setState(156);
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
		public TerminalNode FUNCTION_RW() { return getToken(MileParserParser.FUNCTION_RW, 0); }
		public TerminalNode LPAR() { return getToken(MileParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MileParserParser.RPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(MileParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MileParserParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MileParserParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MileParserParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(MileParserParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(MileParserParser.FLOAT, i);
		}
		public List<Math_functionContext> math_function() {
			return getRuleContexts(Math_functionContext.class);
		}
		public Math_functionContext math_function(int i) {
			return getRuleContext(Math_functionContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Math_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitMath_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_functionContext math_function() throws RecognitionException {
		Math_functionContext _localctx = new Math_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_math_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FUNCTION_RW);
			setState(159);
			match(LPAR);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << FUNCTION_RW))) != 0)) {
				{
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(160);
					match(ID);
					}
					break;
				case 2:
					{
					setState(161);
					match(INT);
					}
					break;
				case 3:
					{
					setState(162);
					match(FLOAT);
					}
					break;
				case 4:
					{
					setState(163);
					math_function();
					}
					break;
				case 5:
					{
					setState(164);
					operation(0);
					}
					break;
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7V"+
		"\n\7\f\7\16\7Y\13\7\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\5\nt\n\n\3\13\7\13"+
		"w\n\13\f\13\16\13z\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0084\n\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\6\21\u009b\n\21\r\21\16\21\u009c"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a8\n\22\f\22\16"+
		"\22\u00ab\13\22\3\22\3\22\3\22\2\3\f\23\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"\2\6\3\2\n\r\3\2\35 \3\2\33\34\3\2$%\u00ba\2$\3\2\2\2\4\'"+
		"\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\fA\3\2\2\2\16Z\3\2\2\2\20"+
		"l\3\2\2\2\22s\3\2\2\2\24x\3\2\2\2\26{\3\2\2\2\30\u0085\3\2\2\2\32\u008e"+
		"\3\2\2\2\34\u0090\3\2\2\2\36\u0092\3\2\2\2 \u0097\3\2\2\2\"\u00a0\3\2"+
		"\2\2$%\5\f\7\2%&\7\2\2\3&\3\3\2\2\2\')\5\b\5\2(*\5\6\4\2)(\3\2\2\2*+\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\5\n\6\2.\5\3\2\2\2/\66\5\32\16"+
		"\2\60\66\5\26\f\2\61\66\5\f\7\2\62\66\5\16\b\2\63\66\5\36\20\2\64\66\5"+
		" \21\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2"+
		"\2\2\65\64\3\2\2\2\66\7\3\2\2\2\678\7\23\2\28\t\3\2\2\29:\7\24\2\2:\13"+
		"\3\2\2\2;<\b\7\1\2<B\7%\2\2=>\7\17\2\2>?\5\f\7\2?@\7\20\2\2@B\3\2\2\2"+
		"A;\3\2\2\2A=\3\2\2\2BW\3\2\2\2CD\f\n\2\2DE\7\4\2\2EV\5\f\7\13FG\f\t\2"+
		"\2GH\t\2\2\2HV\5\f\7\nIJ\f\b\2\2JK\7\6\2\2KV\5\f\7\tLM\f\7\2\2MN\7\7\2"+
		"\2NV\5\f\7\bOP\f\6\2\2PQ\7\b\2\2QV\5\f\7\7RS\f\5\2\2ST\7\t\2\2TV\5\f\7"+
		"\6UC\3\2\2\2UF\3\2\2\2UI\3\2\2\2UL\3\2\2\2UO\3\2\2\2UR\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YW\3\2\2\2Z[\7\25\2\2[^\5\20\t\2\\]\7"+
		"\26\2\2]_\5\22\n\2^\\\3\2\2\2^_\3\2\2\2_\17\3\2\2\2`a\7\17\2\2ab\5\f\7"+
		"\2bc\7\20\2\2cd\7\3\2\2de\5\24\13\2ef\7\3\2\2fm\3\2\2\2gh\7\17\2\2hi\5"+
		"\f\7\2ij\7\20\2\2jk\5\6\4\2km\3\2\2\2l`\3\2\2\2lg\3\2\2\2m\21\3\2\2\2"+
		"no\7\3\2\2op\5\24\13\2pq\7\3\2\2qt\3\2\2\2rt\5\6\4\2sn\3\2\2\2sr\3\2\2"+
		"\2t\23\3\2\2\2uw\5\6\4\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\25\3"+
		"\2\2\2zx\3\2\2\2{|\7%\2\2|\u0083\7\16\2\2}\u0084\5\f\7\2~\u0084\7%\2\2"+
		"\177\u0084\7!\2\2\u0080\u0084\7\"\2\2\u0081\u0084\7$\2\2\u0082\u0084\7"+
		"#\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\27\3\2\2\2\u0085\u0086"+
		"\t\3\2\2\u0086\31\3\2\2\2\u0087\u0088\5\34\17\2\u0088\u0089\5\30\r\2\u0089"+
		"\u008a\7%\2\2\u008a\u008f\3\2\2\2\u008b\u008c\5\30\r\2\u008c\u008d\5\26"+
		"\f\2\u008d\u008f\3\2\2\2\u008e\u0087\3\2\2\2\u008e\u008b\3\2\2\2\u008f"+
		"\33\3\2\2\2\u0090\u0091\t\4\2\2\u0091\35\3\2\2\2\u0092\u0093\7\31\2\2"+
		"\u0093\u0094\7\17\2\2\u0094\u0095\7%\2\2\u0095\u0096\7\20\2\2\u0096\37"+
		"\3\2\2\2\u0097\u0098\7\32\2\2\u0098\u009a\7\17\2\2\u0099\u009b\t\5\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\20\2\2\u009f!\3\2\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a9\7\17\2\2\u00a2\u00a8\7%\2\2\u00a3\u00a8\7!\2"+
		"\2\u00a4\u00a8\7\"\2\2\u00a5\u00a8\5\"\22\2\u00a6\u00a8\5\f\7\2\u00a7"+
		"\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\20"+
		"\2\2\u00ad#\3\2\2\2\20+\65AUW^lsx\u0083\u008e\u009c\u00a7\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}