import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DepartmentTest {
    @Test
    public void doesExist(){
        try{
            Department dept = new Department();
            assertEquals(true, (dept != null));
        } catch (RuntimeException e){
            fail();
        }
    }
}