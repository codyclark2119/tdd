import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DepartmentTest {
    Department dept = new Department("books");
    List<Item> exItems = Arrays.asList(new Item[]{new Item("I, Robot", false, dept), new Item("Nightfall", true, dept), new Item("Frankenstein", true, dept), new Item("Tom Sawyer", false, dept)});

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