package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length() == 2) {
            return true;
        }
        if (str.length() >= 3 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
