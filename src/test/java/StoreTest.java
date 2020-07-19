import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class StoreTest {
    Store store = new Store("Wal-Mart");

    @Test
    public void doesExist(){
        try{
            assertEquals(true, (store != null));
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getDepartment(){
        try{
            store.setDepartments(Arrays.asList(new Department[]{new Department("books"), new Department("food"), new Department("medical"), new Department("electronics"), new Department("perfume")}));
            Department dept = store.getDepartment("books");
            assertEquals("books", dept.getName());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getDepartmentItems(){
        try{
            Department dept = store.getDepartment("books");
            List<Item> exItems = Arrays.asList(new Item[]{new Item("I, Robot", false), new Item("Nightfall", true), new Item("Frankenstein", true), new Item("Tom Sawyer", false)});
            dept.setItems(exItems);

            List deptItems = store.getDepartmentItems(dept);
            assertEquals(exItems.get(0).getName(), deptItems.get(0).getName());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getCashier(){
        try{
            Cashier cashier = store.getCashier();
            assertEquals(true, (cashier != null));
        } catch (RuntimeException e){
            fail();
        }
    }

}