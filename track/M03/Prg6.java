import java.util.Scanner;

public class Prg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2d arrays
        // Read the number of rows and columns
        if (scanner.hasNextInt()) {
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();

            // Process each row
            for (int i = 0; i < rows; i++) {
                int rowTotal = 0; // Reset rowTotal for every row
                
                // Read elements of the current row and add to rowTotal
                for (int j = 0; j < columns; j++) {
                    rowTotal += scanner.nextInt();
                }
                
                // Print the result for the current row (row numbering starts from 1)
                System.out.println("Row " + (i + 1) + " total: " + rowTotal);
            }
        }
        
        scanner.close();
    }
}