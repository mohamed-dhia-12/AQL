package org.example.testtp1.BranchCoverageTest;

import org.example.tp1.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testNullInput() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
        assertEquals("String must not be null", exception.getMessage());
        // couvre la branche if (s == null)
    }

    @Test
    public void testValidPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak"));
        // branche while (i < j) → true
        // branche if (charAt(i) != charAt(j)) → false
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
        // branche if (charAt(i) != charAt(j)) → true
    }

    @Test
    public void testSingleChar() {
        assertTrue(Palindrome.isPalindrome("A"));
        // branche while (i < j) → false immédiatement
    }

    @Test
    public void testPalindromeWithSpacesAndCase() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
        // couvre la suppression des espaces et la mise en minuscule
    }
}
