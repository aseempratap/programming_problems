package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class Diff21 {

    public int diff21(int n) {

        int a;
        if (n <= 21) {
            a = 21 - n;
            return a;
        } else {
            a = 2 * (n - 21);
            return a;
        }
    }

    public static void main(String[] args) {

        Diff21 diff = new Diff21();
        diff.diff21(19);
        diff.diff21(21);
        diff.diff21(32);
        diff.diff21(4);
    }
}
