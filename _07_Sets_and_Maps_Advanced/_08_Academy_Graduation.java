package _07_Sets_and_Maps_Advanced;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _08_Academy_Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        Map<String, Double[]> map = new TreeMap<>();
    /*    while(count-- > 0){
            String name = sc.nextLine();
            ArrayList<Double> grades = Arrays.stream(sc.nextLine().split("\\s+"))
                    .map(Double::parseDouble).collect(Collectors.toCollection(ArrayList:: new));
            map.put(name, grades);
        }
        for(String s : map.keySet()){
            System.out.print(s + " is graduated with ");
        OptionalDouble average = map.get(s).stream().mapToDouble(a -> a).average();
        double result = average.isPresent() ? average.getAsDouble() : 0;
            System.out.println(new DecimalFormat("0.##########################").format(result));
        }
*/
        while(count-- > 0){
            String name = sc.nextLine();
            String [] scoreStrings = sc.nextLine().split(" ");
            Double [] scores = new Double [scoreStrings.length];
            for (int i = 0; i < scoreStrings.length; i++) {
                scores [i] = Double.parseDouble(scoreStrings[i]);
            }
            map.put(name, scores);
        }
        for(String s : map.keySet()){
            System.out.print(s + " is graduated with ");
            double avg = 0;
            for (int i = 0; i < map.get(s).length; i++) {
                avg += map.get(s)[i];
            }
            avg /= map.get(s).length;
            System.out.println(avg);
        }
    }
}
