import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CartTest {
    Customer customer = new Customer("Jeff");
    Department dept = new Department("books");
    List<Item> exItem = Arrays.asList(new Item[]{new Item("I, Robot", false, dept)});

    @Test
    public void doesExist(){
        try{
            assertEquals(true, (customer.getCart() != null));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getItems(){
        try{
            assertEquals(exItem, customer.getCart.getItems());
        } catch (RuntimeException e){
            fail();
        }
    }
}