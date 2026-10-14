public class Main {
    public static void main(String[] args) {
        child1 c1=new child1();
        child2 c2 = new child2();
        accessMethod(c1);
        accessMethod(c2);
    }

static void accessMethod(Parents ref){
    ref.display1();
    ref.display2();
}
}
