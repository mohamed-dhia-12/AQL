package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime_ReturnsFalseNegative() {
        assertFalse(Prime.isPrime(-5), "-5 n'est pas un nombre premier");
        assertFalse(Prime.isPrime(-3), "0 n'est pas un nombre premier");
        assertFalse(Prime.isPrime(-10), "1 n'est pas un nombre premier");
    }

    @Test
    void isPrime_ReturnsTrue() {
        assertTrue(Prime.isPrime(2), "2 est un nombre premier");
        assertTrue(Prime.isPrime(3), "3 est un nombre premier");
        assertTrue(Prime.isPrime(5), "5 est un nombre premier");
        assertTrue(Prime.isPrime(7), "7 est un nombre premier");
        assertTrue(Prime.isPrime(13), "13 est un nombre premier");
    }

    @Test
    void isPrime_ReturnsFalseNonPrime() {
        assertFalse(Prime.isPrime(4), "4 n'est pas un nombre premier");
        assertFalse(Prime.isPrime(6), "6 n'est pas un nombre premier");
        assertFalse(Prime.isPrime(9), "9 n'est pas un nombre premier");
        assertFalse(Prime.isPrime(15), "15 n'est pas un nombre premier");
    }

    @Test
    void isPrime_ReturnsTrueLargerPrime() {
        assertTrue(Prime.isPrime(97), "97 est un nombre premier");
    }

    @Test
    void isPrime_ReturnsFalseLargeNonPrime() {
        assertFalse(Prime.isPrime(100), "100 n'est pas un nombre premier");
    }
}
