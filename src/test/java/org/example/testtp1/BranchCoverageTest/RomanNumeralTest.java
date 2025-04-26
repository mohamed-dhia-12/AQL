package org.example.testtp1.BranchCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void testRomanNumerals() {
        // Test des branches valides
        assertEquals("I", RomanNumeral.toRoman(1)); // Branche 1
        assertEquals("IV", RomanNumeral.toRoman(4)); // Branche 2
        assertEquals("IX", RomanNumeral.toRoman(9)); // Branche 3
        assertEquals("X", RomanNumeral.toRoman(10)); // Branche 4
        assertEquals("XL", RomanNumeral.toRoman(40)); // Branche 5
        assertEquals("XC", RomanNumeral.toRoman(90)); // Branche 6
        assertEquals("C", RomanNumeral.toRoman(100)); // Branche 7
        assertEquals("CD", RomanNumeral.toRoman(400)); // Branche 8
        assertEquals("CM", RomanNumeral.toRoman(900)); // Branche 9
        assertEquals("M", RomanNumeral.toRoman(1000)); // Branche 10
        assertEquals("MMM", RomanNumeral.toRoman(3000)); // Branche 11
    }

    @Test
    public void testInvalidValues() {
        // Test des branches pour les valeurs invalides
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0); // Branche 12 : valeur en dehors des bornes
        });
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000); // Branche 13 : valeur en dehors des bornes
        });
    }
}
