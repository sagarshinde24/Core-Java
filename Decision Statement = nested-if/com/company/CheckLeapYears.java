package com.company;

import java.util.Scanner;

public class CheckLeapYears {

	public static void main(String[] args) {
		//int years = 1900;
		
		Scanner sc = new Scanner(System.in);         // using Scanner class
		System.out.println("Enter your name");
		int years = sc.nextInt();
		
		
		// Nested if
		if(years%4==0) {
			if(years%100==0) {
				if(years%400==0) {
					System.out.println("Perfect Leap Years");
				}
				else {
					System.out.println("Not a Leap Years");
				}
			}
		}
	}


	}
