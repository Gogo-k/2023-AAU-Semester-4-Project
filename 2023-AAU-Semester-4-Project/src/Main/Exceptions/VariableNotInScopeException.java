package Main.Exceptions;

import org.antlr.v4.runtime.tree.RuleNode;

public class VariableNotInScopeException extends RuntimeException{

    private RuleNode node;

    public VariableNotInScopeException(RuleNode node) {
        this.node = node;
    }

    @Override
    public String getMessage() {
        return "\""+ node.getParent().getText() +"\""+" is not declared in scope";
    }
}
