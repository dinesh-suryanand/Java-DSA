package com.dineshsuryanand.dsa.patterns.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductExceptSelfTest {

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {2, 3, 4, 5};
        int[] expected = {60, 40, 30, 24};
        assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {10, 20, 30, 40};
        int[] expected = {24000, 12000, 8000, 6000};
        assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = {5};
        int[] expected = {1}; // Edge case (single element)
        assertArrayEquals(expected, ProductExceptSelf.productExceptSelf(nums));
    }
}
