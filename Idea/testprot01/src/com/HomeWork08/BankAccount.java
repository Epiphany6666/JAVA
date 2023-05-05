package com.HomeWork.HomeWork08;

public class BankAccount extends CheckingAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        super.deposit(amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
