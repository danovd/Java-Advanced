package _04_Stacks_And_Queues_Exercise;

import java.util.*;

public class _05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        ArrayDeque <Character> par = new ArrayDeque<>();
        boolean isBreak = false;

        for (int i = 0; i < command.length(); i++) {
            char currentChar = command.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '[') {
                par.push(currentChar);
            }else if(currentChar == ')' || currentChar == '}' || currentChar == ']'){
                if(par.isEmpty()){
                    isBreak = true;
                    break;
                }
                String pattern = par.pop() + "" + currentChar;
                switch (pattern){
                    case "()":
                    case "{}":
                    case "[]":
                        break;
                    default:
                        isBreak = true;
                        break;
                }
            }else{
                isBreak = true;
                break;
            }
        }
        if(isBreak){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }




    }
}
