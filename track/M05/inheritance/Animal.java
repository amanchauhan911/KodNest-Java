// Superclass (Parent Class)
class Animal {
    // Field in the parent class
    String name;

    // Method in the parent class
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass (Child Class) inheriting from Animal
class Dog extends Animal {
    // Unique method belonging only to the child class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

