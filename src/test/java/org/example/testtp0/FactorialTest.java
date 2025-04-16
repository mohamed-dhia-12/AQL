package org.example.testtp0;

import org.example.tp0.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial_Returns1_If0() {
        Assertions.assertEquals(1, Factorial.factorial(0), "0! doit être égal à 1");
    }

    @Test
    void factorial_ForPositiveInputs() {
        assertEquals(1, Factorial.factorial(1), "1! doit être égal à 1");
        assertEquals(2, Factorial.factorial(2), "2! doit être égal à 2");
        assertEquals(6, Factorial.factorial(3), "3! doit être égal à 6");
        assertEquals(24, Factorial.factorial(4), "4! doit être égal à 24");
        assertEquals(120, Factorial.factorial(5), "5! doit être égal à 120");
        assertEquals(3628800, Factorial.factorial(10), "10! doit être égal à 3628800");
    }

    @Test
    void factorial_ThrowsException_NegativeInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        }, "Une exception doit être levée pour une valeur négative");

        assertEquals("n must be positive", thrown.getMessage());
    }
}
