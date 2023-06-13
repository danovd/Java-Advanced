package _19_Iterators_And_Comparators_Lab;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Document in the Case", 2002);
        Book bookThree = new Book("The Documents in the case", 1930, "Dorothy Sayers", "Robert Eustace");


        Library library = new Library();
        library.add(bookOne);
        library.add(bookTwo);
        library.add(bookThree);

        List<Book> books = library.getBooks();
        books.stream().sorted(new BookComparator())
                .forEach(System.out::println);

       for(Book next : books){
           System.out.println(next.getTitle());
        }



    }
}
