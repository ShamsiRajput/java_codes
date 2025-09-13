package lab2;
import java.util.*;
class Order {
    int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }
}

class OrderList {
    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order searchOrder(int orderId) {
        for (Order order : orders) {
            if (order.orderId == orderId) {
                return order;
            }
        }
        return null;
    }
}