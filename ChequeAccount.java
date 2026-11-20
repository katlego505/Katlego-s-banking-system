package model;

public class ChequeAccount extends Account {
    private String employerName;
    private String employerAddress;

    public ChequeAccount(String accountNumber, String branch, double initialBalance,
                         String employerName, String employerAddress) {
        super(accountNumber, branch, initialBalance);
        this.employerName = employerName;
        this.employerAddress = employerAddress;
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
        // Cheque accounts do not earn interest
        System.out.println("No interest for Cheque Account.");
    }

    // Getters
    public String getEmployerName() { return employerName; }
    public String getEmployerAddress() { return employerAddress; }
}
