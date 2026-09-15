import java.util.Arrays;
import java.util.Scanner;
public class Prg1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(a));

    int b[] = new int[a.length+1];
    for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(b));
}
}