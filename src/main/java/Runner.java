import db.DBHelper;
import models.Customer;
import models.Order;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Customer customer = new Customer("Liam", "Cavens");
        Order order = new Order("Top Class Teaspoons", 5, customer);
        Order order2 = new Order("Shovel", 6, customer);


        DBHelper.saveOrUpdate(customer);
        DBHelper.saveOrUpdate(order);
        DBHelper.saveOrUpdate(order2);

        List<Customer> customers = DBHelper.getAll(Customer.class);
        List<Order> orders = DBHelper.getAll(Order.class);

    }
}
