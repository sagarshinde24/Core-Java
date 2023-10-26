package com.company;

public class break_continue_in_whileloop {
    public static void main(String []args){
        int i = 0;

        while(i<10) {

            System.out.println(i);
            i++;

            if (i == 4) {
               // break;
                continue;

            }
        }

    }
}
