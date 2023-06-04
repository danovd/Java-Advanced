package _04_Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split("\\s+");
        int N = Integer.parseInt(arr[0]);
        int S = Integer.parseInt(arr[1]);
        int X = Integer.parseInt(arr[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            stack.push(sc.nextInt());
        }
        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        if(stack.contains(X)){
            System.out.println("true");
        }else{
            if(stack.isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(Collections.min(stack));
            }
        }

    }

}
