class bankAccount {
    private double balance;
    bankAccount(double openingBalance) {
        if (openingBalance >= 0) {
            balance = openingBalance;
        }
    }
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
}