package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(0, 3).equals("bad") || (str.length() >= 4) && (str.substring(1, 4).equals("bad"))) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}
