package com.projecteuler;

/**
 * Created by buddha on 11/4/14.
 */
public class MultiplesOf3And5 {
    public int multiplesOf3And5(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i < upper; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        MultiplesOf3And5 mul = new MultiplesOf3And5();
        mul.multiplesOf3And5(1, 10);
        mul.multiplesOf3And5(1, 100);
        mul.multiplesOf3And5(1, 1000);
    }
}
