package _04_Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _04_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int toDeq = sc.nextInt();
    int toCheck = sc.nextInt();
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            int current = sc.nextInt();
            stack.push(current);
        }

        if(toDeq > 0){
            for (int i = 0; i < toDeq; i++) {
                stack.pollLast();
            }
        }
        if(stack.contains(toCheck)){
            System.out.println(true);
        }else{
            if(stack.isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(Collections.min(stack));
            }
        }

    }
}
