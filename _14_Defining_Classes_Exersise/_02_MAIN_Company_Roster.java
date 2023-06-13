package _14_Defining_Classes_Exersise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_MAIN_Company_Roster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfEmployees = Integer.parseInt(sc.nextLine());

        Map<String, _02_Department> departments = new HashMap<>();
        /// Read employees and Departments
        for (int i = 0; i < numberOfEmployees; i++) {
            String [] input = sc.nextLine().split(" ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            _02_Employee employee = null;

            if(input.length == 4){
                employee = new _02_Employee(name, salary, position, department);
            }else if(input.length == 6){
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new _02_Employee(name, salary, position, department, email, age);
            }else if(input.length == 5){
                try{
                    int age = Integer.parseInt(input[4]);
                    employee = new _02_Employee(name, salary, position, department, age);
                }catch (NumberFormatException e){
                    String email = input[4];
                    employee = new _02_Employee(name, salary, position, department, email);
                }
            }
            departments.putIfAbsent(department, new _02_Department(department));
            departments.get(department).getEmployees().add(employee);
        }

        _02_Department highestPaidDepartment = departments
                .entrySet()
                .stream()
                .max(Comparator.comparing(e -> e.getValue().calculateAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + highestPaidDepartment.getName());
        highestPaidDepartment.getEmployees()
                .stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

    }
}
