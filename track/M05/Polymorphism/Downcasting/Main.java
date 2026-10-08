public class Main {
    public static void main(String[] args) {
        Parent p= new Child1();
        p.display1();
        p.display2();
        ((Child1)(p)).display3(); // coverting parent to child for accesing child special methods 
    }
}