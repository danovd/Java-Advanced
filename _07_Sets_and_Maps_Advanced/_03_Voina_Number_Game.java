package _07_Sets_and_Maps_Advanced;

import java.util.*;
import java.util.stream.Collectors;

public class _03_Voina_Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <Integer> firstDeck = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set <Integer> secondDeck = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 0; i < 50; i++) {
            if(firstDeck.isEmpty() || secondDeck.isEmpty()){
                break;
            }
            int first = firstDeck.iterator().next();
            firstDeck.remove(first);
            int second = secondDeck.iterator().next();
            secondDeck.remove(second);
            if(first > second){
                 firstDeck.add(first);
                 firstDeck.add(second);
            }else if (second > first){
                secondDeck.add(first);
                secondDeck.add(second);
            }
        }
        if(firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        }else if(secondDeck.size() > firstDeck.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }


    }
}
