public class BankAccount {
    // 1. Data is hidden (private)
    private double balance;

    // 2. Controlled access to read (getter)
    public double getBalance() {
        return balance;
    }

    // 3. Controlled access to update (setter with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}