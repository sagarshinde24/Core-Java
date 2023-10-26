package com.company;

public class Rule3 {
	
	//Changing the Order of the Parameters of Methods
	
	// Static Method 1 
    public static void StudentId(String name, int roll_no){
            System.out.println("Name :" + name + " " + "Roll-No :" + roll_no);
    }
    
    // Static Method 2
    public static void StudentId(int roll_no, String name){
        System.out.println("Roll-No :" + roll_no + " " + "Name :" + name);
    }
    
    // non Static method 1
    public void StudentId(String petName, String RealName){
        System.out.println("petName :" + petName + " " + "Realname :" + RealName);
    }

	public static void main(String[] args) {
		
		//static method not create object
	
		//non static method createing  object
		
		Rule3 s1 = new Rule3();
		s1.StudentId("sagar","SSSSAAAA");
		
       StudentId(10,"sagar");
	}

}