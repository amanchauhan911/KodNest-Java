class EmpApplication{
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.id=11;
        e1.name="Aman";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        Emp e2;
        e2=e1;
        e2.id=13;
        e2.name="Raju";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();



    }
}