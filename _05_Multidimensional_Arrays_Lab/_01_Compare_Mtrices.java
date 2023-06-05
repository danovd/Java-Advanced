package _05_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Compare_Mtrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowsFirst = sc.nextInt();
        int colsFirst = sc.nextInt();

        int[][] arr1 = new int [rowsFirst][colsFirst];

        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < colsFirst; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int rowsSecond = sc.nextInt();
        int colsSecond = sc.nextInt();

        int[][] arr2 = new int [rowsSecond][colsSecond];

        for (int i = 0; i < rowsSecond; i++) {
            for (int j = 0; j < colsSecond; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println(matricesAreEqual(arr1, arr2) ? "equal" : "not equal");

    }
    static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length) return false;

        for (int row = 0; row < firstMatrix.length; row ++) {

            if (firstMatrix[row].length != secondMatrix[row].length)

                return false;

            for (int col = 0; col < firstMatrix[row].length; col ++) {

                if (firstMatrix[row][col] != secondMatrix[row][col]) return false;

            }

        }

        return true;

    }
}
