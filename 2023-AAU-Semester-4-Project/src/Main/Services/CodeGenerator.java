package Main.Services;

import java.io.File;
import java.io.FileWriter;

public class CodeGenerator {

    private String FileName = "JavaFile";
    public static File file;

    public void createFile(Boolean standardFile) {
        file = new File("Output/" + FileName + ".java");
        boolean NewFileCreated = false;
        String programIntroText;
        try {

            // create a new file with name specified
            // by the file object
            NewFileCreated = file.createNewFile();
            if (NewFileCreated) {
                System.out.println("New Java File is created.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        if (standardFile) {
            programIntroText ="public class " + FileName + " { \n" +
                    "\tpublic static void main(String[] args) { \n" +
                    "\t\t" + FileName + " runFile = new " + FileName + "();\n" +
                    "\t}\n" +
                    "\t\n" +
                    "\tpublic " + FileName + "(){\n";
         }
        else {
            programIntroText = "import processing.core.PApplet;\n\n" +
                      "public class " + FileName + " extends PApplet { \n" +

                      "\tpublic static void main(String[] args) { \n" +
                      "\t\tString[] processingArgs = {\"MySketch\"};\n" +
                      "\t\t" + FileName + " javaFile = new " + FileName + "();\n" +
                      "\t\tPApplet.runSketch(processingArgs, javaFile);\n" +
                      "\t}\n" +

                      "\tpublic void settings() {\n" +
                      "\t\tsize(800, 800); //Sets the window size.\n" +
                      "\t}\n\n";
        }
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("Output/" + FileName + ".java", false);

            // Writes the programIntroText to file
            output.write(programIntroText);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    private boolean needIndentation = true;
    public int indentation = 1;

    public void appendStrToFile(String str) {
        // Try block to check for exceptions
        try {

            // Open given file in append mode by creating an
            // object of BufferedWriter class
            FileWriter out = new FileWriter("Output/" + FileName + ".java", true);

            if(needIndentation){
                for (int i = 0; i < indentation; i++) {
                    out.write("\t");
                }
                needIndentation = false;
            }

            // Writing on output stream
            out.write(str);

            //If the next line add indentation next line
            if(str.endsWith("\n")) {
                needIndentation = true;
            }

            // Closing the connection
            out.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void resetFile() {
        // Try block to check for exceptions
        try {

            // Open given file in append mode by creating an
            // object of BufferedWriter class
            FileWriter out = new FileWriter("Output/" + FileName + ".java", false);

            // Writing on output stream
            out.write("");

            // Closing the connection
            out.close();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
