import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CashierTest {
    Store store = new Store("Wal-Mart");
    Customer customer = new Customer("Jeff");
    Department dept = new Department("books");
    List<Item> exItem = Arrays.asList(new Item[]{new Item("I, Robot", false, dept)});


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

        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void totalPrice(){
        try{

        } catch (RuntimeException e){
            fail();
        }
    }

}