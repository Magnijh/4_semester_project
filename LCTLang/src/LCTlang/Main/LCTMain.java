package LCTlang.Main;

import LCTlang.statements.StatementVisitor;
import LCTlang.LCTLexer;
import LCTlang.LCTParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class LCTMain {
    public static void main(String[] args) {
        try
        {
            if (args.length != 1) {
                System.err.print("Usage: file name");
            } else {
                String fileName = args[0];
                LCTParser parser = getParser(fileName);

                // tell ANTLR to build a parse tree
                ParseTree tree = parser.program();

                // Create a visitor for converting the parse tree into Program/Expression object
                StatementVisitor Visitor = new StatementVisitor();
                Visitor.visit(tree);
            }
        }
        catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static LCTParser getParser(String filename) {
        LCTParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            LCTLexer lexer = new LCTLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new LCTParser(tokens);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return parser;
    }
}