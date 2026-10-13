import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        
        // Create JavaTraining object by passing the scanned code
        JavaTraining jt = new JavaTraining(code);
        jt.showInstitute();
        jt.showCourse();
        scanner.close();
    }
}