package com.dineshsuryanand.dsa.udemycourseone.strings;

public class IndianCurrencyToWords {

    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                                                  "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
                                                  "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                                          "Eighty", "Ninety"};

    public static String convertToIndianWords(int num) {
        if (num == 0) return "Zero";

        StringBuilder sb = new StringBuilder();

        if (num >= 1_00_00_000) {
            sb.append(helper(num / 1_00_00_000)).append(" Crore ");
            num %= 1_00_00_000;
        }

        if (num >= 1_00_000) {
            sb.append(helper(num / 1_00_000)).append(" Lakh ");
            num %= 1_00_000;
        }

        if (num >= 1000) {
            sb.append(helper(num / 1000)).append(" Thousand ");
            num %= 1000;
        }

        if (num >= 100) {
            sb.append(helper(num / 100)).append(" Hundred ");
            num %= 100;
        }

        if (num > 0) {
            if (!sb.isEmpty()) sb.append("and ");
            sb.append(helper(num));
        }

        return sb.toString().trim();
    }

    private static String helper(int num) {
        if (num == 0) return "";
        if (num < 20) return LESS_THAN_20[num];
        return TENS[num / 10] + (num % 10 != 0 ? " " + LESS_THAN_20[num % 10] : "");
    }
}
