package _06_Multidimensional_Arrays_Exersise;

import java.util.Scanner;

public class _03_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        int[][] arr = new int [size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        findDifferenceBetweenToDiagonals(arr);
    }

    private static void findDifferenceBetweenToDiagonals(int[][] arr) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int primaryCurent = arr[i][i];
            int secondaryCurrent = arr[i][arr.length - i - 1];
            primaryDiagonalSum += primaryCurent;
            secondaryDiagonalSum += secondaryCurrent;
        }
        System.out.println(Math.max(primaryDiagonalSum, secondaryDiagonalSum) - Math.min(primaryDiagonalSum, secondaryDiagonalSum));

    }
}
