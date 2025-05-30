package com.dineshsuryanand.dsa.udemycourseone.binaysearch;

public class RotatedSortedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(nums[mid] == target) return mid;

            //if left is sorted
            if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else { // if right side is sorted
                if(nums[mid] < target && target <= nums[right]) left = mid +1;
                else right = mid -1;
            }

        }

        return -1;
    }
}
