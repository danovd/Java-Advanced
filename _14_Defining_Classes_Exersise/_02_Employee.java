package _14_Defining_Classes_Exersise;

public class _02_Employee {

private String name;
private double salary;
private String position;
private String department;

private String email;
private int age;

_02_Employee(String name, double salary, String position, String department){
    this.name = name;
    this.salary = salary;
    this.position = position;
    this.department = department;
    this.email = "n/a";
    this.age =  -1;

}

    public _02_Employee(String name, double salary, String position, String department, String email, int age) {
       this(name, salary, position, department);
        this.email = email;
        this.age = age;
    }
    public _02_Employee(String name, double salary, String position, String department, String email){
        this(name, salary, position, department);
        this.email = email;
    }
    public _02_Employee(String name, double salary, String position, String department, int age){
        this(name, salary, position, department);
        this.age = age;
    }


    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
