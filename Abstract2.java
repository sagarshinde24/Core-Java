package com.company;

import com.sun.tools.javac.Main;

abstract class Sagar {
    public String fname = "Sagar";
    public int age = 24;
    public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Sagar {
    public int graduationYear = 2022;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}


