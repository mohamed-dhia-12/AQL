package org.example.testtp1.LineCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void testValidRomanNumerals() {
        // Test des conversions valides
        assertEquals("I", RomanNumeral.toRoman(1)); // L1
        assertEquals("IV", RomanNumeral.toRoman(4)); // L2
        assertEquals("IX", RomanNumeral.toRoman(9)); // L3
        assertEquals("X", RomanNumeral.toRoman(10)); // L4
        assertEquals("XL", RomanNumeral.toRoman(40)); // L5
        assertEquals("XC", RomanNumeral.toRoman(90)); // L6
        assertEquals("C", RomanNumeral.toRoman(100)); // L7
        assertEquals("CD", RomanNumeral.toRoman(400)); // L8
        assertEquals("CM", RomanNumeral.toRoman(900)); // L9
        assertEquals("M", RomanNumeral.toRoman(1000)); // L10
        assertEquals("MMM", RomanNumeral.toRoman(3000)); // L11
    }

    @Test
    public void testInvalidValues() {
        // Test des valeurs invalides pour vérifier la gestion des exceptions
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0); // L12 : valeur en dehors des bornes
        });
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000); // L13 : valeur en dehors des bornes
        });
    }
}
