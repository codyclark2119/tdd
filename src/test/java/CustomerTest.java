import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CustomerTest {
    Customer customer = new Customer("Jeff");
    Department dept = new Department("books", 0);
    List<Item> exItem = Arrays.asList(new Item[]{new Item("I, Robot", false, dept,   12.49)});

    @Test
    public void doesExist() {
        try {
            assertEquals("Jeff", customer.getName());
        } catch (RuntimeException e) {
            fail();
        }
    }

    @Test
    public void getCart(){
        try{
            Cart cart = customer.getCart();
            assertEquals(true, (cart != null));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void addToCart(){
        try{
            dept.setItems(exItem);
            customer.addToCart(exItem.get(0));
            assertEquals(1, customer.getCart().getItems().size());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getCartItems(){
        try{
            customer.addToCart(exItem.get(0));
            assertEquals(exItem, customer.getCartItems());
        } catch (RuntimeException e){
            fail();
        }
    }
}