package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class DoubleX {
    boolean doubleX(String str) {
        if (str.length() < 1) {
            return false;
        }
        if (str.contains("x")) {
            int firstX = str.indexOf("x");

            if (firstX < str.length() - 1) {
                String firstXX = str.substring(firstX, firstX + 2);
                if (firstXX.equals("xx")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String abc = "xx";
        System.out.println(+abc.length());
    }
}
