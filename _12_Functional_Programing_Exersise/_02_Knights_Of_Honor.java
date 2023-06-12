package _12_Functional_Programing_Exersise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _02_Knights_Of_Honor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names = sc.nextLine().split("\\s+");

        Consumer<String> printName = name -> System.out.println("Sir " + name);
        Arrays.stream(names).forEach(printName);
    }
}
