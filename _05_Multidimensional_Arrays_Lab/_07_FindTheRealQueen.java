package _05_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class _07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] arr = new char [8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr [i][j] = sc.next().charAt(0);
            }
        }

        findQueen(arr);
    }

    private static void findQueen(char[][] arr) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(arr[i][j] == 'q'){
                    checkIsTrueQueen(i, j, arr);
                }
            }
        }

    }

    private static boolean checkIsTrueQueen(int i, int j, char[][] arr) {
        int count = 0;
        for (int k = 0; k < arr[i].length; k++) {
            if(arr[i][k] == 'q'){
                count++;
            }
            if(count == 2){
                arr[i][k] = '*';
                return false;
            }
        }
        for (int k = 0; k < arr[i].length; k++) {
            if(arr[i][k] == 'q'){
                count++;
            }
            if(count == 2){
                return false;
            }
        }
        count = 0;
        for (int k = 0; k < arr[i].length; k++) {
            if(arr[k][j] == 'q'){
                count++;
            }
            if(count == 2){
                return false;
            }
        }
        count = 0;
        chechdiagonals(i, j, arr);
        return true;

    }

    private static void chechdiagonals(int i, int j, char arr[][]) {

        if(j > i){
            int startJ = j-i;
            int endI = 8 - startJ;
            for (int k = 0; k < endI; k++) {
                for (int l = startJ; l < j; l++) {
                    System.out.print(arr [k][l] + " ");
                }
                System.out.println("next");
            }

        }


    }
}
