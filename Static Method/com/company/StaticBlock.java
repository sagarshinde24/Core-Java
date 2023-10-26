package com.company;

public class StaticBlock {
	//non static variable
	int a= 15;
	
	//static variable
	static int age ;
	
	//static Block
	static {
		age = 24;                                             // static blocks are used to initialize the static variables.
		System.out.println(" this is the static block");
	}
	//static method
	static void display() {
		
		System.out.println(" this is the static method");
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		//StaticBlock S1 = new StaticBlock();
		
		
		display();
		}
}


	