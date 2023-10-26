package com.company;

public class ConditionOperators3 {    // Gretest Three Number

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int c = 4;
		
		int res= (a>b)?a:b;
		int res1= (res>c)?res:c;
		
		// Method 2
		int res2= (a>b)?((a>c)?a:c):((b>c)?b:c);
	
		
		System.out.println(res1);
		System.out.println(res2);

	}

}
