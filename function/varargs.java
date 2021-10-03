package com.function;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,2 ,3 , 4, 4, 5);
        multiple(2, 4, "Shubham", "Deepanshi");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
        System.out.println(a + " " + b + Arrays.toString(v));
    }

    static void fun(int ...x) {
        System.out.println(Arrays.toString(x));
    }
}
