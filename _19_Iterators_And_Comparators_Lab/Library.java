package _19_Iterators_And_Comparators_Lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Library implements Iterable<Book> {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }
    public void add(Book book){
        this.books.add(book);
    }
    public Book get(int index){
        return this.books.get(index);
    }
    public int size(){
        return this.books.size();
    }

    public List<Book> getBooks() {
        return books;
    }

    private class LibIterator implements Iterator<Book> {
private int begin = 0;

    @Override
    public boolean hasNext() {
        return begin < books.size();
    }

    @Override
    public Book next() {
        Book nextBook = books.get(begin);
        begin++;
        return nextBook;
    }
}
    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

/*    @Override
    public void forEach(Consumer<? super Book> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Book> spliterator() {
        return Iterable.super.spliterator();
    }

 */
}
