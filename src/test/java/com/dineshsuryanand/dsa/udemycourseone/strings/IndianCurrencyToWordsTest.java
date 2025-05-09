package com.dineshsuryanand.dsa.udemycourseone.strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndianCurrencyToWordsTest {

    @ParameterizedTest
    @CsvSource({
        "0, Zero",
        "5, Five",
        "15, Fifteen",
        "50, Fifty",
        "99, Ninety Nine",
        "100, One Hundred",
        "101, One Hundred and One",
        "999, Nine Hundred and Ninety Nine",
        "1000, One Thousand",
        "1234, One Thousand Two Hundred and Thirty Four",
        "100000, One Lakh",
        "101000, One Lakh One Thousand",
        "123456, One Lakh Twenty Three Thousand Four Hundred and Fifty Six",
        "10000000, One Crore",
        "123456789, Twelve Crore Thirty Four Lakh Fifty Six Thousand Seven Hundred and Eighty Nine"
    })
    void testIndianCurrencyConversion(int input, String expected) {
        assertEquals(expected, IndianCurrencyToWords.convertToIndianWords(input));
    }
}
