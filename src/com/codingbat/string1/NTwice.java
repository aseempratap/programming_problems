package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class NTwice {
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public static void main(String[] args) {

    }
}
