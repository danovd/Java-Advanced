package _07_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_Parking_Lot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();
        while(true){
            String input = sc.nextLine();
            if(input.equals("END")){
                break;
            }
            String action = input.split(", ")[0];
            String numberPlate = input.split(", ")[1];
            if(action.equals("IN")){
                set.add(numberPlate);
            }else if(action.equals("OUT")){
                set.remove(numberPlate);
            }
        }
        if(set.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for(String s : set){
                System.out.println(s);
            }
        }
    }
}
