package com.company;

import java.util.Scanner;          // import the Scanner class

public class packageapi {

   // static class Main {

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            String userName;
            String lName;


                                                          // Enter username and press Enter

            System.out.println("Enter username");
            System.out.println("Enter lnamae");

            userName = myObj.nextLine();
            lName = myObj.nextLine();

            System.out.println("Username is: " + userName);
            System.out.println("lname is: "+ userName);
        }
    }


