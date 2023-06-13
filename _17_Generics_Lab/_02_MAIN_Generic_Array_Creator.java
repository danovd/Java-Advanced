package _17_Generics_Lab;

public class _02_MAIN_Generic_Array_Creator {
    public static void main(String[] args) {
        Integer [] integers = _02_ArrayCreator.<Integer>create(10, 13);
        String [] strings = _02_ArrayCreator.<String>create(String.class, 3, "Java");
        for(Integer integer : integers){
            System.out.println(integer);
        }
        for(String string : strings){
            System.out.println(string);
        }

    }
}
