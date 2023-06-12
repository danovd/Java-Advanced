package _11_Functional_Programing_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _06_Find_Evens_Or_Odds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int [] range = Arrays.stream(sc.nextLine().split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();
    String condition = sc.nextLine();
    printNumbersIn(range[0], range[1], condition.equals("even")
            ? n -> n % 2 == 0
            : n -> n % 2 != 0);

 //   printNumbersIn(10, 100, n -> n % 3 == 0);
    }
    private static void printNumbersIn(int startInclusive, int endInclusive, Predicate<Integer> predicate){
        System.out.println(IntStream.rangeClosed(startInclusive, endInclusive)
                .boxed()
                .filter(predicate)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

        ;
    }
}
