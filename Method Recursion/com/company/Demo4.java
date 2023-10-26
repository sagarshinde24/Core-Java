package com.company;


// Method calling itself


public class Demo4 {
	
	static int sum(int a) {
		if(a>0) {                                   // sum of natural number by method recursion
			return a +sum(a-1);
		}
		else {
			return 0;
		}
	}
      

	int result = 1;
	static int fact(int b) {                       // fact of natural number by method recursion
		if (b>0) {
			return b * fact(b-1);
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("SUM : "+ sum(10));
		System.out.println("FACT : "+fact(5));

	}

}
