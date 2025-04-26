package org.example.testtp1.ConditionCoverageTest;

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
    public void testFirstArgumentNull() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "abc");
        });
    }

    @Test
    public void testSecondArgumentNull() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("abc", null);
        });
    }

    @Test
    public void testFirstOrSecondNullBothNotNull() {
        assertDoesNotThrow(() -> {
            Anagram.isAnagram("abc", "cab");
        });
    }

    @Test
    public void testNotAnagramSameLength() {
        assertFalse(Anagram.isAnagram("abcd", "abcf"));
    }
}
