package com.dineshsuryanand.dsa.leetcode.array;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        //left
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        // for above left calculation
        //Arrays.setAll(left,i-> left[i-1]* nums[i-1]);

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }


        Arrays.setAll(result, i -> left[i] * right[i]);
        return result;
    }

    public static int[] productExceptSelfOptimum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        //left
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
}
