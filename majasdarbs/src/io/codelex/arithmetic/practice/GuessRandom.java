package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class GuessRandom {
    public static void main(String[] args) {
        int random = (int) ((Math.random() * 100) + 1);

        Scanner scan = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int guess = scan.nextInt();

        if (random == guess) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else {
            System.out.println("Sorry, you are too " + (guess > random ? "high" : "low") + ".  I was thinking of " + random + ".");
        }

    }
}
