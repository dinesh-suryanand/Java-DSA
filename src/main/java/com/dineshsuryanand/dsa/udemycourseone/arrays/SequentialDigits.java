package com.dineshsuryanand.dsa.udemycourseone.arrays;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        for (int len = 2 ; len <= 9 ; len++) {
            for (int i =0; i <= 9-len ;i++) {
                String sub = digits.substring(i,i+len);
                int num = Integer.parseInt(sub);
                if(low <= num && num<= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}
