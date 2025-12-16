package org.example.module3.inheritance.example_1;

public class bank_account {
    public double balance;


    // methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }
}
