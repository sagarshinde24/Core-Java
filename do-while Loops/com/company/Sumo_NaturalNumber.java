package com.company;

// Structure of block is contineously exicuted when the until given condition is true

public class Sumo_NaturalNumber {

	public static void main(String[] args) {
		int a= 2;
		int sum = 0;
	
        // Do-while loop
        do {
            sum = sum+a;
            a--;
        }
 
        // Now checking condition
        while (a>10);
 
        // Summing up
        System.out.println("Summation: " + sum);
    }
}