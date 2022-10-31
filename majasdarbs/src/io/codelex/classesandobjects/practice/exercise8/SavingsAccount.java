package io.codelex.classesandobjects.practice.exercise8;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SavingsAccount {
    private double balance;
    private double aInterestRate;

    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

    public SavingsAccount(double balance) {
        this.balance = balance;
        aInterestRate = 1;

    }

    public void addMonthlyInterest() {
        balance += (aInterestRate / 12) * balance;

    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough funds.");
        }

    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double balance() {
        return balance;
    }


    public void futureSavings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the annual interest rate:");
        aInterestRate = sc.nextDouble();
        System.out.println("How long has the account been opened?");
        int months = sc.nextInt();
        double totalD = 0;
        double totalW = 0;
        double totalI = 0;
        for (int i = 1; i <= months; i++) {
            addMonthlyInterest();
            totalI += (aInterestRate / 12) * balance;
            System.out.println("Enter amount deposited for month " + i + ":");
            double deposit = sc.nextDouble();
            totalD += deposit;
            deposit(deposit);
            System.out.println("Enter amount withdrawn for month " + i + ":");
            double withdraw = sc.nextDouble();
            totalW += withdraw;
            withdraw(withdraw);

        }
        System.out.println("Total deposited: " + currencyFormatter.format(totalD));
        System.out.println("Total withdrawn: " + currencyFormatter.format(totalW));
        System.out.println("Total interests: " + currencyFormatter.format(totalI));
        System.out.println("Ending balance: " + currencyFormatter.format(balance()));


    }
}
