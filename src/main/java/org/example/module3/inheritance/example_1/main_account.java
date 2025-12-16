package org.example.module3.inheritance.example_1;

public class main_account {
    public static void main(String[] args) {
        savings_account obj = new savings_account();
        obj.deposit(5000);
        obj.printBalance();
        obj.applyInterest();
        obj.printBalance();

        current_account obj2 = new current_account();
        obj2.deposit(8000);
        obj2.printBalance();
        obj2.applyInterest();
        obj2.printBalance();
    }
}
