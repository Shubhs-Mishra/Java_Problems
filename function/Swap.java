package com.function;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap two numbers
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);


        // using functions
        swap(a, b);
        System.out.println( a + " " + b);

    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
