package com.company;

public class SV1 {

	   // static variable
	   static int max = 10;
	  
	   // non-static variable
	   int min = 5;
	

	//public class Main {
public static void main(String[] args) {
	       SV1 obj = new SV1();                                   // object create
	       
	                                                              // access the non-static variable
	       System.out.println("min + 1 = " + (obj.min + 1));

	                                                              // access the static variable
	       System.out.println("max + 1 = " + (SV1.max + 1));
	   }
	}




//non-static variable using the object of the class (obj.min + 1).
//static variable by using the class name (Test.max + 1).