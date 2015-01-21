package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class StartHi {
    public boolean startHi(String str) {
        //String start = str.substring(0,2);
        if (str.startsWith("hi", 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
