package com.company;

public class MethodClass {
   // public class Main {


        // Static method
        static void myStaticMethod() {
            System.out.println("Static methods can be called without creating objects");
        }

        // Public method
        public static void myPublicMethod() {

            System.out.println("Public methods must be called by creating objects");
        }

        // Main method
        public static void main(String[] args) {
            myStaticMethod(); // Call the static method
            //myPublicMethod(); This would compile an error

           MethodClass myObj = new MethodClass(); // Create an object of
            MethodClass.myPublicMethod(); // Call the public method on the object
        }
    }

