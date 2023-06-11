package _08_Sets_and_Maps_Advanced_Exersise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_Unique_Usernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> set = new LinkedHashSet<>();

        while(n-- > 0){
            String name = sc.nextLine();
            set.add(name);
        }
        set.forEach(System.out::println);
    }
}
