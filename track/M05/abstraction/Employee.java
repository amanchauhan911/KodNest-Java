
abstract class Employee {
    private String name;

    Employee(String name) {
        // Initialize name
        this.name=name;
    }

    void showName() {
        // Print name
        System.out.println("Name: " + name);
    }

    abstract void showRole();
}

class Developer extends Employee {
    // Complete constructor and method
    Developer(String name){
    super(name);
    }

    @Override
    void showRole(){
        System.out.println("Role: Developer" );
    }
}

