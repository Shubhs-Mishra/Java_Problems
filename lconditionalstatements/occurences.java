package com.lconditionalstatements;

import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {

        int n = 1355757;
        int count = 0;
        while(n > 0) {
            if (n % 10 == 5){
                count ++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
