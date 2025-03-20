package UnitTesting;

import Main.AntlrGenerated.bnfLexer;
import Main.AntlrGenerated.bnfParser;
import Main.Services.SymbolTable;
import Main.Services.VarRef;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.FileSystems;

import static org.junit.jupiter.api.Assertions.*;

class SymbolTableTest {

    @BeforeEach
    void setUp() {
         SymbolTable symboltable= new SymbolTable();
    }

    public bnfParser findParserThroughFile() throws IOException {
        bnfLexer lexer = new bnfLexer((CharStreams.fromPath(FileSystems.getDefault().getPath("Input/test.txt"))));
        CommonTokenStream commonTokenStream = new CommonTokenStream((lexer));
        return new bnfParser(commonTokenStream);
    }

    @Test
    void addToScope()  throws IOException{
        SymbolTable symboltable1= new SymbolTable();
        bnfParser parser = findParserThroughFile();

        symboltable1.AddToScope(new VarRef(parser.declaration().ID().getText(), parser.declaration().getChild(1).getText(), parser.declaration()));
    }

}