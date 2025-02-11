package com.dineshsuryanand.dsa.functionalprog;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {


        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());

        convertAndDisplay.accept("dinesh");


        Consumer<String> appendInput = input -> System.out.println("new val :" + input);

        appendInput.andThen(convertAndDisplay).accept("lambda");

    }
}
