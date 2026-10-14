import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array (n)
        int n = scanner.nextInt();
        long[] arr = new long[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        // Read the window size (k)
        int k = scanner.nextInt();
        
        // Problem: Find the maximum sum of any contiguous subarray of fixed size k.
        // Logic: Use the sliding window technique to reuse the previous window sum.
        // 1. Compute the sum of the first window of size k.
        long currentWindowSum = 0;
        for (int i = 0; i < k; i++) {
            currentWindowSum += arr[i];
        }
        
        long maxSum = currentWindowSum;
        
        // 2. Slide the window from left to right by adding the next element
        // entering the window and subtracting the element leaving the window.
        for (int i = k; i < n; i++) {
            currentWindowSum = currentWindowSum + arr[i] - arr[i - k];
            if (currentWindowSum > maxSum) {
                maxSum = currentWindowSum;
            }
        }
        
        // Print the maximum fixed-window sum
        System.out.println(maxSum);
        
        scanner.close();
    }
}