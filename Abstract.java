package com.company;

abstract class Parent2{
    public Parent2(){                                                // class ka constructor

        System.out.println("Base class ka constructor");
    }
    public void sagar(){                                         // Method

        System.out.println("Hello Method");
    }
    abstract public void greet();
    abstract public void greet2();
}


class Child2 extends Parent2{
    @Override
    public void greet(){
       System.out.println("Good Morning");
   }
   @Override
   public void greet2(){
       System.out.println("Good Afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void ss(){
        System.out.println("Goooood");
    }
}
public class Abstract {
    public static void main(String... args) {
       // Parent2 b = new Parent2() ;
        Child2 a = new Child2();
       // Child3 c = new Child2();
    }
}
