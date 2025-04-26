package org.example.testtp1.ConditionCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.RomanNumeral;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void testValidRomanNumerals() {
        // Test de conversions valides
        assertEquals("I", RomanNumeral.toRoman(1));
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("XC", RomanNumeral.toRoman(90));
        assertEquals("C", RomanNumeral.toRoman(100));
        assertEquals("CD", RomanNumeral.toRoman(400));
        assertEquals("CM", RomanNumeral.toRoman(900));
        assertEquals("M", RomanNumeral.toRoman(1000));
        assertEquals("MMM", RomanNumeral.toRoman(3000));
    }

    @Test
    public void testInvalidRomanNumerals() {
        // Test des valeurs invalides
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0); // En dehors des limites (inférieur à 1)
        });
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000); // En dehors des limites (supérieur à 3999)
        });
    }
}
