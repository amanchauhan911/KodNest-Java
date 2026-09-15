import java.util.Arrays;
public class Prg3{
    //the code is to remove an element in existing array understand the workflow 
    public static void main(String[] args) {
        int a[]={10 , 20 , 40, 50};
        int b[]=new int[a.length-1];
        System.out.println(Arrays.toString(a));
        //int elemet=30;
        int index=2;
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i]=a[i];
            }else {
                b[i]=a[i+1];
            }
        }
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Modified array: " + Arrays.toString(b));

    }
}
//Loop Iteration 0 (i = 0):
//Is i < 2? Yes! (0 < 2)
//Action: Copy directly. b[0] = a[0]
//Result: b becomes [10, 0, 0]

//Loop Iteration 1 (i = 1):
//Is i < 2? Yes! (1 < 2)
//Action: Copy directly. b[1] = a[1]
//Result: b becomes [10, 20, 0]

//Loop Iteration 2 (i = 2):
//Is i < 2? No! (2 is equal to 2, so it goes to the 'else' block)
//Action: Shift and grab from the next slot in 'a'. b[2] = a[2 + 1] -> a[3]
//Result: b becomes [10, 20, 50]
