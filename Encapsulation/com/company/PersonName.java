package com.company;

public class PersonName {             
	                                                                // private field
			  private int age;
              private String name;
			                                                       // getter methodgetName() provides read-only access
			 public int getAge() {
				  return age;
			  }
			 public String getname() {
				 return name;
			 }
			 public void setname(String name) {
				  this.name = name;                                               // setter method provides write-only access
			 }
			  public void setAge(int age) {
			    this.age = age;
			  }
			  
			  public static void main(String[] args) {
                                                                     // create an object of Person
			    PersonName p1 = new PersonName();                     // change age using setter
			    		
			    p1.setAge(24);                                      // access age using getter
			    p1.setname("sagar");
			    
			    System.out.println("My age is " + p1.getAge());
			    System.out.println("My name is "+ p1.getname());
			  }
			}


