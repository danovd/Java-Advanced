package _07_Sets_and_Maps_Advanced;

import java.util.*;

public class _06_Product_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map <String, Map<String, Double>> map = new TreeMap();
        while(true){
            String input = sc.nextLine();
            if(input.equals("Revision")){
                break;
            }
            String [] parts = input.split(", ");
            String store = parts[0];
            String product = parts[1];
            double price = Double.parseDouble(parts[2]);
            if(!map.containsKey(store)){
                map.put(store, new TreeMap<>());
            }
                if (map.get(store).isEmpty()) {
                        map.put(store, new LinkedHashMap<>());
                }
                map.get(store).put(product, price);
        }
        for(String s : map.keySet()){
            System.out.println(s + "->");
            for(String f : map.get(s).keySet()){

                   System.out.printf("Product: %s, Price: %.1f\n", f, map.get(s).get(f));
            }

        }

    }
}
