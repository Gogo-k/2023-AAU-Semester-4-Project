package Main.Exceptions;

import org.antlr.v4.runtime.tree.ErrorNode;

//Exception used when there is an error in the comparator Node
public class ComparatorException extends RuntimeException{
    private ErrorNode wrongComparator;

    public ComparatorException(ErrorNode wrongComparator) {
        this.wrongComparator = wrongComparator;
    }

    public String getMessage() {
        return "You tried to use the symbol \""+wrongComparator.getText() +"\" try to use" + findAlternative()+ "instead";
    }


    public String findAlternative(){
        switch (wrongComparator.getText()){
            case "&":
                return "and";
            case "|":
                return "or";
            case "=":
                return "only use a single = character";
            case "!":
            case "~":
                return "not";
        }
        return null;
    }

}
