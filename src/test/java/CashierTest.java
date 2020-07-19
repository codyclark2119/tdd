import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CashierTest {
    Store store = new Store("Wal-Mart");
    Customer customer = new Customer("Jeff");
    Department bookDept = new Department("books");
    List<Item> exItem1 = Arrays.asList(new Item[]{new Item("I, Robot", false, bookDept)});
    Department eleDept = new Department("electronics");
    List<Item> exItem2 = Arrays.asList(new Item[]{new Item("Malibu", false, eleDept)});
    Department foodDept = new Department("food");
    List<Item> exItem3 = Arrays.asList(new Item[]{new Item("Hersey's Chocolate Bar", false, foodDept)});

    @Test
    public void doesExist(){
        try{
            Cashier cashier = store.getCashier();
            assertEquals(true, (cashier != null));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void totalTax(){
        try{
            List<Department> storeDeptSeed = Arrays.asList(new Department[]{bookDept, eleDept, foodDept});
            store.setDepartments(storeDeptSeed);
            bookDept.setItems(exItem1);
            eleDept.setItems(exItem2);
            foodDept.setItems(exItem3);
            customer.addToCart(store.searchStore("I, Robot"));
            customer.addToCart(store.searchStore("Malibu"));
            customer.addToCart(store.searchStore("Hersey's Chocolate Bar"));
            assertEquals(1.50, store.getCashier().totalTax(customer));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void totalPrice(){
        try{
            List<Department> storeDeptSeed = Arrays.asList(new Department[]{bookDept, eleDept, foodDept});
            store.setDepartments(storeDeptSeed);
            bookDept.setItems(exItem1);
            eleDept.setItems(exItem2);
            foodDept.setItems(exItem3);
            customer.addToCart(store.searchStore("I, Robot"));
            customer.addToCart(store.searchStore("Malibu"));
            customer.addToCart(store.searchStore("Hersey's Chocolate Bar"));
            assertEquals(1.50, store.getCashier().totalPrice(customer));
        } catch (RuntimeException e){
            fail();
        }
    }

}