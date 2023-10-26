package com.company;

class c1 {
     public int a = 2;           // public modifire
     protected int b = 4;        // protected modifire
     int c = 6;                  // default
     private int d = 8;          // private

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessModifire{
    public static void main(String[] args) {
        c1 j = new c1 ();

        System.out.println(j.a);
        System.out.println(j.b);
        System.out.println(j.c);
        //System.out.println(j.d);              // not use same package because private
    }
}

