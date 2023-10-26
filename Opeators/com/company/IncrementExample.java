package com.company;

public class IncrementExample {

	public static void main(String[] args) {
		
		int m = 1, n = 2;
	       
	      int a = m++ + n + ++m; // It goes like m++ = 1, n = 2, //++m = 1+ incremented 'm' from m++
	                                                             //    = 1 + (1+m) = 1+ (1+1) = 3
	                                                             //  a = 1   + 2 +   3 = 6 
	      System.out.println("Example \n a = "+ a);
	}

}
