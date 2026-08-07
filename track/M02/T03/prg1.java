import java.util.Scanner;
public class prg1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte value : ");
        byte a = sc.nextByte();
        System.out.println("the value of byte :" + a);

        System.out.println("Enter the shot value :");
        short b=sc.nextShort();
        System.out.println("Enter the short value: " + b);

        System.out.println("Enter the value of intiger :");
        int c=sc.nextInt();
        System.out.println("the vaule of intiger is :" + c );

        System.out.println("Eneer the long value : ");
        long d=sc.nextLong();
        System.out.println("the value of long : " + d);

        System.out.println("rnter the value of flaot : ");
        float e =sc.nextFloat();
        System.out.println("the value of float is : " + e);

        System.out.println("rnter the value of double : ");
        double f =sc.nextDouble();
        System.out.println("the value of float is : " + f);

        System.out.println("rnter the value of boolean : ");
        boolean g =sc.nextBoolean();
        System.out.println("the value of boolean is : " + g);




    }
}