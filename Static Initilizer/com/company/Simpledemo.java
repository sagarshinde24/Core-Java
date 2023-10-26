package com.company;

public class Simpledemo {
	static {
		System.out.println("Static initilizer 1");
	}
	static {
		System.out.println("Static initilizer 2");
	}
	static {
		System.out.println("Static initilizer 3");
	}
	static {
		System.out.println("Static initilizer 4");
	}
	
	
	// Main Method
	public static void main(String[] args) {
		
			System.out.println("Hello World!!!");
		}
	
	static {
		System.out.println("Static initilizer 5");        // This Static Initilizer execute before Main Method
		
	}
	}

