package org.example.testtp1.ConditionCoverageTest;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testValidPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
        // Condition if (s.charAt(i) != s.charAt(j)) → false
        // Condition if (s == null) → false
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
        // Condition if (s.charAt(i) != s.charAt(j)) → true
        // Condition if (s == null) → false
    }

    @Test
    public void testNullInput() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
        assertEquals("String must not be null", exception.getMessage());
        // Condition if (s == null) → true
    }

    @Test
    public void testSingleChar() {
        assertTrue(Palindrome.isPalindrome("A"));
        // Condition if (s.charAt(i) != s.charAt(j)) → false
        // Condition if (s == null) → false
    }

    @Test
    public void testPalindromeWithSpacesAndCase() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
        // Condition if (s.charAt(i) != s.charAt(j)) → false
        // Condition if (s == null) → false
    }
}
