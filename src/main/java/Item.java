public class Item {
    private String name;
    private boolean imported;
    private Department department;
    private double price;

    public Item(String name, boolean imported, Department department, double price) {
        this.name = name;
        this.imported = imported;
        this.department = department;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImported() {
        return imported;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getTaxedPrice(){
        double price = getPrice();
        double taxRate = getDepartment().getTaxPercentage();
        if (isImported()){
            taxRate += .05;
        }
        price = (price * taxRate) + price;
        price = Math.round(price * 200.0) / 200.0;
        return price;
    }
}
