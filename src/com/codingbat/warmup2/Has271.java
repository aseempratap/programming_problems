package com.codingbat.warmup2;

/**
 * Created by buddha on 14/3/14.
 */
public class Has271 {
    public boolean has271(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i <= nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 && (nums[i + 2] >= nums[i] - 3 && nums[i + 2] <= nums[i] + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
