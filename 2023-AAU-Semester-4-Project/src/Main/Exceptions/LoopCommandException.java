package Main.Exceptions;

import org.antlr.v4.runtime.tree.RuleNode;

//Exception used for when a user tries to use the 'break' or 'continue' Command outside a loop.
public class LoopCommandException extends RuntimeException {

    public RuleNode node;

    public LoopCommandException(RuleNode node) {

        this.node = node;
    }

    public String getMessage(){
        return "An error has occured on the line " + node.getText() + "it seems like you tried to use of 'break' or 'continue' outside a loop.\n";
    }
}
