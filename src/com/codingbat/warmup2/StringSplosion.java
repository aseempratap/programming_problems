package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class StringSplosion {
    public String stringSplosion(String str) {
        String newStr = "";
        for (int i = 0; i <= str.length(); i++) {
            newStr = newStr + str.substring(0, i);
        }
        //System.out.println(newStr + "\n" + newStr.length() + "\n" + newStr.charAt(newStr.length() - 1) + "\n" + newStr.substring(13));
        return newStr;
    }

    public static void main(String[] args) {
        StringSplosion s = new StringSplosion();
        //s.stringSplosion("a");
        //s.stringSplosion("yo");
        //s.stringSplosion("hello");
    }
}
