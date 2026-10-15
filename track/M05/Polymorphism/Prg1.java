import java.util.Scanner;

class Employee {
    public void displayRole(String role) {
        System.out.println("Employee " + role);
    }
}

class Developer extends Employee {
    // Override displayRole()
    @Override
    public void displayRole(String role){
        System.out.println("Developer " + role);
    }
}

public class Prg1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Read role
        String role = sc.nextLine();
        // Create Developer
        Developer d = new Developer();

        // Call displayRole()
        d.displayRole(role);
    }
}
