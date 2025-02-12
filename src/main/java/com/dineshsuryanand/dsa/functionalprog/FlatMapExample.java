package com.dineshsuryanand.dsa.functionalprog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("dinesh", Arrays.asList("123", "456")),
                new Person("surya", Arrays.asList("232", "2323", "82882"))
        );
        //using map we can only extract phone numbers
        List<List<String>> mapResult = persons.stream()
                .map(Person::phoneNumbers)
                .collect(Collectors.toList());

        System.out.println("map result :" + mapResult);

        //using flat map we can extract individual elements of string
        List<String> flatMapResult = persons.stream()
                .flatMap(person -> person.phoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("flatMap result:" + flatMapResult );


    }
}
