package Main;

import Main.AntlrGenerated.*;
import Main.Services.CodeGenerator;
import Main.Services.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.FileSystems;


public class Run {
    private static CodeGenerator codeGenerator = new CodeGenerator();

    //CharStream is an array of all symbols recognized by the BNF.
    private CharStream codePointCharStream = null;
    private bnfLexer lexer;
    private bnfParser parser;

    private bnfParser.SContext start;

    public Run(String inputName) {

        try {
            //fills the CharStream array with the symbols gotten from the file code.txt in the written path
            codePointCharStream = CharStreams.fromPath(FileSystems.getDefault().getPath("Input/" + inputName));
        } catch (IOException e) { //it does not work, IOexception
            throw new RuntimeException(e); //console writes error
        }
        //LEXER
        //Instantiates a ANTLR gen bnfLexer object, with the CharStream array as input
        lexer = new bnfLexer(codePointCharStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);


        //PARSER
        //Instantiates a ANTLR gen bngParser object,
        // with a CommonTokenStream as input made from the CharStream array from the lexer obj
        parser = new bnfParser(tokens);

        // List of children which is of the "s" rule, vi får en Scontext
        start = parser.s();
    }

    public static void main(String[] args) {

        //Instantiating Run object
        Run codeLauncher = new Run("code.txt");

        //Instantiating SparkToJavaVisitor and TopVisitor object
        TopVisitor topVisitor = new TopVisitor(codeGenerator);
        SparkToJavaVisitor sparkToJavaVisitor = new SparkToJavaVisitor(codeGenerator, codeLauncher);

        try {
            codeLauncher.start.accept(topVisitor);
            codeLauncher.start.accept(sparkToJavaVisitor);

            //closes the class in the output file
            codeGenerator.indentation--;
            codeGenerator.appendStrToFile("}\n");

        }  catch (RuntimeException error){
            System.out.println(error.getMessage());
            codeGenerator.resetFile();
        }
    }
}
