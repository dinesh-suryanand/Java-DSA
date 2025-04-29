package com.dineshsuryanand.dsa.udemycourseone.strings;

import java.util.Arrays;

public class ReverseWordsInString {

    public static String reverseWordsIdeally(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) reversed.append(" ");
        }

        return reversed.toString();
    }
    //todo c
    public static String reverseWords(String s) {
        char[] str = s.toCharArray();
       //clean white spaces
        char[] chars = cleanSpaces(str);

        System.out.println(str);
        //reverse each word

        return null;

    }

    private static char [] cleanSpaces(char[] str) {
        int n = str.length;
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && str[j] == ' ') j++; //skip starting spaces
            while (j < n && str[j] != ' ') str[i++] = str[j++]; // copies the word
            /*
                the   above while loop does this
                str[i] = str[j];
                i++;
                j++;

             */
            while (j < n && str[j] == ' ') j++; // skips ending spaces
            // add one space if there are more words
            if (j < n) str[i++] = ' ';
        }

        char[] result = new char[i];
        System.arraycopy(str,0,result,0,i);

        return result;
    }

    private static void reverseStr(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }


//    public static void main(String[] args) {
//
//        reverseWords("the sky is   blue i   a m");
//    }
}
