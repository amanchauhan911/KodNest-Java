import java.util.Arrays;
import java.util.Scanner;
//shifing the elements left ship
public class Prg4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a []={10,20,30};
    int temp=a[0];

    System.out.println(Arrays.toString(a));
    for (int i=1;i<a.length;i++){
        a[i-1]=a[i];
    }
    a[a.length-1]=temp;
    System.out.println(Arrays.toString(a));
    }
}