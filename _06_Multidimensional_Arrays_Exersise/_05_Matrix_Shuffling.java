package _06_Multidimensional_Arrays_Exersise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05_Matrix_Shuffling {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String size = sc.nextLine();
        int row = Integer.parseInt(size.split("\\s+")[0]);
        int col = Integer.parseInt(size.split("\\s+")[1]);

        String[][] arr = new String[row][col];
        for (int i = 0; i < row; i++) {
            String [] nextLine = sc.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                arr[i][j] = nextLine[j];
            }
        }

        String command = sc.nextLine();
        while(!command.equals("END")){
            String commandParts [] = command.split("\\s+");

            if(isValid(commandParts, arr)){
                swapElements(commandParts, arr);
                printMatrix(arr);
            }else{
                System.out.println("Invalid input!");
            }
            command = sc.nextLine();
        }
    }

    private static void swapElements(String[] commandParts, String [][] arr) {
        String first = arr[Integer.parseInt(commandParts[1])][Integer.parseInt(commandParts[2])];
        String second = arr[Integer.parseInt(commandParts[3])][Integer.parseInt(commandParts[4])];
        arr[Integer.parseInt(commandParts[1])][Integer.parseInt(commandParts[2])] = second + "";
        arr[Integer.parseInt(commandParts[3])][Integer.parseInt(commandParts[4])] = first + "";
    }

    private static boolean isValid(String[] commandParts, String[][] arr) {
            if(commandParts.length != 5 || !commandParts[0].equals("swap") ||
                    Integer.parseInt(commandParts[1]) >= arr.length ||
                    Integer.parseInt(commandParts[1]) < 0 ||
                    Integer.parseInt(commandParts[3]) >= arr.length ||
                    Integer.parseInt(commandParts[3]) < 0 ||
                    Integer.parseInt(commandParts[2]) >= arr[0].length ||
                    Integer.parseInt(commandParts[2]) < 0 ||
                    Integer.parseInt(commandParts[4]) >= arr[0].length ||
                    Integer.parseInt(commandParts[4]) < 0
            ){
                return false;
            }
        return true;
    }
    private static void printMatrix(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
