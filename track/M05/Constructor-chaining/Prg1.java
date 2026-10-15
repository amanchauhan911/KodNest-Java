import java.util.Scanner;

class Person {
    Person(String name) {
        // Print the parent message
        System.out.println("Person: "+ name );
    }
}

class Student extends Person {
    Student(String name) {
        // Call the parent constructor
        super(name);
        // Print the child message
        System.out.println("Student created");
    }
}

public class Prg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the name
        String name =sc.next();
        // Create Student
        Student s1= new Student(name);
        
    }
}
