import java.util.Scanner;
public class Prg3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array element");
        for (int i =0;i<=4;i++){
            a[i]=sc.nextInt();
        }
        System.out.println();

        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }


        sc.close();
    }
}