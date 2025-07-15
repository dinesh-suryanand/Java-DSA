package com.dineshsuryanand.dsa.patterns.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquaresTest {

    @Test
    void testMixedNumbers() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
      System.out.println(Arrays.toString(SortedSquares.sortedSquares(input)));
        assertArrayEquals(expected, SortedSquares.sortedSquares(input));
    }

    @Test
    void testAllPositive() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 4, 9};
        assertArrayEquals(expected, SortedSquares.sortedSquares(input));
    }

    @Test
    void testAllNegative() {
        int[] input = {-3, -2, -1};
        int[] expected = {1, 4, 9};
        assertArrayEquals(expected, SortedSquares.sortedSquares(input));
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, SortedSquares.sortedSquares(input));
    }
}