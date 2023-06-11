package _08_Sets_and_Maps_Advanced_Exersise;

import java.util.*;
import java.util.stream.Collectors;

public class _03_Periodic_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        // Ако искахме да е в обратен ред, в скобите на TreeSet-a пишем Collections.reverseOrder()

        Set<String> set = new TreeSet<>();

        while(n-- > 0){
            String [] compound = sc.nextLine().split(" ");
            set.addAll(Arrays.asList(compound));
        }
        set.forEach(e -> System.out.print(e + " "));


    }
}
