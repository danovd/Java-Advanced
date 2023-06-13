package _17_Generics_Lab;

import java.util.ArrayDeque;
import java.util.Deque;

public class _01_Jar<T> {
  private Deque<T> elements;
  public _01_Jar(){
      this.elements = new ArrayDeque<>();
  }
  public void add(T element){
      this.elements.push(element);
  }
  public T remove(){
      return this.elements.pop();
  }
}
