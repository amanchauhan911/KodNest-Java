import java.util.Scanner;

class Student2{
    private int marks;

    public boolean setMarks(int marks) {
        // Validate and store marks
        this.marks=marks;
        if(marks>=0 && marks<=100){
            return true;
        }
        return false;
    }

    public int getMarks(int marks) {
        // Return marks
        System.out.println(this.marks);
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Complete the program
        int marks=sc.nextInt();
        Student2 s1=new Student2();
        s1.setMarks(marks);
        s1.getMarks(marks);
        sc.close();
    }
}
