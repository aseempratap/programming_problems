package com.codingbat.warmup2;

/**
 * Created by buddha on 14/3/14.
 */
// yakabcyak
public class StringYak {
    public String stringYak(String str) {
        if (str.length() < 3) {
//            System.out.println(str);
            return str;
        }
        if ((str.length() >= 3) && (str.substring(0, 3).equals("yak"))) {
            str = str.substring(3, str.length());
        }
        if ((str.length() >= 3) && (str.substring(str.length() - 3, str.length()).equals("yak"))) {
            str = str.substring(0, str.length() - 3);
        }
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("yak")) {
                str = str.substring(0, i) + str.substring(i + 3, str.length());
            }
        }
//        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
/*
        StringYak yak = new StringYak();
        yak.stringYak("a");
        yak.stringYak("yak");
        yak.stringYak("ayak");
        yak.stringYak("yakabc");
        yak.stringYak("abcyaklab");
        yak.stringYak("ayakbyakcyak");
        yak.stringYak("yyakayakk");
*/
    }
}