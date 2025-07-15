package com.dineshsuryanand.dsa.patterns.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSortedTest {

  @Test
  void testTwoSumSorted() {
    assertArrayEquals(new int[]{1, 3}, TwoSumSorted.twoSumSorted(new int[]{1, 2, 3, 4, 6}, 6));
    assertArrayEquals(new int[]{0, 1}, TwoSumSorted.twoSumSorted(new int[]{2, 5, 9}, 7));
    assertArrayEquals(new int[]{-1, -1}, TwoSumSorted.twoSumSorted(new int[]{1, 3, 5}, 10));
  }

}