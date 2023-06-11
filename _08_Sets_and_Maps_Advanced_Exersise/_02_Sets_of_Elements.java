package _08_Sets_and_Maps_Advanced_Exersise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_Sets_of_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] sizes = sc.nextLine().split("\\s+");
        int size1 = Integer.parseInt(sizes[0]);
        int size2 = Integer.parseInt(sizes[1]);

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        while(size1-- > 0){
            set1.add(Integer.parseInt(sc.nextLine()));
        }
        while(size2-- > 0){
            set2.add(Integer.parseInt(sc.nextLine()));
        }
        for(Integer i : set1){
            if(set2.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}
