package _17_Generics_Lab;

import java.util.List;

public class _04_MAIN_List_Utils {
    public static void main(String[] args) {

        List<Integer> integers = List.of(13, 42, 73, 69);
        List<String> strings = List.of("13", "42", "73", "69");

        System.out.println(_04_ListUtils.getMin(integers));
        System.out.println(_04_ListUtils.getMax(strings));
    }
}
