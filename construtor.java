package com.company;

public class construtor {
                                                     // Create a Main class
    //public static class Main {
        int x;                                      // Create a class attribute

                                                    // Create a class constructor for the Main class
        public construtor() {
          x = 5;                                  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {

            construtor myObj = new construtor();                  // Create an object of class Main (This will call the constructor)
            System.out.println(myObj.x);              // Print the value of x
        }
    }

//}
