package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class Front22 {
    public String front22(String str) {
        int n = str.length();
        String first = str.substring(0, 1);
        String second = str.substring(1, 2);

        if (str.length() < 2) {
            System.out.println("\nold: " + str);
            String newStr = str.substring(0, n) + str.substring(0, n) + str.substring(0, n);
            System.out.println("\nnew: " + newStr);
            return newStr;
        } else {
            System.out.println("\nold: " + str);
            String newStr = first + second + str.substring(0) + first + second;
            System.out.println("\nnew: " + newStr);
            return newStr;
        }
    }

    public static void main(String[] args) {
        Front22 front = new Front22();
        //front.front22("");
        //front.front22("a");
        front.front22("ba");
        front.front22("cba");
        front.front22("hello");
    }
}
