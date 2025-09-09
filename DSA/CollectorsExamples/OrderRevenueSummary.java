import java.util.*;
import java.util.stream.*;

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 250.5),
            new Order("Bob", 100.0),
            new Order("Alice", 300.0),
            new Order("Charlie", 50.0)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getAmount)
            ));

        System.out.println(revenueByCustomer);
    }
}

class Order {
    private String customer;
    private double amount;

    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }
}
