package _12_Functional_Programing_Exersise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _10_Predicate_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listOfNames = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String command = sc.nextLine();

        BiFunction<List<String>, String, List<String>> removeStartsWith = ((list, str) -> {
           list = list.stream()
                    .filter(n -> !n.startsWith(str))
                    .collect(Collectors.toList());
            return list;
        });
        BiFunction<List<String>, String, List<String>> removeEndsWith = ((list, str) ->{
            list = list.stream()
                    .filter(n -> !n.endsWith(str))
                    .collect(Collectors.toList());
            return list;

        });
        BiFunction<List<String>, Integer, List<String>> removeWithLength = ((list, num) ->{
            list = list.stream()
                    .filter(n -> n.length() != num)
                    .collect(Collectors.toList());
            return list;
        });

        BiFunction<List<String>, String, List<String>> doubleStartsWith = ((list, str) ->{
            List<String> newList = new ArrayList<>();
            for (String s : list) {
                newList.add(s);
                if (s.startsWith(str)) {
                    newList.add(s);
                }
            }
            return newList;
        });
        BiFunction<List<String>, String, List<String>> doubleEndsWith = ((list, str) ->{
            List<String> newList = new ArrayList<>();
            for (String s : list) {
                newList.add(s);
                if (s.endsWith(str)) {
                    newList.add(s);
                }
            }
            return newList;
        });
        BiFunction<List<String>, Integer, List<String>> doubleWithLength = ((list, num) ->{
            List<String> newList = new ArrayList<>();
            for (String s : list) {
                newList.add(s);
                if (s.length() == num) {
                    newList.add(s);
                }
            }
            return newList;
        });

        while(!command.equals("Party!")){
            String [] parts = command.split("\\s+");
            switch(parts[0]){
                case "Remove":
                    switch(parts[1]){
                        case "StartsWith":
                            listOfNames = removeStartsWith.apply(listOfNames, parts[2]);
                            break;
                        case "EndsWith":
                            listOfNames = removeEndsWith.apply(listOfNames, parts[2]);
                            break;
                        case "Length":
                            listOfNames = removeWithLength.apply(listOfNames, Integer.parseInt(parts[2]));
                            break;
                        default:
                            break;
                    }
                    break;
                case "Double":
                    switch(parts[1]){
                        case "StartsWith":
                            listOfNames = doubleStartsWith.apply(listOfNames, parts[2]);
                            break;
                        case "EndsWith":
                            listOfNames = doubleEndsWith.apply(listOfNames, parts[2]);
                            break;
                        case "Length":
                            listOfNames = doubleWithLength.apply(listOfNames, Integer.parseInt(parts[2]));
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }

            command = sc.nextLine();
        }


        if(listOfNames.size() == 0){
            System.out.println("Nobody is going to the party!");
        }else{
         //   listOfNames.stream().sorted(String::compareTo)
         //           .forEach(e -> System.out.print(e + " "));

            String result = listOfNames.stream().sorted(String::compareTo)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));

            System.out.println(result + " are going to the party!");
        }
    }
}
