package com.dineshsuryanand.dsa.udemycourseone.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int num : nums) {
            if(!seen.add(num)) return true;
        }

        return false;
    }
}
