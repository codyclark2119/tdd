import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CartTest {
    @Test
    public void doesExist(){
        try{
            Cart cart = new Cart();
            assertEquals(true, (cart != null));
        } catch (RuntimeException e){
            fail();
        }
    }
}