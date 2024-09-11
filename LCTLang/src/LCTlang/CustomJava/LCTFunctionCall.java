package LCTlang.CustomJava;

import LCTlang.LCTParser;

public class LCTFunctionCall {
    LCTParser.StatementBlockContext statements;
    String[] arguments;

    public LCTFunctionCall(LCTParser.StatementBlockContext Statements, String[] Arguments){
        this.statements = Statements;
        this.arguments = Arguments;
    }

    public LCTParser.StatementBlockContext getStatements() {
        return statements;
    }

    public String[] getArguments() {
        return arguments;
    }
}
