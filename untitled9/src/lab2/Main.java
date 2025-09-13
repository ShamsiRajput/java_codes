package lab2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Product Inventory
        ProductInventory inventory = new ProductInventory();
        inventory.addProduct(new Product(1, "Laptop", 999.99));
        inventory.addProduct(new Product(2, "Smartphone", 499.99));

        // Search Product
        Product foundProduct = inventory.searchProduct(1);

        // Order List
        OrderList orderList = new OrderList();
        orderList.addOrder(new Order(101));

        // Sorting and Filtering
        PriceSorter.sortByPrice(inventory.products);
        ArrayList<Product> filteredProducts = PriceSorter.filterByPrice(inventory.products, 100, 500);

        // Wishlist
        Wishlist wishlist = new Wishlist();
        wishlist.addItem("New Laptop");
        wishlist.displayItems();
    }
}