import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Cashier {
    public double totalTax(Customer customer) {
        double taxTotal = 0;
        for (Item item : customer.getCartItems()) {
            taxTotal += item.getTaxAmount();
        }
        return taxTotal;
    }

    public double totalPrice(Customer customer) {
        double total = 0;
        for (Item item : customer.getCartItems()) {
            total += item.getTaxedPrice();
        }
        return total;
    }
}
