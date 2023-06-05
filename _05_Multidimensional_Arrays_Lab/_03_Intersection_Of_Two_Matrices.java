package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _03_Intersection_Of_Two_Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        char [][] arr1 = createMatrix(rows, cols, sc);
        char [][] arr2 = createMatrix(rows, cols, sc);
        printIntersectionMatrice(arr1, arr2);

    }

    private static void printIntersectionMatrice(char [][] arr1, char[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j] == arr2[i][j]){
                    System.out.print(arr1[i][j] + " ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    private static char[][] createMatrix(int rowsFirst, int colsFirst, Scanner sc) {
        char [][] arr = new char[rowsFirst][colsFirst];
        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < colsFirst; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        return arr;
    }
}
