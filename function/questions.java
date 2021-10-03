package com.function;

import java.net.IDN;
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        IsPrime(n);
//        System.out.println(IsPrime(n));


        isArms(n);
        System.out.println(isArms(n));


        for (int x = 100; x < 1000; x++) {
            if (isArms(x))
                System.out.println(x + " ");

        }
    }
//
//    static boolean IsPrime(int n) {
//        if (n<=1){
//            return false;
//        }
//        int c = 2;
//        while (c * c < n){
//            if ( n % c == 0){
//                return false;
//            }
//            c++;
//        }
//        return c*c > n;
//    }


        static boolean isArms(int n) {
            int sum = 0;
            int original = n;
            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem * rem;
                n = n / 10;
            }
            return sum == original;
        }

}

