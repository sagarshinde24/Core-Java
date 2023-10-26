package com.company;

import java.sql.SQLOutput;

public class sString {
    public static void main(String[] args) {

        String greeting = "Hello";                 // String
        System.out.println(greeting);

        String text = "welcome sagar shinde";
        System.out.println(text);
        System.out.println(text.length());         // Length of string

        System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());   // Outputs "hello world"



        String firstName = "Sagar";                                  //String Concatenation
        String lastName = "Shinde";
        System.out.println(firstName + " " + lastName);              // empty text (" ") to create a space

        System.out.println(firstName.concat(lastName));             // concat method


        String txt = "Hello\nWorld!";                               // \n new line start
        System.out.println(txt);
    }
}
