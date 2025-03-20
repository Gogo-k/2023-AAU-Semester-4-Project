package UnitTesting;

import Main.Exceptions.TypeConflictException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeConflictExceptionTest {

    private TypeConflictException typeConflictException;


    @Test
    void getMessage() {

        String expectedString = "The variable "+"\""+"IDtest"+"\""+" was declared of type "+"\""+"number"+"\""+" and was assigned to type "+"\""+"text"+"\""+" This is not possible.";

        typeConflictException = new TypeConflictException("IDtest", "number", "text");
        assertEquals(expectedString, typeConflictException.getMessage());
    }
}