package io.codelex.classesandobjects.practice.exercise13;

public class AccountMain {
    public static void main(String[] args) {
        Account first = new Account("first", 100);
        first.deposit(20);
        System.out.println(first.balance());

        Account mat = new Account("Matt's account", 1000);
        Account my = new Account("My account", 0);
        mat.withdrawal(100);
        my.deposit(100);
        System.out.println(mat.balance());
        System.out.println(my.balance());

        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);

        transfer(A, B, 50);
        transfer(B, C, 25);
        System.out.println(A.balance());
        System.out.println(B.balance());
        System.out.println(C.balance());

    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        System.out.println("Transferred " + howMuch + "$ from " + from.getOwner() + " to " + to.getOwner());
    }


}
