package _08_Sets_and_Maps_Advanced_Exersise;

import java.util.Scanner;

public class _08_Hands_Of_Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("JOKER")){
            String [] parts = input.split("\"[\\\\s,]+\"");
            String name = parts[0];

            input = sc.nextLine();
        }
    }
}
