import java.util.Scanner;

public class Prg20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int maxStreak = 0;
        int currentStreak = 0;
        
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val == 1) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        
        System.out.println(maxStreak);
        scanner.close();
    }
}