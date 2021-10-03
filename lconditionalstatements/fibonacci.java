package com.lconditionalstatements;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        for (int num = 0; num == n-1; num++) {
//            int c = a
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        System.out.println(a);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <=n ){
            int c = b;
            b  = b + a;
            a = c;
            count ++;
        }
        System.out.println(b);
    }
}
