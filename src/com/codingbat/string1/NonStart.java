package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class NonStart {
    public String nonStart(String a, String b) {
        if (a.length() < 2 && b.length() < 2) {
            return "";
        }
        return a.substring(1) + b.substring(1);
    }

    public static void main(String[] args) {

    }
}
