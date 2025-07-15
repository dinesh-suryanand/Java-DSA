package com.dineshsuryanand.dsa.patterns.twopointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateSortedArrayTest {

    @Test
    void testRemoveDuplicates() {
        int[] nums = {1, 1, 2, 2, 3};
        int len = RemoveDuplicateSortedArray.removeDuplicates(nums);
        assertEquals(3, len);
        assertArrayEquals(new int[]{1, 2, 3}, java.util.Arrays.copyOf(nums, len));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int len = RemoveDuplicateSortedArray.removeDuplicates(nums);
        assertEquals(0, len);
    }

    @Test
    void testNoDuplicates() {
        int[] nums = {1, 2, 3};
        int len = RemoveDuplicateSortedArray.removeDuplicates(nums);
        assertEquals(3, len);
        assertArrayEquals(new int[]{1, 2, 3}, java.util.Arrays.copyOf(nums, len));
    }
}