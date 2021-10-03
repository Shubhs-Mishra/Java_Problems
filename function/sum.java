package com.function;

import java.util.Scanner;

public class sum {
//    public static void main(String[] args) {
//        int ans = sum(20, 60);
//        System.out.println(ans);
//    }
//    // providing two values in args
//        static int sum (int a, int b){
//            int sum = a + b;
//            return sum;
//        }

    public static void main(String[] args) {
        sum();
    }
//    longer method
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a = in.nextInt();
        System.out.println("enter the 2nd number");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
