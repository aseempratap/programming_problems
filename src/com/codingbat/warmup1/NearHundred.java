package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class NearHundred {

    public boolean nearHundred(int n) {

        int a = Math.abs(100 - n);
        int b = Math.abs(200 - n);
        if ((a <= 10) || (b <= 10)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
