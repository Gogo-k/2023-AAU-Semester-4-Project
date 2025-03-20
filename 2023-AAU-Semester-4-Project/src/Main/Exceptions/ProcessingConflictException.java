package Main.Exceptions;

import org.antlr.v4.runtime.tree.RuleNode;

//Exception used when the 'on start' command is not present when using a visual features
public class ProcessingConflictException extends RuntimeException {

    public RuleNode node;

    public ProcessingConflictException(RuleNode node) {
        this.node = node;
    }

    public String getMessage(){
        return "An error has occured on the line " + node.getText()+ "\n"+
                "Error: To use the visual features, then everything must be everything except declarations be in 'on start' and 'on eachFrame'.\n"+
                "And at least 'on start' must be present.\n";
    }
}
