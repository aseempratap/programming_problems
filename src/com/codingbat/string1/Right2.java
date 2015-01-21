package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class Right2 {
    public String right2(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public static void main(String[] args) {

    }
}
