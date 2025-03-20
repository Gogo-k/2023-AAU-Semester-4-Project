package UnitTesting;


import Main.Run;
import Main.Services.CodeGenerator;
import Main.Services.SparkToJavaVisitor;
import Main.AntlrGenerated.bnfLexer;
import Main.AntlrGenerated.bnfParser;
import Main.Services.SymbolTable;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class SparkToJavaVisitorTest {

    SparkToJavaVisitor sparkToJavaVisitor;
    Run run = new Run("code.txt");
    CodeGenerator codeGenerator = new CodeGenerator();
    SymbolTable symbolTable = new SymbolTable();

    @BeforeEach
    public void setup() throws IOException {
        sparkToJavaVisitor = new SparkToJavaVisitor(codeGenerator, run);
    }
    public bnfParser findParserThroughString(String inputString) throws IOException {
        bnfLexer lexer = new bnfLexer((CharStreams.fromString(inputString)));
        CommonTokenStream tokens = new CommonTokenStream((lexer));
        return new bnfParser(tokens);
    }

    @Test
    void visitS() throws IOException {
    }

    @Test
    void visitStartFunction() throws IOException {

    }

    @Test
    void visitDrawFunction() throws IOException {
    }

    @Test
    void visitGlobalStatement() throws IOException {
    }

    @Test
    void visitLine() throws IOException {

        bnfParser parser = findParserThroughString("number a = 2\n");



        symbolTable.CreateScope();
        assertEquals("LineContext", sparkToJavaVisitor.visitLine(parser.line()).getClass().getSimpleName());
        symbolTable.RemoveScope();

    }


    @Test
    void visitVariableStatement() throws IOException {
    }

    @Test
    void visitVisualStatement() throws IOException {
    }

    @Test
    void visitFigure() throws IOException {
    }

    @Test
    void visitColorPick() throws IOException {
    }

    @Test
    void visitParameter() throws IOException {


    }

    @Test
    void visitDeclaration() throws IOException {

        bnfParser parser = findParserThroughString("number a = 2\n");

        symbolTable.CreateScope();
        assertEquals("DeclarationContext", sparkToJavaVisitor.visitDeclaration(parser.declaration()).getClass().getSimpleName());
        symbolTable.RemoveScope();

    }

    @Test
    void visitAssignment() throws IOException {
    }

    @Test
    void visitValue() throws IOException {

        bnfParser parser = findParserThroughString("test");

        symbolTable.CreateScope();
        System.out.println(sparkToJavaVisitor.visitValue(parser.value()));
        symbolTable.RemoveScope();
    }

    @Test
    void visitExtraValue() throws IOException {
    }

    @Test
    void visitElseToken() throws IOException {
    }

    @Test
    void visitStatement() throws IOException {
    }

    @Test
    void visitCondition() throws IOException {
    }

    @Test
    void visitNotCondition() throws IOException {
    }

    @Test
    void visitExtraCondition() throws IOException {
    }

    @Test
    void visitSingleCondition() throws IOException {
    }

    @Test
    void visitBlock() throws IOException {
    }

    @Test
    void visitLoopBlock() throws IOException {
    }

    @Test
    void visitComparator() throws IOException {

        bnfParser parser = findParserThroughString("test");

        //assertEquals("LineContext", myVistor.visitComparator(parser.comparator()).getClass().getSimpleName());
    }

    @Test
    void visitOperator() throws IOException {
    }

    @Test
    void visitDecimal() throws IOException {
    }

    @Test
    void visitEquation() throws IOException {
    }

    @Test
    void visitExtraEquation() throws IOException {
    }

    @Test
    void visitExpression() throws IOException {
    }

    @Test
    void visitNum() throws IOException {
    }

    @Test
    void visitStringValue() throws IOException {
    }

    @Test
    void visitExtraStringValue() throws IOException {
    }
}