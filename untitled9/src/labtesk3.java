import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - $" + price;
    }
}

class PriceSortingAndFiltering {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Phone", 599.99));
        products.add(new Product(3, "Tablet", 299.99));

        // Sort by price
        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("Products sorted by price:");
        products.forEach(System.out::println);

        // Filter products above a certain price
        double minPrice = 500;
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.price > minPrice)
                .collect(Collectors.toList());

        System.out.println("\nProducts above $" + minPrice + ":");
        filteredProducts.forEach(System.out::println);
    }
}
