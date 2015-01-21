package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class In3050 {
    public boolean in3050(int a, int b) {
        boolean a3040 = (a >= 30 && a <= 40);
        boolean a4050 = (a >= 40 && a <= 50);
        boolean b3040 = (b >= 30 && b <= 40);
        boolean b4050 = (b >= 40 && b <= 50);
        if ((a3040 && b3040) || (a4050 && b4050)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}
