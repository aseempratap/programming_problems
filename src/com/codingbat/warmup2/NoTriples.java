package com.codingbat.warmup2;

/**
 * Created by buddha on 14/3/14.
 */
public class NoTriples {
    public boolean noTriples(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}