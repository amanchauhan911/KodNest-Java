import java.util.Scanner;

class Parent {
    Parent(String value) {
        // Print Parent and value
        System.out.println("Parent " + value);
    }
}

class Child extends Parent {
    Child(String value) {
        // Call parent
        super(value);
        // Print Child
       System.out.println("Child");
    }
}

public class Prg1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Value=sc.next();
        // Read and create Child
        Child c = new Child(Value);
    }
}
