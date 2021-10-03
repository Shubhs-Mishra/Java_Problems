package com.lconditionalstatements;

public class reverse {
    public static void main(String[] args) {
        int num = 23597;
        int ans = 0;
//            while(n > 0){
//                r = n % 10;
//                System.out.print(rem);
//                n = n / 10;
        while(num> 0){
            int rem = num % 10;
            num /= 10;
            ans = ans* 10 + rem;
        }
        System.out.println(ans);
    }

}
