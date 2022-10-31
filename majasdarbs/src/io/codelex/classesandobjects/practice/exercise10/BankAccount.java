package io.codelex.classesandobjects.practice.exercise10;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    private String name;
    private double balance;

    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough funds.");
        }
    }

    @Override
    public String toString() {
        return name + ", " + currencyFormatter.format(balance);
    }
}
