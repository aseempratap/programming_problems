package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class CountXX {
    int countXX(String str) {
        String newStr;
        if (str.length() < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            newStr = str.substring(i, i + 2);
            if (newStr.contains("xx")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
