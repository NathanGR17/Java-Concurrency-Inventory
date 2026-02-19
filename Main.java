public class Main {
    public static void main(String[] args) {
        Warehouse bcnWarehouse = new Warehouse();
        Product sneakers = new Product("JD Shoes", 5);

        for (int i = 1; i <= 10; i++) {
            new UserThread(bcnWarehouse, sneakers, "User_" + i).start(); // Each user thread will attempt to purchase the sneakers
        }
    }
}