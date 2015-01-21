package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class EndUp {
    public String endUp(String str) {
        String newStr;
        int n = str.length();
        if (n < 3) {
            return str.toUpperCase();
        } else {
            newStr = str.substring(n - 3, n);
            newStr = newStr.toUpperCase();
            return str.substring(0, n - 3) + newStr;
        }
    }

    public static void main(String[] args) {

    }
}
