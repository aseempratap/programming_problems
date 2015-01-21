package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class FrontTimes {
    public String frontTimes(String str, int n) {
        String newStr = "";
        String front = null;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        for (int i = 0; i < n; i++) {
            newStr = newStr + front;
        }
        return newStr;
    }

    public static void main(String[] args) {

    }
}
