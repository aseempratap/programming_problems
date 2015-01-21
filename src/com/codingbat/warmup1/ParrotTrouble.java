package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        ParrotTrouble trouble = new ParrotTrouble();
        trouble.parrotTrouble(true, 3);
        trouble.parrotTrouble(true, 9);
        trouble.parrotTrouble(true, 21);
        trouble.parrotTrouble(false, 3);
        trouble.parrotTrouble(false, 9);
    }
}
