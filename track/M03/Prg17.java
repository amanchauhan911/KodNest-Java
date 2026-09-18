import java.util.Scanner;

public class Prg17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        
        // Initialize max and min with extreme bounds
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        
        // Read array values and find max and min in a single pass
        for (int i = 0; i < n; i++) {
            long current = scanner.nextLong();
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
        
        // Calculate and print the difference using a safe numeric type (long)
        long difference = max - min;
        System.out.println(difference);
        
        scanner.close();
    }
}