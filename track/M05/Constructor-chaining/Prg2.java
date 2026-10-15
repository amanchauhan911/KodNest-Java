import java.util.Scanner;

class Vehicle {
    private String brand;

    Vehicle(String brand) {
        // Initialize brand
        this.brand=brand;
    }

    public String getBrand() {
        // Return brand

        return this.brand;
    }
}

class Car extends Vehicle {
    Car(String brand) {
        // Call the parent constructor
        super(brand);
    }
}

public class Prg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Complete the program
        String brand=sc.next();
        Car c1 = new Car(brand);
        System.out.println(c1.getBrand());
    }
}
