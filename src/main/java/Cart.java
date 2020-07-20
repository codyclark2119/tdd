import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addToCart(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

}
