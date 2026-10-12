import java.util.Scanner;

public class Prg26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (!scanner.hasNextInt()) return;
        int left = scanner.nextInt();
        
        if (!scanner.hasNextInt()) return;
        int right = scanner.nextInt();
        
        // Validate the range
        if (left < 0 || right >= n || left > right) {
            System.out.println("-1");
            scanner.close();
            return;
        }
        
        // Reverse only the inclusive range from left through right
        int l = left;
        int r = right;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        
        // Print the modified complete array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        
        scanner.close();
    }
}