package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class ConCat {
    public String conCat(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1 && a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            a = a.substring(0, a.length() - 1);
        }
        return a + b;
    }

    public static void main(String[] args) {

    }
}
