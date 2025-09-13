import java.util.ArrayList;

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

class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added!");
    }

    void updateProduct(int id, String name, double price) {
        for (Product product : products) {
            if (product.id == id) {
                product.name = name;
                product.price = price;
                System.out.println("Product updated!");
                return;
            }
        }
        System.out.println("Product not found!");
    }

    void deleteProduct(int id) {
        products.removeIf(product -> product.id == id);
        System.out.println("Product deleted!");
    }

    void searchProduct(int id) {
        for (Product product : products) {
            if (product.id == id) {
                System.out.println("Found: " + product);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

 class ProductInventorySystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(1, "Laptop", 1000));
        inventory.addProduct(new Product(2, "Phone", 500));

        inventory.displayProducts();

        inventory.updateProduct(2, "Smartphone", 600);
        inventory.searchProduct(2);

        inventory.deleteProduct(1);
        inventory.displayProducts();
    }
}
