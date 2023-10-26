package com.company;

public class PublicMethod {
	
// Static method
	  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }
	  
// Public method
		  public void myPublicMethod() {
		    System.out.println("Public methods must be called by creating objects");
		  }

// Main method 
public static void main(String[] args) {
			  
		    myStaticMethod(); // Call the static method
		    
		  //myPublicMethod();                             // This would compile an error bacause no object
		    
		    PublicMethod myObj2 = new PublicMethod();       // Create an object of class
		    myObj2.myPublicMethod();                       // Call the public method on the object
		  }
		}