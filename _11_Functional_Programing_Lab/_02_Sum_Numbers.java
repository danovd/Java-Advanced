package _11_Functional_Programing_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _02_Sum_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Function<String, Integer> countIntegers = str -> str.split(", ").length;
        int count = countIntegers.apply(input);

        Function <String, Integer> sumIntegers = str -> Arrays.stream(str.split(", "))
                .mapToInt(Integer::parseInt)
                .sum();
        int sum = sumIntegers.apply(input);
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);



    }
}
