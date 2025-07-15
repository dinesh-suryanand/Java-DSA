package com.dineshsuryanand.dsa.udemycourseone.arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n  = nums.length;
        if(k > n) k %= n;

        reverse(nums,0,n-1); // reverse whole array
        reverse(nums,0,k-1); //reverse first k elements
        reverse(nums,k,n-1);  // reverse remaining elements
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }

    }
}
