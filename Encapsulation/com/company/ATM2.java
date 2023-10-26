package com.company;

public class ATM2 {
	private int Balence;
	
	private int getbalence(){
		return Balence;
	}
	
	public void setbalence(int balence) {
		if(balence>0) {
			this.Balence = balence;
		}
		else {
			System.out.println("balence can not zero");
		}
	}

	public static void main(String[] args) {
		ATM2  A2 = new ATM2();
		A2.setbalence(125);
		System.out.println("My balence = "+ A2.getbalence());

	}

}

