package _19_Iterators_And_Comparators_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.title = title;
        this.year = year;
        this.setAuthors(authors);
    }
    private void setAuthors(String... authors){
        this.authors = Arrays.stream(authors).collect(Collectors.toList());
    }

    private void setTitle(String title){
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
