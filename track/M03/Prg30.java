import java.util.Scanner;

public class Prg30 {
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
            // Advance left pointer past negative values (stop at non-negative values >= 0)
            while (left < right && arr[left] < 0) {
                left++;
            }
            // Move right pointer past non-negative values (stop at negative values < 0)
            while (left < right && arr[right] >= 0) {
                right--;
            }
            
            // Swap the stopped misplaced values
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        // Print the rearranged array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        
        scanner.close();
    }
}