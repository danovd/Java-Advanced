package _08_Sets_and_Maps_Advanced_Exersise;

import java.util.*;

public class _07_Fix_Emails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new LinkedHashMap<>();
        String name = sc.nextLine();
        while(!name.equals("stop")){
            String email = sc.nextLine();
            map.put(name, email);
            name = sc.nextLine();
        }
        List<String> list = new ArrayList<>();
        list.add("us");
        list.add("uk");
        list.add("com");
        for(Map.Entry<String, String> e: map.entrySet()){
            String email = e.getValue();
            String extension = email.substring(email.lastIndexOf("."));
            extension = extension.substring(1);
            if(!list.contains(extension)){
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }


    }
}
