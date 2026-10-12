import java.util.Scanner;

public class Prg18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            long current = arr[i];
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current < largest) {
                secondLargest = current;
            }
        }
        
        if (secondLargest == Long.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(secondLargest);
        }
        
        scanner.close();
    }
}