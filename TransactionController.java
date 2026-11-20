package controller;

import java.util.ArrayList;
import java.util.List;

public class TransactionController {
    private List<String> transactions = new ArrayList<>();

    public void logTransaction(String accNumber, String type, double amount) {
        transactions.add(accNumber + " | " + type + " | " + amount);
    }

    public List<String> getAllTransactions() {
        return transactions;
    }
}
