import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.TreeSet;

public class book {

    public static void main(String[] args) {

        TreeSet<String> book = new TreeSet<>();
        book.add("programming");
        book.add("java");
        book.add("web");
        book.add("english");
        book.add("stats");
        book.add("physics");
        book.add("pakStudy");
        book.add("islamiyat");
        System.out.println("1-\tAdding a new book title.\n" +
                "2-\tRemoving a book title.\n" +
                "3-\tChecking if a specific book is available.\n" +
                "4-\tDisplaying all book titles in sorted order.\n" +
                "5-\tFinding all books that start with a specific letter.\n" +
                "6- update a book name");

        Scanner input = new Scanner(System.in);
        System.out.println("enter choice: ");
        int choice = input.nextInt();
        if (choice == 1) {

            System.out.println("Enter the book name:");
            String AddBook = input.next();
            book.add(AddBook);

            for (String bo : book) {

                System.out.println(bo);

            }


        } else if (choice == 2) {

            String RemoveBook;
            System.out.println("Enter the remove book name:");
            RemoveBook = input.next();
            for (String bo : book) {
                if (bo.contains(RemoveBook)) {
                    book.remove(RemoveBook);
                    System.out.println("this book is successfully remove: " + RemoveBook);
                    break;

                } else {


                    System.out.println("book is not founded in Library:");
                    break;
                }


            }

        } else if (choice == 3) {

            System.out.println("Enter the searching book:");
            String search = input.next();
            for (String bo : book) {
                if (bo.contains(search)) {

                    System.out.println("founded this book: " + search);
                    break;
                } else {


                    System.out.println("not founded in book list this book: " + search);
                    break;
                }


            }


        } else if (choice == 4) {
            for (String bo : book) {


                System.out.println(bo);
            }

        } else if (choice == 5) {

            System.out.println("Enter the character:");
            char alfa = input.next().charAt(0);
            for(String bo:book){
                if(bo.charAt(0)==alfa){

                    System.out.println(bo);

                }


            }


        } else if (choice==6)
        {
            System.out.println("enter book name to update");
            String update = input.next();


            for (String bo : book) {
                if(bo.equals(update)){
                    System.out.println("this item is avail in books list:"+bo);
                    book.remove(bo);

                    System.out.println("Enter the updated name:");
                    String UpName=input.next();
                    book.add(UpName);
                    System.out.println("now "+update+" name update with this "+UpName);
                    System.out.println();
break;



                    }
            }
            System.out.println("now book avail in book list:");
            for(String boo:book){
                System.out.println(boo);
            }


        }
    }}