import java.util.Scanner;
public class switchSatement {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter thee number : ");
    int number=sc.nextInt();
    switch(number){
        case 1 : System.out.println("one");
        break;
        case 2 : System.out.println("Two");
        break;
        case 3 : System.out.println("three");
        break;
        default : System.out.println("invalid");
    }
    }
}
