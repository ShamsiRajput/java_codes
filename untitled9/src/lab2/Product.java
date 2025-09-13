package lab2;

import java.util.ArrayList;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class ProductInventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, String name, double price) {
        for (Product product : products) {
            if (product.id == id) {
                product.name = name;
                product.price = price;
                return;
            }
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.id == id);
    }

    public Product searchProduct(int id) {
        for (Product product : products) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }
}