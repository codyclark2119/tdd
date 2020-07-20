import java.text.DecimalFormat;

public class Cashier {
    public double totalTax(Customer customer) {
        double taxTotal = 0;
        for (Item item : customer.getCartItems()) {
            double taxPercentTotal = item.getDepartment().getTaxPercentage();
            if(item.isImported()){
                taxPercentTotal += .05;
            }
            taxTotal += item.getPrice() * taxPercentTotal;
        }

        taxTotal = Math.round(taxTotal * 200.0) / 200.0;
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
