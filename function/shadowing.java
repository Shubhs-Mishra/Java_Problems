package com.function;

public class shadowing {
    static int x = 90 ;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;// the class variable at line 4 is shadowed by this
        System.out.println(x);
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }
}
