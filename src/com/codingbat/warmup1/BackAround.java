package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class BackAround {
    public String backAround(String str) {
        int n = str.length();
        Character lastChar = str.charAt(n - 1);
        String newStr = lastChar + str.substring(0) + lastChar;
        return newStr;
    }

    public static void main(String[] args) {

    }
}
