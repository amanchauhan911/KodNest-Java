// Main class to test the inheritance
public class main {
    public static void main(String[] args) {
        // Create an object of the subclass (Dog)
        Dog myDog = new Dog();

        // 1. Access the inherited field from Animal
        myDog.name = "Buddy";

        // 2. Call the inherited method from Animal
        myDog.eat(); 

        // 3. Call the subclass's own method
        myDog.bark();
    }
}
