public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // person.age = -25; // COMPILE ERROR: age is private

        person.setAge(-25);  // Output: Invalid age! Must be between 0 and 120.
        person.setAge(25);   // Works perfectly
        System.out.println("Age: " + person.getAge()); // Output: Age: 25
    }
}