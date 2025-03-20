// Generated from C:/Users/tubbe/Desktop/P4/Input\bnf.g4 by ANTLR 4.12.0
package Main.AntlrGenerated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bnfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bnfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bnfParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(bnfParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#startFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartFunction(bnfParser.StartFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#drawFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawFunction(bnfParser.DrawFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(bnfParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(bnfParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#globalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStatement(bnfParser.GlobalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#visualStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisualStatement(bnfParser.VisualStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#colorPick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorPick(bnfParser.ColorPickContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#colorText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorText(bnfParser.ColorTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(bnfParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(bnfParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#elseToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseToken(bnfParser.ElseTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(bnfParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#extraCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraCondition(bnfParser.ExtraConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#notCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(bnfParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCondition(bnfParser.SingleConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(bnfParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(bnfParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(bnfParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(bnfParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(bnfParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(bnfParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#stringCheckRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCheckRule(bnfParser.StringCheckRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#extraValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraValue(bnfParser.ExtraValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#stringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(bnfParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#extraStringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraStringValue(bnfParser.ExtraStringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(bnfParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#extraEquation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraEquation(bnfParser.ExtraEquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(bnfParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(bnfParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(bnfParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#forcedLineChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcedLineChange(bnfParser.ForcedLineChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#extraLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraLines(bnfParser.ExtraLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(bnfParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(bnfParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bnfParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(bnfParser.EmptyContext ctx);
}