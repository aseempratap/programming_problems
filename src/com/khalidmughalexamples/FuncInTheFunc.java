package com.khalidmughalexamples;

/**
 * Created by buddha on 15/4/14.
 */
public class FuncInTheFunc {
    public int funcInFunc(int a) {
        a += 10;
        return a;
    }

    public static int func(int a, int b) {
        int c = a + b;
        return c;
    }

    public static String fuckYouFunky() {
        return "LoL XD :P";
    }

    public static void main(String[] args) {

        FuncInTheFunc funky = new FuncInTheFunc();

        System.out.println(funky.funcInFunc(100));
        System.out.println(func(5, 6));
        System.out.println(fuckYouFunky());
    }
}