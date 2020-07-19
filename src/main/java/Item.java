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
}
