package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public static void main(String[] args) {

    }
}
