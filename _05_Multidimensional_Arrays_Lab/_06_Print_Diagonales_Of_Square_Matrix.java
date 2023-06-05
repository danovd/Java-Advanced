package _05_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Print_Diagonales_Of_Square_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        int[][] arr = new int [size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printDiagonales(arr);
    }

    private static void printDiagonales(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i][j] + " ");
            j++;
        }
    }
}
