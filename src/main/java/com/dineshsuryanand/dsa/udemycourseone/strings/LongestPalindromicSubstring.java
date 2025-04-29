package com.dineshsuryanand.dsa.udemycourseone.strings;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if (s == null ||s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i =0 ;i < s.length(); i++) {
            int oddLength = expandFromCenter(s,i,i);
            int evenLength = expandFromCenter(s,i,i+1);

            int maxLength = Math.max(oddLength,evenLength);

            if (maxLength > (end - start) ) { //start - end indicate the current palindromic substring length
                start = i - (maxLength-1) /2;
                end = i + maxLength/2;
            }
        }
        return s.substring(start,end+1);
    }

    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
