package com.company;

//Process of calling one Construetor from another Construetor

//using this()call statement call the constructor of class

public class person{ 
	
	person(){                                    // constructor
		System.out.println("no of arguments");
	}
    person(int a){                               // parametrizes constructor 1      
		this();
		System.out.println(a);
	}
    person(String s1){                         // parametrizes constructor 2 
		this(10);
		System.out.println(s1);
	}
public static void main(String[] args) {
	System.out.println("ms"); 
	
	new person("sagar");                       // Object Creation by class
	
	System.out.println("me");
	}
}
		


