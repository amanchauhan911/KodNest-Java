import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputAGE=sc.nextInt();
        Employee emp=new Employee();
        if(emp.setAge(inputAGE)){
            System.out.println(emp.getAge());
        } else {
            System.out.println("Invalid age");
        }
        sc.close();

        // Read age and attempt the update
        // Print the required result
    }
}