package _03_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_Browsing_History {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<String>();

        String current = "";
        while(!line.equals("Home")){
            if(line.equals("back")) {
                if(!stack.isEmpty()) {
                    current = stack.pop();
                }else{
                    System.out.println("no previous URLs");
                    line = sc.nextLine();
                    continue;
                }
            }else{
                if(!current.equals("")) {
                    stack.push(current);
                }
                current = line;
            }

            System.out.println(current);

            line = sc.nextLine();
        }

    }
}
