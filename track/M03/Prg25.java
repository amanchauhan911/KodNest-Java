import java.util.Scanner;

public class Prg25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            // Move left pointer forward until it points to an odd value
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // Move right pointer backward until it points to an even value
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            
            // Swap the misplaced odd and even values
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        // Print the partitioned array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        
        scanner.close();
    }
}