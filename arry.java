package com.company;

public class arry {
    public static void main(String[] args) {

        String[] cars = {"bmw", "mersathi", "rollsroyal", "rangRover"};


        for (int i = 0; i < cars.length; i++)
            System.out.println(cars[i]);


        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        System.out.println(cars.length);


        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int a = 0; a < myNumbers.length; ++a) {                   // Multidimensional Arry
            for (int j = 0; j < myNumbers[a].length; ++j) {


                System.out.println(myNumbers[a][j]);
            }
        }
    }
}