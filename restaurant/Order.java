package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
     private List<OrderItem> orderItems = new ArrayList<>();

    public void addOrderItem(OrderItem item) {
        orderItems.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
