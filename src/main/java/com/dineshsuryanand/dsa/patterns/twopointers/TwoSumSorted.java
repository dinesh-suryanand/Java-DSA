package com.dineshsuryanand.dsa.patterns.twopointers;

public class TwoSumSorted {
  public static int[] twoSumSorted(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == target)
        return new int[]{left, right};
      else if (sum < target)
        left++;
      else
        right--;

    }
    return new int[]{-1, -1};
  }

}
