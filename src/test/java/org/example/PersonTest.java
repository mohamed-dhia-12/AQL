package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void  getFullName_ReturnCorrectFormat(){
        Person P = new Person("Mohamed Dhia","Helaimia",12);
        assertEquals("Mohamed Dhia Helaimia",P.getFullName());
    }
    @Test
    void isAdult_returnTrue18ormore(){
        assertTrue((new Person("Dhia","Adult",18)).isAdult());
        assertTrue((new Person("Mohamed","Adult",26)).isAdult());
    }
    @Test
    void isAdult_returnFalse17orless(){
        assertFalse((new Person("Mounir","!Adult",17)).isAdult());
    }
}