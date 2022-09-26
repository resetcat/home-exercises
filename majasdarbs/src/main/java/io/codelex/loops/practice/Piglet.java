package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");

        Scanner scan = new Scanner(System.in);
        int dice = rollDice();
        int result = dice;


        while (result < 21) {
            System.out.println("Roll again ? y/n");
            String answer = scan.nextLine().toLowerCase();
            switch (answer) {
                case "y", "yes":
                    result += rollDice();
                    break;
                case "n", "no":
                    System.out.println("You got " + result + " points");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valid answer is yes or no!");

            }
            if (result >= 21) {
                System.out.println("Congratulation you won the game!!! you have " + result + " points");
            }
        }


    }


    private static int rollDice() {
        Random ran = new Random();
        int dice = ran.nextInt(6) + 1;
        System.out.println("You rolled " + dice + "!");
        if (dice == 1) {
            System.out.println("you lost the game");
            System.exit(0);

        }
        return dice;
    }
}
