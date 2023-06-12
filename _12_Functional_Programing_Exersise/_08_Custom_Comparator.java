package _12_Functional_Programing_Exersise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_Custom_Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



         // comparator -> function приема два елемента и връща цяло число (0, 1, -1)
        // 0 -> двата елемента са еднакви
        // 1 -> първият елемент е по-голям от вторият
        // -1 -> вторият елемент е по-голям от първият

        // sorted (0) -> не разменя двата елемента
        // sorted (1) -> разменя елементите
        // sorted (-1) -> не разменя елементите!!! (те са си правилно наредени)

        // 2 0 3 4 5
        // comparator (2, 0) -> 1 отива sorted -> разменя 2 и 0 -> 0 2 3 4 5 .....
Comparator<Integer> comparator = (f, s) -> {
    // първо четно, второ нечетно
    if(f % 2 == 0 && s % 2 != 0){
        return -1;
    }
    // първо нечетно, второ четно
    else if(f % 2 != 0 && s % 2 == 0){
        return 1;
    }
    // първо четно, второ четно
    // първо нечетно, второ нечетно
    else{
        return f.compareTo(s);
        // f == s -> 0 -> няма смяна
        // f < s -> -1 -> няма смяна
        // f > s -> 1 -> има смяна
    }
};
        numbers.stream().sorted(comparator).forEach(n -> System.out.print(n + " "));
    }
}
