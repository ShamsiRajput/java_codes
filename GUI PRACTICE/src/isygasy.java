
import java.util.ArrayList;
import java.util.*;

interface Product {
    String getName();
    double getPrice();
    String getDescription();
}abstract class GeneralProduct implements Product {
    protected String name;
    protected double price;
    protected String description;

    public GeneralProduct(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}class ElectronicProduct extends GeneralProduct {
    private int warranty; // in months

    public ElectronicProduct(String name, double price, String description, int warranty) {
        super(name, price, description);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }
}

class ClothingProduct extends GeneralProduct {
    private String size;

    public ClothingProduct(String name, double price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}interface ShoppingCart {
    void addProduct(Product product);
    void removeProduct(Product product);
    double calculateTotal();
}
class ShoppingCartImpl implements ShoppingCart {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    @Override
    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters...
}
class Order {
    private List<Product> products;
    private double totalAmount;

    public Order(List<Product> products) {
        this.products = products;
        this.totalAmount = products.stream().mapToDouble(Product::getPrice).sum();
    }

    // Methods for processing payment, etc.
}
 class OnlineShoppingSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCartImpl();

        Product laptop = new ElectronicProduct("Laptop", 1200.00, "High performance laptop", 24);
        Product shirt = new ClothingProduct("T-Shirt", 20.00, "Cotton T-Shirt", "M");

        cart.addProduct(laptop);
        cart.addProduct(shirt);

        System.out.println("Total Price: $" + cart.calculateTotal());

        // Create an order
        Order order = new Order(Arrays.asList(laptop, shirt));
        // Further processing...
    }
}