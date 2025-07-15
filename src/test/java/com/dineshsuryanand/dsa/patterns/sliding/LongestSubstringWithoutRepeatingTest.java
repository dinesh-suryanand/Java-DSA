package com.dineshsuryanand.dsa.patterns.sliding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingTest {

    @Test
    public void testCase1() {
        assertEquals(4 , LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abaabcaacbabdcd"));
    }

    @Test
    public void testCase2() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void testCase3() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void testCase4() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(""));
    }

    @Test
    public void testCase5() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("a"));
    }

    @Test
    public void testCase6() {
        assertEquals(2, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("au"));
    }

    @Test
    public void testCase7() {
        assertEquals(5, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcde"));
    }


    @Test
    public void testCase8() {
        assertEquals(2, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abba"));
    }

    @Test
    public void testCase9() {
        assertEquals(6, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcdeabpcdacbdeab"));
    }

}
