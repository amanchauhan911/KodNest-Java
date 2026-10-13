
class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Product: " + id + " - " + name;
    }
}
