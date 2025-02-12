package com.dineshsuryanand.dsa.randomones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {

    @Test
    void testCase1() {
        assertEquals("ab:cd:ef",Formatter.formatString("abcdef"));
    }

    @Test
    void testCase2() {
        assertEquals("ab:cd:ef:g",Formatter.formatString("abcdefg"));
    }

    @Test
    void testCase3() {
        assertEquals("",Formatter.formatString(""));
    }


    @Test
    void testSingleCharacter() {
        assertEquals("a", Formatter.formatString("a"));
    }

    @Test
    void testTwoCharacters() {
        assertEquals("ab", Formatter.formatString("ab"));
    }

    @Test
    void testThreeCharacters() {
        assertEquals("ab:c", Formatter.formatString("abc"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", Formatter.formatString(""));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals("!@:#$", Formatter.formatString("!@#$"));
    }

    @Test
    void testUnicodeCharacters() {
        assertEquals("日本:語文:字", Formatter.formatString("日本語文字"));
    }

    @Test
    void testSpacesInString() {
        assertEquals("he:ll:o ", Formatter.formatString("hello "));
    }

    @Test
    void testSpacesInString2() {
        assertEquals("he:ll:o :wo:rl:d", Formatter.formatString("hello world"));
    }

}