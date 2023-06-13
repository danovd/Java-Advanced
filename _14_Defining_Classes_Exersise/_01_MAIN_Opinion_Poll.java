package _14_Defining_Classes_Exersise;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _01_MAIN_Opinion_Poll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<_01_Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] commandParts = sc.nextLine().split("\\s+");
            _01_Person person = new _01_Person(commandParts[0], Integer.parseInt(commandParts[1]));
            persons.add(person);
        }

        persons.stream().filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparing(_01_Person::getName))
                .forEach(System.out::println);



    }
}
