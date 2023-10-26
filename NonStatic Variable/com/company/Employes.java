package com.company;

public class Employes {         // non static variable
	String name;
	int id;
	double salary;

	public static void main(String[] args) {
		
		//non static method calling creating Object by class name
		
		Employes e1 = new Employes();

		e1.name="sagar";
		e1.id=1235;
		e1.salary= 450000;
		
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.salary);

	}

}
