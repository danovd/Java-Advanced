package _12_Functional_Programing_Exersise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class _04_Applied_Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int [] numbers = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        // add -> adds 1: приемем масив -> върнем масив
        Function<int[], int[]> add = array -> Arrays.stream(array).map(number -> number += 1).toArray();
        // multiply -> multiply by 2: приемем масив -> върнем масив
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(number -> number *= 2).toArray();
        // subtract -> subtracts 1: приемем масив -> върнем масив
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(number -> number -= 1).toArray();
        // print -> print all elements: приема масив -> отпечатва елементите
        Consumer<int[]> print = array -> Arrays.stream(array).forEach(number -> System.out.print(number + " "));

        String command = sc.nextLine();
        while(!command.equals("end")){

            switch (command){
                case "add":
                    numbers = add.apply(numbers);
                break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }

            command = sc.nextLine();
        }


    }
}
