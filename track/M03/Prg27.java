import java.util.Scanner;

public class Prg27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (!scanner.hasNextLong()) return;
        long k = scanner.nextLong();
        
        // Handle large k and edge cases
        k = k % n;
        if (k < 0) {
            k += n;
        }
        
        if (k > 0 && n > 1) {
            // Step 1: Reverse the first k elements [0 to k-1]
            reverse(arr, 0, (int) k - 1);
            
            // Step 2: Reverse the remaining elements [k to n-1]
            reverse(arr, (int) k, n - 1);
            
            // Step 3: Reverse the entire array [0 to n-1]
            reverse(arr, 0, n - 1);
        }
        
        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        
        scanner.close();
    }
    
    // Helper method to reverse a range in place
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}