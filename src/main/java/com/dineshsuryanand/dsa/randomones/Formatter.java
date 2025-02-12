package com.dineshsuryanand.dsa.randomones;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Formatter {

    public static  String formatString1(String input) {
        StringBuilder output = new StringBuilder();

        for(int i = 0 ; i < input.length(); i=i+2) {
            if (i>0) output.append(":");
            output.append(input,i,Math.min(i+2, input.length()));
        }
        return output.toString();
    }

    public static  String formatString(String input) {
        StringBuilder output = new StringBuilder();

       return IntStream.range(0,input.length())
               .filter(i -> i%2 == 0)
               .mapToObj(i -> input.substring(i,Math.min(i+2,input.length())))
               .collect(Collectors.joining(":"));
    }


}
