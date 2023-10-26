package com.company;

public class method_with_if_else {
    public static void checkAge(int age) {

        if (age < 18) {
            System.out.println("Your are not eligible for vote");
        } else {
            System.out.println("You are eligiblle");
        }

    }

    public static void main (String[]args){
           checkAge(20);

    }
}