package org.example.testtp1.ConditionCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.FizzBuzz;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzDivisibleByThreeAndFive() {
        // Cas où le nombre est divisible par 3 et 5 (condition n % 15 == 0)
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // 15 est divisible par 3 et 5
    }

    @Test
    public void testFizzBuzzDivisibleByThree() {
        // Cas où le nombre est divisible par 3 seulement (condition n % 3 == 0)
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3)); // 3 est divisible par 3
    }

    @Test
    public void testFizzBuzzDivisibleByFive() {
        // Cas où le nombre est divisible par 5 seulement (condition n % 5 == 0)
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5)); // 5 est divisible par 5
    }

    @Test
    public void testFizzBuzzOtherNumbers() {
        // Cas où le nombre n'est divisible ni par 3 ni par 5 (condition else)
        assertEquals("2", FizzBuzz.fizzBuzz(2)); // 2 n'est divisible ni par 3 ni par 5
    }

    @Test
    public void testFizzBuzzInvalidInput() {
        // Cas où n est inférieur ou égal à 1 (valeur invalide)
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
