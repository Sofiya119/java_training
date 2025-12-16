package org.example.module3.inheritance.example_1;

public class savings_account extends bank_account {
    public double interestRate = 4.5;

    // methods
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
    }
}
