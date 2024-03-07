package UF4.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(47999889, "Ariadna Rios", "AriadnaRios@gmail.com");

        Product product1 = new Product(1, "Hamburguesa", 3);
        Product product2 = new Product(2, "Coca-Cola", 2.50);

        // Se crea la orden
        Order order = new Order(153, customer);

        
        OrderItem item1 = new OrderItem(1, product1.getProductId(), 2, product1.getPrice()); // 2 hamburguesas
        OrderItem item2 = new OrderItem(2, product2.getProductId(), 1, product2.getPrice()); // 1 Coca cola

        order.addOrderItem(item1);
        order.addOrderItem(item2);

        double total = order.calculateTotal();
        System.out.println("La orden: " + order.getOrderId() + " está lista.");
        System.out.println("Bienvenida, " + customer.getName() + ", el total de la orden es: " + "$" + total);
    }
}