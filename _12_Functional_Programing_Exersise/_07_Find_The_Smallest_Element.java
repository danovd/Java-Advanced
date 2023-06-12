package _12_Functional_Programing_Exersise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class _07_Find_The_Smallest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //приемаме списък -> отпечатваме индексът на най-малкото число
        Consumer<List<Integer>> printMinIndexOfMinElement = list -> {
            int min = Collections.min(list);
            System.out.println(list.lastIndexOf(min));
        };

        printMinIndexOfMinElement.accept(numbers);
    }
}
