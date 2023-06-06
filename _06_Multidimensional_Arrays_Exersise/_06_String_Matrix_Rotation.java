package _06_Multidimensional_Arrays_Exersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listOfArr = new ArrayList<>();
        int longestWord = 0;
       String commandDegreeRotate = sc.nextLine();

       Pattern pattern = Pattern.compile("\\d+");
       Matcher matcher = pattern.matcher(commandDegreeRotate);
       int degree = 0;
       if(matcher.find()){
           degree = Integer.parseInt(matcher.group());
       }
       String input = sc.nextLine();

       while(!input.equals("END")){
           listOfArr.add(input);
            if(input.length() > longestWord){
                longestWord = input.length();
            }
            input = sc.nextLine();
       }

       String [][] arr = new String [listOfArr.size()][longestWord];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new String[longestWord];

            for (int j = 0; j < arr[i].length; j++) {
                if(j >= listOfArr.get(i).length()){
                    arr[i][j] = null;
                }else{
                    arr[i][j] = listOfArr.get(i).charAt(j) + "";
                }
            }
        }

        rotateMatrixGeneral(arr, degree, longestWord);



    }

    private static void rotateMatrixGeneral(String[][] arr, int degree, int longestWord) {
        int degreeReduced = degree % 360;
        String [][] rotated = new String [longestWord][arr.length];
        switch (degreeReduced){
            case 0:
               rotated = arr;
                break;
            case 90:
                rotated = rotateMatrix90Degree(arr, longestWord);
                break;
            case 180:
                rotated = rotateMatrix180Degree(arr, longestWord);
                break;
            case 270:
                rotated = rotateMatrix270Degree(arr, longestWord);
                break;
        }
        for (String[] strings : rotated) {
            for (String string : strings) {
                if(string != null) {
                    System.out.print(string);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static String[][] rotateMatrix180Degree(String[][] arr, int longestWord) {
        String [][] rotated = new String [longestWord][arr.length];

        for (int i = 0; i < arr.length; i++) {
            String [] current = new String[longestWord];
            rotated[i] = current;
            for (int j = 0; j < longestWord; j++) {
                rotated[i][j] = arr[arr.length - 1 - i][longestWord - j - 1];
            }
        }
        return rotated;
    }

    private static String [][] rotateMatrix270Degree(String[][] arr, int longestWord) {

        String [][] rotated = new String [longestWord][arr.length];

        for (int i = 0; i < longestWord; i++) {
            String[] current = new String[arr.length];
            rotated[i] = current;
            for (int j = 0; j < arr.length; j++) {
                rotated[i][j] = arr[j][longestWord - i - 1];
            }
        }
        return rotated;
    }

    private static String[][] rotateMatrix90Degree(String[][] arr, int longestWord) {

        String [][] rotated = new String [longestWord][arr.length];

        for (int i = 0; i < longestWord; i++) {
            String [] current = new String[arr.length];
            rotated[i] = current;
            for (int j = 0; j < rotated[i].length; j++) {
                rotated[i][j] = arr[arr.length - 1 - j][i];
            }
        }
    return rotated;
    }

}
