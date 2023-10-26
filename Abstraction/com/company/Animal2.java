package com.company;

public abstract class Animal2 {        // Abstract class
	
	public abstract void sound();      //Abstract Method
	public abstract void eat();
}   ///********************************************************************************************************                                
	class Dog extends Animal2{    //Subclass inherite
		@Override
		public void sound() {     //Reguler Method
			System.out.println("Dog voice bho bho....");
			
		}
		public void eat() {
			System.out.println("Dod eatingg...");
		}
	}
	class Lion extends Animal2{       // Another class inherite
		@Override
		public void sound() {
			System.out.println(" Lion sound hoooooo....");
		}
		public void eat() {
			System.out.println("Lion eatingg.....");
		}
	}
class Animal2Test{
	public static void main(String[] args) {
	Lion L1 = new Lion();                                         // create an object
	L1.eat(); 
	L1.sound();
	
	Dog d1 =new Dog();
	d1.sound();
    d1.eat();   
	    
	}

}

