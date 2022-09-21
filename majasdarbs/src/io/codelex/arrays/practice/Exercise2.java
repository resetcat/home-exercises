package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();
        while (maxNumber <= minNumber) {
            System.out.println("Number must be greater than min");
            maxNumber = input.nextInt();
        }

        int[] myArray = new int[(maxNumber - minNumber) + 1];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + minNumber;
        }


//        fixme
        for (int num : myArray) {
            sum += num;
        }


        System.out.println("The sum is " + sum);
    }
}
