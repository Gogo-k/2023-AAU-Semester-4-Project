package Main.Services;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {

    public ErrorListener() {
        System.out.println("I got added");
    }

    public static final boolean REPORT_SYNTAX_ERRORS = true;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.out.println("this line is "+line);
    }


}
