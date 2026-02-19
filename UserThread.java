public class UserThread extends Thread {
    private Warehouse warehouse;
    private Product product;
    private String userId;

    public UserThread(Warehouse warehouse, Product product, String userId) {
        this.warehouse = warehouse;
        this.product = product;
        this.userId = userId;
    }
    @Override
    public void run() {
        // Simulando a un usuario intentando comprar un producto
        warehouse.processOrder(product, 1, userId);
    }
}
