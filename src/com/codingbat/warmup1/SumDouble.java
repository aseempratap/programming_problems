package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class SumDouble {

    public int sumDouble(int a, int b) {

        int c;
        if (a != b) {
            return a + b;
        } else {
            c = 4 * a;
            return c;
        }
    }

    public static void main(String[] args) {

        SumDouble sum = new SumDouble();
        sum.sumDouble(2, 3);
        sum.sumDouble(43, 16);
        sum.sumDouble(2, 90);
        sum.sumDouble(2, 2);
    }
}
