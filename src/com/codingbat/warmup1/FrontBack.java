package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class FrontBack {
    public String frontBack(String str) {
        int n = str.length();
        if (n <= 1) {
            return str;
        } else {
            String mid = str.substring(1, n - 1);
            String newStr = str.charAt(n - 1) + mid + str.charAt(0);
            return newStr;
        }
    }


    public static void main(String[] args) {
        FrontBack swap = new FrontBack();
        swap.frontBack("abcd");
    }
}