import java.util.LinkedList;
import java.util.Scanner;
 class book {

    String name;
    String Author;
    int pages;

    book(String name, String Author, int pages) {
        this.name = name;
        this.Author = Author;
        this.pages = pages;


    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", pages=" + pages +
          '}';
    }}
   class list {
       LinkedList<book> books;

       list() {

           books = new LinkedList<>();


       }

       @Override
       public String toString() {
           return "list{" +
                   "books=" + books +
                   '}';
       }

       void addbooks(book bokks) {

           books.add(bokks);



       }

       void removeBOOK(book bokks) {

           books.remove(bokks);

       }


       public String Searching(String search) {

           for (int i = 0; i < books.size(); i++) {
               if (search.equals(books.get(i).name)) {
                   System.out.println(books.get(i));


               } else {

                   System.out.println("not found");
               }
           }
           return search;
       }
   }
                class Main {
                    public static void main(String[] args) {


                        list obj=new list();
                        obj.addbooks(new book("programming","shamsi",200));
                        obj.addbooks(new book("web","zahra",300));
                        System.out.println(obj);

                        obj.removeBOOK(new book("programming","shamsi",200));

                        


                    }


                    }












