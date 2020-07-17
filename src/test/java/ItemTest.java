import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ItemTest {
    @Test
    public void doesExist(){
        try{
            Item item = new Item();
            assertEquals(true, (item != null));
        } catch (RuntimeException e){
            fail();
        }
    }

}