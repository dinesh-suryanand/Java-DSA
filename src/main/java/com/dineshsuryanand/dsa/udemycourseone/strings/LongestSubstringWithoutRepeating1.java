package com.dineshsuryanand.dsa.udemycourseone.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating1 {
    //check leetcode/sliding/LongestSubstringWithoutRepeating.java for Map Solution


    public int lengthOfLongestSubstring(String s) {

        Set<Character> seen = new HashSet<>();
        int l = 0, max_len = 0;

        for(int r =0 ; r < s.length(); r++) {
            while(seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            max_len = Math.max(max_len,r-l+1);
        }
        return max_len;

    }


}
