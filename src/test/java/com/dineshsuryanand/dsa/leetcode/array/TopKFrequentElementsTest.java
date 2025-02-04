package com.dineshsuryanand.dsa.leetcode.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopKFrequentElementsTest {

    @Test
    void testTopKFrequent() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = TopKFrequentElements.topKFrequent(nums, k);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        int k = 1;
        int[] result = TopKFrequentElements.topKFrequent(nums, k);

        assertArrayEquals(new int[]{1}, result);
    }
}
