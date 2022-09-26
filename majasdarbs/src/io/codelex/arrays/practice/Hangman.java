package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static String[] words = {"Bird", "Man", "Carzzz"};
    public static boolean win = false;
    public static boolean playing = true;


    public static void main(String[] args) {
        while (playing) {
            String word = words[random(words.length)].toLowerCase();
            String[] wordArr = word.split("");
            char[] hidden = word.replaceAll(".", "_").toCharArray();
            StringBuilder misses = new StringBuilder("");


            Scanner scan = new Scanner(System.in);

            while (!win) {
                drawGame(hidden, misses);
                System.out.print("Guess :");
                String letter = scan.nextLine().toLowerCase();
                checkLetter(ifValid(letter), wordArr, hidden, misses);


            }
            newGame();
        }
    }

    public static void newGame() {
        System.out.print("Play \"again\" or \"quit\"?");
        Scanner third = new Scanner(System.in);
        String answer = third.nextLine();
        while (true) {
            if (answer.equals("again")) {
                System.out.println();
                win = false;


                break;
            }
            if (answer.equals("quit")) {
                playing = false;
                break;
            }
        }
    }


    public static String ifValid(String letter) {
        if (letter.length() > 1 || letter.matches("[^a-z]")) {
            System.out.println("You need to enter valid 1 letter!");
            Scanner x = new Scanner(System.in);
            return ifValid(x.nextLine().toLowerCase());
        }
        return letter;
    }


    public static void checkWin(StringBuilder misses, char[] hidden) {
        int count = 0;
        if (misses.length() > 4) {
            System.out.println("You lost the game");
            win = true;
        }
        for (char c : hidden) {

            if (c != '_') {
                count++;
            }
            if (count == hidden.length) {
                drawGame(hidden, misses);
                System.out.println("YOU GOT IT!");
                win = true;
            }
        }

    }

    public static void checkLetter(String letter, String[] arr, char[] hidden, StringBuilder misses) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(letter)) {
                hidden[i] = arr[i].charAt(0);
                count++;
            }
        }
        if (count == 0) {
            misses.append(letter);
        }
        checkWin(misses, hidden);

    }

    public static void printArrey(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
    }

    public static void drawGame(char[] hidden, StringBuilder misses) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Word:   ");
        printArrey(hidden);
        System.out.println();
        System.out.println("Misses: " + misses);

    }

    public static int random(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
