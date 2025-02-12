package com.dineshsuryanand.dsa.functionalprog;

import java.util.Arrays;
import java.util.List;

public class MapMethod {

    public static void main(String[] args) {
        List<String> someList = List.of("apple", "ball", "pen","p");
        List<String> someListArray = Arrays.asList("apple", "ball", "pen","p");

        someList.stream()
                .map(word -> word.replace('p','d'))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

}
