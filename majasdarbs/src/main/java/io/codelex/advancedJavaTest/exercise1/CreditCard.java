package io.codelex.advancedJavaTest.exercise1;

public class CreditCard extends Card {

    public CreditCard(String number, String fullName, String CCVcode, double balance) {
        super(number, fullName, CCVcode, balance);
    }

    @Override
    public void addFunds(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void TakeFunds(double amount) {
        if (amount > getBalance()) {
            throw new NotEnoughFundsException("its not possible to take out the amount you are requesting");
        } else if (getBalance() <= 100) {
            System.out.println("Warning: Low funds");
            setBalance(getBalance() - amount);
        } else {
            setBalance(getBalance() - amount);
        }
    }
}
