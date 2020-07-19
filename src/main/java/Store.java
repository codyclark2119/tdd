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
        for(int i = 0; i < getDepartments().size(); i++){
            if(getDepartments().get(i).getName() == searchName){
                return getDepartments().get(i);
            }
        }
        return null;
    }

    public List getDepartmentItems(Department dept) {
        return dept.getItems();
    }

    public Cashier getCashier() {
        return cashier;
    }

}
