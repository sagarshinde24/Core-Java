package com.company;

public class Student {
	
	String name;
	int age;
	int Weight;
	String petName;
	
	
	//create Parametrized constructor
	Student(String name,int age,int Weight,String petName){
		
		// using this.call Statement bacause global and local variable same name and local variable alwayes given priority.
		// so avod this confusion
		
		this.name= name;
		this.age=age;
		this.Weight=Weight;
		this.petName=petName;
	}  
	
	 // redundant print Statement remove the print statement                 // Non static method create(Alwayes crate object
     void displayDetails() {                                                 // void method create 
    	System.out.println("Name :"+name);
    	System.out.println("Age :"+age);
    	
    }
	public static void main(String[] args) {
		// Create object 
		
		Student s1 = new Student("sagar",23,50,"MR.SS");
		
		s1.displayDetails(); // Non-static method Declartion
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.Weight);
		System.out.println(s1.petName);

	}

}
