package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class StringE {
    public boolean stringE(String str) {
        int i, count = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("e")) {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public static void main(String[] args) {

    }
}
