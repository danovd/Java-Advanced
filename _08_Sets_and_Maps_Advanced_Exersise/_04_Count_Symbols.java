package _08_Sets_and_Maps_Advanced_Exersise;

import java.security.KeyStore;
import java.util.*;

public class _04_Count_Symbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(!map.containsKey(current)){
                map.put(current, 1);
            }else{
                map.put(current, map.get(current) + 1);
            }
        }
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue() + " time/s");
        };
    }
}
