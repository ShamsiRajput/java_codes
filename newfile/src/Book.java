import java.util.ArrayList;

// Book class
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Library class
class Library {
    private String name;
    private ArrayList<Book> books; // Using ArrayList for aggregation

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>(); // Initialize the ArrayList
    }

    public void addBook(Book book) {
        books.add(book); // Add a book to the library
    }

    public ArrayList<Book> getBooks() {
        return books; // Return the list of books
    }

    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }


// Main class to demonstrate aggregation and retrieval

    public static void main(String[] args) {
        Library library = new Library("City Library");

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        // Retrieve and use the list of books
        ArrayList<Book> books = library.getBooks();
        System.out.println("\nRetrieved Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
}
}