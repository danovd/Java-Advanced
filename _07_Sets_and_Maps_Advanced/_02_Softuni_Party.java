package _07_Sets_and_Maps_Advanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_Softuni_Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while(true){
            String guest = sc.nextLine();
            if(guest.equals("PARTY")){
                break;
            }
            if(Character.isDigit(guest.charAt(0))){
                vip.add(guest);
            }else{
                regular.add(guest);
            }
        }

        while (true){
            String guest = sc.nextLine();
            if(guest.equals("END")){
                break;
            }
            if(vip.contains(guest)){
                vip.remove(guest);
            }else regular.remove(guest);
        }
        System.out.println(vip.size() + regular.size());
        if(!vip.isEmpty()){
            vip.forEach(System.out::println);
        }
        if(!regular.isEmpty()){
            regular.forEach(System.out::println);
        }

    }
}
