package org.example.testtp1.LineCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {2, 4, 6, 8, 10};
        assertEquals(-1, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testArrayNull() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }
}
