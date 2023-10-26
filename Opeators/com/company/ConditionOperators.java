package com.company;

public class ConditionOperators {

	public static void main(String[] args) {
		
		/*variable = (condition) ? expression1 : expression2 */
		
        int a = 5;
        int b = 6;
        
        int result = a>b? a:b;
        
             // METHOD 2
            //  int result1 = (a>b)? a+"Is Greter ": b+"Is Greter ";
        
        
        int result2 = a<b? a+b:a-b;
        int result3 = a>b? a+b:a-b;
        
         
        
        System.out.println(result +"Is Greter");
       // System.out.println(result1 +"Is Greter");
        
        System.out.println(result2);
        System.out.println(result3);
	}

}
