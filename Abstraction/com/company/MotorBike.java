package com.company;

public abstract class MotorBike {                    // Abstract class
	
	  abstract void brake();                         // abstract method (no body)     
	  abstract void start();
	}

	class SportsBike extends MotorBike {             // implementation of abstract method
	  public void brake() {                          // regular method
	    System.out.println("SportsBike Brake");
	  }
	  public void start() {
		  System.out.println("SportsBike start"); 
	  }
	}

	class MountainBike extends MotorBike {           // implementation of abstract method
	  public void brake() {
	    System.out.println("MountainBike Brake");
	  }
	  public void start() {
		  System.out.println("SportsBike start"); 
	  }
	}
class Runtest{
	  public static void main(String[] args) {
	    MountainBike m1 = new MountainBike();
	    m1.brake();
	    m1.start();
	    
	    SportsBike s1 = new SportsBike();
	    s1.brake();
	    m1.start();
	  }
	}	