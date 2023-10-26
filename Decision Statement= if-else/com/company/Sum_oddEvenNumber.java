package com.company;

public class Sum_oddEvenNumber {

	public static void main(String[] args) {
         int num = 12345;
         
         int Evensum = 0;
         int Oddsum=0;
         
         while(num>0) {
         
         int digit = num%10;  
         
         if(digit%2==0) {
        	 Evensum+=digit;
         }
         else {
        	 Oddsum+=digit;
         }
         num/=10;
         
	     System.out.println("Sum of even number :"+Evensum);
	     
	     System.out.println("Sum of Odd number :"+Oddsum);   
     }
   }
}
