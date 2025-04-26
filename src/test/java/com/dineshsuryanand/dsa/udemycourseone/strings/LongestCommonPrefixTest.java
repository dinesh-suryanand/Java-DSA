package com.dineshsuryanand.dsa.udemycourseone.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {

    @ParameterizedTest
    @CsvSource({
            "'flower,flow,flight', fl",
            "'dog,racecar,car', ''",
            "'a,ab,abc', a"
    })
    void parameterizedTest(String input, String expected) {
        String[] strs = input.split(",");
        assertEquals(expected, LongestCommonPrefix.longestCommonPrefix(strs));
    }


    @Test
    void testExample() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void testNoCommonPrefix() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void testOneElement() {
        assertEquals("hello", LongestCommonPrefix.longestCommonPrefix(new String[]{"hello"}));
    }

    @Test
    void testAllSame() {
        assertEquals("same", LongestCommonPrefix.longestCommonPrefix(new String[]{"same", "same", "same"}));
    }

    @Test
    void testMixedLengths() {
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
    }

    @Test
    void testEmptyArray() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{}));
    }

    @Test
    void testNullArray() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(null));
    }
}
