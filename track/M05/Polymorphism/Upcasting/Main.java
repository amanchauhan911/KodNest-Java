public class Main {
    public static void main(String[] args) {
        JavaDeveloper jb = new JavaDeveloper();
        accessMethod(jb);
        PythonDeveloper pd= new PythonDeveloper();
        accessMethod(pd);
    }


    public static void accessMethod(Developer dev){
        dev.work();
        dev.project();
    }
}