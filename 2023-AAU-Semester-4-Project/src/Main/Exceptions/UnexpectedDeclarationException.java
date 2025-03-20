package Main.Exceptions;

import org.antlr.v4.runtime.tree.ErrorNode;

//Exception used to catch if the user is trying to declare a variable incorrectly
public class UnexpectedDeclarationException extends RuntimeException{

    private ErrorNode node;

    public UnexpectedDeclarationException(ErrorNode node) {
        this.node = node;
    }

    @Override
    public String getMessage() {
        return "On line: "+node.getSymbol().getLine() +" you tried to \"" +node.getParent().getText() +"\". "+ findAlternative();
    }

    public String findAlternative(){

        switch (node.getSymbol().getText()){
            case "is":
            case "==":
                return "You should use one a single \"=\" to assign the value of the variable" ;
            case "/=":
            case "*=":
            case "-=":
            case "+=":
            case "%=":
                return "This command is not possible, because it is a recursive definition";
            default:
                return "The "+ node.getText() +" is not a know declaration";
        }
    }

}
