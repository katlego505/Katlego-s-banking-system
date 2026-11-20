package model;

public class InvestmentAccount extends Account {
    private static final double INTEREST_RATE = 0.05; // 5% monthly

    public InvestmentAccount(String accountNumber, String branch, double initialBalance) {
        super(accountNumber, branch, initialBalance);
        if (initialBalance < 500) {
            throw new IllegalArgumentException("Investment account requires minimum BWP500 deposit.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            getTransactions().add(new Transaction("Withdrawal", amount));
            System.out.println(amount + " withdrawn. New balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void payInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Interest paid: " + interest + ". New balance: " + getBalance());
    }
}
