public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) throws BalanceInsufficientException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new BalanceInsufficientException("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
