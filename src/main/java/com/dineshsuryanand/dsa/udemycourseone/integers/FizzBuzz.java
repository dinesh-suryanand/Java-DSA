package com.dineshsuryanand.dsa.udemycourseone.integers;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // i is divisible by 3 & 5: FizzBuzz
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) { // i is divisible by 3
                answer.add("Fizz");
            } else if (i % 5 == 0) { // i is divisible by 5
                answer.add("Buzz");
            } else {
                answer.add(i + "");
            }
        }
        return answer;
    }
} // TC: O(n), SC: O(n)F
