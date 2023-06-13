package _18_Generics_Exersise;

import java.util.Scanner;

public class _07_MAIN_Custom_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
    _07_Custom_List<String> customList = new _07_Custom_List<>();
        while(!input.equals("END")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch(commandName){
                case "Add":
                    String elementToAdd = commandParts[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandParts[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String elementToCheck = commandParts[1];
                    System.out.println(customList.contains(elementToCheck));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String element = commandParts[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
                case "Sort":
                   customList = Sorter.sort(customList);
                case "END":
                    break;
            }
            input = sc.nextLine();
        }

    }
}
