public class prg3{
    //the progam is for do-while loop nested
    public static void main(String[] args) {
        int i=1;
        do { 
            int j=1;
            do{ //this a syntax and function of do while loop
                System.out.println(j);
                j++;
            }while(j<=5);
        System.out.println();
        i++;           
        } while (i<=5);
    }
}