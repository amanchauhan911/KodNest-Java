// The Parent Class (The Base Model)
class Enemy {
    void attack() {
        System.out.println("Basic Punch!");
    }

    
}
class FlyingBoss extends Enemy{
        void Flying(){
            System.out.println("Flying towards the sky");
        }
    }