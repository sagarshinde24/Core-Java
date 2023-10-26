package com.company;

public class Operators2{
    public static void main(String [] args) {
        int a =11;
        int b =11;
        int x=10;

        System.out.println(x++);                   //10 (11)
        System.out.println(++x);                   //12
        System.out.println(x--);                   //12 (11)
        System.out.println(--x);                  //10

        System.out.println(a++ + ++a);            //11+13=24
        System.out.println(b++ + b++);            //11+12=23

        int e=10;
        int f=5;
        System.out.println(e+f);                   //15
        System.out.println(e-f);                   //5
        System.out.println(e*f);                   //50
        System.out.println(e/f);                   //2
        System.out.println(e%f);                   //0

        System.out.println(10<<2);                 //10*2^2=10*4=40
        System.out.println(10<<3);                 //10*2^3=10*8=80    // Java Left Shift Operator
        System.out.println(20<<2);                 //20*2^2=20*4=80
        System.out.println(15<<4);                 //15*2^4=15*16=240

        System.out.println(10>>2);                 //10/2^2=10/4=2
        System.out.println(20>>2);                 //20/2^2=20/4=5     // Java Right Shift Operator
        System.out.println(20>>3);                 //20/2^3=20/8=2
    }
}
