import java.util.List;

public class Department {
    private String name;
    private List<Item> items;
    private double taxPercentage;

    public Department(String name, double taxPercentage) {
        this.name = name;
        this.taxPercentage = taxPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public Item findItem(String name) {
        for (Item item : items) {
            if (item.getName() == name) {
                return item;
            }
        }
        return null;
    }
}
