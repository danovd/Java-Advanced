package _04_Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_Reverse_Numbers_With_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for(String s : arr){
            stack.push(s);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }


    }
}
