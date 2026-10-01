// The Parent Class (The Base Model)
class Enemy {
    int health = 100;

    void attack() {
        System.out.println("Basic Punch!");
    }

    class FlyingBoss extends Enemy{
        void Flying(){
            System.out.println("Flying towards the sky");
        }
    }
}