package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class StringBits {
    public String stringBits(String str) {
        String newStr = "";
        if (str.equals("")) {
            //System.out.println("");
            return "";
        }
        if (str.length() < 2) {
            //System.out.println(str.substring(0, 1));
            return str.substring(0, 1);
        }
        for (int i = 0; i < str.length(); i += 2) {
            newStr = newStr + str.charAt(i);
        }
        //System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        StringBits bits = new StringBits();
        bits.stringBits("");
        bits.stringBits("a");
        bits.stringBits("ab");
        bits.stringBits("abc");
        bits.stringBits("abcd");
    }
}
