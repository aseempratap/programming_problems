package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        int n;
        if (nums.length < 4) {
            n = nums.length;
        } else n = 4;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
