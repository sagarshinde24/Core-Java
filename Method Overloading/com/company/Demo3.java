package com.company;

public class Demo3 {
	
	//Multiple method with same name but different argument
	//known as Compile-time Polymorphism, Static Polymorphism.
	
	
	
	static int plusMethod(int x, int y) {                   // Method 1    plusMethod name same
		  return x + y;
		}
    static float plusMethod(float a,float b,float c) {      // Method 2    (plusMethod name same)
    	return a + b + c;
        }
	static double plusMethod(double x, double y) {          // Method 3     (plusMethod name same)
		  return x + y;
		}
    
		public static void main(String[] args) {
			
		  int myNum1 = plusMethod(8, 5);                   //Argument call in method
		 // float myNum2 = plusMethod(145,145,4500);
		  double myNum3 = plusMethod(4.3, 6.26);
		  
		  System.out.println(plusMethod(12,15,48));       //This is also run
		  
		  System.out.println("int: " + myNum1);            //Print the Argument
		//  System.out.println("float: " + myNum2);
		  System.out.println("double: " + myNum3);
		}
}