package com.polymorphisam_day_01;

public class BankAccount {

    int balance;

    // Constructor to initialize balance
    public BankAccount() {
        balance = 0;
    }

    // Deposit method with only amount
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " via default method.");
    }

    // Overloaded deposit method with amount and mode
    public void deposit(int amount, String mode) {
        balance += amount;
        System.out.println("Deposited " + amount + " via " + mode + ".");
    }

    // Method to display current balance
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test overloaded deposit methods
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);                  // Using default deposit
        account.showBalance();

        account.deposit(2000, "cheque");        // Using mode-specific deposit
        account.showBalance();
    }
}

