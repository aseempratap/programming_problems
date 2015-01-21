package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class TwoChar {
    public String twoChar(String str, int index) {
        if ((index + 2) > str.length() || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public static void main(String[] args) {

    }
}
