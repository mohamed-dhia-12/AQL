package org.example.testtp1.LineCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.tp1.Palindrome;
public class PalindromeTest {


    @Test
    public void testSimplePalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak")); // couvre toutes les lignes sauf le if interne
    }

    @Test
    public void testPhrasePalindrome() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose")); // couvre les lignes + suppression espaces
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour")); // exécute aussi la condition dans la boucle
    }

    @Test
    public void testNullInput() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
        assertEquals("String must not be null", exception.getMessage()); // couvre la ligne avec le throw
    }
}
