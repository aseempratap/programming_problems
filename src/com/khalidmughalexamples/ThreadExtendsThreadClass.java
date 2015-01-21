package com.khalidmughalexamples;

/**
 * Created by buddha on 15/4/14.
 */
public class ThreadExtendsThreadClass extends Thread {
    private int currentValue;

    public static void main(String[] args) {

    }

    public ThreadExtendsThreadClass(String ThreadName) {
        super(ThreadName);
        currentValue = 0;
        System.out.println(this);
        setDaemon(true);
        start();
    }


}