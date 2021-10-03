package com.lconditionalstatements;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        take input from user till he/she inputs 'x' or 'X'
        int ans = 0;

        while(true){
            System.out.println("enter the operator ");
            char op = in.next().trim().charAt(0);
            System.out.println("Enter the two numbers ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if ( op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 == 0){
                        System.out.println("Divisor can't be zero");
                    }else{
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }

            }else if ( op == 'x' || op  == 'X'){
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println(ans);

        }

    }
}
