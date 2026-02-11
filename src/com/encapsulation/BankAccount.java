package com.encapsulation;

public class BankAccount {

    private double balance;

    // deposit money
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // get balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount holder = new BankAccount();

        holder.deposit(2000);
        System.out.println("Total balance = " + holder.getBalance());

        holder.withdraw(1000);
        System.out.println("Remaining balance = " + holder.getBalance());
    }
}
