package com.dineshsuryanand.dsa.udemycourseone.strings;

import java.util.*;

public class RepeatedDNASequence {
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (int i =0; i< s.length() -10;i++){
            String subString = s.substring(i,i+10);
            if (!seen.add(subString)){
                result.add(subString);
            }

        }

        return new ArrayList<>(result);
    }
}
