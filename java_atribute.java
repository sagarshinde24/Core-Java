package com.company;

public class java_atribute {

    // public  class Main {
        int x = 5;
        String fname = "Sagar";
        String lname = "Shinde";
        int age = 24;

        public static void main(String[] args) {

            java_atribute myObj = new java_atribute();


            java_atribute myObj1 = new java_atribute();  // Object 1
            java_atribute myObj2 = new java_atribute();  // Object 2
            myObj2.x = 25;

            System.out.println(myObj1.x);                         // Outputs 5
            System.out.println(myObj2.x);                         // Outputs 25


            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
            System.out.println("Age: " + myObj.age);
        }
    }



