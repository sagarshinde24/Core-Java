package com.company;

public class Bike23{
	int cc;
	{
	  System.out.println("Bike Creation");	           // non static initilizer execute before object Creation
	}
	String brand;
	{
		System.out.println("bike 234");
	}

	public static void main(String[] args) {
		 
		System.out.println("Main Start");
		new Bike23();
		new Bike23();
		System.out.println("Main Ends");
	}

}
