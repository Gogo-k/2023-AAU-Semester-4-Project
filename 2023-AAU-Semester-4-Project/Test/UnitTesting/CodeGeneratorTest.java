package UnitTesting;


import Main.Run;
import Main.Services.CodeGenerator;
import Main.Services.SparkToJavaVisitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.File;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CodeGeneratorTest {

    private SparkToJavaVisitor sparkToJavaVisitor;
    private Run run = new Run("code.txt");
    private CodeGenerator codeGenerator = new CodeGenerator();

    @BeforeEach
    public void setup() throws IOException {
        sparkToJavaVisitor = new SparkToJavaVisitor(codeGenerator, run);
    }

    @Test
    void createStandardFile() {
    }

    @Test
    void createProcessingFile() {
    }

    @Test
    void appendStrToFile() throws IOException{

        String testString = "This is a test";

        codeGenerator.appendStrToFile(testString);
        Scanner scanner = new Scanner(new File("Output/JavaFile.java"));

        assertEquals(true, scanner.nextLine().endsWith(testString));

    }
}