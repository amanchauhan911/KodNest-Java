import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        // Store opening balance
        this.balance=balance;
    }

    public void withdraw(double amount) {
        // Perform a valid withdrawal
        if(amount<this.balance && amount>0){
            balance-=amount;
        }
    }

    public double getBalance() {
        // Return balance
        System.out.println(this.balance);
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double openingBalance=sc.nextDouble();
        double amount = sc.nextDouble();
        // Complete the program
        BankAccount b1= new BankAccount(openingBalance);
        b1.withdraw(amount);
        b1.getBalance();
        sc.close();
    }
}
