package _04_Stacks_And_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _07_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOperations = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder currentText = new StringBuilder();

        for (int i = 1; i <= numberOperations; i++) {
            String command = sc.nextLine();
            String commandNumber = command.split("\\s+")[0];
            switch (commandNumber){
                case "1":
                    String textToAdd = command.split("\\s+")[1];
                    currentText.append(textToAdd);
                    stack.push(currentText.toString());
                    break;
                case "2":
                    int countElements = Integer.parseInt(command.split("\\s+")[1]);
                    int startIndex = currentText.length() - countElements;
                    currentText.delete(startIndex, startIndex + countElements);
                    stack.push(currentText.toString());
                    break;
                case "3":
                    int characterToPrint = Integer.parseInt(command.split("\\s+")[1]);
                        System.out.println(currentText.charAt(characterToPrint - 1));
                    break;
                case "4":
                    if(stack.size() > 1) {
                        stack.pop();
                        currentText = new StringBuilder(stack.peek());
                    //    currentText.delete(0, currentText.length());
                    //    currentText.append(stack.pop());
                    }else{
                        currentText = new StringBuilder();
                    //   currentText.delete(0, currentText.length());
                    }
                    break;
            }

        }
    }
}
