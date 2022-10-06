package io.codelex.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the numerator");
                if (scanner.hasNext("q") || scanner.hasNext("Q")) {
                    break;
                }
                int numerator = scanner.nextInt();
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            }
        } catch (ArithmeticException | InputMismatchException e) {
            if (e.getClass().equals(ArithmeticException.class)) {
                System.out.println("You can't divide by 0!");
            } else {
                System.out.println("Enter integers only!");
            }

        }
    }
}
