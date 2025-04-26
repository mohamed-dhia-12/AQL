package org.example.testtp1.BranchCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzDivisibleByThreeAndFive() {
        // Branche où n % 15 == 0 (divisible par 3 et 5)
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // 15 est divisible par 3 et 5
    }

    @Test
    public void testFizzBuzzDivisibleByThree() {
        // Branche où n % 3 == 0 (divisible par 3)
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3)); // 3 est divisible par 3
    }

    @Test
    public void testFizzBuzzDivisibleByFive() {
        // Branche où n % 5 == 0 (divisible par 5)
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5)); // 5 est divisible par 5
    }

    @Test
    public void testFizzBuzzOtherNumbers() {
        // Branche où n % 3 != 0 et n % 5 != 0 (ne divise ni par 3 ni par 5)
        assertEquals("2", FizzBuzz.fizzBuzz(2)); // 2 n'est divisible ni par 3 ni par 5
    }

    @Test
    public void testFizzBuzzInvalidInput() {
        // Branche pour l'exception (n <= 1)
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(1); // n doit être strictement positif
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0); // n doit être strictement positif
        });
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(-3); // n doit être strictement positif
        });
    }
}
