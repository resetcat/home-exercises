package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class textToUppercase {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String input = scan1.nextLine();

        System.out.println(input.toUpperCase());
    }
}
