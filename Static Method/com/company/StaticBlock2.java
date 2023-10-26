package com.company;

public class StaticBlock2 {
	// static variables
	   static int a = 23;
	   static int b;
	   static int max;

	   // static blocks
	   static {
	       System.out.println("First Static block.");
	       b = a * 4;
	   }
	   static {
	       System.out.println("Second Static block.");
	       max = 30;
	   }

	   // static method
	   static void display() {
	       System.out.println( a);
	       System.out.println( b);
	       System.out.println(max);
	   }

	   public static void main(String args[]) {
		   
	      // Static methods can be called without creating objects
		   
	       display();
	   }
	}
