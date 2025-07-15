package com.dineshsuryanand.dsa.udemycourseone.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class BestTimeToBuyAndSellStockTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> data() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(
                new int[]{7,1,5,3,6,4}, 5
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                new int[]{7,6,4,3,1}, 0
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                new int[]{2,4,1}, 2
            )
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void testMaxProfit(int[] prices, int expected) {
        assertEquals(expected, BestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
