package _17_Generics_Lab;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _02_ArrayCreator {

    public static <T> T[] create(int length, T def){
        T[] arr = (T[]) Array.newInstance(def.getClass(), length);
        Arrays.fill(arr, def);
        return arr;
    }
    public static <T> T[] create(Class<T> clazz, int length, T def){
        T[] arr = (T[]) Array.newInstance(clazz, length);
        Arrays.fill(arr, def);
        return arr;
    }

}
