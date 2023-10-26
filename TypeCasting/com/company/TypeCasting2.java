package com.company;

public class TypeCasting2 {

	public static void main(String[] args) {
		
		double a = 9.78d;
	    double b = 45.154;
	    
        int c = (int) a;    // Narrowing Casting Explicit casting: double to int
        int d = (int) b;
        
        
        System.out.println(a);
        System.out.println(b); 
        
        System.out.println(c);     //Explicit casting: double to integer
        System.out.println(d);
	}

}
