package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class SeeColor {
    public String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
