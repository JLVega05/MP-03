package UF4.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<OrderItem> orderItems;


    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }



    public void addOrderItem(OrderItem item){
        this.orderItems.add(item);
    }
    public void removeOrderItem(OrderItem item){
        this.orderItems.remove(item);
    }
    public double calculateTotal(){
        double total = 0.0;
        for (int i = 0; i < orderItems.size(); i++) {
            OrderItem item = orderItems.get(i);
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
