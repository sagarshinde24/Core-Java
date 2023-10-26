package com.company;

// only one parent class and one child class.

public class Papa2 {                              //one parent class
		String bigProperty="100cr";
}
class Son2 extends Papa2{                         //one child class
	String smallProperty="10cr";
}
class Papa2Drive{
	public static void main(String[] args) {
		
		Son2 s1= new Son2();
		
	//	s1.smallProperty();  this is not posible bacause you have not create method
		
		System.out.println(s1.bigProperty);
		System.out.println(s1.smallProperty);

	}

}
