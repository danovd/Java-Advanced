package _18_Generics_Exersise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _07_Custom_List<T extends Comparable<T>> {
private List<T> elements;

public _07_Custom_List(){
    elements = new ArrayList<>();
}
public void add(T element){
    elements.add(element);
}
public T remove (int index){
    return elements.remove(index);
}
public boolean contains(T element){
    return elements.contains(element);
}
public void swap (int firstIndex, int secondIndex){
    Collections.swap(elements, firstIndex, secondIndex);
}
public int countGreaterThan(T element){
return (int)elements.stream()
        .filter(e -> e.compareTo(element) > 0)
        .count();
}
public T getMax(){
// return elements.stream().max((first, second) -> first.compareTo(second)).get();
return Collections.max(elements);
}
public T getMin(){
//    return elements.stream().min((first, second) -> first.compareTo(second)).get();
return Collections.min(elements);
}
public void sort(){
    elements.sort((a, b) -> a.compareTo(b));
}
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for(T element : this.elements){
        sb.append(element).append(System.lineSeparator());
    }
    return sb.toString();
    }
}
