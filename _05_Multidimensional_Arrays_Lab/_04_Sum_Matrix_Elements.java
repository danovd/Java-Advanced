package _05_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dimensions = sc.nextLine();
        int rows = Integer.parseInt(dimensions.split(", ")[0]);
        int cols = Integer.parseInt(dimensions.split(", ")[1]);

        int[][] arr1 = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            arr1 [i] = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(rows);
        System.out.println(cols);
        sum(arr1);
    }
///  Някакъв нов синтаксис за циклите, който самата програма ми препоръча. Ясно как работи.
    private static void sum(int[][] arr1) {
        int sum = 0;
        for (int[] ints : arr1) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);
    }
}
