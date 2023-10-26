package com.company;

public abstract class Vehicle{                 //Abstract class
	
	public String brand;
	public int cc;
	public abstract void start();              //Abstract Methode(does not have a body)
	public abstract void stop();
}
abstract class car extends  Vehicle{            //Abstract class inherite 
	abstract void shiftGeare();
}
class mustang extends car{
	public void start() {                      // regular method
		System.out.println("Mmustang.S");
	}
	public void stop() {                       // regular method
		System.out.println("Mmustang.st");
    }
	public void shiftGeare() {                 // regular method
		System.out.println("Mmustang.Sh");
	}
}
class mustangDriver{                           // Main class
	
	public static void main(String[] args) {   // Drive Method
		
		mustang m1 = new mustang();            // object Create
		m1.start();
		m1.shiftGeare();
		m1.stop();
	}
}