package _17_Generics_Lab;

import java.util.Comparator;

public class _03_Scale <T extends Comparable<T>>{
    public final T left;
    public final T right;
    public _03_Scale(T left, T right){
        this.left = left;
        this.right = right;
    }
    public T getHeavier(){
        int compared = left.compareTo(right);
        
        if(compared > 0){
            return left;
        } else if(compared < 0){
            return right;
        }
        return null;
    }
}
