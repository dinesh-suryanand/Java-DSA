package com.dineshsuryanand.dsa.patterns.twopointers;

import java.util.Arrays;

public  class RemoveDuplicateSortedArray {
  public static int removeDuplicates(int[] nums) {
      if (nums.length == 0) return 0;

      int slow = 0;

      for(int fast = 1; fast < nums.length; fast++) {
        if(nums[slow] != nums[fast]) {
          slow++;
          nums[slow] = nums[fast];
        }
      }
     return slow +1;
  }

}
