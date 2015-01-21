package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class Makes10 {

    public boolean makes10(int a, int b) {

        if ((a == 10) || (b == 10)) {
            return true;
        } else if ((a + b) == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
