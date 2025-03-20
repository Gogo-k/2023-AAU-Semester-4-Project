// Generated from C:/Users/tubbe/Desktop/P4/Input\bnf.g4 by ANTLR 4.12.0
package Main.AntlrGenerated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class bnfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, Empty=24, 
		Operator=25, Comparator=26, String=27, ID=28, Digits=29, WS=30, COMMENT=31, 
		LINE_COMMENT=32, ErrorSymbol=33;
	public static final int
		RULE_s = 0, RULE_line = 1, RULE_forcedLineChange = 2, RULE_statement = 3, 
		RULE_elseToken = 4, RULE_extraLines = 5, RULE_loopLine = 6, RULE_loopStatement = 7, 
		RULE_condition = 8, RULE_extraCondition = 9, RULE_notCondition = 10, RULE_singleCondition = 11, 
		RULE_block = 12, RULE_loopBlock = 13, RULE_variableStatement = 14, RULE_declaration = 15, 
		RULE_assignment = 16, RULE_stringValue = 17, RULE_extraStringValue = 18, 
		RULE_equation = 19, RULE_extraEquation = 20, RULE_expression = 21, RULE_num = 22, 
		RULE_decimal = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "line", "forcedLineChange", "statement", "elseToken", "extraLines", 
			"loopLine", "loopStatement", "condition", "extraCondition", "notCondition", 
			"singleCondition", "block", "loopBlock", "variableStatement", "declaration", 
			"assignment", "stringValue", "extraStringValue", "equation", "extraEquation", 
			"expression", "num", "decimal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'if'", "'while'", "'print'", "'printLine'", "'else if'", 
			"'else'", "'break'", "'continue'", "'not'", "'and'", "'or'", "'('", "')'", 
			"'='", "'then'", "'end'", "'do'", "'number'", "'text'", "'+'", "'-'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Empty", "Operator", "Comparator", "String", "ID", "Digits", "WS", "COMMENT", 
			"LINE_COMMENT", "ErrorSymbol"
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

	@Override
	public String getGrammarFileName() { return "bnf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bnfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public ExtraLinesContext extraLines() {
			return getRuleContext(ExtraLinesContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			extraLines();
			setState(49);
			line();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForcedLineChangeContext forcedLineChange() {
			return getRuleContext(ForcedLineChangeContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode Empty() { return getToken(bnfParser.Empty, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				statement();
				setState(52);
				forcedLineChange();
				setState(53);
				line();
				}
				break;
			case T__18:
			case T__19:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				variableStatement();
				setState(56);
				forcedLineChange();
				setState(57);
				line();
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(Empty);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForcedLineChangeContext extends ParserRuleContext {
		public ForcedLineChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcedLineChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterForcedLineChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitForcedLineChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitForcedLineChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForcedLineChangeContext forcedLineChange() throws RecognitionException {
		ForcedLineChangeContext _localctx = new ForcedLineChangeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forcedLineChange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(T__0);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExtraLinesContext extraLines() {
			return getRuleContext(ExtraLinesContext.class,0);
		}
		public ElseTokenContext elseToken() {
			return getRuleContext(ElseTokenContext.class,0);
		}
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__1);
				setState(68);
				condition();
				setState(69);
				block();
				setState(70);
				extraLines();
				setState(71);
				elseToken();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__2);
				setState(74);
				condition();
				setState(75);
				loopBlock();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__3);
				setState(78);
				stringValue();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(T__4);
				setState(80);
				stringValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseTokenContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExtraLinesContext extraLines() {
			return getRuleContext(ExtraLinesContext.class,0);
		}
		public ElseTokenContext elseToken() {
			return getRuleContext(ElseTokenContext.class,0);
		}
		public TerminalNode Empty() { return getToken(bnfParser.Empty, 0); }
		public ElseTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterElseToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitElseToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitElseToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseTokenContext elseToken() throws RecognitionException {
		ElseTokenContext _localctx = new ElseTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseToken);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__5);
				setState(84);
				condition();
				setState(85);
				block();
				setState(86);
				extraLines();
				setState(87);
				elseToken();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__6);
				setState(90);
				block();
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(Empty);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraLinesContext extends ParserRuleContext {
		public ExtraLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterExtraLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitExtraLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitExtraLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraLinesContext extraLines() throws RecognitionException {
		ExtraLinesContext _localctx = new ExtraLinesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extraLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(94);
				match(T__0);
				}
				}
				setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopLineContext extends ParserRuleContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ForcedLineChangeContext forcedLineChange() {
			return getRuleContext(ForcedLineChangeContext.class,0);
		}
		public LoopLineContext loopLine() {
			return getRuleContext(LoopLineContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode Empty() { return getToken(bnfParser.Empty, 0); }
		public LoopLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterLoopLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitLoopLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitLoopLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopLineContext loopLine() throws RecognitionException {
		LoopLineContext _localctx = new LoopLineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopLine);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				loopStatement();
				setState(101);
				forcedLineChange();
				setState(102);
				loopLine();
				}
				break;
			case T__18:
			case T__19:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				variableStatement();
				setState(105);
				forcedLineChange();
				setState(106);
				loopLine();
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(Empty);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopStatement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public NotConditionContext notCondition() {
			return getRuleContext(NotConditionContext.class,0);
		}
		public ExtraConditionContext extraCondition() {
			return getRuleContext(ExtraConditionContext.class,0);
		}
		public SingleConditionContext singleCondition() {
			return getRuleContext(SingleConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__9);
				setState(117);
				notCondition();
				setState(118);
				extraCondition();
				}
				break;
			case T__12:
			case T__21:
			case String:
			case ID:
			case Digits:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				singleCondition();
				setState(121);
				extraCondition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Empty() { return getToken(bnfParser.Empty, 0); }
		public ExtraConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterExtraCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitExtraCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitExtraCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraConditionContext extraCondition() throws RecognitionException {
		ExtraConditionContext _localctx = new ExtraConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extraCondition);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__10);
				setState(126);
				condition();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__11);
				setState(128);
				condition();
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(Empty);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SingleConditionContext singleCondition() {
			return getRuleContext(SingleConditionContext.class,0);
		}
		public NotConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterNotCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitNotCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitNotCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotConditionContext notCondition() throws RecognitionException {
		NotConditionContext _localctx = new NotConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_notCondition);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__12);
				setState(133);
				condition();
				setState(134);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				singleCondition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleConditionContext extends ParserRuleContext {
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public TerminalNode Comparator() { return getToken(bnfParser.Comparator, 0); }
		public List<TerminalNode> String() { return getTokens(bnfParser.String); }
		public TerminalNode String(int i) {
			return getToken(bnfParser.String, i);
		}
		public SingleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterSingleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitSingleCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitSingleCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleConditionContext singleCondition() throws RecognitionException {
		SingleConditionContext _localctx = new SingleConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleCondition);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__21:
			case ID:
			case Digits:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				equation();
				setState(140);
				match(Comparator);
				setState(141);
				equation();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(String);
				setState(144);
				match(T__14);
				setState(145);
				match(String);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public ForcedLineChangeContext forcedLineChange() {
			return getRuleContext(ForcedLineChangeContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__15);
			setState(149);
			forcedLineChange();
			setState(150);
			line();
			setState(151);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopBlockContext extends ParserRuleContext {
		public ForcedLineChangeContext forcedLineChange() {
			return getRuleContext(ForcedLineChangeContext.class,0);
		}
		public LoopLineContext loopLine() {
			return getRuleContext(LoopLineContext.class,0);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__17);
			setState(154);
			forcedLineChange();
			setState(155);
			loopLine();
			setState(156);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableStatement);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bnfParser.ID, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__18);
				setState(163);
				match(ID);
				setState(164);
				match(T__14);
				setState(165);
				equation();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__19);
				setState(167);
				match(ID);
				setState(168);
				match(T__14);
				setState(169);
				stringValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bnfParser.ID, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				setState(173);
				match(T__14);
				setState(174);
				equation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ID);
				setState(176);
				match(T__14);
				setState(177);
				stringValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bnfParser.ID, 0); }
		public ExtraStringValueContext extraStringValue() {
			return getRuleContext(ExtraStringValueContext.class,0);
		}
		public TerminalNode String() { return getToken(bnfParser.String, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringValue);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(181);
				extraStringValue();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(String);
				setState(183);
				extraStringValue();
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				num();
				setState(185);
				extraStringValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraStringValueContext extends ParserRuleContext {
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public TerminalNode Empty() { return getToken(bnfParser.Empty, 0); }
		public ExtraStringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraStringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterExtraStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitExtraStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitExtraStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraStringValueContext extraStringValue() throws RecognitionException {
		ExtraStringValueContext _localctx = new ExtraStringValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_extraStringValue);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__20);
				setState(190);
				stringValue();
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(Empty);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public ExtraEquationContext extraEquation() {
			return getRuleContext(ExtraEquationContext.class,0);
		}
		public TerminalNode ID() { return getToken(bnfParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equation);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__12);
				setState(195);
				equation();
				setState(196);
				match(T__13);
				setState(197);
				extraEquation();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(ID);
				setState(200);
				extraEquation();
				}
				break;
			case T__21:
			case Digits:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				expression();
				setState(202);
				extraEquation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraEquationContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(bnfParser.Operator, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode Empty() { return getToken(bnfParser.Empty, 0); }
		public ExtraEquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraEquation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterExtraEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitExtraEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitExtraEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraEquationContext extraEquation() throws RecognitionException {
		ExtraEquationContext _localctx = new ExtraEquationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_extraEquation);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Operator:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(Operator);
				setState(207);
				equation();
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(Empty);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__21);
				setState(212);
				num();
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				num();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode Digits() { return getToken(bnfParser.Digits, 0); }
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(Digits);
			setState(217);
			decimal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode Digits() { return getToken(bnfParser.Digits, 0); }
		public TerminalNode Empty() { return getToken(bnfParser.Empty, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decimal);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__22);
				setState(220);
				match(Digits);
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(Empty);
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

	public static final String _serializedATN =
		"\u0004\u0001!\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001"+
		"\u0001\u0002\u0004\u0002@\b\u0002\u000b\u0002\f\u0002A\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004]\b\u0004\u0001\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005c\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b|\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u0083\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u008a\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0093\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00a1\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00ab\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00b3\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00bc"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c1\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00cd\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d2\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00d7\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00df\b\u0017"+
		"\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0000\u00e5"+
		"\u00000\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004?"+
		"\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\b\\\u0001\u0000"+
		"\u0000\u0000\na\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000e"+
		"r\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0082\u0001"+
		"\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0092\u0001"+
		"\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u0099\u0001"+
		"\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000\u0000\u001e\u00aa\u0001"+
		"\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00bb\u0001\u0000"+
		"\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000\u0000"+
		"(\u00d1\u0001\u0000\u0000\u0000*\u00d6\u0001\u0000\u0000\u0000,\u00d8"+
		"\u0001\u0000\u0000\u0000.\u00de\u0001\u0000\u0000\u000001\u0003\n\u0005"+
		"\u000012\u0003\u0002\u0001\u00002\u0001\u0001\u0000\u0000\u000034\u0003"+
		"\u0006\u0003\u000045\u0003\u0004\u0002\u000056\u0003\u0002\u0001\u0000"+
		"6=\u0001\u0000\u0000\u000078\u0003\u001c\u000e\u000089\u0003\u0004\u0002"+
		"\u00009:\u0003\u0002\u0001\u0000:=\u0001\u0000\u0000\u0000;=\u0005\u0018"+
		"\u0000\u0000<3\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>@\u0005\u0001\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0002\u0000\u0000DE\u0003\u0010\b\u0000EF\u0003\u0018\f\u0000"+
		"FG\u0003\n\u0005\u0000GH\u0003\b\u0004\u0000HR\u0001\u0000\u0000\u0000"+
		"IJ\u0005\u0003\u0000\u0000JK\u0003\u0010\b\u0000KL\u0003\u001a\r\u0000"+
		"LR\u0001\u0000\u0000\u0000MN\u0005\u0004\u0000\u0000NR\u0003\"\u0011\u0000"+
		"OP\u0005\u0005\u0000\u0000PR\u0003\"\u0011\u0000QC\u0001\u0000\u0000\u0000"+
		"QI\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0005\u0006\u0000\u0000TU\u0003"+
		"\u0010\b\u0000UV\u0003\u0018\f\u0000VW\u0003\n\u0005\u0000WX\u0003\b\u0004"+
		"\u0000X]\u0001\u0000\u0000\u0000YZ\u0005\u0007\u0000\u0000Z]\u0003\u0018"+
		"\f\u0000[]\u0005\u0018\u0000\u0000\\S\u0001\u0000\u0000\u0000\\Y\u0001"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000"+
		"^`\u0005\u0001\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000b\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0003\u000e\u0007\u0000"+
		"ef\u0003\u0004\u0002\u0000fg\u0003\f\u0006\u0000gn\u0001\u0000\u0000\u0000"+
		"hi\u0003\u001c\u000e\u0000ij\u0003\u0004\u0002\u0000jk\u0003\f\u0006\u0000"+
		"kn\u0001\u0000\u0000\u0000ln\u0005\u0018\u0000\u0000md\u0001\u0000\u0000"+
		"\u0000mh\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\r\u0001\u0000"+
		"\u0000\u0000os\u0003\u0006\u0003\u0000ps\u0005\b\u0000\u0000qs\u0005\t"+
		"\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000s\u000f\u0001\u0000\u0000\u0000tu\u0005\n\u0000\u0000"+
		"uv\u0003\u0014\n\u0000vw\u0003\u0012\t\u0000w|\u0001\u0000\u0000\u0000"+
		"xy\u0003\u0016\u000b\u0000yz\u0003\u0012\t\u0000z|\u0001\u0000\u0000\u0000"+
		"{t\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u0011\u0001\u0000"+
		"\u0000\u0000}~\u0005\u000b\u0000\u0000~\u0083\u0003\u0010\b\u0000\u007f"+
		"\u0080\u0005\f\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000\u0081\u0083"+
		"\u0005\u0018\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0082\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0013\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u0086\u0003\u0010"+
		"\b\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0003\u0016\u000b\u0000\u0089\u0084\u0001\u0000\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0015\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0003&\u0013\u0000\u008c\u008d\u0005\u001a\u0000\u0000"+
		"\u008d\u008e\u0003&\u0013\u0000\u008e\u0093\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u001b\u0000\u0000\u0090\u0091\u0005\u000f\u0000\u0000\u0091"+
		"\u0093\u0005\u001b\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0092"+
		"\u008f\u0001\u0000\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u0010\u0000\u0000\u0095\u0096\u0003\u0004\u0002\u0000\u0096"+
		"\u0097\u0003\u0002\u0001\u0000\u0097\u0098\u0005\u0011\u0000\u0000\u0098"+
		"\u0019\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0012\u0000\u0000\u009a"+
		"\u009b\u0003\u0004\u0002\u0000\u009b\u009c\u0003\f\u0006\u0000\u009c\u009d"+
		"\u0005\u0011\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000\u009e\u00a1"+
		"\u0003\u001e\u000f\u0000\u009f\u00a1\u0003 \u0010\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u001d\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u0013\u0000\u0000\u00a3\u00a4\u0005"+
		"\u001c\u0000\u0000\u00a4\u00a5\u0005\u000f\u0000\u0000\u00a5\u00ab\u0003"+
		"&\u0013\u0000\u00a6\u00a7\u0005\u0014\u0000\u0000\u00a7\u00a8\u0005\u001c"+
		"\u0000\u0000\u00a8\u00a9\u0005\u000f\u0000\u0000\u00a9\u00ab\u0003\"\u0011"+
		"\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ab\u001f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u001c\u0000"+
		"\u0000\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u00b3\u0003&\u0013\u0000"+
		"\u00af\u00b0\u0005\u001c\u0000\u0000\u00b0\u00b1\u0005\u000f\u0000\u0000"+
		"\u00b1\u00b3\u0003\"\u0011\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2"+
		"\u00af\u0001\u0000\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u001c\u0000\u0000\u00b5\u00bc\u0003$\u0012\u0000\u00b6\u00b7\u0005"+
		"\u001b\u0000\u0000\u00b7\u00bc\u0003$\u0012\u0000\u00b8\u00b9\u0003,\u0016"+
		"\u0000\u00b9\u00ba\u0003$\u0012\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b4\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bc#\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u0015\u0000\u0000\u00be\u00c1\u0003\"\u0011\u0000\u00bf\u00c1"+
		"\u0005\u0018\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1%\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\r\u0000\u0000\u00c3\u00c4\u0003&\u0013\u0000\u00c4\u00c5\u0005\u000e"+
		"\u0000\u0000\u00c5\u00c6\u0003(\u0014\u0000\u00c6\u00cd\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u001c\u0000\u0000\u00c8\u00cd\u0003(\u0014\u0000"+
		"\u00c9\u00ca\u0003*\u0015\u0000\u00ca\u00cb\u0003(\u0014\u0000\u00cb\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c2\u0001\u0000\u0000\u0000\u00cc\u00c7"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cd\'\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005\u0019\u0000\u0000\u00cf\u00d2\u0003"+
		"&\u0013\u0000\u00d0\u00d2\u0005\u0018\u0000\u0000\u00d1\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2)\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0016\u0000\u0000\u00d4\u00d7\u0003,\u0016\u0000"+
		"\u00d5\u00d7\u0003,\u0016\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7+\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\u001d\u0000\u0000\u00d9\u00da\u0003.\u0017\u0000\u00da-\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0017\u0000\u0000\u00dc\u00df\u0005\u001d"+
		"\u0000\u0000\u00dd\u00df\u0005\u0018\u0000\u0000\u00de\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df/\u0001\u0000\u0000"+
		"\u0000\u0014<AQ\\amr{\u0082\u0089\u0092\u00a0\u00aa\u00b2\u00bb\u00c0"+
		"\u00cc\u00d1\u00d6\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}