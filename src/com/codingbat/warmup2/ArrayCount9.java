package com.codingbat.warmup2;

/**
 * Created by buddha on 11/3/14.
 */
public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
