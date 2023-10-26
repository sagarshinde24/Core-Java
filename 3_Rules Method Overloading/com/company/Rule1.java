package com.company;



// Changing the Number of Parameters.



public class Rule1 {
	
	public static int add( int a, int b) {
		return a+b;
	}
	
	public static int add( int a, int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
	
      System.out.println(Rule1.add(10, 20));
      
      System.out.println("The addition of number : "+Rule1.add(45, 15, 10));
	}

}
