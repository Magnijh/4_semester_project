package LCTlang.functions;

import LCTlang.CustomJava.Value;
import LCTlang.LCTBaseVisitor;
import LCTlang.LCTParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionVisitor extends LCTBaseVisitor<Object> {
    private final Map<String, Value> memory = new HashMap<String, Value>();
    private final Map<String, LCTParser.StatementBlockContext> functions = new HashMap<String, LCTParser.StatementBlockContext>();


    @Override public Object visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx) {
        List<LCTParser.ExprContext> arguments = null;
        String id = ctx.identifier().getText();
        LCTParser.StatementBlockContext statements = ctx.statementBlock();

        functions.put(id, statements);
        return Value.VOID;
    }

    @Override public Object visitFunctionCall(LCTParser.FunctionCallContext ctx) {
        String id = ctx.identifier().getText();

        this.visit(functions.get(id));
        return Value.VOID;
    }



    @Override public Object visitIdentifier(LCTParser.IdentifierContext ctx) { return visitChildren(ctx); }

    @Override public Object visitArguments(LCTParser.ArgumentsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReturnStatement(LCTParser.ReturnStatementContext ctx) { return visitChildren(ctx); }
}
