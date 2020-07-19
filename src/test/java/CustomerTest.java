import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CustomerTest {

    @Test
    public void doesExist() {
        try {
            Customer customer = new Customer("Jeff");
            assertEquals("Jeff", customer.getName());
        } catch (RuntimeException e) {
            fail();
        }
    }
}