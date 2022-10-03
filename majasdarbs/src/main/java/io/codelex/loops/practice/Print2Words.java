package io.codelex.loops.practice;

import java.util.Scanner;

public class Print2Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String first = scan.nextLine();
        System.out.println("Enter second word:");
        String second = scan.nextLine();
        int max = 30;
        int padLenght = max - (first.length() + second.length());
        String dots = "";
        String padding = String.format("%-" + padLenght + "s", dots).replace(" ", ".");
        System.out.println(first + padding + second);


    }
}
