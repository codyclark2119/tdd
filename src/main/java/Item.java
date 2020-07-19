public class Item {
    private String name;
    private boolean imported;
    private Department department;
    public Item(String name, boolean imported, Department department) {
        this.name = name;
        this.imported = imported;
        this.department = department;
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
}
