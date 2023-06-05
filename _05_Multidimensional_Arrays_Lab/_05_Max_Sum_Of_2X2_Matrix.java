package _05_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Max_Sum_Of_2X2_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dimensions = sc.nextLine();
        int rows = Integer.parseInt(dimensions.split(", ")[0]);
        int cols = Integer.parseInt(dimensions.split(", ")[1]);

        int[][] arr = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            arr [i] = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        printMaxSum2X2(arr);
    }

    private static void printMaxSum2X2(int[][] arr) {
        int max = Integer.MIN_VALUE;
        String firstRow = "";
        String secondRow = "";
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];
                if(sum > max){
                    max = sum;
                    firstRow = arr[i][j] + " " + arr[i][j+1];
                    secondRow = arr[i+1][j] + " " + arr[i+1][j+1];
                }
            }
        }
        System.out.println(firstRow);
        System.out.println(secondRow);
        System.out.println(max);
    }
}
