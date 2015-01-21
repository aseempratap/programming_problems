package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return "";
        }
        if (a.length() > b.length()) {
            return b + a + b;
        } else return a + b + a;
    }

    public static void main(String[] args) {

    }
}
