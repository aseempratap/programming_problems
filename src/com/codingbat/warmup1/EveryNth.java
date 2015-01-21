package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class EveryNth {
    public String everyNth(String str, int n) {
        if (str.length() < n) {
            return str.substring(0, 1);
        }
        int i;
        String newStr = "";
        for (i = 0; i < str.length(); i = i + n) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {

    }
}
