package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
                return false;
            } else return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}
