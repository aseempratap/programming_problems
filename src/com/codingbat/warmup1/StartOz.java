package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class StartOz {
    public String startOz(String str) {
        if (str.startsWith("oz", 0)) {
            return "oz";
        } else if (str.startsWith("o", 0)) {
            return "o";
        } else if (str.startsWith("z", 1)) {
            return "z";
        } else return "";
    }

    public static void main(String[] args) {

    }
}
