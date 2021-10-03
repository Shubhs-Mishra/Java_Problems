package com.function;

public class personalised {
    public static void main(String[] args) {
        String personalised = mygreet("Shubham Mishra!");
        System.out.println(personalised);
    }
    static String mygreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
