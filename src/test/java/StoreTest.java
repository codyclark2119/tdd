import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class StoreTest {
    Store store = new Store("Wal-Mart");
    List<Department> initDept = Arrays.asList(new Department[]{new Department("books"), new Department("food"), new Department("medical"), new Department("electronics"), new Department("perfume")});

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
            List<Item> exList = Arrays.asList(new Item[]{new Item("I, Robot", false, dept), new Item("Nightfall", true, dept), new Item("Frankenstein", true, dept)});
            dept.setItems(exList);
            List<Item> deptItems = store.getDepartmentItems(dept);
            assertEquals(exList, deptItems);
        } catch (RuntimeException e){
            fail();
        }
    }

    @Test
    public void searchStore(){
        try{
            store.setDepartments(initDept);
            Department dept = store.getDepartment("books");
            List<Item> exList = Arrays.asList(new Item[]{new Item("I, Robot", false, dept), new Item("Nightfall", true, dept), new Item("Frankenstein", true, dept)});
            dept.setItems(exList);
            Item foundItem = store.searchStore("I, Robot");
            assertEquals("I, Robot", foundItem.getName());
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