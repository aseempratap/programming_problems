package com.codingbat.string1;

/**
 * Created by buddha on 14/3/14.
 */
public class WithoutEnd {
    public String withoutEnd(String str) {
        if (str.length() < 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {

    }
}
