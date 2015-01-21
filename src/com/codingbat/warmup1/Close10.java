package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class Close10 {
    public int close10(int a, int b) {
        int c = Math.abs(10 - a);
        int d = Math.abs(10 - b);
        if (c < d) {
            return a;
        } else if (d < c) {
            return b;
        } else return 0;
    }

    public static void main(String[] args) {

    }
}
