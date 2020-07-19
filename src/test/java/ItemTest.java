import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ItemTest {
    Department dept = new Department("food", 0);
    Item item = new Item("Mixed Nuts", false, dept, .85);

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
            assertEquals("Mixed Nuts", item.getName());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getPrice(){
        try{
            assertEquals(.85, item.getPrice());
        } catch (RuntimeException e){
            fail();
        }
    }
}