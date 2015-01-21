package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class NotString {

    public String notString(String str) {

        String notStr;
        if ((str.length() >= 3) && (str.substring(0, 3).equals("not"))) {
            return str;
        } else {
            notStr = "not " + str;
            return notStr;
        }
    }

    public static void main(String[] args) {

    }
}
