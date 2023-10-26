package com.company;

public class AssigementOperators {         // Assigen the value

	public static void main(String[] args) {
		
		        // Compound assigement operaters         
		                                       
		      /*1.    += (compound addition assignment operator)
			    2.    -=  (compound subtraction assignment operator)
				3.    *= (compound multiplication assignment operator)
				4.    /= (compound division assignment operator)
				5.    %= (compound modulo assignment operator)
				6.    &= (compound Bitwise & assignment operator)
				7.    |= (compound Bitwise | assignment operator)
				8.    ^= (compound Bitwise ^ assignment operator)
				9.    >>= (compound right-shift assignment operator)
				10.    >>>=(compound right-shift filled 0 assignment operator)
				11.    <<=(compound left-shift assignment operator)		
				*/
		
		int a = 10; 
		a%= 10;
		
		int b = 20;
		b+=20;
		
		int c = 30;
		b-=30;
         
		int d = 40;
		d-=30;
		
		int e = 50;
		e*=50;
		
		int f = 60;
		f/=30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
