package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class IntMax {
    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else return c;
    }

    public static void main(String[] args) {

    }
}
