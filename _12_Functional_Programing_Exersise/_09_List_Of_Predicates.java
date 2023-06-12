package _12_Functional_Programing_Exersise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class _09_List_Of_Predicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> numbersForDivision = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        // всички числа от 1 до n

        for (int number = 1; number <= n; number++){
            // проверяваме дали се дели на всички дадени числа

        }
        // приема лист с числа и число -> връща true/false
        // true -> числото се дели на всички числа
        // false -> числото не се дели на всички числа

        BiFunction<List<Integer>, Integer, Boolean> isDivisible = ((list, number) -> {
            for (int numberInList : list) {
                if (number % numberInList != 0) {
                    return false;
                }
            }
            return true;
        } );

// всички числа от 1 до n

        for(int num = 1; num <= n; num++){
            // проверява дали се дели на всички числа
            if(isDivisible.apply(numbersForDivision, num)){
                System.out.print(num + " ");
            }

        }

    }
}
