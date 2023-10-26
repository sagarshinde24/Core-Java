package com.company;

public class if_else {
    public static void main(String[] args) {
        if (20 > 18) {                                                          // if statement
            System.out.println("20 is greater than 18");

            int x = 20;
            int y = 18;
            if (x > y) {                                                        // if statement
                System.out.println("x is greater than y");

                int time = 20;
                if (time < 18) {
                    System.out.println("Good day.");                           // if else statement
                } else {
                    System.out.println("Good evening.");


                    int age = 22;
                    if (age < 10) {
                        System.out.println("Good morning.");
                    } else if (age > 20) {                                    // if else-if statement
                        System.out.println("Good day.");
                    } else {
                        System.out.println("Good evening.");
                        // Outputs "Good evening"
                    }
                }
            }
        }
    }

}
