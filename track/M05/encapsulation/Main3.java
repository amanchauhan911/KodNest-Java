import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read both values
        double openingBalance=sc.nextDouble();
        double depositAmount = sc.nextDouble();
        // Create account and deposit
        bankAccount3 ac = new bankAccount3(openingBalance);
        ac.deposit(depositAmount);
        // Print final balance
        System.out.println(ac.getBalance());
        sc.close();
    }
}
