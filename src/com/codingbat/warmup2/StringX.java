package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class StringX {
    public String stringX(String str) {
        if (str.length() < 3) {
//            System.out.println(str);
            return str;
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                newStr += str.substring(i, i + 1);
            }
        }
//        System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
/*
        StringX x = new StringX();
        x.stringX("xaxxxax");
*/
    }
}