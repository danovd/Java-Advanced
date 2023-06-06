package _06_Multidimensional_Arrays_Exersise;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Fill_The_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] commandParts = sc.nextLine().split(", ");
        int size = Integer.parseInt(commandParts[0]);
        String type = commandParts[1];
        int [][] arr = null;
        if(type.equals("A")) {
            arr = createArrayPatternA(size, type);
        }else if(type.equals("B")){
            arr = createArrayPatternB(size, type);
        }
        printMatrix(arr);
    }

    private static int[][] createArrayPatternB(int size, String type) {
        int [][] arr = new int [size][size];
        int count = 1;
        for (int i = 0; i < size; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    arr[j][i] = count++;
                }
            }else{
                for (int j = arr.length - 1; j >= 0 ; j--) {
                    arr[j][i] = count++;
                }
            }
        }
        return arr;
    }

    private static int[][] createArrayPatternA(int size, String typeA) {
        int [][] arr = new int [size][size];
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[j][i] = count++;
            }
        }
        return arr;
    }
    protected static void printMatrix(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
