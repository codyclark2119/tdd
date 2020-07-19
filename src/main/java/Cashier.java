public class Cashier {
    public float totalTax(Customer customer) {
        float taxTotal = 0;
        for (Item item : customer.getCartItems()) {
            double taxPercentTotal = item.getDepartment().getTaxPercentage();
            if(item.isImported()){
                taxPercentTotal += .05;
            }
            taxTotal += item.getPrice() * taxPercentTotal;
        }
        return taxTotal;
    }

    public float totalPrice(Customer customer) {
        return 0;
    }
}
