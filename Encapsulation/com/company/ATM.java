package com.company;

public class ATM {
	private int balence;
	private int atmCode;
	
	public int getbalence() {           //GET  only return
		return balence;
	}
    public void setbalence(int balence) {       //set only this.
    	 this.balence = balence;
    }
     public int getatmCode() {
    	 return atmCode;
     }
    public void setatmCode(int atmCode) {
    	this.atmCode = atmCode;
    }
    
	public static void main(String[] args) {
		
		ATM A1 = new ATM();
		A1.setbalence(152);
		A1.setatmCode(12456);
		System.out.println(" MY BALENCE = "+A1.getbalence());
		System.out.println(" MY ATMCODE = "+A1.getatmCode());
	}
	
   }
