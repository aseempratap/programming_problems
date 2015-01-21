package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class Last2 {
    public int last2(String str) {
        String newStr, last;
        if (str.length() <= 2) {
            return 0;
        }
        last = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            newStr = str.substring(i, i + 2);
            if (newStr.equals(last)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
