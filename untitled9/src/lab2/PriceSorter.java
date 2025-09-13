package lab2;
import java.util.*;
import java.util.Comparator;

class PriceSorter {
    public static void sortByPrice(ArrayList<Product> products) {
        products.sort(Comparator.comparingDouble(product -> product.price));
    }

    public static ArrayList<Product> filterByPrice(ArrayList<Product> products, double minPrice, double maxPrice) {
        ArrayList<Product> filtered = new ArrayList<>();
        for (Product product : products) {
            if (product.price >= minPrice && product.price <= maxPrice) {
                filtered.add(product);
            }
        }
        return filtered;
    }
}