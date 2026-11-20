package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class AccountController {
    private List<Account> accounts = new ArrayList<>();

    public void createSavingsAccount(String accNumber, String branch, double balance) {
        accounts.add(new SavingsAccount(accNumber, branch, balance));
    }

    public void createInvestmentAccount(String accNumber, String branch, double balance) {
        accounts.add(new InvestmentAccount(accNumber, branch, balance));
    }

    public void createChequeAccount(String accNumber, String branch, double balance, String employer, String empAddr) {
        accounts.add(new ChequeAccount(accNumber, branch, balance, employer, empAddr));
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    public void deposit(Account acc, double amount) {
        acc.deposit(amount);
    }

    public void withdraw(Account acc, double amount) {
        acc.withdraw(amount);
    }
}
