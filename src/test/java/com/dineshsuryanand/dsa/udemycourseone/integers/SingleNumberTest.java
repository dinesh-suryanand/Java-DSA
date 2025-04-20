package com.dineshsuryanand.dsa.udemycourseone.integers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    @Test
    void testSingleNumber_SimpleCase() {
        int[] nums = {4, 1, 2, 1, 2};
        int result = SingleNumber.singleNumber(nums);
        assertEquals(4, result);
    }

    @Test
    void testSingleNumber_OnlyOneElement() {
        int[] nums = {99};
        int result = SingleNumber.singleNumber(nums);
        assertEquals(99, result);
    }

    @Test
    void testSingleNumber_NegativeValues() {
        int[] nums = {-1, -1, -2};
        int result = SingleNumber.singleNumber(nums);
        assertEquals(-2, result);
    }

    @Test
    void testSingleNumber_ZeroIsUnique() {
        int[] nums = {0, 1, 1};
        int result = SingleNumber.singleNumber(nums);
        assertEquals(0, result);
    }

    @Test
    void testSingleNumber_LargerInput() {
        int[] nums = {5, 3, 5, 4, 4};
        int result = SingleNumber.singleNumber(nums);
        assertEquals(3, result);
    }
}