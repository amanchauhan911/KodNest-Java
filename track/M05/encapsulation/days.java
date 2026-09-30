import java.util.Scanner;

class Attendance {
    // 1. Ensure this starts at exactly 0
    private int presentDays = 0;

    public void addDays(int days) {
        if (days > 0) {
            this.presentDays += days;
        }
    }

    public int getPresentDays() {
        return this.presentDays;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        
        Attendance a1 = new Attendance();
        
        // 2. Ensure this is only called ONCE
        a1.addDays(days);
        
        System.out.println(a1.getPresentDays());
        
        sc.close();
    }
}