package _04_Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _03_maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            String command = sc.nextLine();
            switch(command.split("\\s+")[0]){
                case "1":
                    stack.push(Integer.parseInt(command.split("\\s+")[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
                default:
                    break;
            }


        }

    }
}
