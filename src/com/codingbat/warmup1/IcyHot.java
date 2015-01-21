package com.codingbat.warmup1;

/**
 * Created by buddha on 10/3/14.
 */
public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 * temp2 < 0) && (temp1 > 100 || temp2 > 100)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}
