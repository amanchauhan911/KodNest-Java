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

class Reptile extends Animal{
    @Override 
    void makesound(){
        System.out.println("I am a reptile ");
    }
}

class Snake extends Reptile{
    @Override 
    void makesound(){
        System.out.println("Snake : SHEEEE!!");
    }
}

class Lizerd extends Reptile{
    @Override 
    void makesound(){
        System.out.println("Lizerd : PHISSS!!");
    }
}