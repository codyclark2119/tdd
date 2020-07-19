import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class StoreTest {
    Store store = new Store("Wal-Mart");
    List<Department> initDept = Arrays.asList(new Department[]{new Department("books"), new Department("food"), new Department("medical"), new Department("electronics"), new Department("perfume")});
    List<Item> exItems = Arrays.asList(new Item[]{new Item("I, Robot", false, store.getDepartment("books")), new Item("Nightfall", true, store.getDepartment("books")), new Item("Frankenstein", true, store.getDepartment("books")), new Item("Tom Sawyer", false, store.getDepartment("books"))});

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
            store.setDepartments(initDept);
            Department dept = store.getDepartment("books");
            assertEquals("books", dept.getName());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getAllDepartments(){
        try{
            store.setDepartments(initDept);
            List<Department> departments = store.getDepartments();
            assertEquals(initDept, departments);
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void getDepartmentItems(){
        try{
            store.setDepartments(initDept);
            Department dept = store.getDepartment("books");
            dept.setItems(exItems);
            List<Item> deptItems = store.getDepartmentItems(dept);
            assertEquals(exItems.get(0).getName(), deptItems.get(0).getName());
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void searchStore(){
        try{
            store.setDepartments(initDept);
            Department dept = store.getDepartment("books");
            dept.setItems(exItems);
            Item foundItem = store.searchStore("I, Robot");
            assertEquals(exItems.get(0), foundItem);
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