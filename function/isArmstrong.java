package com.function;

import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(IsArmstrong(n));

        for (int i = 100;  i<1000; i++){
            if (IsArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean IsArmstrong(int n) {
        int original = n;
        int sum = 0;

        if (n < 1){
            return false;
        }

        while (n > 0){
            int rem = n% 10;
            sum += rem*rem*rem;
            n = n/ 10;
        }
        return sum == original;
    }
}
