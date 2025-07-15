package com.dineshsuryanand.dsa.udemycourseone.arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero values to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Fill the rest with 0s
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}

