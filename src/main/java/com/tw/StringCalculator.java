package com.tw;

public class StringCalculator {
    public int add(String string) {
        int result = 0;

        for (char num : string.toCharArray()) {
            if (Character.isDigit(num)) {
                result = result + Character.getNumericValue(num);
            }
        }
        return result;
    }
}
