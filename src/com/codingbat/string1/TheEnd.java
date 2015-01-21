package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class TheEnd {
    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else return str.substring(str.length() - 1);
    }

    public static void main(String[] args) {

    }
}
