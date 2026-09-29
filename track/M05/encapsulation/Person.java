public class Person {
    // Hidden data
    private int age;

    // Getter
    public int getAge() {
        return age;
    }

    // Setter with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Must be between 0 and 120.");
        }
    }
}