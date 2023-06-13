package _19_Iterators_And_Comparators_Lab;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book f, Book s) {
        int compared = f.getTitle().compareTo(s.getTitle());

        if(compared == 0){
            compared = Integer.compare(f.getYear(), s.getYear());
        }
        return compared;
    }

}
