import java.util.Scanner;

class Product {
    private double price;

    public boolean setPrice(double price) {
        // Validate and store
        this.price=price;
        if(price>=0){
            return true;
        }else{
            System.out.println("Invalid price");
        } 
        return false;
    }

    public double getPrice(double price) {
        // Return price
        if(price>=0){
          System.out.println(this.price);
        }
        return 0;
    }
}

public class Prg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Complete the program
        double price = scanner.nextDouble();
        Product p = new Product();
        p.setPrice(price);
        p.getPrice(price);
        scanner.close();
    }
}
