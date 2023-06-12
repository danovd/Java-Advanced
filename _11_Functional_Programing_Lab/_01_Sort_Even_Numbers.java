package _11_Functional_Programing_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(sc.nextLine().split(", "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List <Integer> evenNumbers = numbers
                .stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        String firstOutput = evenNumbers
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(firstOutput);

        String secondOutput = evenNumbers
                .stream()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(secondOutput);
    }
}
