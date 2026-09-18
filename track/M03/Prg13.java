import java.util.Scanner;

public class Prg13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        int n = scanner.nextInt();
        
        // Initialize min to the maximum possible integer, and max to the minimum
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Loop through the input elements
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            
            // Update min and max if necessary
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }
        
        // Print the minimum followed by the maximum
        System.out.println(min + " " + max);
        
        scanner.close();
    }
}