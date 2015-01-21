package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class WithouEnd2 {
    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {

    }
}
