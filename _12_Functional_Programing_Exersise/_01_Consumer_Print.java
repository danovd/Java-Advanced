package _12_Functional_Programing_Exersise;

import java.util.Scanner;
import java.util.function.Consumer;

public class _01_Consumer_Print {
    public static void main(String[] args) {
        // Function <приема, връща> -> apply
        // Consumer <приема> -> void -> accept
        // Supplier <връща> -> get
        // Predicate  <приема> -> false / true -> test
        // BiFunction <приема1, приема2, връща> -> apply

        Scanner sc = new Scanner(System.in);
        String [] names = sc.nextLine().split("\\s+");
        // начин 1:
        /* for(String name : names){
        System.out.println(name)
            };
         */

        // начин 2:
        // name -> печатаме

  /*      Consumer<String> printName = name -> System.out.println(name);
    for(String name : names){
        printName.accept(name);
    }

       */

        // начин 3:
        // масив с имена -> печата
        Consumer<String[]> printNames = array -> {
        for(String name : array){
            System.out.println(name);
        }
        };
    printNames.accept(names);
    }

}
