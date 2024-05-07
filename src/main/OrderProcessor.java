public class OrderProcessor {
    public synchronized void processOrder(Order order) {
        System.out.println("Processando pedido: " + order);
    }
}