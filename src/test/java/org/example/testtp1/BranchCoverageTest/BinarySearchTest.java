package org.example.testtp1.BranchCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.BinarySearch;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testElementFoundMiddle() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testElementFoundLeft() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }

    @Test
    public void testElementFoundRight() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFoundLower() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(-1, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFoundHigher() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(array, 10));
    }

    @Test
    public void testArrayNull() {
        assertThrows(NullPointerException.class, () -> {
            BinarySearch.binarySearch(null, 5);
        });
    }
}
