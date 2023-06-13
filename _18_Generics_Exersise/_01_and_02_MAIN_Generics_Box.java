package _18_Generics_Exersise;

import java.util.Scanner;

public class _01_and_02_MAIN_Generics_Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        _01_Box<String> box = new _01_Box();
        for (int i = 0; i < n; i++) {
            String value = sc.nextLine();
            box.add(value);
        }
///  ЗАДАЧА 2-ра!!! Само се изменя подаваният тип на Integer и се закоментирва
// горният цикъл и декларация и инициализация на Box със String

    //      _01_Box<Integer> box1 = new _01_Box();
    //      for (int i = 0; i < n; i++) {
    //         int value = Integer.parseInt(sc.nextLine());
    //         box1.add(value);
    //     }

        System.out.println(box);
    }
}
