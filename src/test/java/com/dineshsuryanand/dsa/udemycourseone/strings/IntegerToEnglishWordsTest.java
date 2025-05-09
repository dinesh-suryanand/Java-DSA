package com.dineshsuryanand.dsa.udemycourseone.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerToEnglishWordsTest {

    @Test
    void testSingleDigit() {
        assertEquals("One", IntegerToEnglishWords.numberToWords(1));
        assertEquals("Nine", IntegerToEnglishWords.numberToWords(9));
    }

    @Test
    void testDoubleDigit() {
        assertEquals("Twenty", IntegerToEnglishWords.numberToWords(20));
        assertEquals("Forty Two", IntegerToEnglishWords.numberToWords(42));
    }

    @Test
    void testThreeDigit() {
        assertEquals("One Hundred Twenty Three", IntegerToEnglishWords.numberToWords(123));
        assertEquals("Nine Hundred Ninety Nine", IntegerToEnglishWords.numberToWords(999));
    }

    @Test
    void testThousands() {
        assertEquals("Twelve Thousand Three Hundred Forty Five", IntegerToEnglishWords.numberToWords(12345));
        assertEquals("Forty Five Thousand Six Hundred Seventy Eight", IntegerToEnglishWords.numberToWords(45678));
    }

    @Test
    void testMillions() {
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
                     IntegerToEnglishWords.numberToWords(1234567));
    }

    @Test
    void testZero() {
        assertEquals("Zero", IntegerToEnglishWords.numberToWords(0));
    }

    @Test
    void testMaxLimit() {
        assertEquals("Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven",
                     IntegerToEnglishWords.numberToWords(Integer.MAX_VALUE));
    }
}
