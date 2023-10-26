package com.company;

public class Bike2 {                                      // non static variable
	String brand;
	int ccIngine;
	String colour;
	String price;
	
	// non static method
	
	public void info() {                              // Void methods cannot return a value
		System.out.println("start The bike");
	}

	public static void main(String[] args) {
		
		  ///non static method object creation Mondatory(class Name)
		
		Bike2 b1 = new Bike2();
		b1.brand="RoyelEnfiled";
		b1.colour = "Black";
		b1.price=" ";
		b1.ccIngine=8000;
		
		System.out.println(b1.brand);
		System.out.println(b1.colour);
		System.out.println(b1.price);
		System.out.println(b1.ccIngine);
         
	

	}

}
