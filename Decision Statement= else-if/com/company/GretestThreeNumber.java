package com.company;

public class GretestThreeNumber {
	
	// else-if ladder have multiple condition.
	// else block not mendatory
	
	
	public static void main(String[] args) {
		int a= 15;
		int b= 2;
		int c = 10;
		
		if(a>b&&a>c) {
			System.out.println("a is gretest");
		}
		else if(b>c) {
        	System.out.println("b is gretest");
        }
		else {                                                 // else block not mendatory
			System.out.println(" no is gretest");
        }
		}
	}
