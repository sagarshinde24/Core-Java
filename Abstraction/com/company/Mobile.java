package com.company;

public abstract class Mobile {         // Abstract class
	public abstract void phone();      // Abstract Method
	public abstract void SMS();
	public abstract void number();
	public abstract void game();
}	
    abstract class samsung extends Mobile{   // Abstract method inherite
	 abstract void OS();
	}
	class nokia extends samsung{             
	@Override
     void OS() {                                               
		System.out.println("SR24 is operating system");
		
	}

	@Override
	public void phone() {
		System.out.println("APPLE is phone");
		
	}

	@Override
	public void SMS() {
		System.out.println("I LOVE YOU is sms");
		
	}

	@Override
	public void number() {
		System.out.println("1234567890 is number");
		
	}

	@Override
	public void game() {
		System.out.println("GTA_VI_CITY is game");
		
	}

}
	class Mobiletest{
		  public static void main(String[] args) {
			  nokia n1 = new nokia();
			  System.out.println("****** DETAILS OF MY MOBILE *****");
			  n1.OS();
			  n1.phone();
			  n1.SMS();
			  n1.number();
			  n1.game();
			  
			  }
		  }
