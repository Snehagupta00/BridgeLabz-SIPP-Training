import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    String getCustomer() { return customer; }
    double getTotal() { return total; }
}

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Ramesh", 250.5),
            new Order("Suresh", 300.0),
            new Order("Ramesh", 100.0),
            new Order("Mahesh", 150.0)
        );

        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getTotal)
            ));

        System.out.println(revenue);
    }
}
