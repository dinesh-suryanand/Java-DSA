package com.dineshsuryanand.dsa.udemycourseone.arrays;

import java.util.stream.IntStream;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }
}
