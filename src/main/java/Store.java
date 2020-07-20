import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class Store {
    private String name;
    private List<Department> departments;
    private Cashier cashier = new Cashier();

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Department getDepartment(String searchName){
        for (Department dept : departments) {
            if(dept.getName() == searchName){
                return dept;
            }
        }
        return null;
    }

    public List<Item> getDepartmentItems(Department dept) {
        return dept.getItems();
    }

    public Cashier getCashier() {
        return cashier;
    }

    public Item searchStore(String s) {
        for (Department dept : departments) {
            if (dept.findItem(s) != null) {
                return dept.findItem(s);
            }
        }
        return null;
    }

    public void checkout(Customer customer) {
        System.out.println("\n");
        double taxTotal = getCashier().totalTax(customer);
        double total = getCashier().totalPrice(customer);
        NumberFormat formatter = new DecimalFormat("#0.00");
        for (Item item : customer.getCartItems()) {
            System.out.println(" " + item.getName() + " for " + formatter.format(item.getTaxedPrice()));
        }
        System.out.println("\n");
        System.out.println(" Sales Taxes: $" + formatter.format(taxTotal) + " Total: $" + formatter.format(total));
        System.out.println("|----------------------------------------|");
    }
}
