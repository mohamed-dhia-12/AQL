package org.example.testtp1.LineCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.Anagram;
import org.junit.jupiter.api.Test;

public class AnagramTest {

    @Test
    public void testAnagrams() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    public void testDifferentLength() {
        assertFalse(Anagram.isAnagram("chat", "chats"));
    }

    @Test
    public void testNullFirstArgument() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "abc");
        });
    }

    @Test
    public void testNullSecondArgument() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("abc", null);
        });
    }

    @Test
    public void testWithSpacesAndCases() {
        assertTrue(Anagram.isAnagram(" ChIeN ", "NiChe"));
    }

    @Test
    public void testNotAnagramSameLength() {
        assertFalse(Anagram.isAnagram("abcd", "abce"));
    }
}
