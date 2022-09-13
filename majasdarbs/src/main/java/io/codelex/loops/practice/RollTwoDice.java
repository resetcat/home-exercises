package io.codelex.loops.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What number do you desire ?");
        int desNum = scan.nextInt();
        int sum = 0;

            while(!(desNum>1&&desNum<=12)) {
                System.out.println("Your number must be from 2 to 12!");
                desNum = scan.nextInt();
            }
        roll2dice(desNum,sum);




    }
    public static int rollDice() {
        return (int) ((Math.random() * 6) + 1);
    }

    public static void roll2dice(int desNum, int sum) {
        while (desNum != sum) {
            int a = rollDice();
            int b = rollDice();
            sum = a + b;
            System.out.println(a + " and " + b + " = " + sum);
        }
    }
}
