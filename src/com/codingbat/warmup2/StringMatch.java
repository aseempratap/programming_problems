package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class StringMatch {
    public int stringMatch(String a, String b) {
        int n, count = 0;
        if (a.length() > b.length()) {
            n = b.length();
        } else n = a.length();
        for (int i = 0; i <= n - 2; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        //System.out.println(+count);
        return count;
    }

    public static void main(String[] args) {
        //StringMatch str = new StringMatch();
        //str.stringMatch("hello","hell");
    }
}
