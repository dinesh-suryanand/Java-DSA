package com.dineshsuryanand.dsa.leetcode.array;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {


    TwoSum twoSum = new TwoSum();

    @Test
    void testFindTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        assertArrayEquals(expected, twoSum.findTwoSum(nums, target));
    }

    @Test
    void testNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] expected = {-1, -1};

        assertArrayEquals(expected, twoSum.findTwoSum(nums, target));
    }

    @Test
    void testMultiplePairs() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2}; // 2 + 4 = 6

        assertArrayEquals(expected, twoSum.findTwoSum(nums, target));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2}; // -3 + 3 = 0

        assertArrayEquals(expected, twoSum.findTwoSum(nums, target));
    }
}
