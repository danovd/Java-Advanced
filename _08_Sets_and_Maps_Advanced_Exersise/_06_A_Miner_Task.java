package _08_Sets_and_Maps_Advanced_Exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_A_Miner_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String element = sc.nextLine();

        Map<String, Integer> map = new LinkedHashMap<>();
        while(!element.equals("stop")){
            String quantity = sc.nextLine();
            if(!map.containsKey(element)){
                map.put(element, Integer.parseInt(quantity));
            }else{
                map.put(element, map.get(element) + Integer.parseInt(quantity));
            }
            element = sc.nextLine();
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
