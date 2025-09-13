package lab2;
import java.util.*;
class Wishlist {
    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void displayItems() {
        for (String item : items) {
            System.out.println(item);
        }
    }
}