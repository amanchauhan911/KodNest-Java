import java.util.Scanner;

public class Prg24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int writeIndex = 0;
        
        // Step 1: Shift all non-zero elements to the front
        for (int readIndex = 0; readIndex < n; readIndex++) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
        }
        
        // Step 2: Fill the remaining positions with zeros
        while (writeIndex < n) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
        
        // Step 3: Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        
        scanner.close();
    }
}