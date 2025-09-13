import java.util.ArrayList;

class Wishlist {
    private ArrayList<String> wishlist = new ArrayList<>();

    void addItem(String item) {
        wishlist.add(item);
        System.out.println(item + " added to wishlist!");
    }

    void removeItem(String item) {
        if (wishlist.remove(item)) {
            System.out.println(item + " removed from wishlist!");
        } else {
            System.out.println(item + " not found in wishlist!");
        }
    }

    void displayWishlist() {
        System.out.println("Wishlist:");
        for (String item : wishlist) {
            System.out.println("- " + item);
        }
    }
}

class CustomerWishlist {
    public static void main(String[] args) {
        Wishlist wishlist = new Wishlist();

        wishlist.addItem("Headphones");
        wishlist.addItem("Gaming Mouse");

        System.out.println("\nCurrent Wishlist:");
        wishlist.displayWishlist();

        wishlist.removeItem("Gaming Mouse");

        System.out.println("\nUpdated Wishlist:");
        wishlist.displayWishlist();
    }
}
