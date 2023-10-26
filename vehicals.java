package com.company;

public class vehicals {
    int noOfwheels;
}
class Car extends vehicals{
    int power;
}
class tesla extends car{
    int cc;
}
class testvehicals{
    public static void main (String[]args){
        System.out.println("ms");
        tesla t1 =new tesla();
        System.out.println(t1.cc);
        System.out.println(t1.noOfwheels);
        System.out.println("mn");
    }
}
