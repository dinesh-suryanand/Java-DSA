package com.dineshsuryanand.dsa.patterns.twopointers;

import java.util.Arrays;

public class SortedSquares {
  public static int[] sortedSquares(int[] nums) {

    for (int i =0; i < nums.length; i++) {
      if (nums[i] <0) nums[i] = -1 * nums[i];
    }
    return Arrays.stream(nums).sorted().map(n -> n*n).toArray();
  }
}
