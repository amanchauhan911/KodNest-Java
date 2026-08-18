import java.util.Scanner;
public class Prg4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements for the array");
        for(int i = 0 ;i<=a.length-1;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Arrays elemts are : ");
        for (int i=0;i<=a.length-1;i++){
            System.err.print(a[i] + " ");
        }
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum+=a[i];
        }
        System.err.println();
        System.err.println("Total sum " + sum);
        sc.close();
    }
}