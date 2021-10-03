package com.lconditionalstatements;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dept = in.next();

        switch (empId){
            case 1 :
                System.out.println("Shubham Mishra");
                break;
            case 2:
                System.out.println(" Deepanshi Mishra");
                break;
            case 3:
                System.out.println("Employ number 3");
                switch (dept){
                    case "IT":
                        System.out.println(" IT Department");
                        break;
                    case "CS":
                        System.out.println(" CS Department");
                        break;
                    case "CA":
                        System.out.println( "CA Department");
                        break;
                    default:
                        System.out.println("No Department");
                }break;
            default:
                System.out.println("Enter correct EmpId");
        }
        // better way to write
        switch (empId) {
            case 1 -> System.out.println("Shubham Mishra");
            case 2 -> System.out.println(" Deepanshi Mishra");
            case 3 -> {
                System.out.println("Employ number 3");
                switch (dept) {
                    case "IT" -> System.out.println(" IT Department");
                    case "CS" -> System.out.println(" CS Department");
                    case "CA" -> System.out.println("CA Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
    }
}
