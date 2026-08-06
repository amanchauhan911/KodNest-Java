public class prg10{
    //using break in nested loop and naming loops
    public static void main(String[] args){
    outer:for (int i=1;i<=3;i++){
         inner :for (int j=1;j<=4;j++){
                if(i==2){
                    break outer;
                }
                System.out.println("i " + i + " j "+j);
            }

        }
    }
}