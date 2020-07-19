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
}
