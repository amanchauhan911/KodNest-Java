import java.util.Scanner;
public class MaElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        System.out.println("enter the element in array:");
        for(int i =0 ; i<=4;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("the elements in array:");
        for(int i =0 ;i<=4;i++){
            System.out.println(arr[i]+" ");
        }

        int max=arr[0];
        int mini = arr[0];
        for(int i =0;i<=4;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<mini){
                mini=arr[i];
            }
        }
        System.out.println("Max element " + max);
        System.out.println("mini elemet " + mini);
    }
}