
class StudentApplication{
    public static void  main(String[] arge){
        Student s1=new Student();
        s1.age=16;
        s1.name="Aman";
        s1.hight=5.10;
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.hight);
        s1.sleeping();
        s1.cheating();
        s1.running();
    

    }
}