package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}