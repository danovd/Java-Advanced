package _11_Functional_Programing_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class _04_Add_VAT {
    public static void main(String[] args) {
        UnaryOperator<Double> vatCalculator = val -> val * 1.2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Prices with VAT:");

        Arrays.stream(sc.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(vatCalculator)
                .forEach(p -> System.out.printf("%.2f\n", p));
    }
}
