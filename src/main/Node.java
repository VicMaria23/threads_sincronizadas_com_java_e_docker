public class Node extends Thread {
    private OrderProcessor orderProcessor;

    public Node(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Order order = new Order(Integer.toString(i));
            orderProcessor.processOrder(order);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}