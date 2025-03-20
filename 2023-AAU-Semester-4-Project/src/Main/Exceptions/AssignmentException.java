package Main.Exceptions;

import org.antlr.v4.runtime.tree.ErrorNode;
//Exception used when there is an error on an assignment node
public class AssignmentException extends RuntimeException{
    private ErrorNode node;

    public AssignmentException(ErrorNode node) {
        this.node = node;
    }

    @Override
    public String getMessage() {
        return "On line: "+node.getSymbol().getLine() +" you tried to \"" +node.getParent().getText() +"\". "+ findAlternative();
    }

    public String findAlternative(){
        switch (node.getSymbol().getText()){
            case "==":
                return "only use one a single \"=\"";
            case "+=":

                return "";
            case "!":
            case "~":
                return "not";
        }
        return null;
    }

}
