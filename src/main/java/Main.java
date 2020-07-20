import java.util.Arrays;
import java.util.List;

public class Main {
    static Store target = new Store("Target");
    static Department bookDept = new Department("books", 0);
    static Department eleDept = new Department("electronics", .1);
    static Department foodDept = new Department("food", 0);
    static Department perfDept = new Department("perfume", .1);
    static Department medDept = new Department("medical", 0);
    static List<Item> bookItems = Arrays.asList(new Item[]{new Item("I, Robot", false, bookDept, 12.49)});
    static List<Item> eleItems = Arrays.asList(new Item[]{new Item("Malibu", false, eleDept, 14.99)});
    static List<Item> foodItems = Arrays.asList(new Item[]{new Item("Hersey's Chocolate Bar", false, foodDept, 0.85), new Item("Godiva Chocolate", true, foodDept, 10.00), new Item("Ghirardelli Chocolate", true, foodDept, 11.25)});
    static List<Item> perfItems = Arrays.asList(new Item[]{new Item("Calvin Klein", false, perfDept, 18.99), new Item("Houbigant Paris", true, perfDept, 47.50), new Item("Coco Mademoiselle", true, perfDept, 27.99)});
    static List<Item> medItems = Arrays.asList(new Item[]{new Item("Advil", false, medDept, 9.75)});
    public static void main(String args[]){
        bookDept.setItems(bookItems);
        eleDept.setItems(eleItems);
        foodDept.setItems(foodItems);
        perfDept.setItems(perfItems);
        medDept.setItems(medItems);
        List<Department> initDept = Arrays.asList(new Department[]{bookDept, eleDept, foodDept, perfDept, medDept});
        target.setDepartments(initDept);
        Customer customer1 = new Customer("Jeff");
        customer1.addToCart(target.searchStore("I, Robot"));
        customer1.addToCart(target.searchStore("Malibu"));
        customer1.addToCart(target.searchStore("Hersey's Chocolate Bar"));
        target.checkout(customer1);
        Customer customer2 = new Customer("Sarah");
        customer2.addToCart(target.searchStore("Godiva Chocolate"));
        customer2.addToCart(target.searchStore("Houbigant Paris"));
        target.checkout(customer2);
        Customer customer3 = new Customer("Doug");
        customer3.addToCart(target.searchStore("Coco Mademoiselle"));
        customer3.addToCart(target.searchStore("Calvin Klein"));
        customer3.addToCart(target.searchStore("Advil"));
        customer3.addToCart(target.searchStore("Ghirardelli Chocolate"));
        target.checkout(customer3);
    }
}
