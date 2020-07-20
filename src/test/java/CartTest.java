import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CartTest {
    Customer customer = new Customer("Jeff");
    Department dept = new Department("books", .0);
    List<Item> exItem = Arrays.asList(new Item[]{new Item("I, Robot", false, dept, 12.49)});

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
            customer.addToCart(exItem.get(0));
            assertEquals(exItem, customer.getCart().getItems());
        } catch (RuntimeException e){
            fail();
        }
    }
}