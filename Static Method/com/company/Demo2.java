package com.company;

public class Demo2 {
	
	                                                                         // static variable
	   static int age;
	   static int weight;
	                                                                        // static method
	   static void display() {
	       System.out.println("Static Method");
	   }
	   
	   public static void main(String[] args) {
		   
		 //  Static methods can be called without creating objects
		   
	       weight = 50;                                                                // access the static variable
	       age = 30;
	       System.out.println("Age is " + age);
	       System.out.println("Weight is " + weight);
	                                                                       // access the static method
	       display();
	   }
	}

	
