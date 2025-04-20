package com.dineshsuryanand.dsa.udemycourseone.integers;

public class Power {
    public static double myPow(double x, int n) {
        long power = n;  // Convert to long to avoid overflow (esp. for Integer.MIN_VALUE)

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }


        double result = 1.0;

        while (power > 0) {
            if(power %2 == 1) {
                result *=x;
            }
            x *=x;
            power = power/2;

        }

        return result;
    }
}
