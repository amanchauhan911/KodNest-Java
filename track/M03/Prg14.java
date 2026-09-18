import java.util.Scanner;

public class Prg14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        
        // Initialize the array and read its elements
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Read the target value to search for
        int target = scanner.nextInt();
        
        // Variable to store the resulting index, defaulting to -1 (not found)
        int resultIndex = -1;
        
        // Loop through the array to find the first occurrence
        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                resultIndex = i;
                break; // Stop at the first match
            }
        }
        
        // Print the final result
        System.out.println(resultIndex);
        
        scanner.close();
    }
}