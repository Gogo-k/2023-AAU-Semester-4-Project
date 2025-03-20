package Main.Exceptions;

import Main.Services.VarRef;

//Exception used if the user tries to declare to variables with the same name in the same scope
//e.i. number a = 100
//     number a = 30
public class IDAlreadyInScopeException extends RuntimeException{
    private VarRef newVar;

    private VarRef oldVar;

    public VarRef getNewVar() {
        return newVar;
    }

    public VarRef getOldVar() {
        return oldVar;
    }

    public IDAlreadyInScopeException(VarRef newVar, VarRef oldVar) {
        this.newVar = newVar;
        this.oldVar = oldVar;
    }

    public String getMessage(){
        return "The variable "+"\""+newVar.getName()+"\""+" is already declared as: "
                +oldVar.getDeclarationNode().getChild(0) + " " + oldVar.getDeclarationNode().getChild(1) + " "
                + oldVar.getDeclarationNode().getChild(2) + " " + oldVar.getDeclarationNode().getChild(3).getText();
    }
}

