package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class StringTimes {
    public String stringTimes(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr = newStr + str;
        }
        return newStr;
    }

    public static void main(String[] args) {

    }
}
