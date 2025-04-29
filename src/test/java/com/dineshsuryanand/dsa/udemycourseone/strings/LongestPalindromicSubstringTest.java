package com.dineshsuryanand.dsa.udemycourseone.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestPalindromicSubstringTest {

    @Test
    void testOddPalindrome() {
        assertEquals("ababa", LongestPalindromicSubstring.longestPalindrome("bababaad"));
    }

    @Test
    void testEvenPalindrome() {
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", LongestPalindromicSubstring.longestPalindrome(""));
    }
}
