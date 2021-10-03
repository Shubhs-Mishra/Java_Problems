package com.lconditionalstatements;

import java.util.Scanner;

public class swtichstatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruits = in.next();
//
//        switch (fruits) {
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("A round fruit");
//            case "Mango" -> System.out.println("King of fruits");
//            default -> System.out.println("Please enter a valid fruit.");
//        }

        int day = in.nextInt();

        switch (day){
            case 1 -> System.out.println("day 1 is monday");
            case 2 -> System.out.println("day 2 is tuesday");
            case 3 -> System.out.println("day 3 is wednesday");
            case 4 -> System.out.println("day 4 is thursday");
            case 5 -> System.out.println("day 5 is friday");
            case 6 -> System.out.println("day 6 is satday");
            case 7 -> System.out.println("day 7 is sunday");

        }
    }
}
