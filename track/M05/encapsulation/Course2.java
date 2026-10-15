import java.util.Scanner;

class Course {
    private double fee;

    Course(double fee) {
        // Store fee
        this.fee = fee;
    }

    // Create getFee()
    public void getFee(double fee){
        System.out.println(fee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Complete the program
        double fee=sc.nextDouble();
        Course c1 = new Course(fee);
        c1.getFee(fee);
        sc.close();
    }
}
