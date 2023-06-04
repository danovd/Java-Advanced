package _04_Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _06_Recursive_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        for (int i = 2; i < num; i++) {
        int first = stack.poll();
        int second = stack.poll();
        int next = first + second;
        stack.push(first);
        stack.push(second);
        stack.push(next);
        }
        if(num == 1){
            System.out.println(1);
        }else if(num >49){

        }
        else {
            System.out.println(stack.pop());
        }
    }


}
