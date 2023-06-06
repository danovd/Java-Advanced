package _06_Multidimensional_Arrays_Exersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_Maximal_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        List<Integer> indexRowCowAndSumValuesInList = findValues(arr);

        printMatrix(indexRowCowAndSumValuesInList.get(0), indexRowCowAndSumValuesInList.get(1),
                indexRowCowAndSumValuesInList.get(2), arr);

    }



    private static List<Integer> findValues(int[][] arr) {
        List <Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr[i].length - 3; j++) {
                int currentSum = findSumOf3X3(i, j, arr);
                if(currentSum > max){
                    max = currentSum;
                    list.clear();
                    list.add(i);
                    list.add(j);
                    list.add(max);
                }
            }
        }
        return list;
    }

    private static int findSumOf3X3(int row, int col, int[][] arr) {
        int sum = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    private static void printMatrix(Integer row, Integer col, Integer sum, int[][] arr) {
        System.out.println("Sum = " + sum);
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }







}
