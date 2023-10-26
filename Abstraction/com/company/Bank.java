package com.company;

public abstract class Bank {               //Abstract class
		abstract int getRateOfInterest();  
		}  
		  
	class SBI extends Bank{                /// Subclass (inherit from Bank)
	  public int getRateOfInterest(){
			return 7;
			}  
		}  
	class PNB extends Bank{  
		public int getRateOfInterest(){
			return 7;
			}  
		}  
		  
		
	class TestBank{  
		public static void main(String args[]){
			// Create a SBI object	
			
		Bank b=new SBI();//if object is PNB, method of PNB will be invoked  
		
		b.getRateOfInterest(); 
		
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");  
		}
	}  
