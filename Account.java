package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Abstract Account class
public abstract class Account {
    private String accountNumber;
    private double balance;
    private String branch;
    private LocalDate createdDate;
    private List<Transaction> transactions;

    // Constructor
    public Account(String accountNumber, String branch, double initialBalance) {
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.balance = initialBalance;
        this.createdDate = LocalDate.now();
        this.transactions = new ArrayList<>();
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Abstract withdraw method (implemented differently by subclasses)
    public abstract void withdraw(double amount);

    // Abstract method for paying interest
    public abstract void payInterest();

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getBranch() { return branch; }
    public LocalDate getCreatedDate() { return createdDate; }
    public List<Transaction> getTransactions() { return transactions; }

    // Encapsulation: protected setter for balance (accessible by subclasses)
    protected void setBalance(double balance) { this.balance = balance; }
}
