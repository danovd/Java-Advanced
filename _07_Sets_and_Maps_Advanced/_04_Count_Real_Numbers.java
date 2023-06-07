package _07_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] values = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> map = new LinkedHashMap<>();

        for(double v : values){
            if(!map.containsKey(v)){
                map.put(v, 1);
            }else{
                map.put(v, map.get(v) + 1);
            }
        }

        for(double d : map.keySet()){
            System.out.printf("%.1f -> %d\n", d, map.get(d));
        }
    }
}
