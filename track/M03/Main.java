import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        long[] arr = new long[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        // Build the prefix-sum array to efficiently answer range-sum queries in O(1) time
        long[] prefixSum = new long[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        // Read the number of queries
        int q = scanner.nextInt();
        
        // Process each query [left, right]
        for (int i = 0; i < q; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            
            // Calculate the range sum using the prefix-sum array:
            // If the range starts at index 0, the sum is simply prefixSum[right].
            // Otherwise, subtract the prefix sum just before 'left' (prefixSum[left - 1]) from prefixSum[right].
            long ans;
            if (left == 0) {
                ans = prefixSum[right];
            } else {
                ans = prefixSum[right] - prefixSum[left - 1];
            }
            
            // Print the answer for the current query
            System.out.println(ans);
        }
        
        scanner.close();
    }
}