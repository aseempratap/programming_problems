package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class LastDigit {
    public boolean lastDigit(int a, int b) {
        int aRem = a % 10;
        int bRem = b % 10;
        if (aRem == bRem) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        int c = 6 % 10;
        int d = 113 % 10;
        System.out.println(+c + "\n" + d);

        String str = "abcdefghi";
        System.out.println(+str.charAt(1));
    }
}
