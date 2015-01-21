package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class Front3 {

    public String front3(String str) {
        if (str.length() < 3) {
            String newStr = str.substring(0) + str.substring(0) + str.substring(0);
            return newStr;
        } else {
            String newStr = str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
            return newStr;
        }
    }

    public static void main(String[] args) {

    }
}
