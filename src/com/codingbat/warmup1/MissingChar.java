package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class MissingChar {

    public String missingChar(String str, int n) {
        System.out.println("String: " + str + "\nString Length: " + str.length());
        String newStr = str.substring(0, n) + str.substring(n + 1, str.length());
        System.out.println("String: " + newStr + "\nString Length: " + newStr.length());
        return newStr;
    }

    public static void main(String[] args) {
        MissingChar rem = new MissingChar();
        rem.missingChar("Kitten", 1);
    }
}
