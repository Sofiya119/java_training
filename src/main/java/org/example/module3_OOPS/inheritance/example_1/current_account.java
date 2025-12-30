package org.example.module3_OOPS.inheritance.example_1;

public class current_account extends bank_account {
    public double interestRate = 2.5;

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
    }
}
