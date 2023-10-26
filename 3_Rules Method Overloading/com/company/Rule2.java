package com.company;


//Changing Data Types of the Arguments


public class Rule2 {
	       
	public static void display(int a) {              // second print
		System.out.println("Hello_24444_Sagar");
	}
	public static void display(String a) {           // first print
		System.out.println("Hello Sagar");
	}
	public static void display(int a, int b){        // return a+b;   method Voids cannot return a value 
		System.out.println(a);                       // third print
		System.out.println(b);                       // fourth print
		System.out.println("Arguments: " + a + b);   // final print
    }

	public static void main(String[] args) {
		
		display("Hello_24444_Sagar");
		display(1);
        display(1, 4);
	}

}
