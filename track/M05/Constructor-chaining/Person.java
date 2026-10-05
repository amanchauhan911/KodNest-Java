
class Person {
    private String name;

    // Constructor to receive and set the name
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    private int marks;

    // Student constructor calls parent constructor using super(name)
    Student(String name, int marks) {
        super(name); // Send name to Person constructor
        this.marks = marks; // Initialize marks in the child field
    }

    public void display() {
        // Print name and marks separated by one space
        System.out.println(getName() + " " + marks);
    }
}

