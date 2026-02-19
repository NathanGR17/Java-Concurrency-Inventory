public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    // Methods to manage stock
    public void reduceStock(int amount) { this.stock -= amount; }
    public void addStock(int amount) { this.stock += amount; }
    public int getStock() { return stock; }
}
