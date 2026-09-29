public class Student {
    private String name;
    private final int rollNumber; // or just private without a setter

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Read-only access for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Name can be read and updated
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}