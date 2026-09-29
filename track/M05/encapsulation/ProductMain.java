import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read price
        double inputPrice = scanner.nextDouble();
        
        // Create Product
        Product p1 = new Product(inputPrice);
        
        // Print the price through the getter
        System.out.println(p1.getPrice());
        
        scanner.close();
    }
}