package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class Left2 {
    public String left2(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(2) + str.substring(0, 2);
    }

    public static void main(String[] args) {

    }
}
