package com.codingbat.warmup1;

/**
 * Created by buddha on 8/3/14.
 */
public class SleepIn {


    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday && vacation) {
            return true;
        } else if (!weekday && !vacation) {
            return true;
        } else if (weekday && vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        SleepIn sleep = new SleepIn();
        sleep.sleepIn(true, true);
        sleep.sleepIn(true, false);
        sleep.sleepIn(false, true);
        sleep.sleepIn(false, false);
    }
}
