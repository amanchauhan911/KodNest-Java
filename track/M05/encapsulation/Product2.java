import java.util.Scanner;

class Product {
    private double price;

    public boolean setPrice(double price) {
        // Validate and store
        this.price=price;
        if(price>=0){
            return true;
        }
        return false;
    }

    public double getPrice(double price) {
        // Return price
        System.out.println(this.price);
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Complete the program
        double price=sc.nextDouble();
        Product p1= new Product();
        p1.setPrice(price);
        p1.getPrice(price);
        sc.close();
    }
}
