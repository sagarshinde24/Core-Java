package com.company;

      public class Animal3 {                              // class generaeted
	     public void eat() {                              // Public method 
	    	 System.out.println("all Animal eat");
	     }
       }
       class Harbiours extends Animal3{
    	   // @overrides
    	   public void eat() {
    		   System.out.println("they Animal eat only plant "); 
    	   }
       }
    	   
       class Carniours extends Animal3{
    	   // @overrides
    		public void eat() {
    			System.out.println("they Animal eat only xyzzzzzz "); 
    		}
       }
       class Ominiours extends Animal3{
    	    // @overrides
        		public void eat() {
        			System.out.println("they Animal eat plant..... plant ");
      
        		}
       class AnimalEat{
    	   public static void main(String[] args) {
    		   
    		   Harbiours cow = new Harbiours();
    		   cow.eat();
    		   
    		   Carniours lion = new Carniours();
    		   lion.eat();
    		   
    		   Ominiours plug = new Ominiours();
    		   plug.eat();
    		}
      }
    }
       
      

