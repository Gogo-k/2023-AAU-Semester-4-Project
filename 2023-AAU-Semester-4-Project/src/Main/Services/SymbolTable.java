package Main.Services;

import Main.Exceptions.IDAlreadyInScopeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {
    private List<HashMap<String,VarRef>> ScopeStack =  new ArrayList<>(); // A list of maps, which uses string as keys and a VarRefs as value

    public void AddToScope(VarRef varRef){ // adds a scope to the list
        if (VariableIsInScope(varRef.getName())){
            throw new IDAlreadyInScopeException(varRef, FindVariableValue(varRef.getName())); // new and old variable
        }
        ScopeStack.get(ScopeStack.size()-1).put(varRef.getName(), varRef);
    }

    public void RemoveScope(){ // removes a scope from the list
        ScopeStack.remove(ScopeStack.size()-1);
    }

    public void CreateScope(){ // creates a new empty scope
        ScopeStack.add(new HashMap<String,VarRef>());
    }

    public boolean VariableIsInScope(String ID){
        for (int i = ScopeStack.size()-1; i >= 0; i--){ // begins at the top of the stack.
            if (ScopeStack.get(i).containsKey(ID)){
                return true; // returns true if the variable is in the Scope
            }
        }
        return  false;
    }


    public VarRef FindVariableValue(String ID){
        for (int i = ScopeStack.size()-1; i >= 0; i--){ // begins at the top of the stack.
            if (ScopeStack.get(i).containsKey(ID)){
                return ScopeStack.get(i).get(ID); // returns VarRef object associated with the ID
            }
        }
        return  null;
    }
}
