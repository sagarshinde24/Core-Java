package com.company;

public class GlobalVariable {     // Declare Inside the class block. type- Static and non-static
	
	static int a = 10;

	public static void main(String[] args) {
		
		System.out.println(a);      // Direct access to Global variable
		int a =100;
		System.out.println(a);      // Direct access to Local variable

	}

}
