package com.company;

//variables :- We can create static variables at class level only.

                    //static block and static variables are executed in the order they are present in a program.

public class Demo1 {             
	    // of static blocks and variables
	
	    // static variable
	    static int a = m1();
	   
	    // static block
	    static
	    {
	        System.out.println("Inside static block");
	    }
	   
	    // static method
	    static int m1()
	    {
	        System.out.println("from m1");
	        return 20;
	    }
	   
	    // static method(main !!)
	    public static void main(String[] args)
	    {
	        System.out.println("Value of a : " + a);
	        System.out.println("from main");
	    }
	}

