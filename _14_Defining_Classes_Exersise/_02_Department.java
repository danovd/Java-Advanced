package _14_Defining_Classes_Exersise;

import java.util.ArrayList;
import java.util.List;

public class _02_Department {
    private List<_02_Employee> employees;
    private String name;

    public _02_Department(String name){
        this.name = name;
        employees = new ArrayList<>();
    }

    public List<_02_Employee> getEmployees() {
        return employees;
    }
    public double calculateAverageSalary(){
        return this.employees.stream().mapToDouble(_02_Employee::getSalary).average().orElse(0.0);
    }

    public String getName() {
        return name;
    }
}
