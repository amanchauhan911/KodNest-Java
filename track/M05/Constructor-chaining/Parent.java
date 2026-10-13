

public class Parent {
    int a =10;
}

class child extends Parent{
    int a =20;
    void display(){
        System.out.println("Parents a"  + super.a );
        System.out.println("child a" + a);
    }
}
