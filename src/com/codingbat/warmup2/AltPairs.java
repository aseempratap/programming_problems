package com.codingbat.warmup2;

/**
 * Created by buddha on 14/3/14.
 */
public class AltPairs {
    public String altPairs(String str) {
        String newStr = "";
        if (str.length() < 3) {
            //System.out.println(str);
            return str;
        }
        for (int i = 0; i <= str.length(); i = i + 4) {
            if ((i + 2) <= str.length()) {
                newStr += str.substring(i, i + 2);
            } else {
                newStr += str.substring(i, str.length());
            }
        }
        //System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        /*AltPairs alt = new AltPairs();
        alt.altPairs("");
        alt.altPairs("a");
        alt.altPairs("ab");
        alt.altPairs("abc");
        alt.altPairs("abcd");
        alt.altPairs("abcde");
        alt.altPairs("abcdef");
        alt.altPairs("abcdefg");
        alt.altPairs("abcdefgh");
        alt.altPairs("abcdefghi");
        alt.altPairs("abcdefghij");
        alt.altPairs("abcdefghijk");
        alt.altPairs("abcdefghijkl");*/
    }
}