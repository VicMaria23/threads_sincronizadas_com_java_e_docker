public class Order {
    private String orderId;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Pedido #" + orderId;
    }
}