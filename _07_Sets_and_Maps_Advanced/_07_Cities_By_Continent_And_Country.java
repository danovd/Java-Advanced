package _07_Sets_and_Maps_Advanced;

import java.util.*;

public class _07_Cities_By_Continent_And_Country {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String [] input = sc.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String town = input[2];
        if(!map.containsKey(continent)){
            map.put(continent, new LinkedHashMap<>());
            map.get(continent).put(country, new ArrayList<>());
            map.get(continent).get(country).add(town);
        }
        else{
            if(!map.get(continent).containsKey(country)){
                map.get(continent).put(country, new ArrayList<>());
            }
            map.get(continent).get(country).add(town);
        }
        }

        for(String s : map.keySet()){
            System.out.println(s + ":");
            for(String t : map.get(s).keySet()){
                System.out.print("  " + t + " -> ");
                System.out.println(String.join(", ", map.get(s).get(t)));
            }


        }
    }
}
