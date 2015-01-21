package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class MiddleThree {
    public String middleThree(String str) {
        if (str.length() < 4) {
            return str;
        }
        int n = str.length() / 2;
        return str.substring(n - 1, n + 2);
    }

    public static void main(String[] args) {
/*
        int a = 3;
        int b = a / 2;
        System.out.println("Int: "+b);
*/
    }
}
