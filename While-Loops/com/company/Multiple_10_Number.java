package com.company;

public class Multiple_10_Number {

	public static void main(String[] args) {
		int b=1;
		int multi = 1;  //create a local variable
		
		while(b<=10) {
	    	multi = multi*2; 
			b++;
		}
        System.out.println(multi);                    // 1024
	}

}
