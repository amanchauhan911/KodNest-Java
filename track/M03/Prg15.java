import java.util.Scanner;

public class Prg15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;
            
            // Read the array elements and update counts
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }
            
            // Print the counts in the required order
            System.out.println(positiveCount + " " + negativeCount + " " + zeroCount);
        }
        
        scanner.close();
    }
}