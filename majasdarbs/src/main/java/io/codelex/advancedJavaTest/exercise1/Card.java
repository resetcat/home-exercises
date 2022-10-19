package io.codelex.advancedJavaTest.exercise1;

public abstract class Card {

    private String number;

    private String fullName;

    private String CCVcode;

    private double balance;

    public Card(String number, String fullName, String CCVcode, double balance) {
        this.number = number;
        this.fullName = fullName;
        this.CCVcode = CCVcode;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCCVcode() {
        return CCVcode;
    }

    public void setCCVcode(String CCVcode) {
        this.CCVcode = CCVcode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void addFunds(double amount);

    public abstract void TakeFunds(double amount);


}
