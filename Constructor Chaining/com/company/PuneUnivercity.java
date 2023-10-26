package com.company;

// Process calling constructor from anoter construtor

// Using super()call method  call the constructor of parent class


public class PuneUnivercity {
	int uID;
	PuneUnivercity(){
		System.out.println("no argument paraent constructor");
	}
  }
  class Qspyder{
    	 Qspyder(){
    		 super();
    		 System.out.println("no args child");
    	 }
  
     
  public static void main(String[] args) {
	
		System.out.println("ms");
		 new Qspyder();
		System.out.println("me");
	}

}
