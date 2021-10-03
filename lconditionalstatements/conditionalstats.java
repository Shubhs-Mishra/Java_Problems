package com.lconditionalstatements;

public class conditionalstats {
    public static void main(String[] args) {
        int salary = 54400;
//        if (salary > 10000){
//            salary += 2000;
//        }else {
//            salary += 1000;
//        }

        //multiple if_ else
        if (salary> 20000){
            salary += 2000;
        }else if( salary > 10000){
            salary += 3000;
        }else{
            salary+= 1000;
        }
        System.out.println(salary);
    }
}
