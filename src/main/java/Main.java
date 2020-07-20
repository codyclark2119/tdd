import java.util.Arrays;
import java.util.List;

public class Main {
    public static void Main(String args[]){
        Store target = new Store("Target");
        Department bookDept = new Department("books", 0);
        Department eleDept = new Department("electronics", .1);
        Department foodDept = new Department("food", 0);
        Department perfDept = new Department("perfume", .1);
        Department medDept = new Department("medical", 0);
        List<Item> bookItems = Arrays.asList(new Item[]{new Item("I, Robot", false, bookDept, 12.49)});
        List<Item> eleItems = Arrays.asList(new Item[]{new Item("Malibu", false, eleDept, 14.99)});
        List<Item> foodItems = Arrays.asList(new Item[]{new Item("Hersey's Chocolate Bar", false, foodDept, 0.85), new Item("Godiva Chocolate", true, foodDept, 10.00), new Item("Ghirardelli Chocolate", true, foodDept, 11.25)});
        List<Item> perfItems = Arrays.asList(new Item[]{new Item("Calvin Klein", false, perfDept, 18.99), new Item("Houbigant Paris", true, perfDept, 47.50), new Item("Coco Mademoiselle", true, perfDept, 27.99)});
        List<Item> medItems = Arrays.asList(new Item[]{new Item("Advil", false, bookDept, 9.75)});
        bookDept.setItems(bookItems);
        eleDept.setItems(eleItems);
        foodDept.setItems(foodItems);
        perfDept.setItems(perfItems);
        medDept.setItems(medItems);
        List<Department> initDept = Arrays.asList(new Department[]{bookDept, eleDept, foodDept, perfDept});
        target.setDepartments(initDept);
    }
}
