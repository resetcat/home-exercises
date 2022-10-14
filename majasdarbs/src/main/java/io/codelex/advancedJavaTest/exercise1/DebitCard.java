package io.codelex.advancedJavaTest.exercise1;

public class DebitCard extends Card {


    public DebitCard(String number, String fullName, String CCVcode, double balance) {
        super(number, fullName, CCVcode, balance);
    }

    @Override
    public void addFunds(double amount) {
        if (getBalance() > 10_000) {
            System.out.println("Warning: Too much money");
            setBalance(getBalance() + amount);
        }
        setBalance(getBalance() + amount);
    }

    @Override
    public void TakeFunds(double amount) {
        if (amount > getBalance()) {
            throw new NotEnoughFundsException("its not possible to take out the amount you are requesting");
        } else {
            setBalance(getBalance() - amount);
        }

    }
}
