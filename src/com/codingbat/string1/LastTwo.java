package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.length() == 2) {
            return str.substring(1) + str.substring(0, 1);
        }
        return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
    }

    public static void main(String[] args) {

    }
}
