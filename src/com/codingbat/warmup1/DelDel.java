package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class DelDel {
    public String delDel(String str) {
        String newStr;
        if (str.length() >= 4 && str.startsWith("del", 1)) {
            newStr = str.substring(0, 1) + str.substring(4);
            return newStr;
        } else return str;
    }

    public static void main(String[] args) {

    }
}
