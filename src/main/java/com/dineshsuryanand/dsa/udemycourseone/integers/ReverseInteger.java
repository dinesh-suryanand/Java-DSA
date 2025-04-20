package com.dineshsuryanand.dsa.udemycourseone.integers;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2³¹, 2³¹ - 1], return 0.

Constraints:
Input is a 32-bit signed integer.

Reversed number must also fit within 32-bit signed int range.
 */

public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x%10;
            x = x/10;

            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && digit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && digit < -8)) return 0;

            reversed = reversed*10 + digit;
        }

        return reversed;
    }
}
