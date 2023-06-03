package _03_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_Decimal_To_Binary_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.valueOf(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
if(number == 0){
    System.out.println(0);
}else {
    while (number != 0) {
        stack.push(number % 2);
        number /= 2;
    }
    while (!stack.isEmpty()) {
        System.out.print(stack.pop());
    }
}
    }
}
