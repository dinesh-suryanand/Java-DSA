package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    @Test
    void testPositivePalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(PalindromeNumber.isPalindrome(123));
    }

    @Test
    void testSingleDigit() {
        assertTrue(PalindromeNumber.isPalindrome(7));
    }

    @Test
    void testZero() {
        assertTrue(PalindromeNumber.isPalindrome(0));
    }

    @Test
    void testEvenLengthPalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(1221));
    }

    @Test
    void testEndsWithZero() {
        assertFalse(PalindromeNumber.isPalindrome(10));
    }
}
