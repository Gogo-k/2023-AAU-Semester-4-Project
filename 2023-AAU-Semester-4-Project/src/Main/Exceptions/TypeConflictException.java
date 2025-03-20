package Main.Exceptions;

//Exception used when the users tries to assign a variable,
// a value which type defers form the type the variable was declared as
//e.i number a = "100" or
//number a = 100
//a = "200"
public class TypeConflictException extends RuntimeException{
    private String ID;
    private String DeclaredType;
    private String AssignedType;

    public TypeConflictException(String ID, String declaredType, String assignedType) {
        this.ID = ID;
        DeclaredType = declaredType;
        AssignedType = assignedType;
    }

    public String getID() {
        return ID;
    }


    public String getDeclaredType() {
        return DeclaredType;
    }


    public String getAssignedType() {
        return AssignedType;
    }

    public String getMessage(){
        return "The variable "+"\""+ID+"\""+" was declared of type "+"\""+DeclaredType+"\""+" and was assigned to type "+"\""+AssignedType+"\"." +
                " This is not possible as the types can not be converted bewteen the two";
    }
}
