package _07_Sets_and_Maps_Advanced;

import java.util.*;

public class _05_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<Double>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String [] input = sc.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if(map.containsKey(name)){
                map.get(name).add(grade);
            }else{
                map.put(name, new ArrayList<>());
                map.get(name).add(grade);
            }
        }

        for(String s : map.keySet()){
            System.out.print(s + " -> ");
            double sum = 0;
            for (int i = 0; i < map.get(s).size(); i++) {
                System.out.printf("%.2f ", map.get(s).get(i));
                sum += map.get(s).get(i);
            }
            sum /= map.get(s).size();
            System.out.printf("(avg: %.2f)\n", sum);
        }

    }
}
