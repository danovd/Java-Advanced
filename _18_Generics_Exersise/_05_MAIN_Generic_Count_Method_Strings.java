package _18_Generics_Exersise;

import java.util.Scanner;

public class _05_MAIN_Generic_Count_Method_Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        _01_Box<String> box = new _01_Box();
        for (int i = 0; i < n; i++) {
            String value = sc.nextLine();
            box.add(value);
        }
        String elementToCompare = sc.nextLine();
        int greaterElementCount = box.countOfGreaterItems(elementToCompare);
        System.out.println(greaterElementCount);
    }
}
