package _08_Sets_and_Maps_Advanced_Exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<String, String> map = new LinkedHashMap<>();

        while(!input.equals("search")){
            String [] partsOfInput = input.split("-");
            String name = partsOfInput[0];
            String number = partsOfInput[1];
            map.put(name, number);
            input = sc.nextLine();
        }
        String command = sc.nextLine();
        while(!command.equals("stop")){
            if(map.containsKey(command)){
                System.out.println(command + " -> " + map.get(command));
            }else{
                System.out.println("Contact " + command + " does not exist.");
            }

            command = sc.nextLine();
        }
    }
}
