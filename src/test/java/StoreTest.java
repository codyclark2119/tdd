import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class StoreTest {
    @Test
    public void doesExist(){
        try{
            Store store = new Store("Wal-Mart");
            assertEquals(true, (store != null));
        } catch (RuntimeException e){
            fail();
        }
    }

}