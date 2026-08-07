import java.util.Scanner;
public class prg2{
//next line input
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        System.out.println("the age is :" + age);

        System.out.println("Enter hight : ");
        float hight=sc.nextFloat();
        System.out.println("the hight is " + hight);
        sc.nextLine();
        System.out.println("enter the full name ");
        String name = sc.nextLine();
        System.out.println("the name you entered is " + name);

    }
}