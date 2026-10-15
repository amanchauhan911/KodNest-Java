import java.util.Scanner;

class Student {
    private int marks;

    public boolean setMarks(int marks) {
        // Validate and store marks
        this.marks=marks;
        if(marks>=0|| marks<=100){
            return true;
        } else{
            System.out.println("Invalid marks");
        } return false;
    }

    public int getMarks(int marks) {
        // Return marks
        if(marks>=0 && marks<=100){
        System.out.println(this.marks);
        } else {
            System.out.println("Invalid marks");
        }
        return 0;
    }
}

public class Prg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Complete the program
        int marks=sc.nextInt();
        Student s1 = new Student();
        s1.setMarks(marks);
        s1.getMarks(marks);
        sc.close();
    }
}
