import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DepartmentTest {
    Department dept = new Department("books", 0);
    List<Item> exItems = Arrays.asList(new Item[]{new Item("I, Robot", false, dept, 12.49), new Item("Nightfall", true, dept, 13.49), new Item("Frankenstein", true, dept, 11.49)});

    @Test
    public void doesExist(){
        try{
            assertEquals(true, (dept != null));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getItems(){
        try {
            dept.setItems(exItems);
            assertEquals(exItems.get(0), dept.getItems().get(0));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void findItem(){
        try{
            dept.setItems(exItems);
            String name = "I, Robot";
            Item foundItem = dept.findItem(name);
            assertEquals(exItems.get(0), foundItem);
        } catch (RuntimeException e){
            fail();
        }
    }
}