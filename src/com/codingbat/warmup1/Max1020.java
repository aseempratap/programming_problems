package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class Max1020 {
    public int max1020(int a, int b) {
        boolean a1020 = (a >= 10 && a <= 20);
        boolean b1020 = (b >= 10 && b <= 20);
        if (a1020 && b1020) {
            if (a > b) return a;
            else return b;
        } else if (a1020 && !b1020) {
            return a;
        } else if (b1020 && !a1020) {
            return b;
        } else return 0;
    }

    public static void main(String[] args) {

    }
}
