package com.dineshsuryanand.dsa.patterns.array;

import java.util.HashMap;

public class TwoSum {

    public int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            if(numsToIndex.containsKey(complement)) {
                return new int[] {numsToIndex.get(complement),i};
            }
            numsToIndex.put(nums[i],i);

        }
        return new int[]{-1, -1};
    }
}
