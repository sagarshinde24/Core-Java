package com.company;

public class Car2 {
	
	String brand;
	int ccingine;
	
	
	// Parametrize conctructor
	
	Car2(String s1,int a1){              
		brand = s1;
		ccingine = a1;
		System.out.println("Car costructor Executed");
	}

	public static void main(String[] args) {
		
	    Car2 c1 = new Car2("Maruti", 800);
	    
	    System.out.println(c1.brand);
	    System.out.println(c1.ccingine);
	}

}
