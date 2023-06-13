package _18_Generics_Exersise;

import java.util.Scanner;

public class _03_and_04_MAIN_Generic_Swap_Method_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        _01_Box<String> box = new _01_Box();
        for (int i = 0; i < n; i++) {
            String value = sc.nextLine();
            box.add(value);
        }
        // 4-та задача следното вместо горното:
      //  _01_Box<Integer> box1 = new _01_Box();
      //  for (int i = 0; i < n; i++) {
      //      int value = Integer.parseInt(sc.nextLine());
      //      box1.add(value);
      //  }


        String [] indices = sc.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);
        box.swap(firstIndex, secondIndex);
        System.out.println(box);
    }
}
