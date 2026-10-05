import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sccode = new Scanner(System.in);

        // Read input for name and marks
        String name = sccode.next();
        int marks = sccode.nextInt();

        // Create Student object
        Student student = new Student(name, marks);

        // Display values
        student.display();
    }
}