package com.company;

// Aquaring the properties of Paraent class into child class. by using 'extends(inherit bet 2 class)' and 'implement' keyword.

// Inheritance class = Providing the properties paraent class,super class,base class.
//                   = Accepating the properties child class, sub class, drive class.


public class Papa {
	String bigProperty="100cr";
	String car;
}
	class Son extends Papa{             
		String smallProperty;
		String cycle = "RangerCycle";
	}
class PapaDreive{
	public static void main(String[] args) {
		
		Son s1 = new Son();
		
		System.out.println(s1.bigProperty);
		
		System.out.println(s1.smallProperty);
		
		System.out.println(s1.cycle);
		
		
	}
}
