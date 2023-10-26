package com.company;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		//int a = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("This number is Even");
		}
		else {
			System.out.println("This number is Odd");
		}
	}

}
