package _12_Functional_Programing_Exersise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_Predicate_For_Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        // name -> true / false
        // true: length <= n
        // false: length > n
        Predicate<String> validLength = name -> name.length() <= n;
        String [] names = sc.nextLine().split("\\s+");
        Arrays.stream(names).filter(validLength).forEach(System.out::println);
        // filter -> true: оставя; false: премахва
        // оставя в списъка елементите, които отговарят на дадено условие

    }
}
