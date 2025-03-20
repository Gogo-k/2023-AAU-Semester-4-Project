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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		String=53, ID=54, Digits=55, WS=56, COMMENT=57, LINE_COMMENT=58, ErrorSymbol=59;
	public static final int
		RULE_s = 0, RULE_startFunction = 1, RULE_drawFunction = 2, RULE_line = 3, 
		RULE_statement = 4, RULE_globalStatement = 5, RULE_visualStatement = 6, 
		RULE_colorPick = 7, RULE_colorText = 8, RULE_figure = 9, RULE_parameter = 10, 
		RULE_elseToken = 11, RULE_condition = 12, RULE_extraCondition = 13, RULE_notCondition = 14, 
		RULE_singleCondition = 15, RULE_block = 16, RULE_loopBlock = 17, RULE_variableStatement = 18, 
		RULE_declaration = 19, RULE_assignment = 20, RULE_value = 21, RULE_stringCheckRule = 22, 
		RULE_extraValue = 23, RULE_stringValue = 24, RULE_extraStringValue = 25, 
		RULE_equation = 26, RULE_extraEquation = 27, RULE_expression = 28, RULE_num = 29, 
		RULE_decimal = 30, RULE_forcedLineChange = 31, RULE_extraLines = 32, RULE_operator = 33, 
		RULE_comparator = 34, RULE_empty = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "startFunction", "drawFunction", "line", "statement", "globalStatement", 
			"visualStatement", "colorPick", "colorText", "figure", "parameter", "elseToken", 
			"condition", "extraCondition", "notCondition", "singleCondition", "block", 
			"loopBlock", "variableStatement", "declaration", "assignment", "value", 
			"stringCheckRule", "extraValue", "stringValue", "extraStringValue", "equation", 
			"extraEquation", "expression", "num", "decimal", "forcedLineChange", 
			"extraLines", "operator", "comparator", "empty"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'on'", "'start'", "'eachFrame'", "'if'", "'while'", "'print'", 
			"'printLine'", "'break'", "'continue'", "'color'", "'background'", "'darkRed'", 
			"'red'", "'lightRed'", "'darkGreen'", "'green'", "'lightGreen'", "'darkBlue'", 
			"'blue'", "'lightBlue'", "'black'", "'white'", "'darkGrey'", "'grey'", 
			"'lightGrey'", "'circle'", "'square'", "'triangle'", "'else if'", "'else'", 
			"'('", "')'", "'not'", "'and'", "'or'", "'='", "'then'", "'end'", "'do'", 
			"'number'", "'text'", "'+'", "'-'", "'.'", "'\\n'", "'%'", "'/'", "'*'", 
			"'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "String", "ID", "Digits", "WS", "COMMENT", 
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
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StartFunctionContext startFunction() {
			return getRuleContext(StartFunctionContext.class,0);
		}
		public DrawFunctionContext drawFunction() {
			return getRuleContext(DrawFunctionContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				extraLines();
				setState(73);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				extraLines();
				setState(76);
				globalStatement();
				setState(77);
				startFunction();
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(78);
					drawFunction();
					}
					break;
				case EOF:
					{
					setState(79);
					empty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class StartFunctionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForcedLineChangeContext forcedLineChange() {
			return getRuleContext(ForcedLineChangeContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StartFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterStartFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitStartFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitStartFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartFunctionContext startFunction() throws RecognitionException {
		StartFunctionContext _localctx = new StartFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			match(T__1);
			setState(86);
			block();
			setState(87);
			forcedLineChange();
			setState(88);
			globalStatement();
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
	public static class DrawFunctionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForcedLineChangeContext forcedLineChange() {
			return getRuleContext(ForcedLineChangeContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public DrawFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterDrawFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitDrawFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitDrawFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawFunctionContext drawFunction() throws RecognitionException {
		DrawFunctionContext _localctx = new DrawFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_drawFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__0);
			setState(91);
			match(T__2);
			setState(92);
			block();
			setState(93);
			forcedLineChange();
			setState(94);
			globalStatement();
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
		public VisualStatementContext visualStatement() {
			return getRuleContext(VisualStatementContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_line);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				statement();
				setState(97);
				forcedLineChange();
				setState(98);
				line();
				}
				break;
			case T__39:
			case T__40:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				variableStatement();
				setState(101);
				forcedLineChange();
				setState(102);
				line();
				}
				break;
			case T__9:
			case T__10:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				visualStatement();
				setState(105);
				forcedLineChange();
				setState(106);
				line();
				}
				break;
			case EOF:
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				empty();
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__3);
				setState(112);
				condition();
				setState(113);
				block();
				setState(114);
				extraLines();
				setState(115);
				elseToken();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__4);
				setState(118);
				condition();
				setState(119);
				loopBlock();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(T__5);
				setState(122);
				stringValue();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__6);
				setState(124);
				stringValue();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
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
	public static class GlobalStatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ForcedLineChangeContext forcedLineChange() {
			return getRuleContext(ForcedLineChangeContext.class,0);
		}
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_globalStatement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				declaration();
				setState(130);
				forcedLineChange();
				setState(131);
				globalStatement();
				}
				break;
			case EOF:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				empty();
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
	public static class VisualStatementContext extends ParserRuleContext {
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
		}
		public ColorPickContext colorPick() {
			return getRuleContext(ColorPickContext.class,0);
		}
		public VisualStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visualStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterVisualStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitVisualStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitVisualStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisualStatementContext visualStatement() throws RecognitionException {
		VisualStatementContext _localctx = new VisualStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_visualStatement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				figure();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				colorPick();
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
	public static class ColorPickContext extends ParserRuleContext {
		public ColorTextContext colorText() {
			return getRuleContext(ColorTextContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ColorPickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorPick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterColorPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitColorPick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitColorPick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorPickContext colorPick() throws RecognitionException {
		ColorPickContext _localctx = new ColorPickContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colorPick);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__9);
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
					{
					setState(141);
					colorText();
					}
					break;
				case T__42:
				case ID:
				case Digits:
					{
					setState(142);
					parameter();
					setState(143);
					parameter();
					setState(144);
					parameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__10);
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
					{
					setState(149);
					colorText();
					}
					break;
				case T__42:
				case ID:
				case Digits:
					{
					setState(150);
					parameter();
					setState(151);
					parameter();
					setState(152);
					parameter();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class ColorTextContext extends ParserRuleContext {
		public ColorTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterColorText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitColorText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitColorText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorTextContext colorText() throws RecognitionException {
		ColorTextContext _localctx = new ColorTextContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_colorText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67104768L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FigureContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_figure);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__25);
				setState(161);
				parameter();
				setState(162);
				parameter();
				setState(163);
				parameter();
				setState(164);
				parameter();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__26);
				setState(167);
				parameter();
				setState(168);
				parameter();
				setState(169);
				parameter();
				setState(170);
				parameter();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__27);
				setState(173);
				parameter();
				setState(174);
				parameter();
				setState(175);
				parameter();
				setState(176);
				parameter();
				setState(177);
				parameter();
				setState(178);
				parameter();
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
	public static class ParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(bnfParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case Digits:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expression();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(ID);
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
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_elseToken);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__28);
				setState(187);
				condition();
				setState(188);
				block();
				setState(189);
				extraLines();
				setState(190);
				elseToken();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__29);
				setState(193);
				block();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				empty();
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExtraConditionContext extraCondition() {
			return getRuleContext(ExtraConditionContext.class,0);
		}
		public NotConditionContext notCondition() {
			return getRuleContext(NotConditionContext.class,0);
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
		enterRule(_localctx, 24, RULE_condition);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__30);
				setState(198);
				condition();
				setState(199);
				match(T__31);
				setState(200);
				extraCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__32);
				setState(203);
				notCondition();
				setState(204);
				extraCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				singleCondition();
				setState(207);
				extraCondition();
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
	public static class ExtraConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_extraCondition);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__33);
				setState(212);
				condition();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__34);
				setState(214);
				condition();
				}
				break;
			case T__31:
			case T__36:
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				empty();
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
		enterRule(_localctx, 28, RULE_notCondition);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__30);
				setState(219);
				condition();
				setState(220);
				match(T__31);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
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
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_singleCondition);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__42:
			case ID:
			case Digits:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				equation();
				setState(226);
				comparator();
				setState(227);
				equation();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(String);
				setState(230);
				match(T__35);
				setState(231);
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
		enterRule(_localctx, 32, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__36);
			setState(235);
			forcedLineChange();
			setState(236);
			line();
			setState(237);
			match(T__37);
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
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
		enterRule(_localctx, 34, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__38);
			setState(240);
			forcedLineChange();
			setState(241);
			line();
			setState(242);
			match(T__37);
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
		enterRule(_localctx, 36, RULE_variableStatement);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
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
		enterRule(_localctx, 38, RULE_declaration);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__39);
				setState(249);
				match(ID);
				setState(250);
				match(T__35);
				setState(251);
				equation();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__40);
				setState(253);
				match(ID);
				setState(254);
				match(T__35);
				setState(255);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
			setState(259);
			match(T__35);
			setState(260);
			value();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bnfParser.ID, 0); }
		public ExtraValueContext extraValue() {
			return getRuleContext(ExtraValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringCheckRuleContext stringCheckRule() {
			return getRuleContext(StringCheckRuleContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(ID);
				setState(263);
				extraValue();
				}
				break;
			case T__42:
			case Digits:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				expression();
				setState(265);
				extraValue();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				stringCheckRule();
				setState(268);
				extraValue();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(T__30);
				setState(271);
				value();
				setState(272);
				match(T__31);
				setState(273);
				extraValue();
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
	public static class StringCheckRuleContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(bnfParser.String, 0); }
		public StringCheckRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringCheckRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterStringCheckRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitStringCheckRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitStringCheckRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringCheckRuleContext stringCheckRule() throws RecognitionException {
		StringCheckRuleContext _localctx = new StringCheckRuleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringCheckRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(String);
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
	public static class ExtraValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public ExtraValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterExtraValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitExtraValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitExtraValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraValueContext extraValue() throws RecognitionException {
		ExtraValueContext _localctx = new ExtraValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_extraValue);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__41);
				setState(280);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				operator();
				setState(282);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				empty();
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
		enterRule(_localctx, 48, RULE_stringValue);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(ID);
				setState(288);
				extraStringValue();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(String);
				setState(290);
				extraStringValue();
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				num();
				setState(292);
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
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_extraStringValue);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__41);
				setState(297);
				stringValue();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				empty();
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
		enterRule(_localctx, 52, RULE_equation);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__30);
				setState(302);
				equation();
				setState(303);
				match(T__31);
				setState(304);
				extraEquation();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(ID);
				setState(307);
				extraEquation();
				}
				break;
			case T__42:
			case Digits:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				expression();
				setState(309);
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_extraEquation);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				operator();
				setState(314);
				equation();
				}
				break;
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__38:
			case T__44:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				empty();
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
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(T__42);
				setState(320);
				num();
				}
				break;
			case Digits:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
		enterRule(_localctx, 58, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(Digits);
			setState(325);
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
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_decimal);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__43);
				setState(328);
				match(Digits);
				}
				break;
			case T__31:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__38:
			case T__41:
			case T__42:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case ID:
			case Digits:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				empty();
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
		enterRule(_localctx, 62, RULE_forcedLineChange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				match(T__44);
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__44 );
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
		enterRule(_localctx, 64, RULE_extraLines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					match(T__44);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 505775348776960L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8444318020796416L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bnfListener ) ((bnfListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bnfVisitor ) return ((bnfVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\u0004\u0001;\u015e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000Q\b\u0000\u0003\u0000S\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0080\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0087\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u008b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0093\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009b\b\u0007"+
		"\u0003\u0007\u009d\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b5"+
		"\b\t\u0001\n\u0001\n\u0003\n\u00b9\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00c4\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d2\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d9\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e0\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00e9\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00f7\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0101\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0114\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u011e\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0127\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012c\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0138\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u013e\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0143\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u014b\b\u001e\u0001\u001f\u0004"+
		"\u001f\u014e\b\u001f\u000b\u001f\f\u001f\u014f\u0001 \u0005 \u0153\b "+
		"\n \f \u0156\t \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0000"+
		"\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0003\u0001\u0000\f\u0019"+
		"\u0002\u0000*+.0\u0002\u0000$$14\u0164\u0000R\u0001\u0000\u0000\u0000"+
		"\u0002T\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006m"+
		"\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u0086\u0001"+
		"\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000"+
		"\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00b4\u0001\u0000"+
		"\u0000\u0000\u0014\u00b8\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000"+
		"\u0000\u0000\u0018\u00d1\u0001\u0000\u0000\u0000\u001a\u00d8\u0001\u0000"+
		"\u0000\u0000\u001c\u00df\u0001\u0000\u0000\u0000\u001e\u00e8\u0001\u0000"+
		"\u0000\u0000 \u00ea\u0001\u0000\u0000\u0000\"\u00ef\u0001\u0000\u0000"+
		"\u0000$\u00f6\u0001\u0000\u0000\u0000&\u0100\u0001\u0000\u0000\u0000("+
		"\u0102\u0001\u0000\u0000\u0000*\u0113\u0001\u0000\u0000\u0000,\u0115\u0001"+
		"\u0000\u0000\u0000.\u011d\u0001\u0000\u0000\u00000\u0126\u0001\u0000\u0000"+
		"\u00002\u012b\u0001\u0000\u0000\u00004\u0137\u0001\u0000\u0000\u00006"+
		"\u013d\u0001\u0000\u0000\u00008\u0142\u0001\u0000\u0000\u0000:\u0144\u0001"+
		"\u0000\u0000\u0000<\u014a\u0001\u0000\u0000\u0000>\u014d\u0001\u0000\u0000"+
		"\u0000@\u0154\u0001\u0000\u0000\u0000B\u0157\u0001\u0000\u0000\u0000D"+
		"\u0159\u0001\u0000\u0000\u0000F\u015b\u0001\u0000\u0000\u0000HI\u0003"+
		"@ \u0000IJ\u0003\u0006\u0003\u0000JS\u0001\u0000\u0000\u0000KL\u0003@"+
		" \u0000LM\u0003\n\u0005\u0000MP\u0003\u0002\u0001\u0000NQ\u0003\u0004"+
		"\u0002\u0000OQ\u0003F#\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000QS\u0001\u0000\u0000\u0000RH\u0001\u0000\u0000\u0000RK\u0001\u0000"+
		"\u0000\u0000S\u0001\u0001\u0000\u0000\u0000TU\u0005\u0001\u0000\u0000"+
		"UV\u0005\u0002\u0000\u0000VW\u0003 \u0010\u0000WX\u0003>\u001f\u0000X"+
		"Y\u0003\n\u0005\u0000Y\u0003\u0001\u0000\u0000\u0000Z[\u0005\u0001\u0000"+
		"\u0000[\\\u0005\u0003\u0000\u0000\\]\u0003 \u0010\u0000]^\u0003>\u001f"+
		"\u0000^_\u0003\n\u0005\u0000_\u0005\u0001\u0000\u0000\u0000`a\u0003\b"+
		"\u0004\u0000ab\u0003>\u001f\u0000bc\u0003\u0006\u0003\u0000cn\u0001\u0000"+
		"\u0000\u0000de\u0003$\u0012\u0000ef\u0003>\u001f\u0000fg\u0003\u0006\u0003"+
		"\u0000gn\u0001\u0000\u0000\u0000hi\u0003\f\u0006\u0000ij\u0003>\u001f"+
		"\u0000jk\u0003\u0006\u0003\u0000kn\u0001\u0000\u0000\u0000ln\u0003F#\u0000"+
		"m`\u0001\u0000\u0000\u0000md\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000n\u0007\u0001\u0000\u0000\u0000op\u0005"+
		"\u0004\u0000\u0000pq\u0003\u0018\f\u0000qr\u0003 \u0010\u0000rs\u0003"+
		"@ \u0000st\u0003\u0016\u000b\u0000t\u0080\u0001\u0000\u0000\u0000uv\u0005"+
		"\u0005\u0000\u0000vw\u0003\u0018\f\u0000wx\u0003\"\u0011\u0000x\u0080"+
		"\u0001\u0000\u0000\u0000yz\u0005\u0006\u0000\u0000z\u0080\u00030\u0018"+
		"\u0000{|\u0005\u0007\u0000\u0000|\u0080\u00030\u0018\u0000}\u0080\u0005"+
		"\b\u0000\u0000~\u0080\u0005\t\u0000\u0000\u007fo\u0001\u0000\u0000\u0000"+
		"\u007fu\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007f{"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000\u0081\u0082\u0003&\u0013"+
		"\u0000\u0082\u0083\u0003>\u001f\u0000\u0083\u0084\u0003\n\u0005\u0000"+
		"\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0087\u0003F#\u0000\u0086\u0081"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u000b"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0003\u0012\t\u0000\u0089\u008b\u0003"+
		"\u000e\u0007\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u0092\u0005\n"+
		"\u0000\u0000\u008d\u0093\u0003\u0010\b\u0000\u008e\u008f\u0003\u0014\n"+
		"\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090\u0091\u0003\u0014\n\u0000"+
		"\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000"+
		"\u0092\u008e\u0001\u0000\u0000\u0000\u0093\u009d\u0001\u0000\u0000\u0000"+
		"\u0094\u009a\u0005\u000b\u0000\u0000\u0095\u009b\u0003\u0010\b\u0000\u0096"+
		"\u0097\u0003\u0014\n\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099"+
		"\u0003\u0014\n\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0095\u0001"+
		"\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009b\u009d\u0001"+
		"\u0000\u0000\u0000\u009c\u008c\u0001\u0000\u0000\u0000\u009c\u0094\u0001"+
		"\u0000\u0000\u0000\u009d\u000f\u0001\u0000\u0000\u0000\u009e\u009f\u0007"+
		"\u0000\u0000\u0000\u009f\u0011\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\u001a\u0000\u0000\u00a1\u00a2\u0003\u0014\n\u0000\u00a2\u00a3\u0003\u0014"+
		"\n\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u00a5\u0003\u0014\n\u0000"+
		"\u00a5\u00b5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001b\u0000\u0000"+
		"\u00a7\u00a8\u0003\u0014\n\u0000\u00a8\u00a9\u0003\u0014\n\u0000\u00a9"+
		"\u00aa\u0003\u0014\n\u0000\u00aa\u00ab\u0003\u0014\n\u0000\u00ab\u00b5"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u001c\u0000\u0000\u00ad\u00ae"+
		"\u0003\u0014\n\u0000\u00ae\u00af\u0003\u0014\n\u0000\u00af\u00b0\u0003"+
		"\u0014\n\u0000\u00b0\u00b1\u0003\u0014\n\u0000\u00b1\u00b2\u0003\u0014"+
		"\n\u0000\u00b2\u00b3\u0003\u0014\n\u0000\u00b3\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b4\u00a0\u0001\u0000\u0000\u0000\u00b4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b5\u0013\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u00038\u001c\u0000\u00b7\u00b9\u00056\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u0015\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u001d\u0000\u0000\u00bb"+
		"\u00bc\u0003\u0018\f\u0000\u00bc\u00bd\u0003 \u0010\u0000\u00bd\u00be"+
		"\u0003@ \u0000\u00be\u00bf\u0003\u0016\u000b\u0000\u00bf\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u001e\u0000\u0000\u00c1\u00c4\u0003 \u0010"+
		"\u0000\u00c2\u00c4\u0003F#\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u0017\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u001f\u0000\u0000\u00c6"+
		"\u00c7\u0003\u0018\f\u0000\u00c7\u00c8\u0005 \u0000\u0000\u00c8\u00c9"+
		"\u0003\u001a\r\u0000\u00c9\u00d2\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"!\u0000\u0000\u00cb\u00cc\u0003\u001c\u000e\u0000\u00cc\u00cd\u0003\u001a"+
		"\r\u0000\u00cd\u00d2\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u001e\u000f"+
		"\u0000\u00cf\u00d0\u0003\u001a\r\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00c5\u0001\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u0019\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005\"\u0000\u0000\u00d4\u00d9\u0003\u0018\f\u0000\u00d5"+
		"\u00d6\u0005#\u0000\u0000\u00d6\u00d9\u0003\u0018\f\u0000\u00d7\u00d9"+
		"\u0003F#\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u001b\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\u001f\u0000\u0000\u00db\u00dc\u0003\u0018"+
		"\f\u0000\u00dc\u00dd\u0005 \u0000\u0000\u00dd\u00e0\u0001\u0000\u0000"+
		"\u0000\u00de\u00e0\u0003\u001e\u000f\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u001d\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u00034\u001a\u0000\u00e2\u00e3\u0003D\"\u0000\u00e3"+
		"\u00e4\u00034\u001a\u0000\u00e4\u00e9\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u00055\u0000\u0000\u00e6\u00e7\u0005$\u0000\u0000\u00e7\u00e9\u00055"+
		"\u0000\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e9\u001f\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005%\u0000"+
		"\u0000\u00eb\u00ec\u0003>\u001f\u0000\u00ec\u00ed\u0003\u0006\u0003\u0000"+
		"\u00ed\u00ee\u0005&\u0000\u0000\u00ee!\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\'\u0000\u0000\u00f0\u00f1\u0003>\u001f\u0000\u00f1\u00f2\u0003"+
		"\u0006\u0003\u0000\u00f2\u00f3\u0005&\u0000\u0000\u00f3#\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f7\u0003&\u0013\u0000\u00f5\u00f7\u0003(\u0014\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"%\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005(\u0000\u0000\u00f9\u00fa\u0005"+
		"6\u0000\u0000\u00fa\u00fb\u0005$\u0000\u0000\u00fb\u0101\u00034\u001a"+
		"\u0000\u00fc\u00fd\u0005)\u0000\u0000\u00fd\u00fe\u00056\u0000\u0000\u00fe"+
		"\u00ff\u0005$\u0000\u0000\u00ff\u0101\u00030\u0018\u0000\u0100\u00f8\u0001"+
		"\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0101\'\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u00056\u0000\u0000\u0103\u0104\u0005$\u0000\u0000"+
		"\u0104\u0105\u0003*\u0015\u0000\u0105)\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u00056\u0000\u0000\u0107\u0114\u0003.\u0017\u0000\u0108\u0109\u00038"+
		"\u001c\u0000\u0109\u010a\u0003.\u0017\u0000\u010a\u0114\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0003,\u0016\u0000\u010c\u010d\u0003.\u0017\u0000\u010d"+
		"\u0114\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u001f\u0000\u0000\u010f"+
		"\u0110\u0003*\u0015\u0000\u0110\u0111\u0005 \u0000\u0000\u0111\u0112\u0003"+
		".\u0017\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0106\u0001\u0000"+
		"\u0000\u0000\u0113\u0108\u0001\u0000\u0000\u0000\u0113\u010b\u0001\u0000"+
		"\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0114+\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u00055\u0000\u0000\u0116-\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005*\u0000\u0000\u0118\u011e\u0003*\u0015\u0000\u0119\u011a\u0003"+
		"B!\u0000\u011a\u011b\u0003*\u0015\u0000\u011b\u011e\u0001\u0000\u0000"+
		"\u0000\u011c\u011e\u0003F#\u0000\u011d\u0117\u0001\u0000\u0000\u0000\u011d"+
		"\u0119\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e"+
		"/\u0001\u0000\u0000\u0000\u011f\u0120\u00056\u0000\u0000\u0120\u0127\u0003"+
		"2\u0019\u0000\u0121\u0122\u00055\u0000\u0000\u0122\u0127\u00032\u0019"+
		"\u0000\u0123\u0124\u0003:\u001d\u0000\u0124\u0125\u00032\u0019\u0000\u0125"+
		"\u0127\u0001\u0000\u0000\u0000\u0126\u011f\u0001\u0000\u0000\u0000\u0126"+
		"\u0121\u0001\u0000\u0000\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0127"+
		"1\u0001\u0000\u0000\u0000\u0128\u0129\u0005*\u0000\u0000\u0129\u012c\u0003"+
		"0\u0018\u0000\u012a\u012c\u0003F#\u0000\u012b\u0128\u0001\u0000\u0000"+
		"\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c3\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005\u001f\u0000\u0000\u012e\u012f\u00034\u001a\u0000\u012f"+
		"\u0130\u0005 \u0000\u0000\u0130\u0131\u00036\u001b\u0000\u0131\u0138\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u00056\u0000\u0000\u0133\u0138\u00036\u001b"+
		"\u0000\u0134\u0135\u00038\u001c\u0000\u0135\u0136\u00036\u001b\u0000\u0136"+
		"\u0138\u0001\u0000\u0000\u0000\u0137\u012d\u0001\u0000\u0000\u0000\u0137"+
		"\u0132\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0138"+
		"5\u0001\u0000\u0000\u0000\u0139\u013a\u0003B!\u0000\u013a\u013b\u0003"+
		"4\u001a\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013e\u0003F#"+
		"\u0000\u013d\u0139\u0001\u0000\u0000\u0000\u013d\u013c\u0001\u0000\u0000"+
		"\u0000\u013e7\u0001\u0000\u0000\u0000\u013f\u0140\u0005+\u0000\u0000\u0140"+
		"\u0143\u0003:\u001d\u0000\u0141\u0143\u0003:\u001d\u0000\u0142\u013f\u0001"+
		"\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u01439\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u00057\u0000\u0000\u0145\u0146\u0003<\u001e\u0000"+
		"\u0146;\u0001\u0000\u0000\u0000\u0147\u0148\u0005,\u0000\u0000\u0148\u014b"+
		"\u00057\u0000\u0000\u0149\u014b\u0003F#\u0000\u014a\u0147\u0001\u0000"+
		"\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b=\u0001\u0000\u0000"+
		"\u0000\u014c\u014e\u0005-\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150?\u0001\u0000\u0000\u0000\u0151"+
		"\u0153\u0005-\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155A\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0007\u0001\u0000\u0000\u0158C\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0007\u0002\u0000\u0000\u015aE\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015cG\u0001\u0000\u0000\u0000"+
		"\u001cPRm\u007f\u0086\u008a\u0092\u009a\u009c\u00b4\u00b8\u00c3\u00d1"+
		"\u00d8\u00df\u00e8\u00f6\u0100\u0113\u011d\u0126\u012b\u0137\u013d\u0142"+
		"\u014a\u014f\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}