import java.util.Scanner;

public class Prg16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Read the size of the array
        int n = scanner.nextInt();
        
        // 2. Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 3. Read lower and upper boundary values
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        
        // 4. Count how many elements fall within the inclusive range
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }
        
        // 5. Print the final count
        System.out.println(count);
        
        scanner.close();
    }
}