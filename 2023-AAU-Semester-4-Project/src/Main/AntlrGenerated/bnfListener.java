// Generated from C:/Users/tubbe/Desktop/P4/Input\bnf.g4 by ANTLR 4.12.0
package Main.AntlrGenerated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bnfParser}.
 */
public interface bnfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bnfParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(bnfParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(bnfParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#startFunction}.
	 * @param ctx the parse tree
	 */
	void enterStartFunction(bnfParser.StartFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#startFunction}.
	 * @param ctx the parse tree
	 */
	void exitStartFunction(bnfParser.StartFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#drawFunction}.
	 * @param ctx the parse tree
	 */
	void enterDrawFunction(bnfParser.DrawFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#drawFunction}.
	 * @param ctx the parse tree
	 */
	void exitDrawFunction(bnfParser.DrawFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(bnfParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(bnfParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(bnfParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(bnfParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(bnfParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#globalStatement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(bnfParser.GlobalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#visualStatement}.
	 * @param ctx the parse tree
	 */
	void enterVisualStatement(bnfParser.VisualStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#visualStatement}.
	 * @param ctx the parse tree
	 */
	void exitVisualStatement(bnfParser.VisualStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#colorPick}.
	 * @param ctx the parse tree
	 */
	void enterColorPick(bnfParser.ColorPickContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#colorPick}.
	 * @param ctx the parse tree
	 */
	void exitColorPick(bnfParser.ColorPickContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#colorText}.
	 * @param ctx the parse tree
	 */
	void enterColorText(bnfParser.ColorTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#colorText}.
	 * @param ctx the parse tree
	 */
	void exitColorText(bnfParser.ColorTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFigure(bnfParser.FigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFigure(bnfParser.FigureContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(bnfParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(bnfParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#elseToken}.
	 * @param ctx the parse tree
	 */
	void enterElseToken(bnfParser.ElseTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#elseToken}.
	 * @param ctx the parse tree
	 */
	void exitElseToken(bnfParser.ElseTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(bnfParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(bnfParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#extraCondition}.
	 * @param ctx the parse tree
	 */
	void enterExtraCondition(bnfParser.ExtraConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#extraCondition}.
	 * @param ctx the parse tree
	 */
	void exitExtraCondition(bnfParser.ExtraConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#notCondition}.
	 * @param ctx the parse tree
	 */
	void enterNotCondition(bnfParser.NotConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#notCondition}.
	 * @param ctx the parse tree
	 */
	void exitNotCondition(bnfParser.NotConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#singleCondition}.
	 * @param ctx the parse tree
	 */
	void enterSingleCondition(bnfParser.SingleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#singleCondition}.
	 * @param ctx the parse tree
	 */
	void exitSingleCondition(bnfParser.SingleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(bnfParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(bnfParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(bnfParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(bnfParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(bnfParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(bnfParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(bnfParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(bnfParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(bnfParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(bnfParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(bnfParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(bnfParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#stringCheckRule}.
	 * @param ctx the parse tree
	 */
	void enterStringCheckRule(bnfParser.StringCheckRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#stringCheckRule}.
	 * @param ctx the parse tree
	 */
	void exitStringCheckRule(bnfParser.StringCheckRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#extraValue}.
	 * @param ctx the parse tree
	 */
	void enterExtraValue(bnfParser.ExtraValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#extraValue}.
	 * @param ctx the parse tree
	 */
	void exitExtraValue(bnfParser.ExtraValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(bnfParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(bnfParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#extraStringValue}.
	 * @param ctx the parse tree
	 */
	void enterExtraStringValue(bnfParser.ExtraStringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#extraStringValue}.
	 * @param ctx the parse tree
	 */
	void exitExtraStringValue(bnfParser.ExtraStringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(bnfParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(bnfParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#extraEquation}.
	 * @param ctx the parse tree
	 */
	void enterExtraEquation(bnfParser.ExtraEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#extraEquation}.
	 * @param ctx the parse tree
	 */
	void exitExtraEquation(bnfParser.ExtraEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(bnfParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(bnfParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(bnfParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(bnfParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(bnfParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(bnfParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#forcedLineChange}.
	 * @param ctx the parse tree
	 */
	void enterForcedLineChange(bnfParser.ForcedLineChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#forcedLineChange}.
	 * @param ctx the parse tree
	 */
	void exitForcedLineChange(bnfParser.ForcedLineChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#extraLines}.
	 * @param ctx the parse tree
	 */
	void enterExtraLines(bnfParser.ExtraLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#extraLines}.
	 * @param ctx the parse tree
	 */
	void exitExtraLines(bnfParser.ExtraLinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(bnfParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(bnfParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(bnfParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(bnfParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bnfParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(bnfParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link bnfParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(bnfParser.EmptyContext ctx);
}