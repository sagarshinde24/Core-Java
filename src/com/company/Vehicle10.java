package com.company;

public  class Vehicle10 {
	private int ccingine;                                           //  Encapulation
	private int noOfdore;
	public int getCcingine() {
		return ccingine;
	}
	public void setCcingine(int ccingine) {                          //get set method
		this.ccingine = ccingine;
	}                                                                   
	public int getNoOfdore1() {
		return noOfdore;
	}
	public void setNoOfdore1(int noOfdore) {
		this.noOfdore = noOfdore;
	}
	String brand;
	int cc;
	int noOfWheels;
	String type;
	
 Vehicle10(String brand,int cc,int noOfWheels,String type){                //constructor for class name
		this.brand = brand;
		this.cc= cc;
		this.noOfWheels = noOfWheels;
		this.type = type ; 
	}
    public String toString() {
	  return "BRAND=" + brand + ", Cc =" + cc                                 // toString
        + ", NOOFWHEELS=" + noOfWheels +",TYPE =" +type;
    	
    }
    public boolean equal(Object o) {                                          // Equal method
    	Vehicle10 temp = (Vehicle10)o;                                    
    	if(this.brand == temp.brand && this.cc == temp.cc) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public static void main(String[] args) {
            Vehicle10 v1 = new Vehicle10("BMW",5640,4,"Desial");
            v1.setNoOfdore1(4);
            v1.setCcingine(45000);
            Vehicle10 v2 = new Vehicle10("BMW",5640,4,"Desial");
            System.out.println("*********** toString method Output ***************");
            System.out.println("                                                   ");
            System.out.println(v1);
            System.out.println("                                                   ");
            System.out.println(v2);
            System.out.println("                                                   ");
            System.out.println("*********** Equal method Output ***************");
            System.out.println("                                                   ");
            System.out.println(v1 == v2);
            System.out.println(v1.equal(v2));
            System.out.println("                                                   ");
            System.out.println("*********** Encapsulation Output ***************");
            System.out.println("                                                   ");
            System.out.println("MyCarDore ="+ v1.getNoOfdore1()); 
           
            System.out.println("MyCarccingine ="+ v1.getCcingine());
	}
	
	
}
