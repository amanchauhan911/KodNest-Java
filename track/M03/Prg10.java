import java.util.Scanner;

public class Prg10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Loop n times to read and print each element with a space
        for (int i = 0; i < n; i++) {
            System.out.print(sc.nextInt() + " ");
        }
        
        sc.close();
    }
}