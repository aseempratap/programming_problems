package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        MonkeyTrouble trouble = new MonkeyTrouble();
        trouble.monkeyTrouble(true, true);
        trouble.monkeyTrouble(true, false);
        trouble.monkeyTrouble(false, true);
        trouble.monkeyTrouble(false, false);
    }
}
