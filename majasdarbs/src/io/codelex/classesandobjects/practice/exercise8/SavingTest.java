package io.codelex.classesandobjects.practice.exercise8;

import java.util.Scanner;

public class SavingTest {
    public static void main(String[] args) {

        SavingsAccount acc = newAcc();
        acc.futureSavings();

    }

    public static SavingsAccount newAcc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money is in the account?");
        double balance = scan.nextDouble();

        return new SavingsAccount(balance);

    }
}
