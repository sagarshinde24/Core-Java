package com.company;

// One parent class and only more than 2 classes but differntial manner.(1 parent class and 2 child class).

public class GrandFather {                              //one parent class Grand Father
	String bigProperty;
}
class Father extends GrandFather{                       //one child class father
	String smallProperty;
}
class SmallSon extends Father{                         // another child class son
	int mony;
}
class GrandFatherDreive{
	public static void main(String[] args) {
		
		SmallSon s1= new SmallSon();
		
	//	s1.smallProperty();  this is not posible bacause you have not create method
		
		System.out.println(s1.mony);
		System.out.println(s1.bigProperty);
		
		System.out.println(s1.smallProperty);

	}

}


	