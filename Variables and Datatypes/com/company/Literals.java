package com.company;

public class Literals {

	public static void main(String[] args) {
		
		byte age1 ;           // 1 byte	Stores whole numbers from -128 to 127
		age1  = 24;
		
        int age2 = 23;           // 4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        
        char ch = 's';           // 2 bytes	Stores a single character/letter or ASCII values
        
        String str = "sagar";
        
        float f1 = 5.6f;         //8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        
        double d1 = 4.666d;      // 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        
        boolean a = true;
        
        short myShort = 5000;
        
        long myLong = 544444444444l;
        
        System.out.println(age1);
        System.out.println(age2);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(a);
        System.out.println(myShort);
        System.out.println(myLong);


	}

}
