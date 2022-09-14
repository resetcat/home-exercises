package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class CalcSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum1 = scan.nextInt();
        int sum2 = scan.nextInt();

        System.out.println("Sum of " + sum1 + " and " + sum2 + " is " + (sum1 + sum2));

    }
}
