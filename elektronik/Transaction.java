package elektronik;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private List<SaleItem> saleItems = new ArrayList<>();

    public void addSaleItem(SaleItem item) {
        saleItems.add(item);
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (SaleItem item : saleItems) {
            totalRevenue += item.getTotalPrice();
        }
        return totalRevenue;
    }
}
