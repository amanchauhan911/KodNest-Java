import java.util.Scanner;

public class Prg11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        int n = scanner.nextInt();
        
        // Use long to prevent integer overflow since numbers[i] can be up to 10^9
        long sum = 0;
        
        // Loop n times to read each number and add it to the sum
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        
        // Calculate the average ensuring we use floating-point division
        double average = (double) sum / n;
        
        // Print the sum on the first line
        System.out.println(sum);
        // Print the average on the second line rounded to two decimal places
        System.out.printf("%.2f\n", average);
        
        scanner.close();
    }
}