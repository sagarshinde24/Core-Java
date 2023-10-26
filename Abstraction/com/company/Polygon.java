package com.company;

public abstract interface Polygon {
	 abstract void getArea(int length, int breadth);
	}

	// implement the Polygon interface


	class Rectangle2 implements Polygon {// implementation of abstract method	
	  public void getArea(int length, int breadth) {
	    System.out.println("The area of the rectangle is " + (length * breadth));
	  }
	}

class InterfaceDeive {
	  public static void main(String[] args) {
		  
	    Rectangle2 r1 = new Rectangle2();
	    r1.getArea(5, 6);
	  }
	}