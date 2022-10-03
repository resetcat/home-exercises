package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter small number:");
        int min = scan.nextInt();
        System.out.println("Enter larger number:");
        int max = scan.nextInt();
        while (max <= min) {
            System.out.println("Large number must be larger than small one!");
            max = scan.nextInt();
        }
        for (int i = min; i <= max; i++) {
            for (int j = i; j < max + i; j++) {
                System.out.print((j - 1) % max + 1);
            }
            System.out.println();
        }

    }


}


