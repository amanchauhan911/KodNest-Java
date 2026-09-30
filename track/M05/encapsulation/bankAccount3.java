import java.util.Scanner;

class bankAccount3 {
    private double balance;

    bankAccount3(double balance) {
        // Store opening balance
       this.balance=balance;
    }

    public void deposit(double amount) {
        // Add only a positive amount
        if(amount>0){
            this.balance+=amount;
        }
    }

    public double getBalance() {
        // Return balance
        return this.balance;
    }
}

