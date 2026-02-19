import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Warehouse {
    // Method to process orders without allowing race conditions
    private final Lock lock = new ReentrantLock(); 

    public void processOrder(Product product, int amount, String userId) {
        lock.lock(); // We acquire the lock to ensure exclusive access to the product's stock
        try {
            if (product.getStock() >= amount) {
                System.out.println("User " + userId + " is buying...");
                product.reduceStock(amount);
                System.out.println("Success! Remaining stock: " + product.getStock()); 
            } 
            else {
                System.out.println("User " + userId + " failed: Out of stock."); // If the stock is insufficient, we inform the user without modifying the stock
            }
            } 
        finally {
            lock.unlock(); // No matter what happens, we release the lock to allow other threads to access the product
            }
        }
}
