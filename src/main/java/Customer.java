import java.util.List;

public class Customer {
    private String name;
    private Cart cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public List<Item> getCartItems(){
        return getCart().getItems();
    }

    public void addToCart(Item item) {
        getCart().addToCart(item);
    }
}
