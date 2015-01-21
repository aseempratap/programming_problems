package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class MiddleTwo {
    public String middleTwo(String str) {
        if (str.length() < 3) {
            return str;
        }
        int n = str.length() / 2;
        return str.substring(n - 1, n + 1);
    }

    public static void main(String[] args) {

    }
}
