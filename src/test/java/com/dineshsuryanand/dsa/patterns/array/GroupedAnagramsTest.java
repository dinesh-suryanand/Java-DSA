package com.dineshsuryanand.dsa.patterns.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupedAnagramsTest {
    @Test
    void testGroupAnagrams() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = GroupedAnagrams.groupAnagrams(input);

        assertEquals(3, result.size());
        assertTrue(result.contains(List.of("eat", "tea", "ate")));
        assertTrue(result.contains(List.of("tan", "nat")));
        assertTrue(result.contains(List.of("bat")));
    }

    @Test
    void testNoAnagrams() {
        String[] input = {"abc", "def", "ghi"};
        List<List<String>> result = GroupedAnagrams.groupAnagrams(input);
        assertEquals(3, result.size());
    }

}