public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        Node node1 = new Node(orderProcessor);
        Node node2 = new Node(orderProcessor);
        Node node3 = new Node(orderProcessor);

        node1.start();
        node2.start();
        node3.start();
    }
}