// Superclass (Parent Class)
class Animal {
    // Field in the parent class
    String name;

    // Method in the parent class
    void eat() {
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

class Monkey extends Animal{
    @Override 
     void eat(){
        System.out.println("i will steal and eat !!");
    }
}

class Tiger extends Animal{
    @Override
    void eat(){
        System.out.println("i will hunt and eat !!!");
    }
}

