import java.util.Arrays;
public class Prg2{
    //the code is to add an element in existing array understand the workflow 
    public static void main(String[] args) {
        int a[]={10 , 20 , 40, 50};
        int b[]=new int[a.length+1];
        System.out.println(Arrays.toString(a));
        int elemet=30;
        int index=2;
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i]=a[i];
            }else if(i==index){
                b[i]=elemet;
            }else{
                b[i]=a[i-1];
            }
        }
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Modified array: " + Arrays.toString(b));

    }
}