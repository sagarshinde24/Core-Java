package com.company;
//import java.util.Scanner;
public class Sumof_OddEven_Number {

	public static void main(String[] args) {
		//int num = 1;
       // Scanner sum= new Scanner(System.in);
        
        int num =0;
		int Evensum = 0;
		int Oddsum = 0;
		
		while(num<=num) {
			if(num%2==0) {
			  Evensum+=num;
			}
			else {
				Oddsum+=num;
			}
			num++;
		}
		System.out.println("Sum of Even : "+Evensum);
		System.out.println("Sum of odd : "+Oddsum);

	}

}
