class Animal {
    void makesound(){
        System.out.println("the animal make sound ");
    }
}

class Dog extends Animal {
    @Override 
    void makesound(){
        System.out.println("dog barks : WOOF!!");
    }
}

class Cat extends Animal{
    @Override 
    void makesound(){
        System.out.println("Cat meow : MEOW!!");
    }
}