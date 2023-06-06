package _06_Multidimensional_Arrays_Exersise;

import java.util.Scanner;

public class _02_Matrix_Of_Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        String [][] arr = createArr(row, col);
        printMatrix(arr);
    }

    private static void printMatrix(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String [][] createArr(int row, int col) {
        String [][] arr = new String [row][col];

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {

                char firstAndThird = (char)(i + 'a');
                char second = (char)(firstAndThird + j);
                String sb = String.valueOf(firstAndThird) +
                        second +
                        firstAndThird;
                arr [i][j] = sb;
            }
        }
        return arr;
    }

}
