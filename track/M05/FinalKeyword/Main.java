import java.util.Scanner;

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        // Create first, alias and second references
        Employee e1 = new Employee(id);
        Employee e2 = e1;
        
        // Create a separate employee object with the same id
        Employee e3 = new Employee(id);

        // Compare using == operator
        System.out.println(e1 == e2);
        System.out.println(e1 == e3);
    }
}
    

