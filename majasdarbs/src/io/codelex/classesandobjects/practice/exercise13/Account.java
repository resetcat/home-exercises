package io.codelex.classesandobjects.practice.exercise13;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {

    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public String balance() {
        return currencyFormatter.format(balance);
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

}
