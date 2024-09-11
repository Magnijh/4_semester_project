// Generated from E:/Projects/LearnCode/LCTLang/src/LCTlang\LCT.g4 by ANTLR 4.9.1
package LCTlang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LCTParser}.
 */
public interface LCTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LCTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LCTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LCTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LCTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LCTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(LCTParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(LCTParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void enterReassignment(LCTParser.ReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#reassignment}.
	 * @param ctx the parse tree
	 */
	void exitReassignment(LCTParser.ReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(LCTParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(LCTParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(LCTParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(LCTParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LCTParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LCTParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LCTParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LCTParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(LCTParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(LCTParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(LCTParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(LCTParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(LCTParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(LCTParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(LCTParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(LCTParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(LCTParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(LCTParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LCTParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LCTParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(LCTParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(LCTParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LCTParser#solveFunction}.
	 * @param ctx the parse tree
	 */
	void enterSolveFunction(LCTParser.SolveFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LCTParser#solveFunction}.
	 * @param ctx the parse tree
	 */
	void exitSolveFunction(LCTParser.SolveFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LCTParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LCTParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionReturn}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(LCTParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionReturn}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(LCTParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(LCTParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(LCTParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpr(LCTParser.PreDecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpr(LCTParser.PreDecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(LCTParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(LCTParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(LCTParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(LCTParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LCTParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LCTParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpr(LCTParser.PostIncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpr(LCTParser.PostIncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpr(LCTParser.PreIncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpr(LCTParser.PreIncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(LCTParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(LCTParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(LCTParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(LCTParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpr(LCTParser.AdditionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpr(LCTParser.AdditionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpr(LCTParser.SubtractionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpr(LCTParser.SubtractionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpr(LCTParser.PostDecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecrementExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpr(LCTParser.PostDecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqrtExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpr(LCTParser.SqrtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqrtExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpr(LCTParser.SqrtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(LCTParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(LCTParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LCTParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LCTParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LCTParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterParentExpr(LCTParser.ParentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitParentExpr(LCTParser.ParentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterNumberVariable(LCTParser.NumberVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitNumberVariable(LCTParser.NumberVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierVariable(LCTParser.IdentifierVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierVariable(LCTParser.IdentifierVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterStringVariable(LCTParser.StringVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitStringVariable(LCTParser.StringVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVariable(LCTParser.BooleanVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanVariable}
	 * labeled alternative in {@link LCTParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVariable(LCTParser.BooleanVariableContext ctx);
}