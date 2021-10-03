package com.lconditionalstatements;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //print nums from 1 to n

        Scanner in = new Scanner(System.in);
//        int n =in.nextInt();
//        for (int num = 0; num <= n; num++) {
//            System.out.print(num+ " ");
        int n = 1;
        do {
            System.out.println(n);
            n++;
        }while(n<=5);


    }
}
