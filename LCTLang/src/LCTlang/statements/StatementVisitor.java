package LCTlang.statements;

import LCTlang.*;
import LCTlang.CustomJava.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Math;

public class StatementVisitor extends LCTBaseVisitor<Value>
{
    private final Map<String, Value> memory = new HashMap<String, Value>();
    private final Map<String, LCTFunctionCall> functions = new HashMap<String, LCTFunctionCall>();

/* Start of all Statements
*  Start of all Statements
*  Start of all Statements*/
    @Override public Value visitAssignStatement(LCTParser.AssignStatementContext ctx) {
        if (ctx.getText().contains("=")) {
            String id = ctx.Identifier().getText();
            Value value = this.visit(ctx.expr());
            return memory.put(id, value);
        } else {
            String id = ctx.Identifier().getText();
            Value value = new Value(null);
            return memory.put(id, value);
        }
    }

    @Override public Value visitReassignment(LCTParser.ReassignmentContext ctx) {
        String id = ctx.Identifier().getText();

        if (memory.containsKey(id)) {
            Value value = this.visit(ctx.expr());
            return memory.replace(id, value);
        }
        else
            throw new RuntimeException("no such variable: " + id);
    }

    @Override public Value visitForStatement(LCTParser.ForStatementContext ctx) {
        String endCheck = ctx.statementBlock().getText();
        if (!endCheck.substring(endCheck.length() - 3).contains("end"))
            throw new RuntimeException("Missing end to encapsulate the loop");

        if(ctx.forCondition().Int() == null)
            throw new RuntimeException("Loops only accepts integer values for loop amount");
        int loopCount = Integer.parseInt(ctx.forCondition().Int().getText());

        for (int i = 0; i < loopCount; i++) {
            this.visit(ctx.statementBlock());
        }

        return Value.VOID;
    }

    @Override public Value visitIfStatement(LCTParser.IfStatementContext ctx) {
        List<LCTParser.ConditionBlockContext> conditions =  ctx.conditionBlock();
        boolean evaluatedBlock = false;

        // If statements and else if statements
        for(LCTParser.ConditionBlockContext condition : conditions) {
            Value evaluated = this.visit(condition.expr());
            if (evaluated.isBoolean() == false)
                throw new RuntimeException("If statements only accept boolean expressions");
            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                //Evaluating if condition is met
                this.visit(condition.statementBlock());
                break;
            }
        }

        // Else statements
        if(!evaluatedBlock && ctx.statementBlock() != null) {
            this.visit(ctx.statementBlock());
        }

        return Value.VOID;
    }

    @Override public Value visitFunctionDeclaration(LCTParser.FunctionDeclarationContext ctx) {
        String id = ctx.identifier().getText();
        String[] arguments = null;

        if (ctx.arguments() != null) {
            arguments = ctx.arguments().getText().split(",");
            for (String arg: arguments) {
                Value value = Value.VOID;
                memory.put(arg, value);
            }
        }

        LCTFunctionCall funcCall = new LCTFunctionCall(ctx.statementBlock(), arguments);
        functions.put(id, funcCall);
        return Value.VOID;
    }

    @Override public Value visitFunctionCall(LCTParser.FunctionCallContext ctx) {
        ArrayList<Value> values = new ArrayList<Value>();
        int i = 0;
        String id = ctx.identifier().getText();

        // Saved function names.
        if (id.contains("intersection")) {
            Value line1 = this.visit(ctx.arguments().expr(0));
            Value line2 = this.visit(ctx.arguments().expr(1));
            if((line1.isString() && line2.isString()) == false)
                throw new RuntimeException("Intersection only accepts equations in string format");
            LCTIntersection intersect = new LCTIntersection(line1, line2);
            //System.out.println(intersect.IntersectionPoint());
            return new Value(intersect.IntersectionPoint());
        }

        if (id.contains("log10")) {
            Value input = this.visit(ctx.arguments().expr(0));
            if(input.isDouble() == false)
                throw new RuntimeException("log10 only accepts numbers");

            LCTLog log = new LCTLog();
            return new Value(log.log(input.asDouble()));
        }

        // Gets the statements form function declaration
        LCTFunctionCall funcCall = functions.get(id);
        // Handling arguments from function call
        if (funcCall.getArguments() != null) {
            if (ctx.arguments() == null)
                throw new RuntimeException("Missing arguments in function call for: " + id);

            for (LCTParser.ExprContext expr : ctx.arguments().expr()){
                values.add(this.visit(expr));
            }

            for (String arg: funcCall.getArguments()) {
                memory.replace(arg, values.get(i));
                i++;
            }
        }

        // Handling return statements
        try {
            this.visit(funcCall.getStatements());
        } catch (LCTFunctionReturnException res) {
            String testCase = String.valueOf(res.getCause());
            if (testCase.matches("[-+]?([0-9]*[.])?[0-9]+")) {
                return new Value(Double.valueOf(testCase));

            } else {
                return new Value(testCase);
            }
        }
        return Value.VOID;
    }

    @Override public Value visitReturnStatement(LCTParser.ReturnStatementContext ctx) {
        if ((ctx.getText().contains("<missing '('>")) || (ctx.getText().contains("<missing ')'>"))) {
            throw new RuntimeException("Missing ( ) around return expression");
        }

        //System.out.println(ctx.expr().getText());
        throw new LCTFunctionReturnException("Return Statement Found!", this.visit(ctx.expr()));
    }

    @Override public Value visitSolveFunction(LCTParser.SolveFunctionContext ctx) {
        Value input = this.visit(ctx.variable());
        if (input.isString() == false)
                throw new RuntimeException("The equation needs to be in a string format");
        String solveFor = ctx.Identifier().getText();
       if (input.asString().contains(solveFor) == false)
            throw new RuntimeException("The variable you want to solve for is not in the equation");
        LCTSolve solve = new LCTSolve(input, solveFor);
        System.out.println(solve.solve());

        return Value.VOID;
    }

     /* Start of all Variables
     *  Start of all Variables
     *  Start of all Variables */

     @Override public Value visitVariableExpr(LCTParser.VariableExprContext ctx) {
         Value value = this.visit(ctx.variable());
         return value;
     }

    @Override public Value visitParentExpr(LCTParser.ParentExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return value;
     }

    @Override public Value visitIdentifierVariable(LCTParser.IdentifierVariableContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    @Override public Value visitStringVariable(LCTParser.StringVariableContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override public Value visitNumberVariable(LCTParser.NumberVariableContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override public Value visitBooleanVariable(LCTParser.BooleanVariableContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    /* Start of all Expr
    *  Start of all Expr
    *  Start of all Expr*/

    @Override public Value visitNotExpr(LCTParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        if((value.isBoolean()  == false))
            throw new RuntimeException("Only boolean expressions can be used with ! expression");
        return new Value(!value.asBoolean());
    }

    @Override public Value visitSqrtExpr(LCTParser.SqrtExprContext ctx) {
        Value value = this.visit(ctx.expr());

        if ((ctx.getText().contains("<missing '('>")) || (ctx.getText().contains("<missing ')'>")))
            throw new RuntimeException("Missing ( ) around output expression");

        if((value.isDouble()  == false))
            throw new RuntimeException("Only numbers can be used with the sqrt expression");

        return new Value(Math.sqrt(value.asDouble()));
    }


    @Override public Value visitUnaryExpr(LCTParser.UnaryExprContext ctx) {
        Value value = this.visit(ctx.expr());

        if(value.isDouble() == false)
            throw new RuntimeException("Only numbers can be used with unary expression");

        return new Value(-value.asDouble());
    }

    @Override public Value visitPostIncrementExpr(LCTParser.PostIncrementExprContext ctx) {
        String id = ctx.expr().getText();
        Value incrementedValue;
        Value value;
        double i = 1;

        if (id.matches("[a-zA-Z_][a-zA-Z0-9_]*") == false)
            throw new RuntimeException("Only variables can be incremented");

        if (memory.containsKey(id)) {
            value = memory.get(id);
            if (value.asDouble() != null)
                incrementedValue = new Value(value.asDouble() + i);
            else
                incrementedValue = new Value(i);
            memory.replace(id, incrementedValue);
            return incrementedValue;
        } else
            throw new RuntimeException("Variable does not exits");
    }

    @Override public Value visitPostDecrementExpr(LCTParser.PostDecrementExprContext ctx) {
        String id = ctx.expr().getText();
        Value incrementedValue;
        Value value;
        double i = 1;

        if (id.matches("[a-zA-Z_][a-zA-Z0-9_]*") == false)
            throw new RuntimeException("Only variables can be incremented");

        if (memory.containsKey(id)) {
            value = memory.get(id);
            if (value.asDouble() != null)
                incrementedValue = new Value(value.asDouble() - i);
            else
                incrementedValue = new Value(0);
            memory.replace(id, incrementedValue);
            return incrementedValue;
        } else
            throw new RuntimeException("Variable does not exits");
    }

    @Override public Value visitPreIncrementExpr(LCTParser.PreIncrementExprContext ctx) {
        String id = ctx.expr().getText();
        Value incrementedValue;
        Value value;
        double i = 1;

        if (id.matches("[a-zA-Z_][a-zA-Z0-9_]*") == false)
            throw new RuntimeException("Only variables can be incremented");

        if (memory.containsKey(id)) {
            value = memory.get(id);
            if (value.asDouble() != null)
                incrementedValue = new Value(value.asDouble() + i);
            else
                incrementedValue = new Value(i);
            memory.replace(id, incrementedValue);
            return incrementedValue;
        } else
            throw new RuntimeException("Variable does not exits");
    }

    @Override public Value visitPreDecrementExpr(LCTParser.PreDecrementExprContext ctx) {
        String id = ctx.expr().getText();
        Value incrementedValue;
        Value value;
        double i = 1;

        if (id.matches("[a-zA-Z_][a-zA-Z0-9_]*") == false)
            throw new RuntimeException("Only variables can be incremented");

        if (memory.containsKey(id)) {
            value = memory.get(id);
            if (value.asDouble() != null)
                incrementedValue = new Value(value.asDouble() - i);
            else
                incrementedValue = new Value(i);
            memory.replace(id, incrementedValue);
            return incrementedValue;
        } else
            throw new RuntimeException("Variable does not exits");
    }


    @Override public Value visitPowerExpr(LCTParser.PowerExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        if((left.isDouble() && right.isDouble()) == false)
            throw new RuntimeException("Only numbers can be used with ^");

        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    @Override public Value visitAdditionExpr(LCTParser.AdditionExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        if ((left.isString() || left.isDouble() && right.isString() || right.isDouble()) == false)
            throw new RuntimeException("Only strings and numbers can be added");

                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
    }

    @Override public Value visitSubtractionExpr(LCTParser.SubtractionExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        if ((left.isDouble() && right.isDouble()) == false)
            throw new RuntimeException("Only numbers can be subtracted");

        return new Value(left.asDouble() - right.asDouble());
    }

    @Override public Value visitMultiplicativeExpr(LCTParser.MultiplicativeExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        if ((left.isDouble() && right.isDouble()) == false)
            throw new RuntimeException("Only numbers can be be used for multiplicative expressions");

        switch (ctx.op.getType()) {
            case LCTParser.Multiply:
                return new Value(left.asDouble() * right.asDouble());
            case LCTParser.Divide:
                if (right.asDouble() == 0) {
                    throw new RuntimeException("Division with 0 is illegal");
                    //return left.asDouble() == 0 ? right : left;
                }
                return new Value(left.asDouble() / right.asDouble());
            case LCTParser.Modulo:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitRelationalExpr(LCTParser.RelationalExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        if((left.isDouble() && right.isDouble()) == false)
            throw new RuntimeException("Only numbers can be used with relational expressions");

        switch (ctx.op.getType()) {
            case LCTParser.LessThan:
                return new Value(left.asDouble() < right.asDouble());
            case LCTParser.LessEqual:
                return new Value(left.asDouble() <= right.asDouble());
            case LCTParser.MoreThan:
                return new Value(left.asDouble() > right.asDouble());
            case LCTParser.MoreEqual:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitEqualExpr(LCTParser.EqualExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LCTParser.Equal:
                if (!left.isDouble() && !right.isDouble()){
                    return new Value(left.asString().equals(right.asString()));
                } else
                    return new Value(Math.abs(left.asDouble() - right.asDouble()) < 0.00000000001);
            case LCTParser.NotEqual:
                if (!left.isDouble() && !right.isDouble()){
                    return new Value(!left.asString().equals(right.asString()));
                } else
                    return new Value(Math.abs(left.asDouble() - right.asDouble()) >= 0.00000000001);
            default:
                throw new RuntimeException("unknown operator: " + LCTParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override public Value visitAndExpr(LCTParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        if((left.isBoolean() && right.isBoolean()) == false)
            throw new RuntimeException("Only boolean expressions can be used with AND");
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override public Value visitOrExpr(LCTParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        if((left.isBoolean() && right.isBoolean()) == false)
            throw new RuntimeException("Only boolean expressions can be used with OR");
        return new Value(left.asBoolean() || right.asBoolean());
    }

    //OUTPUT
    @Override public Value visitOutput(LCTParser.OutputContext ctx) {
        if ((ctx.getText().contains("<missing '('>")) || (ctx.getText().contains("<missing ')'>")))
            throw new RuntimeException("Missing ( ) around output expression");

        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }
}