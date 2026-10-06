class Parent{
    void disp(){
        System.out.println("inside parent disp 1");
    }

    void disp2(){
        System.out.println("inside parent disp 2");
    }
}

class Child extends Parent{
    @Override 
    void disp2(){
        System.out.println("inside child disp 2");
    }

    void disp3(){
        System.out.println("inside child disp 3");
    }

}