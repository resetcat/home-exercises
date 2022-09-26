package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Max value ?");
        int max = scan.nextInt();
        for (int i = 1; i <= max; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 20 == 0) {
                System.out.println();
            }
            if (i != max && i % 20 != 0) {
                System.out.print(" ");
            }
        }
    }
}

