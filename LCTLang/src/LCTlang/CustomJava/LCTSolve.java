package LCTlang.CustomJava;

import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.parser.ExprParser;
import org.matheclipse.core.expression.Symbol;

public class LCTSolve {
    String equation;
    String solveFor;
    String solveFunctionInput;

    public LCTSolve(Value Equation, String SolveFor){
        this.equation = String.valueOf(Equation).replace("\"", "");
        this.solveFor = SolveFor;
    }

    public String solve() {
        solveFunctionInput = equation + "," + solveFor;
        ExprEvaluator util = new ExprEvaluator();
        IExpr result =  util.eval("N(Solve(" +solveFunctionInput + "))");
        return String.valueOf(result);
    }
}