package Main.Services;

import Main.AntlrGenerated.bnfParser;

// variable reference to be used in the symbol table
public class VarRef {
    private String name;
    private String type;
    private bnfParser.DeclarationContext declarationNode;

    public VarRef(String name, String type, bnfParser.DeclarationContext declarationNode) {
        this.name = name;
        this.type = type;
        this.declarationNode = declarationNode;
    }

    public String getName() {return name;}

    public String getType() {
        return type;
    }

    public bnfParser.DeclarationContext getDeclarationNode() {
        return declarationNode;
    }
}
