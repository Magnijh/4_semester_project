package LCTlang.CustomJava;

import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.parser.ExprParser;
import org.matheclipse.core.expression.Symbol;

public class LCTLog {

    public Value log(double input)
    {
        String inputConverted = String.valueOf(input);

        ExprEvaluator util = new ExprEvaluator();
        IExpr Result = util.eval("N(log10(" + inputConverted +"))");

        return new Value(Result);
    }
}
