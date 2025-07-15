package com.dineshsuryanand.dsa.udemycourseone.arrays;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        //easy code
//        String[] words = s.trim().split("\\s+");
//        return words[words.length - 1].length();

        //optimized
        int length = 0, i = s.length()- 1;
        while (i>=0 && s.charAt(i) == ' ') i--;
        while (i>=0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
