package HomeWork.Lesson30;

import java.util.function.*;
import java.util.ArrayList;

public class Lesson30 {

}

class Employee {

    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class testEmployee {

    void printEmployee(Employee emp) {
        System.out.println("Name: " + emp.name + ", department: " + emp.department + ", salary: " + emp.salary);
    }

    void filtrEmployee(ArrayList<Employee> aL, Predicate<Employee> emp) {
        for (Employee e : aL) {
            if (emp.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("John", "IT", 2000.0);
        Employee emp2 = new Employee("Steve", "Engeneer", 1500.0);
        Employee emp3 = new Employee("Leon", "Driver", 1300.0);
        Employee emp4 = new Employee("Andrew", "IT", 2500.0);
        Employee emp5 = new Employee("Michel", "Teacher", 1200.0);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        testEmployee tEmp = new testEmployee();

        tEmp.filtrEmployee(list, (Employee emp) -> {
            return emp.department == "IT" && emp.salary > 2000.0;
        });
        System.out.println("---------------------------");
        tEmp.filtrEmployee(list, (Employee emp) -> {
            return emp.name.startsWith("S");
        });

    }
}
