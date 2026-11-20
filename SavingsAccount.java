package model;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.0005; // 0.05% monthly

    public SavingsAccount(String accountNumber, String branch, double initialBalance) {
        super(accountNumber, branch, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed for Savings Account.");
    }

    @Override
    public void payInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Interest paid: " + interest + ". New balance: " + getBalance());
    }
}
