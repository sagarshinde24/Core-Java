package com.company;

public class Rule1_1 {
	
	// Changing the Number of Parameters.
	
	
	public static void display(int a){
        System.out.println("Arguments: " + a);
    }

    public static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
    
    public static void display(int a, int b,int c){
        System.out.println("Arguments: " + a + " and " + b+" and " + c);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        display(1, 4, 8);
    }
}
