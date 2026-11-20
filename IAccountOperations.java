public interface IAccountOperations {
    boolean deposit(double amount);
    boolean withdraw(double amount);
    void applyMonthlyInterest();
    String getAccountSummary();
}
