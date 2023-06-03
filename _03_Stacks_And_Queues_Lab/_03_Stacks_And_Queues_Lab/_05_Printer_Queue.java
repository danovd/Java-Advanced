package _03_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_Printer_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        ArrayDeque <String> stack = new ArrayDeque<>();

        while(!command.equals("print")){
            if(command.equals("cancel")){
                if(stack.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.printf("Canceled %s\n", stack.pollFirst());
                }
            }else{
                stack.offer(command);
            }
            command = sc.nextLine();
        }
while(stack.isEmpty()){
    System.out.println(stack.poll());
}
    }
}
