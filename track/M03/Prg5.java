import java.util.Arrays;
public class Prg5{
    //shifting the elements from right to left 
    public static void main(String[] args) {
        int a[]={10,20,30,40};
     // 1. Save the rightmost element   
    int temp=a[a.length-1];
     // 2. Loop backwards to shift left to right
    for( int i=a.length-1;i>0;i--){
        a[i]=a[i-1];
    }
    a[0]=temp;
    System.out.println(Arrays.toString(a));
    }
}