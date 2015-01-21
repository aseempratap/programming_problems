package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class AtFirst {
    public String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        }
        if (str.length() == 1) {
            return str + "@";
        }
        return str.substring(0, 2);
    }

    public static void main(String[] args) {

    }
}
