import java.util.ArrayList;

class Order {
    int orderId;
    String product;

    Order(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Product: " + product;
    }
}

class OrderList {
    private ArrayList<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order added!");
    }

    void searchOrderById(int orderId) {
        for (Order order : orders) {
            if (order.orderId == orderId) {
                System.out.println("Found: " + order);
                return;
            }
        }
        System.out.println("Order not found!");
    }

    void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

class OrderManagementSystem {
    public static void main(String[] args) {
        OrderList orderList = new OrderList();

        orderList.addOrder(new Order(101, "Laptop"));
        orderList.addOrder(new Order(102, "Phone"));

        orderList.searchOrderById(101);
        orderList.displayOrders();
    }
}
