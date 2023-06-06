package _06_Multidimensional_Arrays_Exersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_Crossfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String size = sc.nextLine();
        int row = Integer.parseInt(size.split("\\s+")[0]);
        int col = Integer.parseInt(size.split("\\s+")[1]);

        int [][] arr = new int[row][col];
        int count = 1;

        for (int i = 0; i < row; i++) {
           // int [] current = new int [col];
            for (int j = 0; j < col; j++) {
                arr[i][j] = count++;
            }
        }

        String [][] matrix = convertIntMatrixToString(arr);
        String input = sc.nextLine();

        while(!input.equals("Nuke it from orbit")){
            String [] parts = input.split("\\s+");
            int r = Integer.parseInt(parts[0]);
            int c = Integer.parseInt(parts[1]);
            int radius = Integer.parseInt(parts[2]);

            matrix = crossFire(r, c, radius, matrix);

            input = sc.nextLine();
        }


// PRINT
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }


    }
// Cross fire
    private static String[][] crossFire(int row , int col, int radius, String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j == col && i <= row + radius && i >= row - radius){
                    matrix [i][j] = "*";
                }
                if(i == row && j <= col + radius && j >= col - radius){
                    matrix [i][j] = "*";
                }
            }
        }

        matrix = removeAsteriks(matrix);

        return matrix;
    }

    private static String[][] removeAsteriks(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j].equals("*")){
                    count++;
                }
            }
            if(count < matrix[i].length){
                String [] current = new String[matrix[i].length - count];
                int c = 0;
                for (int k = 0; k < matrix[i].length; k++) {
                    if(!matrix[i][k].equals("*")){
                        current[c++] = matrix[i][k];
                    }
                }
                matrix[i] = current;
            }

            else{
                if(matrix.length > 1) {
                    String[][] newMatrix = new String[matrix.length - 1][];
                    int cou = 0;
                    for (int t = 0; t < matrix.length; t++) {
                        if (t != i) {
                            newMatrix[cou++] = matrix[t];
                        }
                    }
                    matrix = newMatrix;
                }else{
                    return matrix;
                }

            }


        }


        return matrix;

    }

    // Convert
    private static String[][] convertIntMatrixToString(int[][] arr) {
        String [][] matrix = new String [arr.length][];

        for (int i = 0; i < arr.length; i++) {
            String [] current = new String [arr[i].length];
            matrix[i] = current;
            for (int j = 0; j < arr[i].length; j++) {
                matrix[i][j] = arr[i][j] + "";
            }
        }
        return matrix;
    }
}
