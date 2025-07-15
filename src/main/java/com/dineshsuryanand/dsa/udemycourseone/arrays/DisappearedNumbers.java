package com.dineshsuryanand.dsa.udemycourseone.arrays;

import java.util.*;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i =0 ; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1; // get the index with the help of element
            if (nums[index] > 0) nums[index] = -nums[index]; // mark visited as -ve
        }

        for (int i =0; i<nums.length; i++) {
            if (nums[i] > 0) result.add(i+1);
        }
        return result;
    }
}
