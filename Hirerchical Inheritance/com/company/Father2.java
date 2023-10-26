package com.company;

//one parent class and more than one child class At The same level is called Hirerchical

public class Father2 {
	String bigProperty="100cr";
}	
	class child1 extends Father2{
		String property1="honda";
	}
	class child2 extends Father2{
		String property2="bmw";
	}
    class child3 extends Father2{
    	String property3="ktm";
    }
 class Father2Test{
	public static void main(String[] args) {
		
         child2 c2 = new child2();
         
         System.out.println(c2.property2);
         System.out.println(c2.bigProperty);
         
       //  System.out.println(c2.property3); compile time error
	}
}
