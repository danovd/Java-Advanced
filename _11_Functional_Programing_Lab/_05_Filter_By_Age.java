package _11_Functional_Programing_Lab;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _05_Filter_By_Age {
  public static  class Person{
        String name;int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Supplier<Person> personSupplier = () -> {
            String [] tokens = sc.nextLine().split(", ");
            return new Person(tokens[0], Integer.parseInt(tokens[1]));
        };
        List<Person> people = IntStream.range(0, n)
                .mapToObj(ignored -> personSupplier.get())
                .collect(Collectors.toList());

        String condition = sc.nextLine();
        int ageLimit = Integer.parseInt(sc.nextLine());
        String [] format = sc.nextLine().split("\\s+");

        Predicate <Person> filter = getFilter(condition, ageLimit);
        var printer = getPrinter(format);

        people
                .stream()
                .filter(filter)
                .forEach(printer);

    }
    public static Predicate<Person> getFilter(String condition, int age){
        return condition.equals("older")
                ? p -> p.age >= age
                : p -> p.age <= age;
    }
    public static Consumer<Person> getPrinter(String[] format){
        if(format.length == 2){
            return p -> System.out.println(p.name + " - " + p.age);
        } else if(format[0].equals("name")){
            return p -> System.out.println(p.name);
        }
        return p -> System.out.println(p.age);
    }
}
