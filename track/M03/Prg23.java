import java.util.Scanner;

public class Prg23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Since array values range from -100,000 to 100,000,
        // we use an offset frequency array of size 200,001 to handle negative numbers.
        int[] freq = new int[200005];
        int OFFSET = 100000;
        
        // Step 1: Count frequencies of each element
        for (int i = 0; i < n; i++) {
            freq[arr[i] + OFFSET]++;
        }
        
        // Step 2: Find the first element with a frequency of 1 in original order
        int firstNonRepeating = -1;
        for (int i = 0; i < n; i++) {
            if (freq[arr[i] + OFFSET] == 1) {
                firstNonRepeating = arr[i];
                break;
            }
        }
        
        System.out.println(firstNonRepeating);
        scanner.close();
    }
}