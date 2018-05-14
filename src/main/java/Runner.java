import db.DBCustomer;
import db.DBOrder;
import models.Customer;
import models.Order;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Customer customer = new Customer("Liam", "Cavens", 3);
        Order order = new Order("Top Class Teaspoons", 5);

        DBCustomer.save(customer);
        DBOrder.save(order);

        List<Customer> customers = DBCustomer.getCustomers();
        List<Order> orders = DBOrder.getOrders();

        order = new Order("Top Class Spoons", 5);
        DBOrder.update(order);
    }
}
