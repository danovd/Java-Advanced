package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _02_Positions_Of {
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
        int find = sc.nextInt();
        action(find, arr1);

    }

    private static void action(int find, int[][] arr1) {
        boolean isFind = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j] == find){
                    System.out.println(i + " " + j);
                    isFind = true;
                }
            }
        }
        if(!isFind){
            System.out.println("not found");
        }

    }


}
