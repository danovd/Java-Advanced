package _12_Functional_Programing_Exersise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _05_Reverse_And_Exclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());

        // обръщаме списъка
        Collections.reverse(numbers);
        // премахваме всички числа, които се делят на n
        // приема число -> true/false
        Predicate<Integer> chechDivision = number -> number % n == 0;
        numbers.removeIf(chechDivision);

        numbers.forEach(number -> System.out.print(number + " "));
    }
}
