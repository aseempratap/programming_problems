package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class ExtraEnd {
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

    public static void main(String[] args) {

    }
}
