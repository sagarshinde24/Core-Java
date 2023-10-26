package com.company;

public class LocalVariable {
	
	public static void main(String[] args) {        // Declare inside the Main Method

       int a;                                       // Priority first to local variable
       a=10;
       
       int b = 100;
       
       System.out.println(a);
       System.out.println(b);
       System.out.println(a+b);

	}

}
