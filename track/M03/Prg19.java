import java.util.Scanner;

public class Prg19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        long target = scanner.nextLong();
        
        int closestValue = arr[0];
        long minDiff = Math.abs((long) arr[0] - target);
        
        for (int i = 1; i < n; i++) {
            long currentDiff = Math.abs((long) arr[i] - target);
            
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closestValue = arr[i];
            } else if (currentDiff == minDiff) {
                if (arr[i] < closestValue) {
                    closestValue = arr[i];
                }
            }
        }
        
        System.out.println(closestValue);
        scanner.close();
    }
}