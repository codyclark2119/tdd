import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ItemTest {
    Department dept = new Department("electronics", .1);
    Item item = new Item("Malibu", false, dept, 14.99);

    @Test
    public void doesExist(){
        try{
            assertEquals(true, (item != null));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getName(){
        try{
            assertEquals("Malibu", item.getName());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getPrice(){
        try{
            assertEquals(14.99, item.getPrice());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getTaxedPrice(){
        try{
            assertEquals(16.49, item.getTaxedPrice());
        } catch (RuntimeException e){
            fail();
        }
    }
}