
final class StudentRecord {
    // Add private final fields, constructor and getters
    private final int Id;
    private final String name ;

    StudentRecord(int Id , String name){
        this.Id=Id;
        this.name=name;
    }

    void getter(){
        System.out.println("ID: " + Id);
        System.out.println("Name: " + name);
    }

}

