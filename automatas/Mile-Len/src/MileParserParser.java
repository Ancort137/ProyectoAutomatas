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
		EXC_MARK=1, PLUS=2, MINUS=3, AND=4, OR=5, EQUAL=6, NQUAL=7, GT=8, LT=9, 
		LPAR=10, RPAR=11, LBRACE=12, RBRACE=13, BEGIN_RW=14, END_RW=15, IF_RW=16, 
		ELSE_RW=17, READ_RW=18, WRITE_RW=19, INTEGER_RW=20, STRING_RW=21, FLOAT_RW=22, 
		BOOLEAN_RW=23, NUMBER=24, FLOAT=25, BOOLEAN=26, STRING=27, ASSIGN=28, 
		ID=29, COMMENT=30, WS=31, POW=32, SQRT=33, ABS=34, RAND=35;
	public static final int
		RULE_s = 0, RULE_program = 1, RULE_stat = 2, RULE_start_block = 3, RULE_end_block = 4, 
		RULE_operation = 5, RULE_if_block = 6, RULE_condition_block = 7, RULE_else_block = 8, 
		RULE_block = 9, RULE_assign = 10, RULE_variable_type = 11, RULE_declaration = 12, 
		RULE_read_block = 13, RULE_write_block = 14;
	public static final String[] ruleNames = {
		"s", "program", "stat", "start_block", "end_block", "operation", "if_block", 
		"condition_block", "else_block", "block", "assign", "variable_type", "declaration", 
		"read_block", "write_block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'+'", "'-'", "'$$'", "'//'", "'='", "'<>'", "'>'", "'<'", 
		"'('", "')'", "'{'", "'}'", "'born'", "'die'", "'attack'", "'defend'", 
		"'listen'", "'talk'", "'mage'", "'knigth'", "'priest'", "'thief'", null, 
		null, null, null, null, null, null, null, "'buff'", "'nerf'", "'clean'", 
		"'roll'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EXC_MARK", "PLUS", "MINUS", "AND", "OR", "EQUAL", "NQUAL", "GT", 
		"LT", "LPAR", "RPAR", "LBRACE", "RBRACE", "BEGIN_RW", "END_RW", "IF_RW", 
		"ELSE_RW", "READ_RW", "WRITE_RW", "INTEGER_RW", "STRING_RW", "FLOAT_RW", 
		"BOOLEAN_RW", "NUMBER", "FLOAT", "BOOLEAN", "STRING", "ASSIGN", "ID", 
		"COMMENT", "WS", "POW", "SQRT", "ABS", "RAND"
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
			setState(30);
			operation(0);
			setState(31);
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
			setState(33);
			start_block();
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				stat();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << INTEGER_RW) | (1L << STRING_RW) | (1L << FLOAT_RW) | (1L << BOOLEAN_RW) | (1L << ID))) != 0) );
			setState(39);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				operation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				if_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				read_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
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
			setState(49);
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
			setState(51);
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
		public TerminalNode LT() { return getToken(MileParserParser.LT, 0); }
		public TerminalNode GT() { return getToken(MileParserParser.GT, 0); }
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
	public static class IdContext extends OperationContext {
		public TerminalNode ID() { return getToken(MileParserParser.ID, 0); }
		public IdContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MileParserVisitor ) return ((MileParserVisitor<? extends T>)visitor).visitId(this);
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
		public TerminalNode PLUS() { return getToken(MileParserParser.PLUS, 0); }
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(ID);
				}
				break;
			case LPAR:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(LPAR);
				setState(56);
				operation(0);
				setState(57);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(61);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(62);
						match(PLUS);
						setState(63);
						operation(7);
						}
						break;
					case 2:
						{
						_localctx = new CompContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NQUAL) | (1L << GT) | (1L << LT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						operation(6);
						}
						break;
					case 3:
						{
						_localctx = new AndContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(67);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(68);
						match(AND);
						setState(69);
						operation(5);
						}
						break;
					case 4:
						{
						_localctx = new OrContext(new OperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						match(OR);
						setState(72);
						operation(4);
						}
						break;
					}
					} 
				}
				setState(77);
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
			setState(78);
			match(IF_RW);
			setState(79);
			condition_block();
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				match(ELSE_RW);
				setState(81);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(LPAR);
				setState(85);
				operation(0);
				setState(86);
				match(RPAR);
				setState(87);
				match(EXC_MARK);
				setState(88);
				block();
				setState(89);
				match(EXC_MARK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(LPAR);
				setState(92);
				operation(0);
				setState(93);
				match(RPAR);
				setState(94);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXC_MARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(EXC_MARK);
				setState(99);
				block();
				setState(100);
				match(EXC_MARK);
				}
				break;
			case LPAR:
			case IF_RW:
			case READ_RW:
			case WRITE_RW:
			case INTEGER_RW:
			case STRING_RW:
			case FLOAT_RW:
			case BOOLEAN_RW:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF_RW) | (1L << READ_RW) | (1L << WRITE_RW) | (1L << INTEGER_RW) | (1L << STRING_RW) | (1L << FLOAT_RW) | (1L << BOOLEAN_RW) | (1L << ID))) != 0)) {
				{
				{
				setState(105);
				stat();
				}
				}
				setState(110);
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
		public TerminalNode NUMBER() { return getToken(MileParserParser.NUMBER, 0); }
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
			setState(111);
			match(ID);
			setState(112);
			match(ASSIGN);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(113);
				operation(0);
				}
				break;
			case 2:
				{
				setState(114);
				match(ID);
				}
				break;
			case 3:
				{
				setState(115);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(116);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(117);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(118);
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
		public TerminalNode STRING_RW() { return getToken(MileParserParser.STRING_RW, 0); }
		public TerminalNode BOOLEAN_RW() { return getToken(MileParserParser.BOOLEAN_RW, 0); }
		public TerminalNode FLOAT_RW() { return getToken(MileParserParser.FLOAT_RW, 0); }
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
			setState(121);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				variable_type();
				setState(124);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				variable_type();
				setState(127);
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
		enterRule(_localctx, 26, RULE_read_block);
		try {
			_localctx = new ReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(READ_RW);
			setState(132);
			match(LPAR);
			setState(133);
			match(ID);
			setState(134);
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
		enterRule(_localctx, 28, RULE_write_block);
		int _la;
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WRITE_RW);
			setState(137);
			match(LPAR);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
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
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==ID );
			setState(143);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0094\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\6\3&\n\3\r\3\16\3\'\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b\3\b\5\bU\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\5\nj\n\n\3\13\7\13m\n\13\f\13\16\13p\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0084"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\6\20\u008e\n\20\r\20\16"+
		"\20\u008f\3\20\3\20\3\20\2\3\f\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\5\3\2\b\13\3\2\26\31\4\2\35\35\37\37\u009a\2 \3\2\2\2\4#\3\2\2\2"+
		"\6\61\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f=\3\2\2\2\16P\3\2\2\2\20b\3\2"+
		"\2\2\22i\3\2\2\2\24n\3\2\2\2\26q\3\2\2\2\30{\3\2\2\2\32\u0083\3\2\2\2"+
		"\34\u0085\3\2\2\2\36\u008a\3\2\2\2 !\5\f\7\2!\"\7\2\2\3\"\3\3\2\2\2#%"+
		"\5\b\5\2$&\5\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2"+
		"\2)*\5\n\6\2*\5\3\2\2\2+\62\5\32\16\2,\62\5\26\f\2-\62\5\f\7\2.\62\5\16"+
		"\b\2/\62\5\34\17\2\60\62\5\36\20\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2"+
		"\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64\7\20\2\2\64"+
		"\t\3\2\2\2\65\66\7\21\2\2\66\13\3\2\2\2\678\b\7\1\28>\7\37\2\29:\7\f\2"+
		"\2:;\5\f\7\2;<\7\r\2\2<>\3\2\2\2=\67\3\2\2\2=9\3\2\2\2>M\3\2\2\2?@\f\b"+
		"\2\2@A\7\4\2\2AL\5\f\7\tBC\f\7\2\2CD\t\2\2\2DL\5\f\7\bEF\f\6\2\2FG\7\6"+
		"\2\2GL\5\f\7\7HI\f\5\2\2IJ\7\7\2\2JL\5\f\7\6K?\3\2\2\2KB\3\2\2\2KE\3\2"+
		"\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\r\3\2\2\2OM\3\2\2\2PQ\7"+
		"\22\2\2QT\5\20\t\2RS\7\23\2\2SU\5\22\n\2TR\3\2\2\2TU\3\2\2\2U\17\3\2\2"+
		"\2VW\7\f\2\2WX\5\f\7\2XY\7\r\2\2YZ\7\3\2\2Z[\5\24\13\2[\\\7\3\2\2\\c\3"+
		"\2\2\2]^\7\f\2\2^_\5\f\7\2_`\7\r\2\2`a\5\6\4\2ac\3\2\2\2bV\3\2\2\2b]\3"+
		"\2\2\2c\21\3\2\2\2de\7\3\2\2ef\5\24\13\2fg\7\3\2\2gj\3\2\2\2hj\5\6\4\2"+
		"id\3\2\2\2ih\3\2\2\2j\23\3\2\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2o\25\3\2\2\2pn\3\2\2\2qr\7\37\2\2ry\7\36\2\2sz\5\f\7\2tz\7"+
		"\37\2\2uz\7\32\2\2vz\7\33\2\2wz\7\35\2\2xz\7\34\2\2ys\3\2\2\2yt\3\2\2"+
		"\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\27\3\2\2\2{|\t\3\2\2|\31\3"+
		"\2\2\2}~\5\30\r\2~\177\7\37\2\2\177\u0084\3\2\2\2\u0080\u0081\5\30\r\2"+
		"\u0081\u0082\5\26\f\2\u0082\u0084\3\2\2\2\u0083}\3\2\2\2\u0083\u0080\3"+
		"\2\2\2\u0084\33\3\2\2\2\u0085\u0086\7\24\2\2\u0086\u0087\7\f\2\2\u0087"+
		"\u0088\7\37\2\2\u0088\u0089\7\r\2\2\u0089\35\3\2\2\2\u008a\u008b\7\25"+
		"\2\2\u008b\u008d\7\f\2\2\u008c\u008e\t\4\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\7\r\2\2\u0092\37\3\2\2\2\16\'\61=KMTbiny\u0083\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}